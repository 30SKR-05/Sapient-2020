package com.sol.assignment5;

import java.util.ArrayList;
import java.util.List;

public class Question {

	private String question;
	private String opt1, opt2, opt3, opt4;
	private String correctOpt;
	
	public Question(String question, String opt1, String opt2, String opt3, String opt4, String correctOpt) {
		this.question = question;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.correctOpt = correctOpt;
	}

	public String getQuestion() {
		return this.question;
	}

	public List<String> getOptions() {
		List<String> options = new ArrayList<String>();
		options.add(this.opt1);
		options.add(this.opt2);
		options.add(this.opt3);
		options.add(this.opt4);
		return options;
	}

	public String getCorrectAnswer() {
		return this.correctOpt;
	}

}
