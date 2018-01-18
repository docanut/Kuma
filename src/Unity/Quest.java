package Unity;
public class Quest {
	static float n=0.93f;
	//public static boolean AutoQuestCheck=true;
	static String[][] daily_quest={
	{"敵艦隊を撃破せよ！",Img.battle_01,Img.battle_01_orange,Img.battle_01_green,},
	{"敵艦隊主力を撃滅せよ！",Img.battle_02,Img.battle_02_orange,Img.battle_02_green,},
	{"敵艦隊を10回邀撃せよ！",Img.battle_03,Img.battle_03_orange,Img.battle_03_green,},
	{"敵補給艦を3隻撃沈せよ！",Img.battle_04,Img.battle_04_orange,Img.battle_04_green,},
	{"南西諸島海域の制海権を握れ！",Img.battle_05,Img.battle_05_orange,"Null",},
	{"南西諸島海域の制海権を握れ！",Img.battle_05_02,Img.battle_05_orange_02,"Null",},
	};
	
	public static void IntoQuest() {
		Mevent.Click_exists(Img.quest, Img.quest_345,0.92f);
	}
	public static void DailyQuest() {
		Mevent.Click_expire(Img.Daily_black,Img.quest_345,0.92f );
	}
	
	public static void Check() {
		for (int i = 0; i < 6; i++) {
			if (Mevent.Find_Img(daily_quest[i][1],n) && Mevent.Find_Img(Img.two_solt,n)) {
				Mevent.Click_exists(daily_quest[i][1], daily_quest[i][2], n);
				System.out.println("執行:"+daily_quest[i][0]);
				if (i==0 || i==1 ) {
					break;
				}
			}
		}

	}

	public static void Done() {
		for (int i = 0; i < 4; i++) {
			if (i!=2) {
				if (Mevent.Find_Img(daily_quest[i][3],n)) {
				Mevent.Click_exists(daily_quest[i][3], Img.quest_close, n);
				System.out.println("完成:"+daily_quest[i][0]);
				do {Mevent.Click_expire(Img.quest_close, Img.quest_close, n);
				Mevent.Delay(1);
				} while (Mevent.Find_Img(Img.quest_close,n));
			}
			}
			
		}
	}
	public static void Start(){
		if (Unity.Button.Quest) {
			Start_check();
		}
	}
	public static void Start_check() {
		
		Actions.Overview_phase();
		if (Mevent.Find_Img(Img.battle_05_poi,n)) {
			Unity.Button.Quest=false;
		}
			if (Unity.Button.Quest) {
			IntoQuest();
			DailyQuest();
			Done();
			Check();
			Actions.BackToBoko();
		}
		
		
		
		
	}
}
