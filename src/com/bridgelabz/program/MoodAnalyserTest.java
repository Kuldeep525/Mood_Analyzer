package com.bridgelabz.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	 @Test
	   void givenMessage_ToMoodAnalyser_ShouldReturnSad()throws MoodAnalysisException {
		  MoodAnalyser mood = new MoodAnalyser("I am in sad mood"); 
		  String message = mood.analyseMood();
		  assertEquals("SAD" , message );
	  
	  }
	 @Test
	 void givenMessage_ToMoodAnalyser_ShouldReturnHappy()throws MoodAnalysisException {
		 MoodAnalyser mood = new MoodAnalyser("I am in Happy mood"); 
		 String message =  mood.analyseMood();
		 assertEquals("HAPPY" , message );
		  
	 }
	 @Test
	 void givenMessage_ToMoodAnalysers_ShouldReturnHappy()throws MoodAnalysisException {
		 
		 MoodAnalyser mood = new MoodAnalyser("I m in mood ");
		 String message ;
		 try {
			 message = mood.analyseMood();
			 assertEquals("HAPPY",message);
		 }catch(MoodAnalysisException e) {
			e.printStackTrace();
		 }
	 }
	 
	 @Test
	 void givenMessageNull_ToMoodAnalysers_ShouldReturnProperException()throws MoodAnalysisException {
		 
		 MoodAnalyser mood = new MoodAnalyser(null);
		 try {
			 mood.analyseMood();
		 }catch(MoodAnalysisException e) {
			 assertEquals(MoodAnalysisException.TypeOfException.ENTERED_NULL,e.type);
		 }
	 }	 
	 
	 @Test
	 void givenMessageEmpty_ToMoodAnalysers_ShouldReturnProperException()throws MoodAnalysisException {
		 
		 MoodAnalyser mood = new MoodAnalyser(" ");
		 try {
			 mood.analyseMood();
		 }catch(MoodAnalysisException e) {
			 assertEquals(MoodAnalysisException.TypeOfException.ENTERED_EMPTY,e.type);
		 }
	 }
		 
	 
}
