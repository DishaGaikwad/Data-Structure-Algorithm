package com.assignment.datastructures.test;
import java.util.*;
import com.assignment.datastructures.service.ArrayProcessor;
import com.assignment.datastructures.service.StringOrganizer;

public class Main {

	public static void main(String[] args) {
		int[] numbers= {3,4,8,5,6,3,46,23,4,3,2,567,678345};
		ArrayProcessor processor=new ArrayProcessor();
		processor.processArray(numbers);
		
		StringOrganizer organizer = new StringOrganizer();
        Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter up to 20 string :");
		
			while(true) {
				System.out.println("add string(or type 'exit'):");
				String input=sc.nextLine();
				if(input.equalsIgnoreCase("exit"))break;
				organizer.addString(input);
						
			}
			organizer.printStrings();
		}
	
	
}
