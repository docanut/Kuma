package Unity;
import org.sikuli.script.Region;

public class Img {
   /*
    String clazz = "Img.Img";
    String imgFolder = "/Img";
    String inJarFolder = clazz + imgFolder;
    */
	String clazz = "Img.Img";
    String imgFolder = "/Img";
    String inJarFolder = clazz + imgFolder;
	//遠征顏色卻認
	static String black = "black.png";
	static String blue = "blue.png";
	static String green = "green.png";
	static String orange = "orange.png";
	static String red="red.png";
	//
	static String shutsugeki="SHUTSUGEKI.PNG";
	static String shutsugeki2="sutsu2.PNG";
	static String full_slide="full_slide.png";
	static String expdition_logo="expdition_logo.png";
	//
	static String hoku="hoku.png";
	static String houkyuready="houkyuready.png";
	static String hoku_side="hoku_side.png";
	static String hoku_side_light="hoku_side_light.png";
	static String nyuukyo="NYUUKYO.png";
	static String nyuukyo_side="nyuukyo_side.png";
	static String nyuukyo_side_light="nyuukyo_side_light.png";
	static String hensei="HENSEI.png";
	static String hensei_side="hensei_side.png";
	static String hensei_side_light="hensei_side_light.png";
	static String hensei_expor="hensei_expor.png";
	static String hensei_expor2="hensei_expor2.png";
	static String kosho="kosho.png";
	static String kosho_side="kosho_side.png";
	static String kosho_side_light ="kosho_side_light.png";
	static String kaizo="kaizo.png";
	static String kaizo_side="kaizo_side.png";
	static String kaizo_side_light="kaizo_side_light.png";
	static String NYUUKYO_start="NYUUKYO_start.png";
	static String NYUUKYO_empty="NYUUKYO_empty.png";
	static String NYUUKYO_yes="NYUUKYO_yes.png";
	static String NYUUKYO_no="NYUUKYO_no.png";
	//
	static String number2="number2.png";
	static String number2_light="nubmer2_light.png";
	static String number3="number3.png";
	static String number3_light="nubmer3_light.png";
	static String number4="number4.png";
	static String number4_light="nubmer4_light.png";
	static String number1="number1.png";
	static String number1_light="nubmer1_light.png";
	//
	static String hokubox="hokubox.png";
	static String ensei_back="ensei_back.png";
	//
	static String b11="11.png";
	static String b12="12.png";
	static String b13="13.png";
	static String b14="14.png";
	static String b21="21.png";
	static String b22="22.png";
	static String b23="23.png";
	static String b24="24.png";
	static String b31="31.png";
	static String b32="32.png";
	static String b33="33.png";
	static String b34="34.png";
	static String b42="42.png";
	static String b54="54.png";
	static String x5="X5.png";
	static String Chinjufu="Chinjufu.png";
	static String b2x="southwest.png";
	static String b2x_light="southwestlight.png";
	static String b3x="north.png";
	static String b3x_light="northlight.png";
	static String b4x="west.png";
	static String b4x_light="westlight.png";
	static String b5x="south.png";
	static String b5x_light="southlight.png";
	static String bluegreen="bluegreen.png";
	//
	static String agree="agree.png";
	static String battelstart="battelstart.png";
	static String next="next.png";
	//
	static String campass="compass.png";
	static String chase="chase.png";
	static String nightwar="nightwar.png";
	static String retreat="retreat.png";
	static String attack="attack.png";
	static String get_resource="get_resource.png";
	static String inbattle_secondkan="inbattle_secondkan.png";

	static String flagship_taiha="flag_ship_taipa.png";
	static String formation="formation.png";
	static String battle_report="battle_report.png";
	static String salimg="sailing.png";
	static String battle_selt="battle_selt.png";
	static String back="back.png";
	static String attackorretreat="attackorretreat.png";

	static String blue_shipstatusbox="blue_shipstatusbox.png";
	static String white_shipstatusbox="white_shipstatusbox.png";
	static String white_overview="white_overview.png";
	static String blue_overview="blue_overview.png";

	//遠征海域
	static String ensei_north="ensei_north.png";
	static String ensei_south="ensei_south.png";
	static String ensei_southwest="ensei_southwest.png";
	static String ensei_west="ensei_west.png";
	static String ensei_02="ensei_02.png";
	static String ensei_03="ensei_03.png";
	static String ensei_04="ensei_04.png";
	static String ensei_05="ensei_05.png";
	static String ensei_06="ensei_06.png";
	static String ensei_11="ensei_11.png";
	static String ensei_21="ensei_21.png";
	static String ensei_37="ensei_37.png";
	static String ensei_38="ensei_38.png";
	static String ExpeditionStart="ExpeditionStart.png";
	static String number3_ensei="number3_ensei.png";
	static String number3_ensei_light="number3_ensei_light.png";
	static String number4_ensei="number4_ensei.png";
	static String number4_ensei_light="number4_ensei_light.png";

