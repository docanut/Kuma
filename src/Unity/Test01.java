package Unity;

import java.awt.Desktop.Action;
import java.util.Random;

import org.sikuli.basics.Debug;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Match;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;


public class Test01 {
	public static Region ScreenRegion = new Screen();
	public static Random ran = new Random();
	public static float n=0.91f;
	public static void Test() {
		Mevent.Click_expire(Img.shutsugeki, Img.shutsugeki, n);
		//Battles.Ro500_Solo();
		
	}

	public static void main(String[] args) {
	    //ImagePath.add("C:\\Users\\poi\\Downloads\\Kuma_win\\src\\Img");
	   Kuma.setImagePath();  
	   /*
	
	
	Quest.Select();*/
	   Quest.initialize();
	  
	   Quest.Complete();
	   Quest.Select();
  
	}

	

}
