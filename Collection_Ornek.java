package Ornekler;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collection_Ornek {


	public static void main(String[] args) {
		HashMap<Integer, String> x = new HashMap<Integer, String>();
		x.put(1,"A");
		x.put(2,"B");
		x.put(3,"A");
		x.put(11,"C");
		x.put(8,"D");
		System.out.println(x);
		TreeMap<Integer,String> y = new TreeMap<Integer, String>(x);
		System.out.println(y);



	}

}
