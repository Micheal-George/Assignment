package com.Dayten;

public class HistoryStudent extends Student{

	int historyMarks;
	int civicsMarks;
	
	public HistoryStudent(int historyMarks,int civicsMarks)
	{
		this.historyMarks=historyMarks;
		this.civicsMarks=civicsMarks;
	}
	
	
	@Override
	float getPercentage() {
		
		return (float)(historyMarks+civicsMarks)/2;
	}

}
