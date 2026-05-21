package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class P1 {
	public static void main(String[] args) {
		Collection<Object> list = new ArrayList<>();
		
		list.add(Integer.valueOf(100));
        list.add(Double.valueOf(3.14));
        list.add(Long.valueOf(21L));
        list.add(Short.valueOf("100"));
        list.add(Double.valueOf(5.1));
        list.add("Kitty");
        list.add(Integer.valueOf(100));
        list.add(new Object());
        list.add("Snoopy");
        list.add(new BigInteger("1000"));
        
        //印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
        //Iterator
        for (Iterator it = list.iterator(); it.hasNext();)
			System.out.print(it.next() + " ");

		System.out.println();
		
		//傳統for
        for (int i = 0; i< list.size(); i++) {
        	System.out.print(((ArrayList<Object>) list).get(i) + " ");
        }
        
        System.out.println("");
        
        
        for(Object obj : list) {
            System.out.print(obj + " ");
        }
        
        //移除number以外的obj
        list.removeIf(item -> !(item instanceof Number));

        System.out.println("\n移除後的數量: " + list.size());
        System.out.println("留下來的obj:");
        
        for(Object obj : list) {
            System.out.print( obj + " ");
        
        
        }
	}
}
