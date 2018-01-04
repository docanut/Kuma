package Unity;

import java.awt.Color;

public class Expedition {
	public static boolean exp=false;
	public static int locate[]={0,0,0};
	public static String status[]={"","",""};
	static float n=0.9f;

	public static void select(int x){
		switch (x) {
		case 2:
			Mevent.Click_exists(Img.ensei_02,Img.agree,n);
			break;
		case 3:
			Mevent.Click_exists(Img.ensei_03,Img.agree,n);
			break;
		case 4:
			Mevent.Click_exists(Img.ensei_04,Img.agree,n);
			break;
		case 5:
			Mevent.Click_exists(Img.ensei_05,Img.agree,n);
			break;
		case 6:
			Mevent.Click_exists(Img.ensei_06,Img.agree,n);
			break;
		case 11:
			Mevent.Click_exists(Img.ensei_southwest,Img.ensei_11,n);
			Mevent.Delay(3);
			Mevent.Click_exists(Img.ensei_11,Img.agree,n);
			break;
		case 21:
			Mevent.Click_exists(Img.ensei_north,Img.ensei_21,n);
			Mevent.Delay(3);
			Mevent.Click_exists(Img.ensei_21,Img.agree,n);
			break;
		case 37:
			if (Mevent.Find_Img(Img.ensei_37, n)||Mevent.Find_Img(Img.ensei_38, n)) {
				
			}else {
				Mevent.Click_exists(Img.ensei_south,Img.ensei_37,n);
			}
			Mevent.Delay(3);
			Mevent.Click_exists(Img.ensei_37,Img.agree,n);
			break;
		case 38:
			if (Mevent.Find_Img(Img.ensei_37, n)||Mevent.Find_Img(Img.ensei_38, n)) {
				
			}else {
				Mevent.Click_exists(Img.ensei_south,Img.ensei_37,n);
			}
			Mevent.Delay(3);
			Mevent.Click_exists(Img.ensei_38,Img.agree,n);
			break;
		default:
			break;
		}
		Mevent.Click_expire(Img.agree,Img.agree,n);
	}
	
	public static void team_Chose(int x) {
		switch (x) {
		case 3:
			Mevent.Click_expire(Img.number3_ensei,Img.number3_ensei,n);
			System.out.println("選3");
			break;
		case 4:
			Mevent.Click_expire(Img.number4_ensei,Img.number4_ensei,n);
			System.out.println("選4");
			break;
		default:
			break;
		}
		Mevent.Click_expire(Img.ExpeditionStart,Img.ExpeditionStart,n);
		
	}
	public static void Ensei_Loop() {
		Mevent.Delay(5);
		
		
	}
	public static void status() {
		exp=false;
		for (int i = 2; i < 5; i++) {
			if (null != Img.Expedition_status(i).exists(Img.black)) {
				status[i-2]="black";
			} else if (null != Img.Expedition_status(i).exists(Img.blue)) {
				status[i-2]="blue";
			} else if (null != Img.Expedition_status(i).exists(Img.green)) {
				status[i-2]="green";
			} else if (null != Img.Expedition_status(i).exists(Img.orange)) {
				status[i-2]="orange";
			} else {
				status[i-2]="bug";
			}
		}
		for (int j = 0; j < status.length; j++) {
			
			System.out.println(status[j]);
		}
		for (int i = 0; i < locate.length; i++) {
			System.out.println("T"+(i+2)+"狀態:"+status[i]+locate[i]);
			if (status[i]=="black"||status[i] == "green" ){
				exp=true;
			}
		}
		label_color();
	}//Expeditiontatus end
	public static void start() {
		Mevent.Delay(1);
		System.out.println("遠征迴圈:");
		Actions.Overview_phase();
		status();
		while(exp) {
			Mevent.Delay(5);
	    	Actions.BackToBoko();
	    	status();
				 if (status[0] == "black" ||status[1]=="black"||status[2]=="black"||
						 status[0] == "green" ||status[1]=="green"||status[2]=="green") {
					 	Mevent.Click_expire(Img.hoku,Img.hoku,n);
					 	for (int i = 0; i < locate.length; i++) {
					 		if (status[i]=="black") {
					 			Actions.Teamselect_Hokyu(i+2);
					 			Actions.hokyu_check();
							}
			
				    	System.out.println("回歸"+status[i]);
					 	}
			Actions.BackToBoko();
			Mevent.Click_expire(Img.shutsugeki,Img.shutsugeki,n);
			Mevent.Click_expire(Img.expdition_logo,Img.expdition_logo,n);
			  for (int i = 0; i < 3; i++) {
					if (status[i] == "black" && Expedition.locate[i]!=0) {
						Expedition.select(Expedition.locate[i]);
						Expedition.team_Chose(i+2);
					}
				
				}
			
					
				
			}
		 status();
		}
	}
	public static void label_color() {
		for (int i = 0; i < status.length; i++) {
			if (status[i]=="black") {
				Button.expedition[i].setForeground(Color.black);
			}else if (status[i] =="blue") {
				Button.expedition[i].setForeground(Color.blue);
			}else if (status[i]=="green") {
				Button.expedition[i].setForeground(Color.green);
			}else if (status[i]=="orange") {
				Button.expedition[i].setForeground(Color.orange);
			}
		}
		
	}
}
