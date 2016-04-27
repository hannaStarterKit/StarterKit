package com.capgemini.main;


import java.util.ArrayList;

import com.capgemini.coins.Coins;
import com.capgemini.fibonacci.Fibonacci;
import com.capgemini.pascalrectangle.PascalRectangle;
import com.capgemini.placeToSplit.PlaceToSplit;
import com.capgemini.pythagorean.Pythagorean;

public class MainClass {
	
	
	
	public static void main(String[] args) {
		//Fibonacci fibonacci = null;
		PascalRectangle pascalRectangle = new PascalRectangle();
		//Integer[] i=new Integer[]{0,1};
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(1);
		int[] numers = {1,1,2,1};
		
		@SuppressWarnings("static-access")
		long result = Fibonacci.fib(7);
		System.out.println(result);
		
		
		System.out.println(pascalRectangle.pascal(1,2));
		System.out.println(Coins.solution(list));
		System.out.println(Pythagorean.solution());
		System.out.println(PlaceToSplit.canBalance(numers));
	}
}
