package Unity;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.temporal.TemporalAmount;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.SwingWorker;


public class Button {
	public static Boolean Battle=true,Quest=true,Creep=false;
	public static  JLabel[] expedition = {new JLabel("��������G"),new JLabel("��������T"),new JLabel("��������|")};
	
	public static  String[] Expedition = {"�����","02���Z������m��","03ĵ�ƥ���","04��Lĵ�٥���","05���W�@�å���","06���Ůg���t��","11�T�g�B�����","21�_�蹫���B��","37�F�ʫ��","38�F�ʫ��(�L)"};
	
	public static  JComboBox<String> Team2_Ensei = new JComboBox<>(Expedition);
	public static  JComboBox<String> Team3_Ensei = new JComboBox<>(Expedition);
	public static  JComboBox<String> Team4_Ensei = new JComboBox<>(Expedition);
	
	public static  JCheckBox	QuestCheck=new JCheckBox("���ѥ���");
	public static  JCheckBox	BattleCheck=new JCheckBox("���԰�");
	public static  JCheckBox	Autocreep=new JCheckBox("�۰ʰ��o");
	
	public static  JToggleButton  LoopProcessOnOff = new JToggleButton("����^��B�@");
	public static  JToggleButton  ExpeditionOnce= new JToggleButton("��������");
	public static  JToggleButton  Brush_flash = new JToggleButton("1-1��⦸");
	public static  JToggleButton  Short_battle = new JToggleButton("2-3���|��");
	public static  JToggleButton  Creepy = new JToggleButton("���o�@��");
	public static  JToggleButton  QuestinItialize = new JToggleButton("���m����");
	
	
	public static void Events() {
		
		 ItemListener Full_Loop = new ItemListener() {
				public void itemStateChanged(ItemEvent itemEvent) {
					int state = itemEvent.getStateChange();
					if (state == ItemEvent.SELECTED) {
						System.out.println("���U�j��");
						Full_Loop();
						
					} else if (state != ItemEvent.SELECTED) {
						System.out.println("�u�_�j��");
					}
				}
			};
			Button.LoopProcessOnOff.addItemListener(Full_Loop);
			//=========================================================
			ItemListener QuestCheck = new ItemListener() {
				public void itemStateChanged(ItemEvent itemEvent) {
					int state = itemEvent.getStateChange();
					if (state == ItemEvent.SELECTED) {
						System.out.println("���ѥ���");
						Quest=false;
						
						Button.Brush_flash.setEnabled(true);
					} else if (state != ItemEvent.SELECTED) {
						System.out.println("�n�ѥ���");
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
						System.out.println("���U��{");
						
						Brush_flash();
						Button.Brush_flash.setEnabled(true);
					} else if (state != ItemEvent.SELECTED) {
						System.out.println("�u�_��{");
					}
				}
			};
			
			Button.Brush_flash.addItemListener(Brush_flash);
		//=========================================================
			
			ItemListener Short_battle = new ItemListener() {
				public void itemStateChanged(ItemEvent itemEvent) {
					int state = itemEvent.getStateChange();
					if (state == ItemEvent.SELECTED) {
						System.out.println("2-3���|��");
					ShortBattle_start();
					} else if (state != ItemEvent.SELECTED) {
						System.out.println("���԰�");
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
						System.out.println("���U����");
						ExpeditionOnce() ;
					} else if (state != ItemEvent.SELECTED) {
						System.out.println("�u�_����");
					}
				}
			};
			Button.ExpeditionOnce.addItemListener(ExpeditionOnce);
			//=========================================================
			ItemListener BattleCheck = new ItemListener() {
				public void itemStateChanged(ItemEvent itemEvent) {
					int state = itemEvent.getStateChange();
					if (state == ItemEvent.SELECTED) {
						System.out.println("���԰�");
						Battle=false;
						
						//Button.Brush_flash.setEnabled(true);
					} else if (state != ItemEvent.SELECTED) {
						System.out.println("�n�԰�");
						Battle=true;
					}
				}
			};
			Button.BattleCheck.addItemListener(BattleCheck);
		
		//=========================================================
			ItemListener Creepy_once = new ItemListener() {
				public void itemStateChanged(ItemEvent itemEvent) {
					int state = itemEvent.getStateChange();
					if (state == ItemEvent.SELECTED) {
						System.out.println("���U���o");
						Creepy();
					} else if (state != ItemEvent.SELECTED) {
						System.out.println("�u�_���o");
					}
				}
			};
			Button.Creepy.addItemListener(Creepy_once);
			
		//=========================================================
			ItemListener AutoCreep = new ItemListener() {
				public void itemStateChanged(ItemEvent itemEvent) {
					int state = itemEvent.getStateChange();
					if (state == ItemEvent.SELECTED) {
						System.out.println("�|���o");
						Creep=true;
						
						//Button.Brush_flash.setEnabled(true);
					} else if (state != ItemEvent.SELECTED) {
						System.out.println("�����o");
						Creep=false;
						
					}
				}
			};
			Button.Autocreep.addItemListener(AutoCreep);
		
		//=========================================================
			//=========================================================
			ItemListener questInitialize = new ItemListener() {
				public void itemStateChanged(ItemEvent itemEvent) {
					int state = itemEvent.getStateChange();
					if (state == ItemEvent.SELECTED) {
						System.out.println("���ȭ��m");
						
						Quest_Initialize();
						Button.Brush_flash.setEnabled(true);
					} else if (state != ItemEvent.SELECTED) {
						System.out.println("���m���ȧ���");
						
					}
				}
			};
			
			Button.QuestinItialize.addItemListener(questInitialize);
		
	}
	
