package com.gitdeveloper2.TimeTableSystem.geneticalgorithm.domain;
import java.util.ArrayList;
public class department {
	private String name;
	private ArrayList<course> courses;
	public department(String name,ArrayList<course> courses){
		this.name=name;
		this.courses=courses;
	}
public String getName(){ return name;}
public ArrayList<course> getCourses(){return courses;}

}
