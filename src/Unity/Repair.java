package Unity;
public class Repair {
	static float n=0.9f;
	public static String[][]  SS = {
				{Img.ro500_1,Img.ro500_2,Img.ro500_3,""},	
				{Img.i8_1,Img.i8_2,Img.i8_3,""},
				{Img.i19_1,Img.i19_2,Img.i19_3,""},
				{Img.i58_1,Img.i58_2,Img.i58_3,""},
				{Img.i168_1,Img.i168_2,Img.i168_3,""},
						
		};

	public static void Print_SS(){
		  for (int i = 0; i < 5; i++) {
	    	   for (int j = 0; j < 4; j++) {
	    		  System.out.print(SS[i][j]+",");
	   		}
	    	   System.out.println("");
		}
	}
	public static void Taipa_Check() {
	Print_SS();
	Actions.Prophet_phase();
	for (int i = 0; i < 5; i++) {
		if (Mevent.Find_Img_Region(Img.Ships(i+1), SS[i][0], n)) {
			if (Mevent.Find_Img_Region(Img.Ships(i+1), Img.green, n)) {
				SS[i][3]="false";
			}
			else {
				SS[i][3]="true";
			}
		}
    	
	}
	Actions.Overview_phase();
	for (int i = 0; i < 5; i++) {
		if(Mevent.Find_Img(SS[i][2], n)){
			SS[i][3]="flase";
		}
			
	}
	Print_SS();
}
	public static void Into_Nyuukyo() {
	Mevent.Click_expire(Img.nyuukyo_side, Img.nyuukyo_side, n);
	if (Mevent.Find_Img(Img.NYUUKYO_empty, n)) {
		
	}else {
		System.out.println("¾þ°ó¤wº¡");
	}
	
}
	public static void Click_Bath(){
		Mevent.Click_exists(Img.NYUUKYO_empty, Img.NYUUKYO_nubmer, n);
	}
	public static void XX(){
		for (int i = 0; i < 5; i++) {
			if (SS[i][3].equals("true")&&Mevent.Find_Img(Img.NYUUKYO_empty, n)) {
				System.out.println(SS[i][0]+"­n¬~¾þ");
				Mevent.Click_exists(Img.NYUUKYO_empty, Img.NYUUKYO_nubmer, n);
				Mevent.Click_exists(SS[i][1],Img.NYUUKYO_start,n);
				Mevent.Click_exists(Img.NYUUKYO_start, Img.NYUUKYO_yes, n);
				Mevent.Click_exists(Img.NYUUKYO_yes, Img.NYUUKYO_empty, n);
			}
		}
	}

	public static void Start() {
		Actions.BackToBoko();
		Battles.Call_01();
		Taipa_Check();
		Into_Nyuukyo();
		XX();
	}
}
