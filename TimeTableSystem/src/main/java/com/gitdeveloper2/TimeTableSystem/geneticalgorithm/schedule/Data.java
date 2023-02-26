package com.gitdeveloper2.TimeTableSystem.geneticalgorithm.schedule;
import java.util.ArrayList;
import java.util.Arrays;
import com.geneticalgorithm.domain.course;
import com.geneticalgorithm.domain.department;
import com.geneticalgorithm.domain.instructor;
import com.geneticalgorithm.domain.room;
import com.geneticalgorithm.domain.meetingTime;
public class Data {
	
	private ArrayList<room> rooms;
	private ArrayList<instructor> instructors;
	private ArrayList<course> courses;
	private ArrayList<department> depts;
	private ArrayList<meetingTime> meetingTimes;
	private int numberOfClasses = 0;
	public Data (){initialize();}
	private Data initialize (){
		
		room room1 = new room ("CS 1",25);
		room room2 = new room ("CS 2",45);
		room room3 = new room ("CS 3",33);
		rooms = new ArrayList <room> (Arrays.asList(room1,room2,room3));
		
		meetingTime meetingTime1 = new meetingTime ("MT1" ,"MWF 09:00 - 10:00" );
		meetingTime meetingTime2 = new meetingTime ("MT2" ,"MWF 10:00 - 11:00" );
		meetingTime meetingTime3 = new meetingTime ("MT3" ,"TTH 09:00 - 10:30" );
		meetingTime meetingTime4 = new meetingTime ("MIT4" ,"TTH 10:00 - 12:00" );
		meetingTimes=new ArrayList <meetingTime> (Arrays.asList(meetingTime1,meetingTime2, meetingTime3,meetingTime4));
instructor instructor1 = new instructor ("I1", "DR. kinyua");
instructor instructor2 = new instructor ("I2", "DR. kimani");
instructor instructor3 = new instructor ("I3", "DR. kinyanjui");
instructor instructor4 = new instructor ("I4", "DR. Njeru");
instructors = new ArrayList<instructor> (Arrays.asList(instructor1,instructor2,instructor3,instructor4));

course course1 = new course ( "BIT 411", "411", new ArrayList <instructor>(Arrays.asList(instructor1,instructor2)), 25);
course course2 = new course ( "BIT 412", "412", new ArrayList <instructor>(Arrays.asList(instructor1,instructor2,instructor3)), 35);
course course3 = new course ( "BIT 413", "413", new ArrayList <instructor>(Arrays.asList(instructor1,instructor2)), 25);
course course4 = new course ( "BIT 415", "415", new ArrayList <instructor>(Arrays.asList(instructor3,instructor4)), 30);
course course5 = new course ( "BIT 416", "416", new ArrayList <instructor>(Arrays.asList(instructor4)), 35);
course course6 = new course ( "BIT 417", "417", new ArrayList <instructor>(Arrays.asList(instructor2,instructor4)), 45);
course course7 = new course ( "BIT 418", "418", new ArrayList <instructor>(Arrays.asList(instructor2,instructor4)), 45);
courses = new ArrayList<course>(Arrays.asList(course1,course2,course3,course4,course5,course6,course7));

department dept1 = new department ("COMPUTER SCIENCE AND INFORMATICS" , new ArrayList <course>(Arrays.asList(course1,course3,course2,course4,course5,course6,course7)));


/*
 * 
 * department dept2 = new department ("DEPT 2" , new ArrayList <course>(Arrays.asList(course2,course4,course5)));
department dept3 = new department ("DEPT 3" , new ArrayList <course>(Arrays.asList(course6,course7)));
depts = new ArrayList <department>(Arrays.asList(dept1,dept2,dept3));
 * 
 * */
depts = new ArrayList <department>(Arrays.asList(dept1));
depts.forEach(x->numberOfClasses+=x.getCourses().size());

System.out.println(depts.size());
return this;

	}
	
	public ArrayList <room> getRooms (){return rooms;}
	public ArrayList <instructor> getInstructors (){return instructors;}
	public ArrayList <course> getCourses (){return courses;}
	public ArrayList <department> getDepts (){return depts;}
	public ArrayList <meetingTime> getMeetingTimes (){return meetingTimes;}
public int getNumberOfClasses (){return this.numberOfClasses;}

}

