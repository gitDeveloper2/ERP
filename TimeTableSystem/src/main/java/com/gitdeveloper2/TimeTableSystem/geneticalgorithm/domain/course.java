package com.gitdeveloper2.TimeTableSystem.geneticalgorithm.domain;
import java.util.ArrayList;
public class course {
	private String number=null;
	private String name=null;
	private int max_Num_Students;
	private ArrayList<instructor> instructors;
	public course (String number, String name,ArrayList<instructor> instructors,int max_Num_Students){
	this.number=number;
	this.name=name;
	this.instructors=instructors;
	this.max_Num_Students=max_Num_Students;
	}
	public String getNumber() {return number;}
	public String getName() {return name;}
	
	public ArrayList<instructor> getInstructors(){
		return instructors;
		}
	public int getMaxNumbOfStudents (){
	return max_Num_Students;
	}
	

}
