package Unity;
import org.sikuli.script.Region;

public class Img {
   /*
    String clazz = "Img.Img";
    String imgFolder = "/Img";
    String inJarFolder = clazz + imgFolder;
    */
	
	//遠征顏色卻認
	static String black = "black";
	static String blue = "blue";
	static String green = "green";
	static String orange = "orange";
	static String red="red";
	//
	static String shutsugeki="SHUTSUGEKI";
	static String shutsugeki2="sutsu2";
	static String full_slide="full_slide";
	static String expdition_logo="expdition_logo";
	//
	static String hoku="hoku";
	static String houkyuready="houkyuready";
	static String hoku_side="hoku_side";
	static String hoku_side_light="hoku_side_light";
	static String nyuukyo="NYUUKYO";
	static String nyuukyo_side="nyuukyo_side";
	static String nyuukyo_side_light="nyuukyo_side_light";
	static String hensei="HENSEI";
	static String hensei_side="hensei_side";
	static String hensei_side_light="hensei_side_light";
	static String hensei_expor="hensei_expor";
	static String hensei_expor2="hensei_expor2";
	static String kosho="kosho";
	static String kosho_side="kosho_side";
	static String kosho_side_light ="kosho_side_light";
	static String kaizo="kaizo";
	static String kaizo_side="kaizo_side";
	static String kaizo_side_light="kaizo_side_light";
	static String NYUUKYO_start="NYUUKYO_start";
	static String NYUUKYO_empty="NYUUKYO_empty";
	static String NYUUKYO_yes="NYUUKYO_yes";
	static String NYUUKYO_no="NYUUKYO_no";
	static String NYUUKYO_nubmer="NYUUKYO_number";
	static String nyuukyo_kan="nyuukyo_kan";
	//
	static String number2="number2";
	static String number2_light="nubmer2_light";
	static String number3="number3";
	static String number3_light="nubmer3_light";
	static String number4="number4";
	static String number4_light="nubmer4_light";
	static String number1="number1";
	static String number1_light="nubmer1_light";
	//
	static String hokubox="hokubox";
	static String ensei_back="ensei_back";
	//
	static String b11="11";
	static String b12="12";
	static String b13="13";
	static String b14="14";
	static String b21="21";
	static String b22="22";
	static String b23="23";
	static String b24="24";
	static String b31="31";
	static String b32="32";
	static String b33="33";
	static String b34="34";
	static String b42="42";
	static String b54="54";
	static String x5="X5";
	static String Chinjufu="Chinjufu";
	static String b2x="southwest";
	static String b2x_light="southwestlight";
	static String b3x="north";
	static String b3x_light="northlight";
	static String b4x="west";
	static String b4x_light="westlight";
	static String b5x="south";
	static String b5x_light="southlight";
	static String bluegreen="bluegreen";
	//
	static String agree="agree";
	static String battelstart="battelstart";
	static String next="next";
	//
	static String campass="compass";
	static String chase="chase";
	static String nightwar="nightwar";
	static String retreat="retreat";
	static String attack="attack";
	static String get_resource="get_resource";
	static String inbattle_secondkan="inbattle_secondkan";

	static String flagship_taiha="flag_ship_taipa";
	static String formation="formation";
	static String battle_report="battle_report";
	static String salimg="sailing";
	static String battle_selt="battle_selt";
	static String back="back";
	static String attackorretreat="attackorretreat";

	static String blue_shipstatusbox="blue_shipstatusbox";
	static String white_shipstatusbox="white_shipstatusbox";
	static String white_overview="white_overview";
	static String blue_overview="blue_overview";

