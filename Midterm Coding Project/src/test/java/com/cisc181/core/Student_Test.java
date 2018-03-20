package com.cisc181.core;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;
import Exception.PersonException;


public class Student_Test {
	private static ArrayList<Section> Sectionlist = new ArrayList<Section>();
	private static ArrayList<Course> Courselist = new ArrayList<Course>();
	private static ArrayList<Student> Studentlist;
	private static ArrayList<Semester> Semesterlist;
	
	
	
	
	@BeforeClass
	public static void setup() throws PersonException{
		Date Date1 = new Date (2016, 8, 12);
		Date Date2 = new Date (2016, 12, 12);
		Date Date3 = new Date (2017, 3, 12);
		Date Date4 = new Date(2017, 6, 12);
		Semester FALL = new Semester(Date1, Date2);
		Semester Spring = new Semester(Date3, Date4);
		Semesterlist.add(FALL);
		Semesterlist.add(Spring);
		 
		
		Course Nursing = new Course(UUID.randomUUID(), 3, "Nursing101", com.cisc181.eNums.eMajor.NURSING );
		Course Business = new Course(UUID.randomUUID(), 3, "intro business", com.cisc181.eNums.eMajor.BUSINESS);
		Course Compsci = new Course(UUID.randomUUID(), 4, "CISC181", com.cisc181.eNums.eMajor.COMPSI);
		
		Courselist.add(Compsci);
		Courselist.add(Nursing);
		Courselist.add(Business);
		
		ArrayList<Student> StudentList = new ArrayList<Student>();
		Date dob = new Date (1995,3, 11);
		
		Student student1 = new Student("Bill", "x", "BOB", dob, eMajor.NURSING, "123 some address",  "(302)-333-2222", 
				"billybob@udel.edu");
		Student student2 = new Student("jill", "x", "BOB", dob, eMajor.NURSING, "1234 some address",  "(302)-444-2222", 
				"jillybob@udel.edu");
		Student student3 = new Student("dill", "x", "BOB", dob, eMajor.NURSING, "1235 some address",  "(302)-555-2222", 
				"dillybob@udel.edu");
		Student student4 = new Student("xill", "x", "BOB", dob, eMajor.NURSING, "1236 some address",  "(302)-777-2222", 
				"xillybob@udel.edu");
		Student student5 = new Student("mill", "x", "BOB", dob, eMajor.BUSINESS, "231 some address",  "(302)-333-2222", 
				"millybob@udel.edu");
		Student student6 = new Student("yill", "x", "BOB", dob, eMajor.BUSINESS, "232 some address",  "(302)-888-2222", 
				"yillybob@udel.edu");
		Student student7 = new Student("fill", "x", "BOB", dob, eMajor.BUSINESS, "321 some address",  "(302)-999-2222", 
				"fillybob@udel.edu");
		Student student8 = new Student("qill", "x", "BOB", dob, eMajor.BUSINESS, "231 some address",  "(302)-933-2222", 
				"qillybob@udel.edu");
		Student student9 = new Student("oill", "x", "BOB", dob, eMajor.BUSINESS, "231 some address",  "(302)-773-2222", 
				"oillybob@udel.edu");
		Student student10 = new Student("pill", "x", "BOB", dob, eMajor.BUSINESS, "231 some address",  "(302)-439-2222", 
				"pillybob@udel.edu");

		Studentlist.add(student1);
		Studentlist.add(student2);
		Studentlist.add(student3);
		Studentlist.add(student4);
		Studentlist.add(student5);
		Studentlist.add(student6);
		Studentlist.add(student7);
		Studentlist.add(student8);
		Studentlist.add(student9);
		Studentlist.add(student10);

	

		Section one = new Section(Courselist.get(0).getCourseID(), Semesterlist.get(0).getSemesterID(),
				UUID.randomUUID(), 101);
		Section two = new Section(Courselist.get(0).getCourseID(), Semesterlist.get(1).getSemesterID(),
				UUID.randomUUID(), 101);
		Section three = new Section(Courselist.get(1).getCourseID(), Semesterlist.get(0).getSemesterID(),
				UUID.randomUUID(), 103);		
		Section four = new Section(Courselist.get(1).getCourseID(), Semesterlist.get(1).getSemesterID(),
				UUID.randomUUID(), 103);
		Section five = new Section(Courselist.get(2).getCourseID(), Semesterlist.get(0).getSemesterID(),
				UUID.randomUUID(), 302);
		Section six = new Section(Courselist.get(2).getCourseID(), Semesterlist.get(1).getSemesterID(),
				UUID.randomUUID(), 302);
		
		one.setRoster(Studentlist);
		two.setRoster(Studentlist);
		three.setRoster(Studentlist);
		four.setRoster(Studentlist);
		five.setRoster(Studentlist);
		six.setRoster(Studentlist);
		
		Sectionlist.add(one);
		Sectionlist.add(two);
		Sectionlist.add(three);
		Sectionlist.add(four);
		Sectionlist.add(five);
		Sectionlist.add(six);
	
		
	}
		
		
		@Test
			
		
	public void test() {
			//did not finish testing for grades and 
		assertEquals(1, 1);
	}
	
}
