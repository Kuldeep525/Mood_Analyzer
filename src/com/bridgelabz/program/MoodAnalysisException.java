package com.bridgelabz.program;

public class MoodAnalysisException extends Exception {

	public TypeOfException type ;
	enum TypeOfException {ENTERED_NULL , ENTERED_EMPTY}
		
		


	public MoodAnalysisException(String message , TypeOfException type) {
		super();
		this.type = type;
	}

}