	static String battle_01="battle_01.png";
	static String battle_01_orange="battle_01_orange.png";
	static String battle_01_green="battle_01_green.png";
	static String battle_01_poi="battle_01_poi.png";
	static String battle_01_poi_green="battle_01_poi_green.png";
	
	static String battle_02 ="battle_02.png";
	static String battle_02_orange="battle_02_orange.png";
	static String battle_02_green="battle_02_green.png";
	static String battle_02_poi_green="battle_02_poi_green.png";
	
	static String battle_03="battle_03.png";
	static String battle_03_green="battle_03_green.png";
	static String battle_03_orange="battle_03_orange.png";
	static String battle_03_poi_green="battle_03_poi_green.png";
	
	static String battle_04="battle_04.png";
	static String battle_04_green="battle_04_green.png";
	static String battle_04_orange="battle_04_orange.png";
	static String battle_04_poi_green="battle_04_poi_green.png";
	static String battle_04_green_2="battle_04_green_2.png";
	
	
	
	static String battle_05="battle_05.png";
	static String battle_05_02="battle_05_02.png";
	static String battle_05_orange="battle_05_orange.png";
	static String battle_05_orange_02="battle_05_orange_02.png";
	static String battle_05_poi="battle_05_poi.png";
	static String two_solt="two_solt.png";
	
	static String quest_345="quest_345.PNG";
	
	static String i8_1="i8_1.png";
	static String i8_2="i8_2.png";
	static String i8_3="i8_3.png";
	static String i13_1="i13_1.png";
	static String i14_1="i14_1.png";
	static String i19_1="i19_1.png";
	static String i19_2="i19_2.png";
	static String i19_3="i19_3.png";
	static String i26_1="i26_1.png";
	static String i58_1="i58_1.png";
	static String i58_2="i58_2.png";
	static String i58_3="i58_3.png";
	static String i168_1="i168_1.png";
	static String i168_2="i168_2.png";
	static String i168_3="i168_3.png";
	static String i401_1="i401_1.png";
	static String ro500_1="ro500_1.png";
	static String ro500_2="ro500_2.png";
	static String ro500_3="ro500_3.png";
	static String U511_1="U511_1.png";
	static String Ro500check="Ro500check.png";
	

	
	/*
	
	
	static String =".png";
	static String =".png";
	static String =".png";
	

	static String =".png";
	static String =".png";
	static String =".png";
	static String =".png";
	
	static String =".png";
	static String =".png";*/
	
	static String quest="quest.png";
	static String quest_blank ="quest_blank.png";
	static String Daily_black="Daily_black.png";
	static String Daily_white="Daily_white.png";
	static String Weekly_white="Weekly_white.png";
	static String Weekly_black="Weekly_black.png";
	static String quest_close="quest_close.png";
	static String quest_number2_black="quest_number2_black.png";
	static String quest_number2_green="quest_number2_green.png";
	
	
	/*formation


	
	static String =".png";
	static String =".png";
	static String =".png";
	static String =".png";
	static String =".png";
	static String =".png";
	static String =".png";
	*/
	
	
	

	//
	public static Region Ships(int x){
		int xcoordinate,ycoordinate,width,length;
		xcoordinate=-7;
		width=420;
		ycoordinate=+36;
		length=24;
		switch (x) {
		case 1:
			return new Region(20+xcoordinate, 620+ycoordinate, width, length);
			
		case 2:
			return new Region(20+xcoordinate, 655+ycoordinate, width, length)
			;	
		case 3:
			return new Region(20+xcoordinate, 690+ycoordinate, width, length);
				
		case 4:
			return new Region(20+xcoordinate, 725+ycoordinate, width, length);
			
		case 5:
			return new Region(20+xcoordinate, 760+ycoordinate, width, length);
			
		case 6:
			return new Region(20+xcoordinate, 795+ycoordinate, width, length);
			
		default:
			return new Region(0,0,5,5);
		}
		
		
	}
	public static Region Expedition_status(int team_number){
		int xcoordinate,ycoordinate,width,length;
		xcoordinate=4;
		width=49;
		ycoordinate=9;
		length=12;
		switch (team_number) {
		case 2:
			return new Region(450+xcoordinate  , 851+ycoordinate , width, length);
		case 3:
			return new Region(450+xcoordinate  , 877+ycoordinate , width, length);
		case 4:
			return new Region(450+xcoordinate  , 902+ycoordinate , width, length);

		default:
			return new Region(0,0,5,5);
		}
	}

	public static Region Nyuukyo=new Region(275, 710, 240, 110);
	public static Region FullShipStatus=new Region(205, 655, 225, 207);
	public static Region Home_Page=new Region(10,40,70,60);
	//10,40-80,100

}
