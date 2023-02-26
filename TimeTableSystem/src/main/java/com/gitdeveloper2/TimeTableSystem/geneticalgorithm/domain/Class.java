package com.gitdeveloper2.TimeTableSystem.geneticalgorithm.domain;

public class Class {
	private int id;
	private department dept;
	private course course;
	private instructor instructor;
	private room room;
	private meetingTime meetingTime;

	public Class (int id, department dept, course course){
	this.id=id;
	this.dept=dept;
	this.course=course;
	}





	public void setInstructor (instructor instructor){
	this.instructor=instructor;
	}
	public void setMeetingTime(meetingTime meetingTime){
	this.meetingTime=meetingTime;}
	public void setRoom(room room){
	this.room=room;
	}
	public int getId(){
	return this.id;
	}
	public department getDept(){
	return this.dept;
	}
	public course getCourse(){
	return this.course;
	}
	public instructor getInstructor(){
	return instructor;
	}
	public meetingTime getMeetingTime(){
	return this.meetingTime;
	}
	public room getRoom(){
	return this.room;
	}

	public String toString (){
	return "["+dept.getName()+","+course.getNumber()+","+room.getNumber()+","+instructor.getId()+"."+meetingTime.getId ()+"]";
	}







}
