package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericTest{
	public static void main(String[] args){
		Collection<Integer> iList = new ArrayList<Integer>();
		Collection<Double> dList = new ArrayList<Double>();
		for(int j = 0; j < 10; j++){
			iList.add(j);
		       	dList.add(j+0.50);	
		}
		System.out.println("Number of odd integers, from 1-10 is ");
		countOdd(iList);
		System.out.println("Number of odd  doubles, from 1-10 is ");
		countOdd(dList);
	}

	public static <T> void countOdd(Collection<T> list){
		int count = 0;
		Iterator<T> iterator = list.iterator();
		while(iterator.hasNext()){
			try{
				int i = (Integer)iterator.next();
				if(i%2 == 1){
					count = count +1;
				}

			}catch(ClassCastException e){
				System.out.println("Cant do integer division if list elements are not integer");
				break;
			}
		}
		System.out.println(count);
	}
}
