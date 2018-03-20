package com.cisc181.core;
import java.util.UUID;
import java.util.ArrayList;

public class Section {
	
	private UUID CouseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	private ArrayList<Student> rosterlist;

	public UUID getCouseID() {
		return CouseID;
	}
	public void setCouseID(UUID couseID) {
		CouseID = couseID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	public Section(UUID c, UUID s, UUID se, int R) {
		super();
		this.CouseID = c;
		this.SemesterID = s;
		this.SectionID = se;
		this.RoomID = R; 
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Student> getRoster() {
		return rosterlist;
	}

	
	public void setRoster(ArrayList<Student> students) {
		this.rosterlist = students;
	}
	
	
}
