package dsa_Java;

import java.util.Arrays;

public class App {
//Code for calling the reverseArray class
	public static void main(String[] args) {
		int [] a = new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		ReverseArray b = new ReverseArray();
		a= b.Solve(a);
		System.out.println(Arrays.toString(a));
//Code for calling the generic class
		Generics<Integer> obj =new Generics<Integer>(10);
		Generics<String> obj2 =new Generics<String>("Sonu");
		obj.getType();
		
		
		
		
	}

}
