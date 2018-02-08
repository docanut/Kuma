package Unity;

public class modo {
	public static void Loop() {
		while (true) {
			Button.Expedition_trun();
			Unity.Expedition.start();
			if (Button.LoopProcessOnOff.isSelected()==false)
				{
				break;
				}
			if (Button.Battle) 
				{
				Unity.Battles.Ro500_Solo();
				}else if 
				(Button.Creep) 
				{
					Creepy();
				}
			if (Button.LoopProcessOnOff.isSelected()==false)
				{
				break;
				}
			Unity.Expedition.start();
			if (Button.LoopProcessOnOff.isSelected()==false)
				{
				break;
				}
			if (Button.Battle) 
				{
				Unity.Battles.Four_SS_Auto23();
				Ships.Start();
				}
			if (Button.LoopProcessOnOff.isSelected()==false) 
				{
				break;
				}
			if (Button.Creep) {
				if (Quest.Checkquestcomplete()) {
					Button.Battle=false;
				}
			}
		}
	}
	public static void short_battle() {

		Battles.Ro500_Solo();
		Battles.Four_SS_Auto23();
		Ships.Start();
	}
	public static void ExpeditionOnce() {
		Button.Expedition_trun();
		Unity.Expedition.start();
		
	}
	public static void Bursh_flash() {
		
	}
	public static void Creepy() {
		Battles.SS_solo23();
		Ships.Start();
	}
}
