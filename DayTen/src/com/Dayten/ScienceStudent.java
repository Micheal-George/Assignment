package com.Dayten;

public class ScienceStudent extends Student{
	
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	
	public ScienceStudent(int phisicsMarks,int chemistryMarks,int mathsMarks) {
		this.phisicsMarks=phisicsMarks;
		this.chemistryMarks=chemistryMarks;
		this.mathsMarks=mathsMarks;
	}
	@Override
	float getPercentage() {
		
		return (float)(mathsMarks+phisicsMarks+chemistryMarks)/3;
		
	}
	
	



}
