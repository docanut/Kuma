package Unity;

import java.util.Random;

import org.sikuli.basics.Debug;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Match;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;


public class Test01 {
	public static Region ScreenRegion = new Screen();
	public static Random ran = new Random();
	public static float n=0.9f;
	public static void Test() {
		Mevent.Click_expire(Img.shutsugeki, Img.shutsugeki, n);
		//Battles.Ro500_Solo();
		
	}

	public static void main(String[] args) {
	    //ImagePath.add("C:\\Users\\poi\\Downloads\\Kuma_win\\src\\Img");
	   // ImagePath.add("D:\\Program Files\\elc\\Kuma_win\\src\\Img");
	  
      Screen s = new Screen();
      Debug.info("Screen: %s", s);
      String clazz = "Unity.Kuma";
      String imgFolder = "/Img";
      String img = Img.shutsugeki;
      String inJarFolder = clazz + imgFolder;
      if (ImagePath.add(inJarFolder)) {
              Debug.info("Image Folder in jar at: %s", inJarFolder);
      } else {
              Debug.error("Image Folder in jar not possible: %s", inJarFolder);
      }
     Match target = s.exists(img);
      if (null == target) {
              Debug.error("Not found: ", img);
      } else {
              Debug.info("Found: %s at %s", img, target);
            s.hover();
      }
      Debug.info("... leaving");
	  Mevent.Click_expire(Img.shutsugeki, Img.shutsugeki, 0.9f);
		
  
	}

	

}
