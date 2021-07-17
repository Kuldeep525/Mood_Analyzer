package com.bridgelabz.program;

public class MoodAnalyser  {
	
	private String message;
	public MoodAnalyser() {
		
	}
	
	public MoodAnalyser(String message) {
		this.message = message;
	
	}

	
    public  String analyseMood() throws MoodAnalysisException {
    	String messageForEmptyString = "Message is Empty ,Please enter Valid message";
    	String mesaageForNullString = "Message is Null ,Please enter Valid message" ;
    	
    	
    	try	{
    		if(message.length() == 0) 
    			throw new MoodAnalysisException( messageForEmptyString,MoodAnalysisException.TypeOfException.ENTERED_EMPTY);
    		else if (message.contains("sad"))
    			return "SAD";
    		else 
    			return "HAPPY";
    		
    	} catch (NullPointerException e) {
    		throw new  MoodAnalysisException(mesaageForNullString,MoodAnalysisException.TypeOfException.ENTERED_NULL);
    	}
    }

}
