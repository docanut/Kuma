package Unity;


public class Expedition{
	public static boolean start=true;
	public static int locate2=2;
	public static int locate3=6;
	public static int locate4=5;
	public static String status2="";
	public static String status3="";
	public static String status4="";
	public static float n=0.9f;
	
	public static void Select(int x){
		Mevent.Click_expire(Img.shutsugeki, Img.shutsugeki, n);
		Mevent.Click_expire(Img.expdition_logo,Img.expdition_logo,n);
		switch (x) {
		case 2:
			Mevent.Click_exists(Img.ensei_02, Img.agree, n);
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
			Mevent.Click_exists(Img.ensei_south,Img.ensei_37,n);
			Mevent.Delay(3);
			Mevent.Click_exists(Img.ensei_37,Img.agree,n);
			break;
		case 38:
			Mevent.Click_exists(Img.ensei_south,Img.ensei_37,n);
			Mevent.Delay(3);
			Mevent.Click_exists(Img.ensei_38,Img.agree,n);
			break;
		default:
			break;
		}
		Mevent.Click_expire(Img.agree, Img.agree, n);
	}
	
	public static void Team_Chose(int x) {
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
		Mevent.Click_expire(Img.ExpeditionStart, Img.ExpeditionStart, n);
		
	}
	public static void Loop() {
		Mevent.Delay(5);
		
		
	}
	public static String Expeditionstatus(int x) {
		switch (x) {
		case 2:
			if (null != Img.Expedition_status(2).exists(Img.black)) {
				return "black";
			} else if (null != Img.Expedition_status(2).exists(Img.blue)) {
				return "blue";
			} else if (null != Img.Expedition_status(2).exists(Img.green)) {
				return "green";
			} else if (null != Img.Expedition_status(2).exists(Img.orange)) {
				return "orange";
			} else {
				return "bug";
			}
		case 3:
			if (null != Img.Expedition_status(3).exists(Img.black)) {
				return "black";
			} else if (null != Img.Expedition_status(3).exists(Img.blue)) {
				return "blue";
			} else if (null != Img.Expedition_status(3).exists(Img.green)) {
				return "green";
			} else if (null != Img.Expedition_status(3).exists(Img.orange)) {
				return "orange";
			} else {
				return "bug";
			}
		case 4:
			if (null != Img.Expedition_status(4).exists(Img.black)) {
				return "black";
			} else if (null != Img.Expedition_status(4).exists(Img.blue)) {
				return "blue";
			} else if (null != Img.Expedition_status(4).exists(Img.green)) {
				return "green";
			} else if (null != Img.Expedition_status(4).exists(Img.orange)) {
				return "orange";
			} else {
				return "bug";
			}
		default:
			return "bug";
		}// swich end
	}//Expeditiontatus end
	public static void start() {
		Mevent.Delay(1);
		System.out.println("遠征迴圈:"+start);
		Actions.Overview_phase();
			if (locate2 != 0)
			{
				status2=Expeditionstatus(2);
				System.out.println("T2狀態:"+status2);
			}
			if (locate3 != 0) 
			{
				status3=Expeditionstatus(3);
				System.out.println("T3狀態:"+status3);
			}
			if (locate4 !=0)
			{
				status4=Expeditionstatus(4);
				System.out.println("T4狀態:"+status4);
			}//遠征顏色檢查
			
		    if (status2 == "black" ||status2=="green") {
		    	System.out.println("2隊回歸"+status2);
		    	Mevent.Delay(5);
		    	Actions.BackToBoko();
		    	Actions.Hokyu(2);
		    	Actions.BackToBoko();
		    	Select(locate2);
		    	Team_Chose(0);
		    	Mevent.Delay(5);
			}
		    if (status3 == "black" ||status3=="green") {
		    	System.out.println("3回歸?"+status3);
		    	Mevent.Delay(5);
		    	Actions.BackToBoko();
		    	Actions.Hokyu(3);
		    	Actions.BackToBoko();
		    	Select(locate3);
		    	Team_Chose(3);
		    	Mevent.Delay(5);
			}
		    if (status4 == "black" ||status4=="green") {
		    	System.out.println("4回歸?"+status4);
		    	Mevent.Delay(5);
		    	Actions.BackToBoko();
		    	Actions.Hokyu(4);
		    	Actions.BackToBoko();
		    	Select(locate4);
		    	Team_Chose(4);
		    	Mevent.Delay(5);
			}
			
		
	}
}
