import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Member m1; //jonathan
	private Member m2; //jonathan

	private Registration r1;
	private Registration r2;

	private Course c1;
	private Course c2;

	private CourseCategory cc1;
	private CourseCategory cc2;

	private ArrayList<Member> MemberList; //jonathan
	private ArrayList<Registration> regList; //Boaz
	private ArrayList<Course> courseList; //yiqian
	private ArrayList<CourseCategory> categoryList;//daryl

	@Before
	public void setUp() throws Exception {

		m1 = new Member("John","Male",84440720,"John@gmail.com","22/07/2020","Singapore","pass1234"); //jonathan
		m2 = new Member("May","Female",84440721,"May@gmail.com","21/07/2010","Singapore","pass12345"); //jonathan

		r1 = new Registration("DBIS", 1234); //Boaz
		r2 = new Registration("DBA", 4321); //Boaz

		c1 = new Course(1,"Addition","1+1","Math","Tuesdays"); //yiqian
		c2 = new Course(2,"Subtraction","1-1","Math","Tuesdays"); //yiqian

		cc1 = new CourseCategory("Political Science", "Something about politics");//daryl
		cc2 = new CourseCategory("English", "Something about england");

		MemberList= new ArrayList<Member>(); //jonathan
		regList = new ArrayList<Registration>(); //Boaz
		courseList = new ArrayList<Course>(); //yiqian
		categoryList = new ArrayList<CourseCategory>();//Daryl
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
	public void deleteMemberTest() {
		// Test if Member list is not null so there member to delete -boundary
		assertNotNull("Test if there is valid Member arraylist to retrieve item", MemberList);
		//Given a list of 1 member, after deleting a member check if list is 0 -normal
		C206_CaseStudy.deleteMember(MemberList,1);
		assertEquals("Test that Member arraylist size is 0",0,MemberList.size());
		//Given a list of 2 member, after deleting a member check if list is 1 -normal
		C206_CaseStudy.deleteMember(MemberList,1);
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
		assertNotNull("Test if there is valid course arraylist to add to", courseList);

		C206_CaseStudy.addCourse(courseList, c1);
		assertEquals("Test if that course arraylist size is 1?", 1, courseList.size());

		assertSame("Test that course is added same as 1st item of the list?", c1, courseList.get(0));

		C206_CaseStudy.addCourse(courseList, c2);
		assertEquals("Test that course arraylist size is 2?", 2, courseList.size());
	}

	@Test
	public void getCourseList() {

		assertNotNull("Test if there is valid course arraylist to add to", courseList);

		String allCourses= C206_CaseStudy.getCourseList(courseList);
		String testOutput = "";
		assertEquals("Check that getCourseList", testOutput, allCourses);

		C206_CaseStudy.addCourse(courseList, c1);
		C206_CaseStudy.addCourse(courseList, c2);
		assertEquals("Test if that Camcorder arraylist size is 2?", 2, courseList.size());

		allCourses= C206_CaseStudy.getCourseList(courseList);

		testOutput = String.format("%-10d %-30s %-20s %-20s\n", 1,"SUBTRACTION", "1-1", "MATH", "TUESDAY");
		testOutput += String.format("%-10d %-30s %-20s %-20s\n", 1,"SUBTRACTION", "1-1", "MATH", "TUESDAY");

		assertEquals("Check that getCourseList", testOutput, allCourses);
	}

	@Test
	public void deleteCourse() {
		assertNotNull("Test if there are courses in the course arraylist", courseList);
		C206_CaseStudy.deleteCourse(courseList);
		assertEquals("Test that course arraylist size is 0",0,courseList.size());
		C206_CaseStudy.deleteCourse(courseList);
		assertEquals("Test that course arraylist size is 1",1,courseList.size());
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
}