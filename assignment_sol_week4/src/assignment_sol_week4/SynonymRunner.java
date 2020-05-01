package assignment_sol_week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SynonymRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String response;
		do {
			System.out.println("Enter a word:");
			String key = sc.nextLine();
			Synonym obj = new Synonym();
			if (obj.checkKey(key)) {
				//print synonyms of input key
				obj.toString(key);
				
			}
			else {
				System.out.println("Do you want to add " +key+ " to the list(Y/N):");
				String wish = sc.nextLine();
				if (wish.equals("Y")) {
					List<String> list = new ArrayList<String>();
					System.out.println("Enter synonyms of "+key+":");
					String input = sc.nextLine();
					while(!input.equals("")) {
						list.add(input);
						input = sc.nextLine();
					}
					obj.setter(key, list);
				}
			}
			System.out.println("Do you wish to continue?(Y/N):");
			response = sc.nextLine();
		}while(!response.equals("N"));
		
		sc.close();
		System.out.println("Bye");
	}
}
