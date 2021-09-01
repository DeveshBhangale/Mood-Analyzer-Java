package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	private String message;
	
	public MoodAnalyser() {
		super();
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	
	public String analyseMood(String message) throws MoodAnalyserException {
		try {
			if(message.toLowerCase().contains("happy") && !message.toLowerCase().contains("not")) {
				return "Happy";
			}
			else {
				return "Sad";
			}
		}
		catch(NullPointerException e) {
			throw new MoodAnalyserException("Invalid Input");
		}
	}
	
	public String analyseMood() throws MoodAnalyserException {
		try {
			if(message.toLowerCase().contains("happy") && !message.toLowerCase().contains("not")) {
				return "Happy";
			}
			else {
				return "Sad";
			}
		}
		catch(NullPointerException e) {
			throw new MoodAnalyserException("Invalid Input");
		}
	}

}
