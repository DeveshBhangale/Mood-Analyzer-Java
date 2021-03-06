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
	public void testMoodIsHappy() throws MoodAnalyserException {
		String str =  moodAnalyser.analyseMood("I am Happy");
		Assert.assertEquals("Happy", str);
	}
	
	@Test
	public void testMoodIsSad() throws MoodAnalyserException {
		String str =  moodAnalyser.analyseMood("I am not Happy");
		Assert.assertEquals("Sad", str);
	}
	
	@Test
	public void testMoodIsSadOrNot() throws MoodAnalyserException {
		String str =  moodAnalyser.analyseMood("I am sad");
		Assert.assertEquals("Sad", str);
	}
	
	@Test
	public void testMoodIsHappyUsingConstructor() throws MoodAnalyserException {
		MoodAnalyser moodAnalyserUsingConstructor =  new MoodAnalyser("I am Happy");
		Assert.assertEquals("Happy", moodAnalyserUsingConstructor.analyseMood());
	}
	
	@Test(expected = MoodAnalyserException.class)
	public void testMoodIsInValid() throws MoodAnalyserException {
		Assert.assertEquals("Invalid Input", moodAnalyser.analyseMood(null));
	}
	

}
