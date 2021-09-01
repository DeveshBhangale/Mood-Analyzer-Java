package com.bridgelabz.moodanalyser;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class MoodAnalyserTest {
	private MoodAnalyser moodAnalyser;
	
	@Before
	public void initialize() {
		moodAnalyser = new MoodAnalyser();
	}
	
	@Test
	public void testMood() {
		String str =  moodAnalyser.analyseMood("I am Happy");
		Assert.assertEquals("Happy", str);
	}

	

}
