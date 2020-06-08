package com.sol.assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionRunner{

	public static void main(String[] args) throws Exception {

		List<Question> question = new ArrayList<>();
		
		Question q1 = new Question("Who is India's Prime Minister?", "Narendra Modi","Donald Trump", "ABC", "None", "A");
		
		Question q2 = new Question("Which country is responsible for COVID-19?", "USA","Italy", "China", "India", "C");

		question.add(q1);
		question.add(q2);

		Scanner sc = new Scanner(System.in);
		
		for (Question tempQuestion: question) {
			//get the question
			System.out.println(tempQuestion.getQuestion());
			
			//get all the options for this question in a list 
			List<String> options = tempQuestion.getOptions();
			int a = 65;
			for (String tempOptions: options) {
				System.out.println("(" + (char)a+ ") "+ tempOptions);
				a += 1;
			}
			
			System.out.print("Enter your answer:");
			
			//calling timer class : not implemented yet
			
			String ans = sc.nextLine();
			
			
			if ((!ans.equals(tempQuestion.getCorrectAnswer().toLowerCase())) && (!ans.equals(tempQuestion.getCorrectAnswer()))) {
				System.out.println("Sorry wrong answer!");
			}
			
			
			//Thread.sleep(5000);
			
		}
		sc.close();
	}

}



