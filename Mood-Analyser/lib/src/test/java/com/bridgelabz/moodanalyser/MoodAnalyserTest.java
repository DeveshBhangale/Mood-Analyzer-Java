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
	public void testMoodIsHappy() {
		String str =  moodAnalyser.analyseMood("I am Happy");
		Assert.assertEquals("Happy", str);
	}
	
	@Test
	public void testMoodIsSad() {
		String str =  moodAnalyser.analyseMood("I am not Happy");
		Assert.assertEquals("Sad", str);
	}
	
	@Test
	public void testMoodIsSadOrNot() {
		String str =  moodAnalyser.analyseMood("I am sad");
		Assert.assertEquals("Sad", str);
	}
	

}
