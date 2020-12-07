package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		//1
		int numbers[][] = new int[3][4];
		
		//2
		int temp[][] = { {37,15,22}, {12,36,49,33} };
		
		for(int[] element: temp)
			for(int number: element)
				System.out.println(number);
		System.out.println(temp.length);
		
		System.out.println(temp[1][3]);
		
		temp[0] [0] = 15;
		
		for(int i=0; i < temp.length; i++){ 
		
        for(int j=0; j < temp[i].length; j++)
			    System.out.print(temp[i][j]);
			
			System.out.println();
		}
			

	}

}
