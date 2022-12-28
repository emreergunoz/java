package Ornekler;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Denemeler {

		static List<Integer> l = new ArrayList<>(
				Arrays.asList(new Integer[] {16,3,1,22}));
		static int s = 0;
		

	
	public static void main(String[] args) {
		
		Timer z = new Timer();
		
		TimerTask g = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println(l);
				l = l.stream().
						map(p->{
							if(p%2==0 && s%2==0) p/=2;
							else p=p+1;
							return p;
						}).
						collect(Collectors.toList());
				s++;
				if(s>=5) z.cancel();
			}
		};
		
		z.schedule(g,0,500);
		
	}

			
		

}
