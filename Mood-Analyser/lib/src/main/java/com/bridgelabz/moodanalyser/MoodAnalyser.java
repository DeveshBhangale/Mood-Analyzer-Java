package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	
	public String analyseMood(String input) {
		if(input.toLowerCase().contains("happy") && !input.toLowerCase().contains("not")) {
			return "Happy";
		}
		else {
			return "Sad";
		}
	}

}