	//遠征海域
	static String ensei_north="ensei_north";
	static String ensei_south="ensei_south";
	static String ensei_southwest="ensei_southwest";
	static String ensei_west="ensei_west";
	static String ensei_02="ensei_02";
	static String ensei_03="ensei_03";
	static String ensei_04="ensei_04";
	static String ensei_05="ensei_05";
	static String ensei_06="ensei_06";
	static String ensei_11="ensei_11";
	static String ensei_21="ensei_21";
	static String ensei_37="ensei_37";
	static String ensei_38="ensei_38";
	static String ExpeditionStart="ExpeditionStart";
	static String number3_ensei="number3_ensei";
	static String number3_ensei_light="number3_ensei_light";
	static String number4_ensei="number4_ensei";
	static String number4_ensei_light="number4_ensei_light";

	static String battle_01="battle_01";
	static String battle_01_orange="battle_01_orange";
	static String battle_01_green="battle_01_green";
	static String battle_01_poi="battle_01_poi";
	static String battle_01_poi_green="battle_01_poi_green";
	
	static String battle_02 ="battle_02";
	static String battle_02_orange="battle_02_orange";
	static String battle_02_green="battle_02_green";
	static String battle_02_poi_green="battle_02_poi_green";
	
	static String battle_03="battle_03";
	static String battle_03_green="battle_03_green";
	static String battle_03_orange="battle_03_orange";
	static String battle_03_poi_green="battle_03_poi_green";
	
	static String battle_04="battle_04";
	static String battle_04_green="battle_04_green";
	static String battle_04_orange="battle_04_orange";
	static String battle_04_poi_green="battle_04_poi_green";
	static String battle_04_green_2="battle_04_green_2";
	
	
	
	static String battle_05="battle_05";
	static String battle_05_02="battle_05_02";
	static String battle_05_orange="battle_05_orange";
	static String battle_05_orange_02="battle_05_orange_02";
	static String battle_05_poi="battle_05_poi";
	static String two_solt="two_solt";
	
	static String quest_345="quest_345";
	
	static String i8_1="i8_1";
	static String i8_2="i8_2";
	static String i8_3="i8_3";
	static String i13_1="i13_1";
	static String i14_1="i14_1";
	static String i19_1="i19_1";
	static String i19_2="i19_2";
	static String i19_3="i19_3";
	static String i26_1="i26_1";
	static String i58_1="i58_1";
	static String i58_2="i58_2";
	static String i58_3="i58_3";
	static String i168_1="i168_1";
	static String i168_2="i168_2";
	static String i168_3="i168_3";
	static String i401_1="i401_1";
	static String ro500_1="ro500_1";
	static String ro500_2="ro500_2";
	static String ro500_3="ro500_3";
	static String U511_1="U511_1";
	
	static String ro500_p2="ro500_p2";
	static String i8_p2="i8_p2";
	static String i19_p2="i19_p2";
	static String i58_p2="i58_p2";
	static String i168_p2="i168_p2";
	
	static String Ro500check="Ro500check";
	

	
	/*
	
	
	static String ="";
	static String ="";
	static String ="";
	

	static String ="";
	static String ="";
	static String ="";
	static String ="";
	
	static String ="";
	static String ="";*/
	
	static String quest="quest";
	static String quest_blank ="quest_blank";
	static String Daily_black="Daily_black";
	static String Daily_white="Daily_white";
	static String Weekly_white="Weekly_white";
	static String Weekly_black="Weekly_black";
	static String quest_close="quest_close";
	static String quest_number2_black="quest_number2_black";
	static String quest_number2_green="quest_number2_green";
	
	
	/*formation


	
	static String ="";
	static String ="";
	static String ="";
	static String ="";
	static String ="";
	static String ="";
	static String ="";
	*/
	
	
	

	//
	public static Region Ships(int x){
		int xcoordinate,ycoordinate,width,length;
		xcoordinate=-15;
		width=430;
		ycoordinate=+36;
		length=26;
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

	public static Region Nyuukyo=new Region(265, 700, 250, 120);
	public static Region FullShipStatus=new Region(205, 655, 225, 207);
	public static Region Home_Page=new Region(10,40,70,60);
	//10,40-80,100

}
