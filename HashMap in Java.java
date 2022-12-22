import java.util.*;

public class Main
{
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put(1, 'a');
		h.put(2, 'b');
		h.put(3, 'c');
		System.out.println(h);
		
		Set s = h.keySet();
		System.out.println(s);
		
		Collection c = h.values();
		System.out.println(c);
		
		Set s1 = h.entrySet();
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
		    Map.Entry m = (Map.Entry)itr.next();
		    System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}
}

