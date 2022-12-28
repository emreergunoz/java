package Ornekler;

import java.util.Timer;
import java.util.TimerTask;

public class timerornek {
	public static int s =0;
	public static void main(String[] args) {
		
		Timer t = new Timer();
		TimerTask tgorev = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("t1");
				s++;
				if (s==10) t.cancel();
			}
		};
		TimerTask tgorev2 = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("t2" );
				s++;
			}
		};
		t.schedule(tgorev, 0,300);
		t.schedule(tgorev2, 500,500);

	}

}
