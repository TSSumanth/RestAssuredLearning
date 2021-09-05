package javaprogams;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class mycomparator {

	public static void main(String[] args) {
		Comparator c = (I1,I2)->{			
			return 1;
		};
		
		Comparator<Integer> c2 = (I1,I2)->{			
			if(I1>I2)
				return 1;
			else if(I1<I2)
				return -1;
			else
				return 0;
		};
		
		Comparator<String> c3 = (S1,S2)->{			
			if(S1.length()>S2.length())
				return 1;
			else if(S1.length()<S2.length())
				return -1;
			else
				return 0;
		};
		
		Comparator<Character> c4 = (S1,S2)->{			
			if(S1>S2)
				return 1;
			else if(S1<S2)
				return -1;
			else
				return 0;
		};
		
		String str = "sdhhfhuwuirhuasfsd";
		char[] cr = str.toCharArray();
		
		Set<Character> se = new TreeSet<Character>(c4);
		for(char strcr:cr) {
			se.add(strcr);
		}
		System.out.println(se);
		Set<Integer> s = new TreeSet<Integer>(c2);
		s.add(1);
		s.add(10);
		s.add(-1);
		s.add(3);
		System.out.println(s);
	
		
	}

}
