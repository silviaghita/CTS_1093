package ro.ase.csie.cts.g1093.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

import jdk.jfr.Category;
import ro.ase.csie.cts.g1093.testing.exceptions.WrongAgeException;
import ro.ase.csie.cts.g1093.testing.exceptions.WrongGradeException;
import ro.ase.csie.cts.g1093.testing.exceptions.WrongNameException;
import ro.ase.csie.cts.g1093.testing.models.Student;
import ro.ase.csie.cts.g1093.testing.tests.categories.ImportantTest;
import ro.ase.csie.cts.g1093.testing.tests.categories.PerformanceTest;

public class TestStudent {
	
	//test fixture
	static Student student;
	static ArrayList<Integer> grades;
	static String initialName = "John";
	static int initialAge = 21;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		grades = new ArrayList<>();
		grades.add(9);
		grades.add(10);
		grades.add(8);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	    grades.clear();
	    grades = null;
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(initialName, initialAge, grades);
	}

	@After
	public void tearDown() throws Exception {
		student = null;
	}

	@Ignore
	@org.junit.Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@org.junit.Test
	public void testSetNameConfromanceForRightInput() throws WrongNameException {
		
		String newName = "John Doe";
		student.setName(newName);
		assertEquals("Testing with a proper name", newName, student.getName());
	}
	
	@org.junit.Test
	public void testSetAgeConformanceForRightInput() {
		int newAge = initialAge + 1;
		try {
			student.setAge(newAge);
			assertEquals("Testing with right values", newAge, student.getAge());
		} catch (WrongAgeException e) {
			fail("We got an exception for right data");
		}
	}
	
	@org.junit.Test
	public void testSetAgeErrorConditionNegativeValue() {
		int newAge = initialAge * -1;
		try {
			student.setAge(newAge);
			fail("We didn't get the exception");
		} catch (WrongAgeException e) {
			assertTrue(true);
		}
	}
	
	@org.junit.Test(expected = WrongNameException.class)
	public void testSetNameErrorConditionSmallName() throws WrongNameException {
		String newName = "Io";
		student.setName(newName);
	}
	
	@org.junit.Test
	public void testGetGradesAverageOrderingAsc() throws WrongGradeException {
		ArrayList<Integer> grades = new ArrayList<>();
		for(int i = 5; i < 10; i++) {
			grades.add(i);
		}
		student.setGrades(grades);
		
		float expectedAverage = 7.5f;
		float computedAverage = student.getGradesAverage();
				
		assertEquals("Testing with sorted array of grades", expectedAverage, computedAverage, 1);
		
	}
	
	@org.junit.Test
	public void testGetGradesAverageCardinalityZero() throws WrongGradeException {
		ArrayList<Integer> grades = new ArrayList<>();
		student.setGrades(grades);
		
		float expectedAverage = 0;
		float computedAverage = student.getGradesAverage();
		
		assertEquals("Testing with an empty array of grades", expectedAverage, computedAverage, 0);

	}
	
	@org.junit.Test
	public void testGetGradesAverageCardinalityOne() throws WrongGradeException {
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(Student.MAX_GRADE);
		student.setGrades(grades);
		
		float expectedAverage = Student.MAX_GRADE;
		float computedAverage = student.getGradesAverage();
		
		assertEquals("Testing with an empty array of grades", expectedAverage, computedAverage, 0);

	}
	
	
	@org.junit.Test
	public void testGetGradesAverageExistenceNullReferenceForGrades() throws WrongGradeException {
		student.setGrades(null);
		
		float expectedAverage = 0;
		float computedAverage = student.getGradesAverage();
		
		assertEquals("Testing with null for grades", expectedAverage, computedAverage, 0);

	}

}
