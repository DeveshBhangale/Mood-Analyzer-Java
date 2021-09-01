package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	private String message;
	
	public MoodAnalyser() {
		super();
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	
	public String analyseMood(String message) {
		if(message.toLowerCase().contains("happy") && !message.toLowerCase().contains("not")) {
			return "Happy";
		}
		else {
			return "Sad";
		}
	}
	
	public String analyseMood() {
		if(message.toLowerCase().contains("happy") && !message.toLowerCase().contains("not")) {
			return "Happy";
		}
		else {
			return "Sad";
		}
	}

}
