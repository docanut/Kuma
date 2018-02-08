package Unity;

public class Actions {
	static float n=0.9f;
	public static void Prophet_phase() {
		//Mevent.Random_Click(new Region(X, Y, W, H));
		Mevent.Delay(1);
		Mevent.Random_Click(566, 607);
		Mevent.Delay(1);
	}
	public static void Overview_phase() {
		Mevent.Delay(1);
		Mevent.Random_Click(114, 607);
		Mevent.Delay(1);
		Mevent.Random_Click(331, 695);
		Mevent.Delay(1);
		Mevent.Random_Click(567, 651);
		Mevent.Delay(1);
	}
	public static  void Teamselect_Hokyu(int x) {
		switch (x) {
		case 1:
			//Mevent.ClickToExpire(Img.number1);
			break;
		case 2:
			Mevent.Click_expire(Img.number2, Img.number2, n);
			break;
		case 3:
			Mevent.Click_expire(Img.number3,Img.number3,n);
			break;
		case 4:
			Mevent.Click_expire(Img.number4,Img.number4,n);
			break;
		default:
			break;
		}
		}
	public static void Hokyu(int xx) {

		Mevent.Click_expire(Img.hoku,Img.hoku,n);
		Teamselect_Hokyu(xx);
		
		hokyu_check();
		
			
	}
	public static void hokyu_check() {
		do {
			Mevent.Move_to(135, 160);
			Mevent.Delay(3);
			Mevent.Random_Click(135,160);
		} while (Mevent.Find_Img(Img.houkyuready, n));
	}
	public static void Hokyu_side(int xx) {

		Mevent.Click_exists(Img.hoku_side, Img.hoku_side_light, 0.85f);
		Teamselect_Hokyu(xx);
		
		//Mevent.Random_Click(135, 160);
		while(Mevent.Find_Img(Img.houkyuready, n)){
			Mevent.Move_to(135, 160);
			Mevent.Delay(3);
			Mevent.Random_Click(135, 160);
			
		}
			
	}
	
	
	public static void Expeditionback() {
		while(Mevent.Find_Img(Img.ensei_back, 0.8f))
		{
		Mevent.Click_expire(Img.ensei_back, Img.ensei_back, 0.8f);
		Mevent.Delay(5);
		while(Mevent.Find_Img(Img.shutsugeki, n)){
			//防指lag 等出擊圖示消失財前進
		}
			while(!Mevent.Find_Img(Img.shutsugeki,n)){
				Mevent.Random_Click(400, 300);
				
			}
		}
			
	
	}


	public static void BackToBoko() {
		
		while(true){
			if (Mevent.Find_Img(Img.ensei_back,n)||Mevent.Find_Img(Img.shutsugeki,n)) {
				System.out.println("已回母港");
				break;
			}
			if (Mevent.Find_Img(Img.shutsugeki, n) ){
				Mevent.Click_expire(Img.hoku, Img.hoku, n);
			}else{}
			if(!Mevent.Find_Img(Img.shutsugeki,n)){
				Mevent.Delay(3);
				Mevent.Random_Click(45, 77);
				System.out.println("進入母港");
				Mevent.Delay(3);
			}
			
		}
		Expeditionback() ;
		 
		 
	}
	public static boolean checkfourss(boolean x){
		int start=0,end=0;
		if(x){
			start=1;
			end=5;
		}else{
			start=0;
			end=1;
		}
		for (int i = start; i < end; i++) {
			if(Mevent.Find_Img_Region(Img.Nyuukyo, Ships.SS[i][2], n)){	
				return false;
			}
		}
		return true;
		
	}
}