	public static void Creepy() {

		SwingWorker<Void, Void> Creepy_work = new SwingWorker<Void, Void>() {

			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("���o");
				Button.setDisabled();
				// TODO Auto-generated method stub
				modo.Creepy();
				Button.setEnabled();
				Button.Creepy.setSelected(false);
				
				
				return null;
			}
		};
		Creepy_work.execute();

	}
	
	public static void Brush_flash() {

		SwingWorker<Void, Void> Brush_flash_work = new SwingWorker<Void, Void>() {

			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("��{");
				Button.setDisabled();
				// TODO Auto-generated method stub
				//Attacks.Solo1_1();
				//L1.Delay(3);
				
				
				//Unity.Quest.Start_check();
				Unity.Quest.n=Unity.Quest.n-.01f;
				
				
				Button.setEnabled();
				Button.Brush_flash.setSelected(false);
				
				
				return null;
			}
		};
		Brush_flash_work.execute();

	}
	public static void Quest_Initialize() {

		SwingWorker<Void, Void> Quest_Initialize_work = new SwingWorker<Void, Void>() {

			@Override
			protected Void doInBackground() throws Exception {
				
				Button.setDisabled();
				// TODO Auto-generated method stub
				//Attacks.Solo1_1();
				//L1.Delay(3);
				
				Unity.Quest.initialize();
				//Unity.Quest.Start_check();
				
				
				Button.setEnabled();
				Button.QuestinItialize.setSelected(false);
				
				
				return null;
			}
		};
		Quest_Initialize_work.execute();

	}
	private static void ExpeditionOnce() {
		SwingWorker<Void, Void> ExpeditionOnce_work = new SwingWorker<Void, Void>() {
			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("�����}�l����@��");
				Button.setDisabled();
				// TODO Auto-generated method stub
				modo.ExpeditionOnce();
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
				System.out.println("�԰��}�l");
				
				Button.setDisabled();
				// TODO Auto-generated method stub
				modo.short_battle();
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
				System.out.println("�}�l");
				// TODO Auto-generated method stub
				Button.setDisabled();
				modo.Loop();
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
		Creepy.setEnabled(false);
		QuestinItialize.setEnabled(false);
	}
	public static void setEnabled(){
		Mevent.Delay(1);
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
		Creepy.setEnabled(true);
		QuestinItialize.setEnabled(true);
	}
	public static   void Expedition_trun() {
		switch (Team2_Ensei.getSelectedItem().toString()) {
		case "02���Z������m��":
			Unity.Expedition.locate[0]=2;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "03ĵ�ƥ���":
			Unity.Expedition.locate[0]=3;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "04��Lĵ�٥���":
			Unity.Expedition.locate[0]=4;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "05���W�@�å���":
			Unity.Expedition.locate[0]=5;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "06���Ůg���t��":
			Unity.Expedition.locate[0]=6;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "11�T�g�B�����":
			Unity.Expedition.locate[0]=11;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "21�_�蹫���B��":
			Unity.Expedition.locate[0]=21;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "37�F�ʫ��":
			Unity.Expedition.locate[0]=37;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "38�F�ʫ��(�L)":
			Unity.Expedition.locate[0]=38;
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		case "�����":
			System.out.println(Team2_Ensei.getSelectedItem().toString());
			break;
		default:
			break;
		}
		switch (Team3_Ensei.getSelectedItem().toString()) {
		case "02���Z������m��":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[1]=2;
			break;
		case "03ĵ�ƥ���":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[1]=3;
			break;
		case "04��Lĵ�٥���":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[1]=4;
			break;
		case "05���W�@�å���":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[1]=5;
			break;
		case "06���Ůg���t��":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[1]=6;
			break;
		case "11�T�g�B�����":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[1]=11;
			break;
		case "21�_�蹫���B��":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[1]=21;
			break;
		case "37�F�ʫ��":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[1]=37;
			break;
		case "38�F�ʫ��(�L)":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[1]=38;
			break;
		case "�����":
			System.out.println(Team3_Ensei.getSelectedItem().toString());
			break;
		default:
			break;
		}
		switch (Team4_Ensei.getSelectedItem().toString()) {
		case "02���Z������m��":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[2]=2;
			break;
		case "03ĵ�ƥ���":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[2]=3;
			break;
		case "04��Lĵ�٥���":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[2]=4;
			break;
		case "05���W�@�å���":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[2]=5;
			break;
		case "06���Ůg���t��":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[2]=6;
			break;
		case "11�T�g�B�����":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[2]=11;
			break;
		case "21�_�蹫���B��":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[2]=21;
			break;
		case "37�F�ʫ��":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[2]=37;
			break;
		case "38�F�ʫ��(�L)":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			Unity.Expedition.locate[2]=38;
			break;
		case "�����":
			System.out.println(Team4_Ensei.getSelectedItem().toString());
			break;
		default:
			break;
		}
	}
	
	
	
}
