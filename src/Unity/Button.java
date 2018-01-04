package Unity;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.SwingWorker;


public class Button {
	public static Boolean Battle=true,Quest=true;
	public static  JLabel expedition1 = new JLabel("遠征隊伍二");
	public static  JLabel expedition2 = new JLabel("遠征隊伍三");
	public static  JLabel expedition3 = new JLabel("遠征隊伍四");
	
	public static  String[] Expedition = {"未選擇","02長距離航海練習","03警備任務","04對淺警戒任務","05海上護衛任務","06防空射擊演習","11鋁土運輸任務","21北方鼠式運輸","37東京急行","38東京急行(貳)"};
	
	public static  JComboBox<String> Team2_Ensei = new JComboBox<>(Expedition);
	public static  JComboBox<String> Team3_Ensei = new JComboBox<>(Expedition);
	public static  JComboBox<String> Team4_Ensei = new JComboBox<>(Expedition);
	
	public static  JCheckBox	QuestCheck=new JCheckBox("不解任務");
	public static  JCheckBox	BattleCheck=new JCheckBox("不戰鬥");
	
	public static  JToggleButton  LoopProcessOnOff = new JToggleButton("整體回圈運作");
	public static  JToggleButton  ExpeditionOnce= new JToggleButton("遠征ㄧ次");
	public static  JToggleButton  Brush_flash = new JToggleButton("1-1刷兩次");
	public static  JToggleButton  Short_battle = new JToggleButton("2-3打四次");
	public static void Events() {
		
		 ItemListener Full_Loop = new ItemListener() {
				public void itemStateChanged(ItemEvent itemEvent) {
					int state = itemEvent.getStateChange();
					if (state == ItemEvent.SELECTED) {
						System.out.println("按下迴圈");
						Full_Loop();
						
					} else if (state != ItemEvent.SELECTED) {
						System.out.println("彈起迴圈");
					}
				}
			};
			Button.LoopProcessOnOff.addItemListener(Full_Loop);
			//=========================================================
			ItemListener QuestCheck = new ItemListener() {
				public void itemStateChanged(ItemEvent itemEvent) {
					int state = itemEvent.getStateChange();
					if (state == ItemEvent.SELECTED) {
						System.out.println("不解任務");
						Quest=false;
						
						Button.Brush_flash.setEnabled(true);
					} else if (state != ItemEvent.SELECTED) {
						System.out.println("要解任務");
						Quest=true;
					}
				}
			};
			
			Button.QuestCheck.addItemListener(QuestCheck);
		
		//=========================================================
	     ItemListener Brush_flash = new ItemListener() {
				public void itemStateChanged(ItemEvent itemEvent) {
					int state = itemEvent.getStateChange();
					if (state == ItemEvent.SELECTED) {
						System.out.println("按下刷閃");
						Brush_flash();
						
						Button.Brush_flash.setEnabled(true);
					} else if (state != ItemEvent.SELECTED) {
						System.out.println("彈起刷閃");
					}
				}
			};
			
			Button.Brush_flash.addItemListener(Brush_flash);
		//=========================================================
			
			ItemListener Short_battle = new ItemListener() {
				public void itemStateChanged(ItemEvent itemEvent) {
					int state = itemEvent.getStateChange();
					if (state == ItemEvent.SELECTED) {
						System.out.println("2-3打四次");
					ShortBattle_start();
					} else if (state != ItemEvent.SELECTED) {
						System.out.println("不戰鬥");
					}
				}
			};
			Button.Short_battle.addItemListener(Short_battle);
	
		//=========================================================
		//=========================================================
			
			ItemListener ExpeditionOnce = new ItemListener() {
				public void itemStateChanged(ItemEvent itemEvent) {
					int state = itemEvent.getStateChange();
					if (state == ItemEvent.SELECTED) {
						System.out.println("按下遠征");
						ExpeditionOnce() ;
					} else if (state != ItemEvent.SELECTED) {
						System.out.println("彈起遠征");
					}
				}
			};
			Button.ExpeditionOnce.addItemListener(ExpeditionOnce);
			//=========================================================
			ItemListener BattleCheck = new ItemListener() {
				public void itemStateChanged(ItemEvent itemEvent) {
					int state = itemEvent.getStateChange();
					if (state == ItemEvent.SELECTED) {
						System.out.println("不戰鬥");
						Battle=false;
						
						//Button.Brush_flash.setEnabled(true);
					} else if (state != ItemEvent.SELECTED) {
						System.out.println("要戰鬥");
						Battle=true;
					}
				}
			};
			Button.BattleCheck.addItemListener(BattleCheck);
		
		//=========================================================
		
	}
	

