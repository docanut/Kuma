package Unity;
public class Quest {
	static float n=0.95f;
	static boolean start=true;
	//public static boolean AutoQuestCheck=true;
	protected String green,orange,blank,name;
	protected boolean iscompleted=false,isselected=false;
	static Quest[] quset=new Quest[9];
	public static void initialize(){
		for (int i = 0; i < quset.length; i++) {
			quset[i]=new Quest();
			quset[i].green ="quest0"+(i+1)+"g";
			quset[i].orange="quest0"+(i+1)+"o";
			quset[i].blank ="quest0"+(i+1)+"b";
			System.out.println(quset[i].green+":"+quset[i].orange+":"+quset[i].blank);
		}
		quset[0].name="敵艦隊擊破";
		quset[1].name="敵艦隊主力擊滅";
		quset[2].name="敵艦隊10次擊破";
		quset[3].name="敵補給艦3隻擊沉";
		quset[4].name="南西諸島海域制海權掌控";
		quset[5].name="遠征3回";
		quset[6].name="遠征10回";
		quset[7].name="維修5回";
		quset[8].name="補給15回";
		
		
	}
	public static boolean findo(int i) {
		
		return Mevent.Find_Img(quset[i].orange, n);
	}
	public static boolean findg(int i) {
		return Mevent.Find_Img(quset[i].green, n);
	}
	public static boolean findb(int i) {
		
		return Mevent.Find_Img(quset[i].blank, n);
	}
	public static void clicko(int i) {
		Mevent.Click_expire(quset[i].orange, quset[i].orange, n);
	}
	public static void clickg(int i) {
		Mevent.Click_exists(quset[i].green,Img.quest_close, n);
		System.out.println("完成:"+quset[i].name);
		do {Mevent.Click_expire(Img.quest_close, Img.quest_close, n);
		Mevent.Delay(1);
		} while (Mevent.Find_Img(Img.quest_close,n));
		}
	public static void clickb(int i) {
		Mevent.Click_expire(quset[i].blank, quset[i].blank, n);
	}
	/*
	static String[][] daily_quest={
	{"敵艦隊を撃破せよ！",Img.battle_01,Img.battle_01_orange,Img.battle_01_green,},
	{"敵艦隊主力を撃滅せよ！",Img.battle_02,Img.battle_02_orange,Img.battle_02_green,},
	{"敵艦隊を10回邀撃せよ！",Img.battle_03,Img.battle_03_orange,Img.battle_03_green,},
	{"敵補給艦を3隻撃沈せよ！",Img.battle_04,Img.battle_04_orange,Img.battle_04_green,},
	{"南西諸島海域の制海権を握れ！",Img.battle_05,Img.battle_05_orange,"Null",},
	{"南西諸島海域の制海権を握れ！",Img.battle_05_02,Img.battle_05_orange_02,"Null",},
	};*/
	
	public static void IntoQuest() {
		Mevent.Click_exists(Img.quest, Img.quest_345,0.92f);
	}
	public static void DailyQuest() {
		Mevent.Click_expire(Img.Daily_black,Img.quest_345,0.92f );
	}
	public static void Select(){
		for (int i = 0; i < quset.length; i++) {
				if (!quset[i].iscompleted && !quset[i].isselected) {
					if (findb(i)) {
						clickb(i);
						quset[i].isselected=true;
					}
				}
		}
	}
	public static void Complete() {
		for (int i = 0; i < quset.length; i++) {
			if (i==2|i==4|i==6|i==8) {//skip 出擊10回,南西5次,遠征10次,補給15次
			}else {
				if (!quset[i].iscompleted ) {
					if (findg(i)) {
						clickg(i);
						quset[i].iscompleted=true;
					}
				}
			}
			
		}
	}

	public static void Start(){
		if (Button.Quest&&!quset[4].isselected&&!quset[8].isselected&&!quset[6].isselected) {
			IntoQuest();
			DailyQuest();
			Complete();
			Select();
			Actions.BackToBoko();
		}
	}

}
