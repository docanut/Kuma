package Unity;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
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
				setImagePath();
				JFrame frame=new JFrame("Kuma");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setPreferredSize(new Dimension(265, 670));
				frame.setLayout( new GridLayout(0, 1, 0, 0));
				
				//======================================================================
				
				GridBagConstraints gc = new GridBagConstraints(); //layout setting
				JPanel panel_01 =new JPanel();
				panel_01.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
				panel_01.add(new JLabel("迴圈區域"));
				panel_01.setLayout(new GridBagLayout());
				panel_01.add(icon_image,gc);
				 gc.gridx = 0; gc.gridy = 1;panel_01.add(Button.expedition[0], gc);
			     gc.gridx = 1; gc.gridy = 1;panel_01.add(Button.Team2_Ensei, gc);
			     gc.gridx = 0; gc.gridy = 2;panel_01.add(Button.expedition[1], gc);
			     gc.gridx = 1; gc.gridy = 2;panel_01.add(Button.Team3_Ensei, gc);
			     gc.gridx = 0; gc.gridy = 3;panel_01.add(Button.expedition[2], gc);
			     gc.gridx = 1; gc.gridy = 3;panel_01.add(Button.Team4_Ensei, gc);
			     gc.gridx = 0;gc.gridy = 4;panel_01.add(Button.BattleCheck, gc);
			     gc.gridx = 1;gc.gridy = 4;panel_01.add(Button.QuestCheck, gc);
			     //gc.gridx = 0;gc.gridy = 5;panel_01.add(Button.Autocreep, gc);
			     gc.gridx = 1;gc.gridy = 5;panel_01.add(Button.LoopProcessOnOff, gc);
			     
			     
			     frame.add(panel_01);
			     //===========================================================================
			     GridBagConstraints gc2 = new GridBagConstraints();
			     JPanel panel2 =new JPanel();
			     panel2.setLayout(new GridBagLayout());
			     panel2.setBorder(new TitledBorder("單次執行區域"));
			     gc2.gridx = 0; gc2.gridy = 0;panel2.add(Button.Brush_flash,gc2);
			     gc2.gridx = 1; gc2.gridy = 0;panel2.add(Button.Brush_flash2,gc2);
			     
			     gc2.gridx = 0; gc2.gridy = 1;panel2.add(Button.Creepy,gc2);
			     gc2.gridx = 1; gc2.gridy = 1;panel2.add(Button.Short_battle,gc2);
			     
			     gc2.gridx = 0; gc2.gridy = 2;panel2.add(Button.ExpeditionOnce,gc2);
			     gc2.gridx = 1; gc2.gridy = 2;panel2.add(Button.QuestinItialize, gc2);

			     gc2.gridx = 0; gc2.gridy = 3;panel2.add(Button.Attack32,gc2);
			     gc2.gridx = 1; gc2.gridy = 3;panel2.add(Button.Attack33, gc2);

			     gc2.gridx = 0; gc2.gridy = 4;panel2.add(Button.Attack42,gc2);
			     //gc2.gridx = 1; gc2.gridy = 4;panel2.add(Button., gc2);
			    
			     frame.add(panel2);
			     //============================================================================
			    Button.Events();
			    Quest.initialize();
			   
			   
		        
		        frame.setLocation(870, 0);
				frame.pack();
				frame.setVisible(true);
	}
	public static void setImagePath() {
		//ImagePath.setBundlePath("D:\\Program Files\\elc\\Kuma\\src\\Kuma");
		//ImagePath.add("D:\\Program Files\\elc\\Kuma_win\\src\\Img");
		String clazz = "Unity.Kuma";
	    String imgFolder = "/Img";
	    String inJarFolder = clazz + imgFolder;
	    ImagePath.add(inJarFolder);
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
	
	public static void Change_icon(int x) {
		if (x==0) {
			icon_image.setIcon(imageIcon_Sleep);
		}else if (x==1) {
			icon_image.setIcon(imageIcon_Rung);
		}
		
	}
}
