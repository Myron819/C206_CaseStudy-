import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Member m1; //jonathan
	private Member m2; //jonathan

	private ArrayList<Member> MemberList; //jonathan
	
	@Before
	public void setUp() throws Exception {
		
		m1 = new Member("John","Male",84440720,"John@gmail.com","22/07/2020","Singapore","pass1234"); //jonathan
		m2 = new Member("May","Female",84440721,"May@gmail.com","21/07/2010","Singapore","pass12345"); //jonathan
		MemberList= new ArrayList<Member>(); //jonathan
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

}
