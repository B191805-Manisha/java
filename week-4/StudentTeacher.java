import java.util.*;
import java.lang.*;

class person{
	String name,add;
	
	person(String name,String add){
		this.name=name;
		this.add=add;
	}
	
	String getName(){
		return this.name;
	}
	
	String getAddress(){
		return this.add;
	}
}

class student extends person{
	int numCourse=0;
	String[] courses=new String[30];
	int[] grades=new int[30];
	
	student(String name,String add){
		super(name,add);
	}
	
	void addCourseGrade(String course,int grade){
		if(numCourse==30){
			System.out.println("30 Courses registered. so not allowed");
			return;
		}
		courses[numCourse]=course;
		grades[numCourse]=grade;
		this.numCourse+=1;
	}
	
	void printGrades(){
		System.out.print("Grades of "+this.name+":\n");
		for(int i=0;i<numCourse;i++){
			System.out.println((i+1)+" "+courses[i]+" "+grades[i]);
		}
	}
	
	double getAverageGrade(){
		double sm=0;
		for(int i=0;i<numCourse;i++){
			sm+=grades[i];
		}
		return sm/numCourse;
	}
}

class teacher extends person{
	int numCourse=0;
	String courses[]=new String[5];
	
	teacher(String name,String add){
		super(name,add);
	}
	
	boolean addCourse(String name){
		if(numCourse==5){
			System.out.println("limit cmplted");
			return false;
		}
		for(int i=0;i<numCourse;i++){
			if(courses[i]==name){
				System.out.println("Already exists");
				return false;
			}
		}
		
		System.out.println("course added successfully");
		courses[numCourse]=name;
		numCourse+=1;
		return true;
	}
	
	boolean removeCourse(String name){
		for(int i=0;i<numCourse;i++){
			if(courses[i]==name){
				courses[i]="$";
				numCourse-=1;
				System.out.println("course removed successfully");
				return true;
			}
		}
		
		System.out.println("course not found");
		return false;
	}
	
	void printCourses(){
		System.out.print("courses of "+this.name+":\n");
		int k=1;
		for(int i=0;i<numCourse;i++){
			if(courses[i]!="$"){
				System.out.println(k+" "+courses[i]);
				k+=1;
			}
		}
	}
}


class StudentTeacher{
	public static void main(String args[]){
		student s=new student("uday","rgukt basar");
		s.addCourseGrade("DAS",10);
		s.addCourseGrade("DAA",6);
		s.addCourseGrade("JAVA",8);
		s.printGrades();
		System.out.println("avg grades "+s.getAverageGrade());
		
		teacher t=new teacher("bala","hyd");
		t.addCourse("ece");
		t.addCourse("cse");
		t.addCourse("mech");
		t.addCourse("ece");
		t.printCourses();
		t.removeCourse("mech");
		t.printCourses();
		
	}
}







































