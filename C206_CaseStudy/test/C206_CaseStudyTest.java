import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Member m1; //jonathan
	private Member m2; //jonathan
	private Member updateM1; //jonathan
	private Member updateM2; //jonathan

	private Registration r1;
	private Registration r2;

	private Course c1; //yiqian
	private Course c2; //yiqian
	private Course c3; //yiqian
	private Course c4;
	private Course c5;
	private Course c6;
	private CourseSchedule cs1; //yiqian
	private CourseSchedule cs2; //yiqian
	private CourseSchedule cs3; //yiqian
	private ArrayList<CourseSchedule> csl1; //yiqian
	private ArrayList<CourseSchedule> csl2; //yiqian

	private CourseCategory cc1;
	private CourseCategory cc2;

	private ArrayList<Member> MemberList; //jonathan
	private ArrayList<Registration> regList; //Boaz
	private ArrayList<Course> courseList; //yiqian
	private ArrayList<CourseCategory> categoryList;//daryl
	private ArrayList<CourseSchedule> courseScheduleList; //Myron

	@Before
	public void setUp() throws Exception {

		m1 = new Member("John","Male",84440720,"John@gmail.com","22/07/2020","Singapore","pass1234"); //jonathan
		m2 = new Member("May","Female",84440721,"May@gmail.com","21/07/2010","Singapore","pass12345"); //jonathan

//		r1 = new Registration("DBIS", 1234); //Boaz
//		r2 = new Registration("DBA", 4321); //Boaz


		cc1 = new CourseCategory("Political Science", "Something about politics"); //daryl
		cc2 = new CourseCategory("English", "Something about england"); //daryl
		
		MemberList= new ArrayList<Member>(); //jonathan
		regList = new ArrayList<Registration>(); //Boaz
		courseList = new ArrayList<Course>(); //yiqian
		categoryList = new ArrayList<CourseCategory>();//Daryl
		courseScheduleList = new ArrayList<CourseSchedule>(); // Myron
		
		csl1 = new ArrayList<CourseSchedule>(); //yiqian
		csl2 = new ArrayList<CourseSchedule>(); //yiqian
		//adding items in course schedule
		cs1 = new CourseSchedule(1,"Math",50,"1/1/2020","1/5/2020","12pm","2pm","Woodlands"); //yiqian
		csl1.add(cs1); //yiqian
		cs2 = new CourseSchedule(2,"Math",70,"3/1/2020","3/3/2020","5pm","6pm","Bukit Batok" ); //yiqian
		csl1.add(cs2); //yiqian
		cs3 = new CourseSchedule(1,"Science",70,"3/1/2020","3/3/2020","5pm","6pm","Bukit Merah" ); //yiqian
		csl2.add(cs3); //yiqian
		//adding items in course category
		CourseCategory ccM = new CourseCategory("Math", "Math");
		categoryList.add(ccM);
		CourseCategory ccS = new CourseCategory("Science", "Science");
		categoryList.add(ccS);
		//creating course
		c1 = new Course(1,"Addition","1+1",ccM,null,"From Jan to June",null); //yiqian
		c2 = new Course(2,"Subtraction","1-1",ccM,null,"From Jan to June",null); //yiqian
		c3 = new Course(3,"Science","Plants",ccS,null,"From Feb to June",null); //yiqian
		c4 = new Course(4,"Addition","1+1",ccM,csl1,"From Jan to June",null); //yiqian
		c5 = new Course(5,"Subtraction","1-1",ccM,csl1,"From Jan to June",null); //yiqian
		c6 = new Course(6,"Science","Plants",ccS,csl2,"From Feb to June",null); //yiqian
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

	@Test //jonathan
	public void addMemberTest() {
		// Item list is not null, so that can add a new member - boundary
		assertNotNull("Check if there is valid Member arraylist to add to", MemberList);
		//Given an empty list, after adding 1 member, the size of the list is 1 - normal
		//The member just added is as same as the first item of the list
		C206_CaseStudy.addNewMember(MemberList, m1);
		assertEquals("Check that Member arraylist size is 1", 1, MemberList.size());
		assertSame("Check that Member is added", m1, MemberList.get(0));

		//Add another Member. test The size of the list is 2? -normal
		//The item just added is as same as the second member of the list
		C206_CaseStudy.addNewMember(MemberList, m2);
		assertEquals("Check that Member arraylist size is 2", 2, MemberList.size());
		assertSame("Check that Member is added", m2, MemberList.get(1));
	}
	
	@Test //jonathan
	public void retrieveAllMemberTest() {
		// Test if Member list is not null but empty -boundary
		assertNotNull("Test if there is valid Member arraylist to retrieve item", MemberList);

		//test if the list of Member retrieved from the C206_CaseStudy is empty - boundary
		String allMember= C206_CaseStudy.retrieveAllMember(MemberList);
		String testOutput = "";
		assertEquals("Check that retrieveAllMember", testOutput, allMember);

		//Given an empty list, after adding 2 Member, test if the size of the list is 2 - normal
		C206_CaseStudy.addNewMember(MemberList, m1);
		C206_CaseStudy.addNewMember(MemberList, m2);
		assertEquals("Test that Member arraylist size is 2", 2, MemberList.size());

		//test if the expected output string same as the list of Member retrieved from the C206_CaseStudy	
		allMember = C206_CaseStudy.retrieveAllMember(MemberList);
		testOutput = String.format("%-10s %-10s %-10s %-40s %-10s %-20s %-20s\n","John","Male",84440720,"John@gmail.com","22/07/2020","Singapore","pass1234");
		testOutput += String.format("%-10s %-10s %-10s %-40s %-10s %-20s %-20s\n","May","Female",84440721,"May@gmail.com","21/07/2010","Singapore","pass12345");

		assertEquals("Test that ViewAllCamcorderlist", testOutput, allMember);
	}
	@Test //jonathan
	public void updateMemberTest() {
		// Test if Member list is not null so there member to delete -boundary
		assertNotNull("Test if there is valid Member arraylist to retrieve item", MemberList);
		//Test update - normal
		updateM1 = new Member("john", "", 84440759, "", "", "Malaysia", "Pass4321");
		C206_CaseStudy.updateMemberDetails(MemberList,updateM1);
		String updated = String.format("%-10s %-10s %-10s %-40s %-10s %-20s %-20s\n","John","Male",84440759,"John@gmail.com","22/07/2020","Malaysia","Pass4321");
		assertEquals("Test update works",MemberList.get(1),updated);
	}
	
	@Test // jonathan
	public void searchMemberTest() {
		// Test if Member list is not null so there member to delete -boundary
		assertNotNull("Test if there is valid Member arraylist to retrieve item", MemberList);
		//Test search by country - normal
		String testSearch = String.format("%-10s %-10s %-10s %-40s %-10s %-20s %-20s\n","John","Male",84440720,"John@gmail.com","22/07/2020","Singapore","pass1234");
		C206_CaseStudy.searchMemberByCountryOfResidence(MemberList,"Singapore");
		assertEquals("Test right member found",MemberList.get(1),testSearch);
	}
	@Test //jonathan
	public void deleteMemberTest() {
		// Test if Member list is not null so there member to delete -boundary
		assertNotNull("Test if there is valid Member arraylist to retrieve item", MemberList);
		//Given a list of 1 member, after deleting a member check if list is 0 -normal
		C206_CaseStudy.deleteMember(MemberList,"John");
		assertEquals("Test that Member arraylist size is 0",0,MemberList.size());
		//Given a list of 2 member, after deleting a member check if list is 1 -normal
		C206_CaseStudy.deleteMember(MemberList,"John");
		assertEquals("Test that Member arraylist size is 1",1,MemberList.size());
	}
	
	@Test //Boaz
	public void RegisterForCourseScheduleTest() {
		// Registration list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid Registration arraylist to add to", regList);

		//Given an empty list, after adding 1 Registration, the size of the list is 1 - normal
		//The Registration just added is as same as the first item of the list
		C206_CaseStudy.registerForCourseSchedule(regList, r1);		
		assertEquals("Test that Chromebook arraylist size is 1", 1, regList.size());
		assertSame("Test that Registration is added", r1, regList.get(0));

		//Add another Registration. test The size of the list is 2? - normal
		//The Registration just added is as same as the second Registration of the list
		C206_CaseStudy.registerForCourseSchedule(regList, r2);
		assertEquals("Test that regList arraylist size is 2", 2, regList.size());
		assertSame("Test that Chromebook is added", r2, regList.get(1));
	}
	
	@Test //Boaz
	public void retrieveAllRegistrationsTest() {
		// Test if Registration list is not null but empty -boundary
		assertNotNull("Test if there is valid Registration arraylist to retrieve item", regList);

		//test if the list of Registration retrieved from the SourceCentre is empty - boundary
		String allRegistration= C206_CaseStudy.retrieveAllRegistrations(regList);
		String testOutput = "";
		assertEquals("Check that ViewAllRegistrationlist", testOutput, allRegistration);

		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.registerForCourseSchedule(regList, r1);
		C206_CaseStudy.registerForCourseSchedule(regList, r2);
		assertEquals("Test that Registration arraylist size is 2", 2, regList.size());

		//test if the expected output string same as the list of Registration retrieved from the SourceCentre	
		allRegistration= C206_CaseStudy.retrieveAllRegistrations(regList);
		testOutput = String.format("%-20s %-30s\n","1234", "DBIS");
		testOutput += String.format("%-20s %-30s\n","4321", "DBA");

		assertEquals("Test that ViewAllRegistrations", testOutput, allRegistration);
	}
	
	@Test //Boaz
	public void deleteRegistrationTest() {
		// Test if Registration list is not null so there member to delete -boundary
		assertNotNull("Test if there is valid Registration arraylist to retrieve item", regList);
		//Given a list of 1 Registration, after deleting a Registration check if list is 0 -normal
		C206_CaseStudy.deleteRegistration(regList);
		assertEquals("Test that Registration arraylist size is 0",0,regList.size());
		//Given a list of 2 Registration, after deleting a Registration check if list is 1 -normal
		C206_CaseStudy.deleteRegistration(regList);
		assertEquals("Test that Registration arraylist size is 1",1,regList.size());
	}

	//By yiqian
	@Test
	public void addCourse() {
//		 Test if course list is not null but is empty -boundary
		assertNotNull("Test if there is valid course arraylist to add to", courseList);
		
		//Given an empty list, after adding a course, the size of the list is 1
		C206_CaseStudy.addCourse(1,"Addition","1+1","Math","From Jan to June",null,courseList,categoryList);
		assertEquals("Test if that course arraylist size is 1?", 1, courseList.size());
		
		//The course just added is as same as the first item of the list
//		assertSame("Test that course is added same as 1st item of the list?", c1, courseList.get(0));
		assertEquals("Check that getCourseList",c1.toString(), courseList.get(0).toString());

//		//Test that after adding another course, the size of the list is 2
		C206_CaseStudy.addCourse(2,"Subtraction","1-1","Math","From Jan to June",null,courseList,categoryList);
		assertEquals("Test that course arraylist size is 2?", 2, courseList.size());
	}

	@Test
	public void getCourseList() {
		//Test if course list is not null but is empty -boundary
		assertNotNull("Test if there is valid course arraylist to add to", courseList);
		
		
		String allCourses= C206_CaseStudy.getCourseList(courseList);
		String testOutput = "";
		assertEquals("Check that getCourseList", testOutput, allCourses);

		C206_CaseStudy.addCourse(1,"Addition","1+1","Math","From Jan to June",null,courseList,categoryList);
		C206_CaseStudy.addCourse(2,"Subtraction","1-1","Math","From Jan to June",null,courseList,categoryList);
		assertEquals("Test if that Camcorder arraylist size is 2?", 2, courseList.size());

		allCourses= C206_CaseStudy.getCourseList(courseList);

		testOutput = String.format("%-10s %-15s %-15s %-20s %-20s %-22s %-10s\n", "1", "Addition", "Math", "1+1", "From Jan to June", null,"Yes");
		testOutput += String.format("%-10s %-15s %-15s %-20s %-20s %-22s %-10s\n", "2", "Subtraction", "Math", "1-1", "From Jan to June", null,"Yes");

		assertEquals("Check that getCourseList",allCourses, testOutput);
	}

	@Test
	public void deleteCourse() {
		//Test if course list is not null but is empty -boundary
		assertNotNull("Test if there are courses in the course arraylist", courseList);
		
		C206_CaseStudy.addCourse(1,"Addition","1+1","Math","From Jan to June",null,courseList,categoryList);
		C206_CaseStudy.addCourse(2,"Subtraction","1-1","Math","From Jan to June",null,courseList,categoryList);
		C206_CaseStudy.addCourse(3,"Science","Plants","Science","From Feb to June",null,courseList,categoryList);
		
		assertEquals("Test that course arraylist size is 3",3,courseList.size());
		
		//Test cannot delete - error
		C206_CaseStudy.deleteCourse(1,courseList);
		assertEquals("Test that course arraylist size is 3",3,courseList.size());
		
		//Test cannot delete - error
		C206_CaseStudy.deleteCourse(2,courseList);
		assertEquals("Test that course arraylist size is 3",3,courseList.size());
		
	}
	
	@Test
	public void updateCourse() {
		assertNotNull("Test if there are courses in the course arraylist", courseList);
	}
	
	@Test
	public void searchCourseByCategoryName() {
		assertNotNull("Test if there are courses in the course arraylist", courseList);
		
		assertNotNull("Test if there are courses in the course category arraylist", categoryList);
		
		C206_CaseStudy.addCourse(1,"Addition","1+1","Math","From Jan to June",null,courseList,categoryList);
		C206_CaseStudy.addCourse(2,"Subtraction","1-1","Math","From Jan to June",null,courseList,categoryList);
		C206_CaseStudy.addCourse(3,"Science","Plants","Science","From Feb to June",null,courseList,categoryList);
		
		ArrayList<Course> result = C206_CaseStudy.searchCourseByCategoryName("Math",courseList, categoryList);
		assertEquals("Test that result size is 2",2,result.size());
		
		ArrayList<Course> result2 = C206_CaseStudy.searchCourseByCategoryName("Science",courseList, categoryList);
		assertEquals("Test that result size is 1",1,result2.size());
	}
	
	@Test
	public void listAllCourseSchedulesForACourse() {
		//Test if course list is not null but empty - boundary
		assertNotNull("Test if there are courses in the course arraylist", courseList);
		
		//Test if schedule list is not null but empty - boundary
		assertNotNull("Test if there are courses in the schedule arraylist", courseScheduleList);
		
		courseList.add(c4);
		courseList.add(c5);
		courseList.add(c6);
		
		ArrayList<CourseSchedule> result = C206_CaseStudy.listAllCourseSchedulesForACourse("Addition",courseList);
		assertEquals("Test that result size is 2",2,result.size());
		
		ArrayList<CourseSchedule> result2 = C206_CaseStudy.listAllCourseSchedulesForACourse("Science",courseList);
		assertEquals("Test that result size is 1",1,result2.size());
	}

	//daryl
	public void addCourseCategory() {
		assertNotNull("Test if there is valid course arraylist to add to", categoryList);

		C206_CaseStudy.addCourseCategory(categoryList, cc1);
		assertEquals("Test if that categoryList arraylist size is 1?", 1, categoryList.size());

		assertSame("Test that course is added same as 1st item of the list?", c1, categoryList.get(0));

		C206_CaseStudy.addCourseCategory(categoryList, cc2);
		assertEquals("Test that categoryList arraylist size is 2?", 2, categoryList.size());
	}
	
	//daryl
	public void retrieveAllCategoryTest() {
		// Test if Registration list is not null but empty -boundary
		assertNotNull("Test if there is valid CategoryList arraylist to retrieve the catgory list", categoryList);

		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addCourseCategory(categoryList, cc1);
		C206_CaseStudy.addCourseCategory(categoryList, cc2);
		assertEquals("Test that Registration arraylist size is 2", 2, categoryList.size());

		//test if the expected output string same as the list of Registration retrieved from the SourceCentre	
		String orignalOutput= C206_CaseStudy.retrieveAllCourseCategories(categoryList);
		String testOutput = String.format("%-20s %-30s\n","1234", "DBIS");
		testOutput += String.format("%-20s %-30s\n","4321", "DBA");

		assertEquals("Test that ViewAllRegistrations", testOutput, orignalOutput);
	}
	
	//daryl
	public void deleteCategoryTest() {
		// Test if Registration list is not null so there member to delete -boundary

		assertNotNull("Test if there is valid Category arraylist to retrieve item", categoryList);
		C206_CaseStudy.addCourseCategory(categoryList, cc1);
		//Given a list of 1 Registration, after deleting a Registration check if list is 0 -normal
		C206_CaseStudy.deleteCourseCategory(categoryList);
		assertEquals("Test that Registration arraylist size is 0",0,regList.size());
		//Given a list of 2 Registration, after deleting a Registration check if list is 1 -normal
		C206_CaseStudy.addCourseCategory(categoryList, cc1);
		C206_CaseStudy.addCourseCategory(categoryList, cc2);
		C206_CaseStudy.deleteCourseCategory(categoryList);
		assertEquals("Test that Registration arraylist size is 1",1,regList.size());
	}
	//daryl
	public void updateCategoryTest() {
		C206_CaseStudy.addCourseCategory(categoryList, cc1);
		C206_CaseStudy.addCourseCategory(categoryList, cc2);
		C206_CaseStudy.updateCourseCategoryDetails(categoryList);
		assertEquals("Test if the description have change",categoryList.get(0).getCategoryDesc(),"Something about politics");
		assertEquals("Test if the description did not change",categoryList.get(1).getCategoryDesc(),"Something about politics");
		
	}
	/* Myron */
	@Test
	public void addCourseScheduleTest() {
		
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid CourseSchedule arraylist to add to", courseScheduleList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		C206_CaseStudy.doAddCourseSchedule(courseScheduleList, 1, "course1", 111, "1/1/1", "2/2/2", "0100", "0101", "location one");
		assertEquals("Check that CourseSchedule arraylist size is 1", 1, courseScheduleList.size());
		assertSame("Check that CourseSchedule is added", new CourseSchedule(1, "course1", 111, "1/1/1", "2/2/2", "0100", "0101", "location one"), courseScheduleList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		C206_CaseStudy.doAddCourseSchedule(courseScheduleList, 2, "course2", 2222, "2/2/2", "3/3/3", "0200", "0202", "location two");
		assertEquals("Check that CourseSchedule arraylist size is 2", 2, courseScheduleList.size());
		assertSame("Check that CourseSchedule is added", new CourseSchedule(2, "course2", 2222, "2/2/2", "3/3/3", "0200", "0202", "location two"), courseScheduleList.get(0));
		
	}
	
	@Test
	public void DeleteCourseScheduleTest() {
		
		// Item list is not null, so that can delete items - boundary
		assertNotNull("Check if there is valid CourseSchedule arraylist to add to", courseScheduleList);
		
		//Given an list of 2 items, after deleting 1 item, the size of the list is 1 - normal
		C206_CaseStudy.doAddCourseSchedule(courseScheduleList, 1, "course1", 111, "1/1/1", "2/2/2", "0100", "0101", "location one");
		C206_CaseStudy.doAddCourseSchedule(courseScheduleList, 2, "course2", 2222, "2/2/2", "3/3/3", "0200", "0202", "location two");
		CourseSchedule cs1 = C206_CaseStudy.getCoursescheduleFromListByID(courseScheduleList, 1);
		CourseSchedule cs2 = C206_CaseStudy.getCoursescheduleFromListByID(courseScheduleList, 2);
		
		C206_CaseStudy.doDeleteCourseschedule(courseScheduleList, cs1);
		assertEquals("Check that CourseSchedule arraylist size is 1", 1, courseScheduleList.size());
		
		//Delete another item. test The size of the list is 2? -normal
		C206_CaseStudy.doDeleteCourseschedule(courseScheduleList, cs2);
		C206_CaseStudy.doAddCourseSchedule(courseScheduleList, 2, "course2", 2222, "2/2/2", "3/3/3", "0200", "0202", "location two");
		assertEquals("Check that CourseSchedule arraylist size is 0", 0, courseScheduleList.size());
		
	}
	
}