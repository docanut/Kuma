package Unity;

import java.lang.reflect.Member;

import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;



public class Battles {
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
 		
			System.out.println("��ˬd�}�l");
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
				System.out.println("����j�}");
			}else {
				System.out.println("���A�}�n");
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
		
	}
    public static void Call_01() {
	Mevent.Click_expire(Img.hensei, Img.hensei, n);
		Mevent.Click_expire(Img.hensei_expor2, Img.hensei_expor2, n);
			while(!Mevent.Find_Img(Img.hensei_expor, n))
			{//�Iĥ���i�}���즨�\
				Mevent.Random_Click(321, 250);
				Mevent.Delay(3);
			}
		Mevent.Print("��������: "+"�簣�Xĥ�w�~��ĥ");
	}
	public static void Goto23() {
		Mevent.Click_expire(Img.shutsugeki, Img.shutsugeki, n);
		Mevent.Click_expire(Img.shutsugeki2, Img.shutsugeki2, n);
		//Mevent.Click_expire(Img.b2x, Img.b2x, n);
		Mevent.Click_exists(Img.b2x, Img.b23, n);
		Mevent.Click_exists(Img.b23, Img.agree, n);
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
	public static void AttackorRetreat() {
		while (true) {
			if (Mevent.Find_Img(Img.shutsugeki, n)) {
			System.out.println("�H�^����");
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
	public static void Night_battle(int night) {
		while (true) {
		if (Mevent.Find_Img(Img.battle_selt, n)) {
			if (batele_time >= night) {
				System.out.println("�ǳƶi�J�]��");
				Mevent.Click_expire(Img.nightwar, Img.nightwar, n);
				System.out.println("�w�i�J�]��");
				break;
			}else {
				System.out.println("�~��l��");
				Mevent.Click_expire(Img.chase,Img.chase,n);
				System.out.println("�l��");
				break;
				
			}
		}else if (Mevent.Find_Img(Img.battle_report, n)) {
			break;
		}else{
			System.out.println("�|�������԰�");
		}
		}//while lopp end
		
		Battle_report();
	}
	public static void Battle_phase_Solo() {
		while (true) {
			if (Mevent.Find_Img(Img.campass, n)) {
				//ù�L
				Mevent.Click_expire(Img.campass, Img.campass, n);
			}else {System.out.println("�����ù�L");}
			if (Mevent.Find_Img(Img.get_resource,n)) {
				//���o�귽
				Mevent.Click_expire(Img.get_resource,Img.get_resource,n);
				break;
			}else {
				System.out.println("�����o�귽");
			} 
			if (Mevent.Find_Img(Img.battle_selt, n)){
				batele_time++;
				Night_battle(0);
			}else {
				System.out.println("���������");
			}if (Mevent.Find_Img(Img.shutsugeki, n)) {
				System.out.println("�H�^����");
				break;
			}else {
				System.out.println("�|�B�b�~");
			}if (Mevent.Find_Img(Img.battle_report, n)) {
				Battle_report();
				System.out.println("���end");
			}else {
				System.out.println("���������");
			}
		}
	}
	
	public static void Battle_phase() {
		while (true) {
			if (Mevent.Find_Img(Img.campass, n)) {
				//ù�L
				Mevent.Click_expire(Img.campass, Img.campass, n);;
			}else {System.out.println("�����ù�L");}
			if (Mevent.Find_Img(Img.get_resource,n)) {
				//���o�귽
				Mevent.Click_expire(Img.get_resource,Img.get_resource,n);
				break;
			}else {
				System.out.println("�����o�귽");
			} 
			if (Mevent.Find_Img(Img.formation,n)){
				batele_time++;
				Mevent.Click_expire(Img.formation,Img.formation,n);
				ShipStatusCheck();
				Night_battle(2);
			}else {
				System.out.println("���}�l�����");
			}if (Mevent.Find_Img(Img.shutsugeki,n)) {
				System.out.println("�H�^����");
				break;
			}else {
				System.out.println("�|�B�b�~");
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
		
		if (!Mevent.Find_Img(Img.ro500_3, n)) {
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
			
			if (!Mevent.Find_Img(Img.ro500_3, n)) {
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
}

