package Unity;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import org.sikuli.script.ImagePath;




public class Kuma {
	static java.net.URL url = Kuma.class.getResource("/Img/01.jpg");
	static ImageIcon imageIcon_Sleep = new ImageIcon(url);
	
	static java.net.URL url1 = Kuma.class.getResource("/Img/02.gif");
	static ImageIcon imageIcon_Rung = new ImageIcon(url1);
	
	static java.net.URL path = Kuma.class.getResource("/Img");
	
	static JLabel icon_image=new JLabel(imageIcon_Sleep);
	public static void display(){
				imagepath();
			    
			    
				JFrame frame=new JFrame("Kuma");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(600, 600);
				frame.setLayout( new GridLayout());
				//======================================================================
				
				JPanel panel=new JPanel();
				frame.setLayout( new GridLayout(0, 1, 0, 0));
				GridBagConstraints gc = new GridBagConstraints(); //layout setting
				JPanel looppanel =new JPanel();
				frame.add(panel);
				panel.add(looppanel);
				looppanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
				looppanel.add(new JLabel("迴圈區域"));
				looppanel.setLayout(new GridBagLayout());
				looppanel.add(icon_image,gc);
				
				 gc.gridx = 0; gc.gridy = 1;looppanel.add(Button.expedition1, gc);
			     gc.gridx = 1; gc.gridy = 1;looppanel.add(Button.Team2_Ensei, gc);
			     
			     gc.gridx = 0; gc.gridy = 2;looppanel.add(Button.expedition2, gc);
			     gc.gridx = 1; gc.gridy = 2;looppanel.add(Button.Team3_Ensei, gc);
			     
			     gc.gridx = 0; gc.gridy = 3;looppanel.add(Button.expedition3, gc);
			     gc.gridx = 1; gc.gridy = 3;looppanel.add(Button.Team4_Ensei, gc);
				
			     gc.gridx = 0;gc.gridy = 4;looppanel.add(Button.BattleCheck, gc);
			     gc.gridx = 1;gc.gridy = 4;looppanel.add(Button.QuestCheck, gc);
			     gc.gridx = 1;gc.gridy = 5;looppanel.add(Button.LoopProcessOnOff, gc);
			     
			 
			     JPanel panel2 =new JPanel();
			     panel2.setBorder(new TitledBorder("單次執行區域"));
			     
			     panel2.add(Button.Brush_flash);
			     panel2.add(Button.Short_battle);
			     panel2.add(Button.ExpeditionOnce);
			     frame.add(panel2);
			     //============================================================================
			    Button.Events();
			   
			  
		        frame.setLocation(870,940);
			  
				frame.pack();
				frame.setVisible(true);
	}
	  
	public static void main(String[] args) {
		

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Kuma();
				Kuma.display();
            }
        });
	}
	public static void imagepath() {
		//ImagePath.setBundlePath("D:\\Program Files\\elc\\Kuma\\src\\Kuma");
		//ImagePath.add("D:\\Program Files\\elc\\Kuma_win\\src\\Img");
		String clazz = "Unity.Kuma";
	    String imgFolder = "/Img";
	    String inJarFolder = clazz + imgFolder;
	    ImagePath.add(inJarFolder);
	}
	
	
	public static void Change_icon(int x) {
		if (x==0) {
			icon_image.setIcon(imageIcon_Sleep);
		}else if (x==1) {
			icon_image.setIcon(imageIcon_Rung);
		}
		
	}
}
