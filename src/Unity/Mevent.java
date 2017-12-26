package Unity;
import java.util.Random;

import org.eclipse.swt.internal.win32.TCHITTESTINFO;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;


public class Mevent {
	public static Region ScreenRegion = new Screen();
	public static Random ran = new Random();
	public static float n=0.9f;
	
	private static void WaitUntil(String path,int x) {
		switch (x) {
		case 1:
			while(true){
				Pattern pattern=new Pattern(path).exact();
				Match match = ScreenRegion.exists(pattern);
				System.out.print("未找到"+path);
				Delay(3);
				if(null!=match){
					System.out.print("發現"+path+"存在");
					break;}
			}
			break;

		default:
			while(true){
				Pattern pattern=new Pattern(path);
				Match match = ScreenRegion.exists(pattern);
				System.out.print("未找到"+path);
				Delay(3);
				if(null!=match){
					System.out.print("發現"+path+"存在");
					break;}
			}
			break;
		}
		
		
	}

	
	public static void Click_expire(String pic_to_click,String pic_to_wait,Float similar){
		Click_Event(pic_to_click,similar,pic_to_wait,similar,2);
	}
	public static void Click_exists(String pic_to_click,String pic_to_wait,Float similar){
		
		Click_Event(pic_to_click,similar,pic_to_wait,similar,1);
	}
	public static void Click_Region_Until(Region region ,String pic_to_wait,Float similar_wait ) {
		do {
				Random_Click_Region(region);
				
			} while (!Find_Img(pic_to_wait,similar_wait));
			
	}
	
	public static void Click_Event(String pic_to_click,Float similar_click,String pic_to_wait,Float similar_wait,int pattern) {
		
		Pattern pattern01=null,pattern02=null;
		Match match=null;
		switch (pattern) {
		case 1:
			do {
				while (match==null) {
					pattern01=new Pattern(pic_to_click).similar(similar_click);
					match = ScreenRegion.exists(pattern01);
					if (match==null) {
						Print("未發現"+pic_to_click);
					}else {
						Print("找到"+pic_to_click);
					}
					Delay(3);
				}
				Random_Click_Region(match);
			} while (!Find_Img(pic_to_wait,similar_wait));
			break;
		case 2:
			do {
				while (match==null) {
					pattern01=new Pattern(pic_to_click).similar(similar_click);
					match = ScreenRegion.exists(pattern01);
					if (match==null) {
						Print("未發現"+pic_to_click);
					}else {
						Print("找到"+pic_to_click);
					}
					Delay(3);
				}
				Random_Click_Region(match);
				//pattern02=new Pattern(pic_to_wait).similar(similar_wait);
				
			} while (Find_Img(pic_to_wait,similar_click));
		default:
			break;
		}
		
		/*
		Pattern pattern01=new Pattern(pic_to_click).similar(similar_click);
		Match match01 = ScreenRegion.exists(pattern01);
		match01.getTopLeft().offset((ran.nextInt(match01.w)), (ran.nextInt(match01.h))).click();
		
		Pattern pattern02=new Pattern(pic_to_wait).similar(similar_wait);
		Match match02 = ScreenRegion.exists(pattern02);
		match02.getTopLeft().offset((ran.nextInt(match02.w)), (ran.nextInt(match02.h))).click();
		*/
		/*尋找圖片->找不到怎麼半? wait?
		 * 點集(click drog)圖片
		 * 確認完成
		 */
	}
	public static void Delay(int x) {
		Print("---等待"+x+"秒");
		try {Thread.sleep(x*1000);} catch (Exception e) {}
}
	public static void Print(String string) {
		System.out.println(string);
		//System.out.println();
		
	}
	public static void Move_to(int x,int y) {
		new Location(x, y).hover();
	}
	public static void Random_Click(int x,int y) {
		Region region=new Region(x-2,y-2,4,4);
		Delay(1);
		region.getTopLeft().offset((ran.nextInt(region.w)), (ran.nextInt(region.h))).click();
		new Location(0, 0).hover();
		
		Delay(3);
	}
	public static void Random_Click_Region(Region region) {
		
		Delay(1);
		region.getTopLeft().offset((ran.nextInt(region.w)), (ran.nextInt(region.h))).click();
		new Location(0, 0).hover();
		
		Delay(3);
	}
	public static void Find_match(){
	/*	pattern01=new Pattern(pic_to_click).similar(similar_click);
		Match match01 = ScreenRegion.exists(pattern01);
		Print("發現"+pic_to_click+"並點擊");*/
	}
	public static boolean Find_Img(String img,float similar) {
		
		Pattern Img_find=new Pattern(img).similar(similar);
		Match macth=ScreenRegion.exists(Img_find);
		if (macth!=null) {
			Print("找到"+img);
			return true;
		}else {
			Print("沒發現"+img);
			return false;
		}
	}
	public static void DragDrop(Location lo,String img) {
		Pattern pattern= new Pattern(img);
			try {ScreenRegion.dragDrop(lo, pattern);} 
			catch (Exception e) {}
	}
}