	public static void Brush_flash() {

		SwingWorker<Void, Void> Brush_flash_work = new SwingWorker<Void, Void>() {

			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("刷閃");
				Button.setDisabled();
				// TODO Auto-generated method stub
				//Attacks.Solo1_1();
				//L1.Delay(3);
				
				
				
				
				Repair.Start();
				Button.setEnabled();
				Button.Brush_flash.setSelected(false);
				
				
				return null;
			}
		};
		Brush_flash_work.execute();

	}
	private static void ExpeditionOnce() {
		SwingWorker<Void, Void> ExpeditionOnce_work = new SwingWorker<Void, Void>() {
			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("遠征開始執行一次");
				Button.setDisabled();
				// TODO Auto-generated method stub
				Button.Expedition_trun();
				Unity.Expedition.start();
				Button.setEnabled();
				Button.ExpeditionOnce.setSelected(false);
				return null;
			}
		};
		ExpeditionOnce_work.execute();

	}
	private static void ShortBattle_start() {

		SwingWorker<Void, Void> ShortBattle_start_work = new SwingWorker<Void, Void>() {

			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("戰鬥開始");
				
				Button.setDisabled();
				// TODO Auto-generated method stub
				Battles.Ro500_Solo();
				Battles.Four_SS_Auto23();
				Repair.Start();
				Button.setEnabled();
				Button.Short_battle.setSelected(false);
				// TODO Auto-generated method stub
				return null;
			}
		};
		ShortBattle_start_work.execute();

	}
	
	private static void Full_Loop() {

		SwingWorker<Void, Void> Full_Loop_work = new SwingWorker<Void, Void>() {
			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("開始");
				// TODO Auto-generated method stub
				Button.setDisabled();
				while (true) {
					Expedition_trun();
					Unity.Expedition.start();
					if (Button.LoopProcessOnOff.isSelected()==false) {break;}
					if (Battle) {Unity.Battles.Ro500_Solo();}
					if (Button.LoopProcessOnOff.isSelected()==false) {break;}
					Unity.Expedition.start();
					if (Button.LoopProcessOnOff.isSelected()==false) {break;}
					if (Battle) {Unity.Battles.Four_SS_Auto23();}
					if (Button.LoopProcessOnOff.isSelected()==false) {break;}
					
				}
				Button.setEnabled();
				Button.Short_battle.setSelected(false);
				// TODO Auto-generated method stub
				return null;
			}
		};
		Full_Loop_work.execute();

	}
	
	public static void setDisabled() {
		Kuma.Change_icon(1);
		ExpeditionOnce.setEnabled(false);
		Brush_flash.setEnabled(false);
		Short_battle.setEnabled(false);
		Team2_Ensei.setEnabled(false);
		Team3_Ensei.setEnabled(false);
		Team4_Ensei.setEnabled(false);
		//SSBattle.setEnabled(false);
		//LoopProcessOnOff.setEnabled(false);
		QuestCheck.setEnabled(false);
		BattleCheck.setEnabled(false);
	}
	public static void setEnabled(){
		Kuma.Change_icon(0);
		ExpeditionOnce.setEnabled(true);
		Brush_flash.setEnabled(true);
		Short_battle.setEnabled(true);
		Team2_Ensei.setEnabled(true);
		Team3_Ensei.setEnabled(true);
		Team4_Ensei.setEnabled(true);
		//LoopProcessOnOff.setEnabled(true);
		QuestCheck.setEnabled(true);
		BattleCheck.setEnabled(true);
		
	}
	public static   void Expedition_trun() {
		switch (Team2_Ensei.getSelectedItem().toString()) {
		case "02長距離航海練習":
			Unity.Expedition.locate2=2;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "03警備任務":
			Unity.Expedition.locate2=3;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "04對淺警戒任務":
			Unity.Expedition.locate2=4;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "05海上護衛任務":
			Unity.Expedition.locate2=5;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "06防空射擊演習":
			Unity.Expedition.locate2=6;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "11鋁土運輸任務":
			Unity.Expedition.locate2=11;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "21北方鼠式運輸":
			Unity.Expedition.locate2=21;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "37東京急行":
			Unity.Expedition.locate2=37;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "38東京急行(貳)":
			Unity.Expedition.locate2=38;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "未選擇":
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		default:
			break;
		}
		switch (Team3_Ensei.getSelectedItem().toString()) {
		case "02長距離航海練習":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate3=2;
			break;
		case "03警備任務":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate3=3;
			break;
		case "04對淺警戒任務":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate3=4;
			break;
		case "05海上護衛任務":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate3=5;
			break;
		case "06防空射擊演習":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate3=6;
			break;
		case "11鋁土運輸任務":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate3=11;
			break;
		case "21北方鼠式運輸":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate3=21;
			break;
		case "37東京急行":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate3=37;
			break;
		case "38東京急行(貳)":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate3=38;
			break;
		case "未選擇":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			break;
		default:
			break;
		}
		switch (Team4_Ensei.getSelectedItem().toString()) {
		case "02長距離航海練習":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate4=2;
			break;
		case "03警備任務":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate4=3;
			break;
		case "04對淺警戒任務":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate4=4;
			break;
		case "05海上護衛任務":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate4=5;
			break;
		case "06防空射擊演習":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate4=6;
			break;
		case "11鋁土運輸任務":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate4=11;
			break;
		case "21北方鼠式運輸":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate4=21;
			break;
		case "37東京急行":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate4=37;
			break;
		case "38東京急行(貳)":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate4=38;
			break;
		case "未選擇":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			break;
		default:
			break;
		}
	}
	
	
	
}
