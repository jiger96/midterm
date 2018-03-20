package com.cisc181.core;
import java.util.UUID;
import com.cisc181.eNums.eMajor;
import java.util.ArrayList;
	

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	private ArrayList<Section> Sectionlist = new ArrayList<Section>();

	public Course (UUID CourseID, int GP, String Name, eMajor M) {
		super();
		CourseID= CourseID;
		GradePoints = GP;
		CourseName = Name;
		Major=M;
	}
	
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public String getCouseName() {
		return CourseName;
	}
	public void setCouseName(String couseName) {
		CourseName = couseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	public eMajor getMajor() {
		return Major;
	}
	public void setMajor(eMajor major) {
		Major = major;
	}
	/**
	 * Returns the list of sections for the course
	 * @return
	 */
	public ArrayList<Section> getSection() {
		return Sectionlist;
	}

	/**
	 * Sets the list of sections for the course (2 per course)
	 * @param section
	 */
	public void setSection(Section section) {
		Sectionlist.add(section);
	}


}
