package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;


public class Staff_Test {

	static ArrayList<Staff> staffs = new ArrayList<Staff>();

	 
	@Test
	public void Salarytesting() {
		Staff one = new Staff(eTitle.MR);
		Staff two = new Staff(eTitle.MR);
		Staff three = new Staff(eTitle.MR);
		Staff four = new Staff(eTitle.MRS);
		Staff five = new Staff(eTitle.MRS);
		
		one.setSalary(10000.00);
		two.setSalary(10000.00);
		three.setSalary(10000.00);
		four.setSalary(10000.00);
		five.setSalary(10000.00);
	
		staffs.add(one);
		staffs.add(two);
		staffs.add(three);
		staffs.add(four);
		staffs.add(five);
		
	
	}
	public void test() {
		double x = 0;
		double y = 0;
		for (Staff s: staffs) {
			x += s.getSalary();
		}
		
		y = x/staffs.size();
		assertEquals(y,10000, 1);
		
		
	}	

}
