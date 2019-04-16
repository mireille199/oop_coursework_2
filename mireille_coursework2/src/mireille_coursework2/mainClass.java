package mireille_coursework2;

import java.util.ArrayList;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> names = new ArrayList();
		Scanner scan = new Scanner(System.in);
		int n=1;		
		

	
	while(true) {
		System.out.print("Enter Student "+ n + ":");
		String name = new Scanner(System.in).nextLine();
		
		if(name.toLowerCase().equals("exit"))
			break;
		else {
			names.add(name);
		
			Students course = new Students();
		
			
		}
		n++;
				
	}
		
	}
	

}
