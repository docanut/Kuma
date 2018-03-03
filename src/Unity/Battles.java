package Unity;


import org.python.antlr.PythonParser.if_stmt_return;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;


	public class Battles {
	//public static boolean AutoBattleCheck=true;
	public static boolean Ship_Taipo=false;
	public static int batele_time=0;
	static float n=0.9f;
	static String SS_name[][]={
			{Img.ro500_1,Img.ro500_2,Img.ro500_3},
			{Img.i8_1,Img.i8_2,Img.i8_3,},
			{Img.i19_1,Img.i19_2,Img.i19_3,},
			{Img.i58_1,Img.i58_2,Img.i58_3,},
			{Img.i168_1,Img.i168_2,Img.i168_3,},
			
	};
	public static void checkss() {
		for (int i = 0; i < SS_name.length; i++) {
			if (Mevent.Find_Img(SS_name[i][0], n)) {
				
			}
		}
		
	}
	public static void ShipStatusCheck() {
 		
			System.out.println("船隊檢查開始");
			Actions.Prophet_phase();
			Mevent.Delay(2);
			Pattern pattern=new Pattern(Img.red).exact();
			Match match = Img.FullShipStatus.exists(pattern);
			if (match!=null) {
				Ship_Taipo = true;
			}else if (match==null) {
				Ship_Taipo = false;
			}
			if (Ship_Taipo) {
				System.out.println("有船大破");
			}else {
				System.out.println("狀態良好");
			}
	}
 	public static void ShipStatusCheck_atHome(){
 		do {
 			Actions.Prophet_phase();
		} while (!Mevent.Find_Img(Img.blue_shipstatusbox, n));
 		ShipStatusCheck();
 	}
 	public static void ShipStatusCheck_inBattle() {
 		do {
 			Actions.Prophet_phase();
		} while (!Mevent.Find_Img(Img.inbattle_secondkan, n));
 		ShipStatusCheck();
		
	}
	public static  void Keep_FlagShip() {
		while(!Mevent.Find_Img(Img.Ro500check, n)){
			Mevent.Random_Click(457, 163);
		}
		
	}
	public static void Kick_Ship(int x) {
		int xx=0,yy=0;
		switch (x) {
		case 1:
			xx=423;yy=214;
			break;
		case 2:
			xx=781;yy=203;
			break;
		case 3:
			xx=400;yy=334;
			break;
		case 4:
			xx=784;yy=335;
			break;
		case 5:
			xx=400;yy=469;
			break;
		case 6:
			xx=781;yy=467;
			break;
		default:
			break;
		}
		Location location=new Location(xx, yy);
		Mevent.DragDrop(location, Img.quest);
		Mevent.Delay(3);
	}
    public static void Call_01() {
	Mevent.Click_expire(Img.hensei, Img.hensei, n);
		Mevent.Click_expire(Img.hensei_expor2, Img.hensei_expor2, n);
			while(!Mevent.Find_Img(Img.hensei_expor, n))
			{//點艦隊展開直到成功
				Mevent.Random_Click(321, 250);
				Mevent.Delay(3);
			}
		Mevent.Print("完成任務: "+"剔除旗艦已外船艦");
	}
	public static void Goto23() {
		
		Mevent.Click_expire(Img.shutsugeki, Img.shutsugeki, n);
		Mevent.Click_expire(Img.shutsugeki2, Img.shutsugeki2, n);
		Mevent.Click_exists(Img.b2x, Img.b23, n);
		Mevent.Click_exists(Img.b23, Img.agree, n);
	if (!Mevent.Find_Img(Img.battelstart, n)) {
		Mevent.Click_expire(Img.agree, Img.agree, n);
	}
	Mevent.Click_expire(Img.battelstart, Img.battelstart, n);
	
}
	public static void GotoSea(int Sea,int Mission) {
		String Sea_num="",temp="";
		
		switch (Sea) {
		case 2:
			Sea_num=Img.b2x;
			Mission=20+Mission;
			break;
		case 3:
			Sea_num=Img.b3x;
			Mission=30+Mission;
			break;
		case 4:
			Sea_num=Img.b4x;
			Mission=40+Mission;
			break;
		default:
			break;
		}
		temp=Integer.toString(Mission);
		Mevent.Click_expire(Img.shutsugeki, Img.shutsugeki, n);
		Mevent.Click_expire(Img.shutsugeki2, Img.shutsugeki2, n);
		Mevent.Click_exists(Sea_num, temp, 0.61f);
		Mevent.Click_exists(temp, Img.agree, 0.61f);
	if (!Mevent.Find_Img(Img.battelstart, n)) {
		Mevent.Click_expire(Img.agree, Img.agree, n);
	}
	Mevent.Click_expire(Img.battelstart, Img.battelstart, n);
	
}

	public static void Battle_report() {
		ShipStatusCheck();
		while (!Mevent.Find_Img(Img.battle_report,n)) {
			Mevent.Delay(3);
		}
		
		while(!Mevent.Find_Img(Img.attackorretreat,0.95f) && !Mevent.Find_Img(Img.shutsugeki,n)){
			Mevent.Random_Click(500, 500);
			Mevent.Delay(3);
			
		}
		AttackorRetreat();
	}	
	public static void Battle_report_ss() {
		ShipStatusCheck();
		while (!Mevent.Find_Img(Img.battle_report,n)) {
			Mevent.Delay(3);
		}
		
		while(!Mevent.Find_Img(Img.attackorretreat,0.95f) && !Mevent.Find_Img(Img.shutsugeki,n)){
			Mevent.Random_Click(500, 500);
			Mevent.Delay(3);
			
		}
		retreat();
	}
	public static void AttackorRetreat() {
		while (true) {
			if (Mevent.Find_Img(Img.shutsugeki, n)) {
			System.out.println("以回母港");
			break;
		}else{
			if (Ship_Taipo==true) {
				Mevent.Click_expire(Img.retreat, Img.retreat, n);
				break;
			}else if (Ship_Taipo ==false) {
				Mevent.Click_expire(Img.attack,Img.attack,n);
				break;
			}
		}
		}
		
		
	}
	public static void retreat(){

		while (true) {
			if (Mevent.Find_Img(Img.shutsugeki, n)) {
			System.out.println("以回母港");
			break;
		}else{
			Mevent.Click_expire(Img.retreat, Img.retreat, n);
			break;
			
		}
		}
	}
	public static void Night_battle(int night) {
		while (true) {
			if (Mevent.Find_Img(Img.battle_selt, (n+0.05f))) {
				if (batele_time >= night) {
					System.out.println("準備進入夜戰");
					Mevent.Click_expire(Img.nightwar, Img.nightwar, n);
					System.out.println("已進入夜戰");
					break;
				}
				else 
				 {
					System.out.println("繼續追擊");
					Mevent.Click_expire(Img.chase,Img.chase,n);
					System.out.println("追擊");
					break;
				}
			}
			if (Mevent.Find_Img(Img.battle_report, n)) {
				break;
			}else{
				System.out.println("尚未結束戰鬥");
			}
		}//while lopp end
		
		Battle_report();
	}	
	public static void Night_battle_SS(int night) {
		while (true) {
			if (Mevent.Find_Img(Img.battle_selt, (n+0.05f))) {
				if (batele_time >= night) {
					System.out.println("準備進入夜戰");
					Mevent.Click_expire(Img.nightwar, Img.nightwar, n);
					System.out.println("已進入夜戰");
					break;
				}
				else 
				 {
					System.out.println("繼續追擊");
					Mevent.Click_expire(Img.chase,Img.chase,n);
					System.out.println("追擊");
					break;
				}
			}
			if (Mevent.Find_Img(Img.battle_report, n)) {
				break;
			}else{
				System.out.println("尚未結束戰鬥");
			}
		}//while lopp end
		
		Battle_report_ss();
	}
	public static void Battle_phase_Solo() {
		while (true) {
			if (Mevent.Find_Img(Img.campass, n)) {
				//羅盤
				Mevent.Click_expire(Img.campass, Img.campass, n);
			}else {System.out.println("未找到羅盤");}
			if (Mevent.Find_Img(Img.get_resource,n)) {
				//取得資源
				Mevent.Click_expire(Img.get_resource,Img.get_resource,n);
				break;
			}else {
				System.out.println("未取得資源");
			} 
			if (Mevent.Find_Img(Img.battle_selt, n)){
				batele_time++;
				Night_battle(0);
			}else {
				System.out.println("未結束日戰");
			}if (Mevent.Find_Img(Img.shutsugeki, n)) {
				System.out.println("以回母港");
				break;
			}else {
				System.out.println("尚且在外");
			}if (Mevent.Find_Img(Img.battle_report, n)) {
				Battle_report();
				System.out.println("日戰end");
			}else {
				System.out.println("未結束日戰");
			}
		}
	}
	
	public static void Battle_phase() {
		while (true) {
			if (Mevent.Find_Img(Img.campass, n)) {
				//羅盤
				Mevent.Click_expire(Img.campass, Img.campass, n);;
			}else {System.out.println("未找到羅盤");}
			if (Mevent.Find_Img(Img.get_resource,n)) {
				//取得資源
				Mevent.Click_expire(Img.get_resource,Img.get_resource,n);
				break;
			}else {
				System.out.println("未取得資源");
			} 
			if (Mevent.Find_Img(Img.formation,n)){
				batele_time++;
				Mevent.Click_expire(Img.formation,Img.formation,n);
				ShipStatusCheck();
				Night_battle(2);
			}else {
				System.out.println("未開始選擇鎮型");
			}
			if (Mevent.Find_Img(Img.shutsugeki,n)) {
				System.out.println("以回母港");
				break;
			}else {
				System.out.println("尚且在外");
			}
		}
	}
	public static void battlephase_ss() {
		
		while (true) {
			if (Mevent.Find_Img(Img.campass, n)) {
				//羅盤
				Mevent.Click_expire(Img.campass, Img.campass, n);;
			}else {System.out.println("未找到羅盤");}
			if (Mevent.Find_Img(Img.get_resource,n)) {
				//取得資源
				Mevent.Click_expire(Img.get_resource,Img.get_resource,n);
				break;
			}else {
				System.out.println("未取得資源");
			} 
			if (Mevent.Find_Img(Img.formation_ss,n)){
				batele_time++;
				Mevent.Click_expire(Img.formation_ss,Img.formation_ss,n);
				ShipStatusCheck();
				Night_battle_SS(2);
			}else {
				System.out.println("未開始選擇鎮型");
			}
			if (Mevent.Find_Img(Img.shutsugeki,n)) {
				System.out.println("以回母港");
				break;
			}else {
				System.out.println("尚且在外");
			}
		}	
	}	
	public static void Ro500_Solo() {
		batele_time=-5;
		Actions.BackToBoko();
		Call_01();
		Keep_FlagShip();
		
		for (int i = 0; i < 2; i++) {
			
		Actions.BackToBoko();
		ShipStatusCheck();
		Actions.Overview_phase();
		
		if (Actions.checkfourss(false)) {
				if (Ship_Taipo==false) {
			Quest.Start();
			Actions.Hokyu(1);
			Actions.BackToBoko();
			Goto23();
			Battle_phase_Solo();
		}//First end
		}
		}
		
		Actions.BackToBoko();
	}
	
	public static void Four_SS_Auto23() {
		batele_time=0;
		Actions.BackToBoko();
		Call_01();
		Kick_Ship(1);
		
		for (int i = 0; i < 2; i++) {
			
			Actions.BackToBoko();
			ShipStatusCheck();
			Actions.Overview_phase();
			
			if (Actions.checkfourss(true)) {
					if (Ship_Taipo==false) {
				Quest.Start();
				Actions.Hokyu(1);
				Actions.BackToBoko();
				Goto23();
				Battle_phase();
			}//First end
			}
			}
		

		Actions.BackToBoko();
	}
	
	public static void Click_shi() {
		//Mevent.Click_expire(Img.shutsugeki, Img.shutsugeki, n);
		while(true){
			if (Mevent.Find_Img(Img.shutsugeki, n) ){
				Mevent.Click_expire(Img.hoku, Img.hoku, n);
			}else{}
			if(!Mevent.Find_Img(Img.shutsugeki,n)){
				Mevent.Delay(3);
				Mevent.Random_Click(45, 77);
				System.out.println("進入母港");
				Mevent.Delay(3);
			}
			if (Mevent.Find_Img(Img.ensei_back,n)||Mevent.Find_Img(Img.shutsugeki,n)) {
				System.out.println("已回母港");
				break;
			}
		}
		Actions.Expeditionback() ;
	}

	public static void SS_solo23() {
		Actions.BackToBoko();
		Call_01();
		Actions.Hokyu_side(1);
		for (int i = 0; i < 5; i++) {
			batele_time=-5;
				Actions.BackToBoko();
				Call_01();
				for (int j = 0; j < (i); j++) {
					 Battles.Kick_Ship(1);	
				}
			  
			   Battles.Keep_FlagShip();
			   Actions.BackToBoko();
			   ShipStatusCheck();
				Actions.Overview_phase();
				if (!Mevent.Find_Img_Region(Img.Nyuukyo, Ships.SS[i][2], n)) {
						if (Ship_Taipo==false) {
					
					Actions.BackToBoko();
					Goto23();
					Battle_phase_Solo();
				}//First end
				}
			   
			
		}
		

		Actions.BackToBoko();
	}
	
	public static void auto42() {
		batele_time=0;
		Actions.BackToBoko();
		Actions.Prophet_phase();
		ShipStatusCheck();
		Actions.Overview_phase();	
		if (Ship_Taipo==false) {
			Actions.Hokyu(1);
			Actions.BackToBoko();
			GotoSea(4, 2);
			Battle_phase();
			}//First end
			

		Actions.BackToBoko();
	}
	public static void auto33() {
		batele_time=-1;
		Actions.BackToBoko();
		Actions.Prophet_phase();
		ShipStatusCheck();
		Actions.Overview_phase();	
		if (Ship_Taipo==false) {
			Actions.Hokyu(1);
			Actions.BackToBoko();
			GotoSea(3, 3);
			Battle_phase();
			}//First end
			

		Actions.BackToBoko();
	}
	public static void Brush_flash() {
		batele_time=-5;
		for (int i = 0; i <=1; i++) {
		
			Goto11();
			Battle_phase_Solo();
		}
	}
	private static void Goto11() {
		Actions.BackToBoko();
		Mevent.Click_expire(Img.shutsugeki, Img.shutsugeki, n);
		Mevent.Click_expire(Img.shutsugeki2, Img.shutsugeki2, n);
		Mevent.Click_exists(Img.b11, Img.agree, 0.61f);
	if (!Mevent.Find_Img(Img.battelstart, n)) {
		Mevent.Click_expire(Img.agree, Img.agree, n);
	}
	Mevent.Click_expire(Img.battelstart, Img.battelstart, n);
	}
	public static void Goto15() {
		Actions.BackToBoko();
		Mevent.Click_expire(Img.shutsugeki, Img.shutsugeki, n);
		Mevent.Click_expire(Img.shutsugeki2, Img.shutsugeki2, n);
		Mevent.Click_exists(Img.x5, Img.x15, 0.61f);
		Mevent.Click_exists(Img.x15, Img.agree, 0.61f);
	if (!Mevent.Find_Img(Img.battelstart, n)) {
		Mevent.Click_expire(Img.agree, Img.agree, n);
	}
	Mevent.Click_expire(Img.battelstart, Img.battelstart, n);
	}
	
	public static void unlimited151() {
		while (true) {
			
			Actions.BackToBoko();
			Actions.Hokyu(1);
			Battles.ShipStatusCheck();
			if (Ship_Taipo) {break;/*break while*/}
			for (int i = 0; i <=4; i++)
			{
				if (Ship_Taipo) {break;/*break for*/}
			batele_time=-5;
			Goto15();
			battlephase_ss();
			}
			
			
		}
		
		
	}
	
	}
		
	

