package Ornekler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class lambdaornek_1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> s  =new ArrayList<>();
		s.addAll(Arrays.asList(new Integer[] {21,67,89,56,23,90,21}));
		List<Integer> lm = s.stream().map(p->p+5).collect(Collectors.toList());
		List<Integer> lm1 = s.stream().map(p->{if (p%2==0) p-=5 ; else  p+=5;return p;}).collect(Collectors.toList());
		List<Integer> lf2 = s.stream().filter(p->p<50).collect(Collectors.toList());
		List<Integer> lf3 = s.stream().filter(p->p>50&&p%2==0).collect(Collectors.toList());
		Optional<Integer> lf4 = s.stream().reduce((p1,p2)->p1+p2);
		System.out.println(lm);
		System.out.println(lm1);
		System.out.println(lf2);
		System.out.println(lf3);
		System.out.println(lf4);
		
		

	}

}
