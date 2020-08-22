import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		ArrayList<Member> MemberList = new ArrayList<Member>();
		ArrayList<Course> Course = new ArrayList<Course>();
		ArrayList<CourseCategory> CourseCategoryList = new ArrayList<CourseCategory>();
		ArrayList<CourseSchedule> courseScheduleList = new ArrayList<CourseSchedule>();
		ArrayList<Registration> registrationList = new ArrayList<Registration>();
		
		MemberList.add(new Member("John","Male",84440720,"John@gmail.com","22/07/2020","Singapore","pass1234"));	
		Course.add(new Course(1,"Addition","1+1","Math","Tuesdays",null,null,true));
		
		int option = -1;
		while (option != 0) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			// Member Options (Jonathan)
			if (option == 1) {
				C206_CaseStudy.setHeader("ADD NEW MEMBER");
				Member m = inputMember();
				C206_CaseStudy.addNewMember(MemberList, m);
			} else if (option == 2) {
				C206_CaseStudy.setHeader("VIEW ALL MEMBERS");	
				C206_CaseStudy.viewAllMembers(MemberList);
			} else if (option == 3) {
				C206_CaseStudy.setHeader("DELETE MEMBER");
				String z = dMember();
				C206_CaseStudy.deleteMember(MemberList,z);
				
			} else if (option == 4) {
				C206_CaseStudy.setHeader("UPDATE MEMBER DETAILS");
				String z = uMember();
				C206_CaseStudy.updateMemberDetails(MemberList,z);
			} else if (option == 5) {
				C206_CaseStudy.setHeader("SEARCH MEMBER BY COUNTRY OF RESIDENCE");
				String z = sMember();
				C206_CaseStudy.searchMemberByCountryOfResidence(MemberList,z);
			} else if (option == 6) {
				C206_CaseStudy.setHeader("LIST ALL COURSES FOR A MEMBER");
				C206_CaseStudy.listAllCoursesForAMember(MemberList);

				// Course Options
			} else if (option == 7) {
				C206_CaseStudy.setHeader("ADD COURSE");	
				C206_CaseStudy.addCourse(Course, CourseCategoryList);
			} else if (option == 8) {
				C206_CaseStudy.setHeader("VIEW ALL COURSES");	
				C206_CaseStudy.viewCourseList(Course);
			} else if (option == 9) {
				C206_CaseStudy.setHeader("DELETE COURSE");
				C206_CaseStudy.deleteCourse(Course);

			} else if (option == 10) {
				C206_CaseStudy.setHeader("UPDATE COURSE DETAILS");
				C206_CaseStudy.updateCourseDetails(Course);
			} else if (option == 11) {
				C206_CaseStudy.setHeader("SEARCH COURSE BY CATEGORY NAME");
				C206_CaseStudy.searchCourseByCategoryName(Course);
			} else if (option == 12) {
				C206_CaseStudy.setHeader("LIST ALL COURSE SCHEDULES FOR COURSE");
				C206_CaseStudy.listAllCourseSchedulesForACourse(Course);

				// Course Category Options
			} else if (option == 13) {
				C206_CaseStudy.setHeader("ADD COURSE CATEGORY");
				C206_CaseStudy.addCourseCategory(CourseCategoryList);
			} else if (option == 14) {
				C206_CaseStudy.setHeader("VIEW ALL COURSE CATEGORIES");
				C206_CaseStudy.viewAllCourseCategories(CourseCategoryList);	
			} else if (option == 15) {
				C206_CaseStudy.setHeader("DELETE COURSE CATEGORY");
				C206_CaseStudy.deleteCourseCategory(CourseCategoryList);

			} else if (option == 16) {
				C206_CaseStudy.setHeader("UPDATE COURSE CATEGORY DETAILS");
				C206_CaseStudy.updateCourseCategoryDetails(CourseCategoryList);
			} else if (option == 17) {
				C206_CaseStudy.setHeader("SEARCH COURSE CATEGORY BY CATEGORY NAME");
				C206_CaseStudy.searchCourseCategoryByCategoryName(CourseCategoryList);	
			} else if (option == 18) {
				C206_CaseStudy.setHeader("LIST ALL COURSES UNDER A CATEGORY");
				C206_CaseStudy.listAllCoursesUnderACategory(CourseCategoryList);

				// Course Schedule Options
			} else if (option == -1) {
				C206_CaseStudy.setHeader("ADD COURSE SCHEDULE ");	
				C206_CaseStudy.addCourseSchedule(courseScheduleList);
			} else if (option == -1) {
				C206_CaseStudy.setHeader("VIEW ALL COURSE SCHEDULES");	
				C206_CaseStudy.viewAllCourseSchedules(courseScheduleList);
			} else if (option == -1) {
				C206_CaseStudy.setHeader("DELETE COURSE SCHEDULE");	
				C206_CaseStudy.DeleteCourseSchedule(courseScheduleList);

			} else if (option == 10) {
				C206_CaseStudy.setHeader("ADD COURSE SCHEDULE ");	
				C206_CaseStudy.addCourseSchedule(courseScheduleList);
			} else if (option == 11) {
				C206_CaseStudy.setHeader("VIEW ALL COURSE SCHEDULES");	
				C206_CaseStudy.viewAllCourseSchedules(courseScheduleList);
			} else if (option == 12) {
				C206_CaseStudy.setHeader("DELETE COURSE SCHEDULE");	
				C206_CaseStudy.DeleteCourseSchedule(courseScheduleList);

				// Registration Options
			} else if (option == 13) {
				C206_CaseStudy.setHeader("REGISTER FOR COURSE SCHEDULE ");
				Registration rc = inputRegistration();
				C206_CaseStudy.registerForCourseSchedule(registrationList, rc);
			} else if (option == 14) {
				C206_CaseStudy.setHeader("VIEW ALL REGISTRATIONS");		
				C206_CaseStudy.viewAllRegistrations(registrationList);
			} else if (option == 15) {
				C206_CaseStudy.setHeader("DELETE REGISTRATION");	
				C206_CaseStudy.deleteRegistration(registrationList);

				// Other Options
			} else if (option == 0) {
				System.out.println("\nProgram Terminated.");

			} else {
				Helper.readString("\nInvalid option... (Press Enter)");
			} 
		}
	}

	public static void menu() {
		C206_CaseStudy.setHeader("COURSE MANAGEMENT SYSTEM");
		System.out.println("Member Options\n" + 
							"1. Add New Member\n" + 
							"2. View All Members\n" + 
							"3. Delete Member\n" + 
							"4. Update Member Details\n" + 
							"5. Search Member by Country of Residence\n" + 
							"6. List All Courses for a Member\n" + 
							"\n" + 
							"Course Options\n" + 
							"7. Add Course\n" + 
							"8. View All Courses\n" + 
							"9. Delete Course\n" + 
							"10. Update Course Details\n" + 
							"11. Search Course by Category Name\n" + 
							"12. List all Course Schedules for Course\n" + 
							"\n" + 
							"Course Category Options\n" + 
							"13. Add Course Category\n" + 
							"14. View All Course Categories\n" + 
							"15. Delete Course Category\n" + 
							"16. Update Course Category Details\n" + 
							"17. Search Course Category by Category Name\n" + 
							"18. List All Courses Under a Category\n" + 
							"\n" + 
							"Course Schedule Options\n" + 
							"19. Add Course Schedule\n" + 
							"20. View All Course Schedules\n" + 
							"21. Delete Course Schedule\n" + 
							"22. Update Course Schedule Details\n" + 
							"23. Search Course Schedule by Price\n" + 
							"24. List All Members Registered for a Course Schedule\n" + 
							"\n" + 
							"Registration Options\n" + 
							"25. Register for Course Schedule\n" + 
							"26. View All Registrations\n" + 
							"27. Delete Registration\n" + 
							"28. Update Course Registration\n" + 
							"29. Search Registration Status by Course ID\n" + 
							"30. List All Course Schedules Listed By a Member\n" + 
							"\n" + 
							"Other Options\n" + 
							"0. Quit");
		Helper.line(80, "-");
	}

	public static void setHeader(String header) {
		System.out.println("");
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	/* Member Options */
	//Adding Jonathan
	public static Member inputMember() {
		String name = Helper.readString("Enter name > ");
		String gender = Helper.readString("Enter gender > ");
		int moblie = Helper.readInt("Enter moblie > ");
		String email = Helper.readString("Enter email > ");
		String DOB = Helper.readString("Enter DOB > ");
		String country = Helper.readString("Enter country > ");
		String password = Helper.readString("Enter password > ");

		Member m= new Member(name, gender, moblie, email, DOB, country, password);
		return m;

	}
	public static void addNewMember(ArrayList<Member> MemberList, Member m) {

		MemberList.add(m);
		System.out.println("Member added");
	}
	//Retrieve Jonathan
	public static String retrieveAllMember(ArrayList<Member> MemberList) {
		String output = "";

		for (int i = 0; i < MemberList.size(); i++) {

			output += String.format("%-84s\n", MemberList.get(i).toString());
		}
		return output;
	}

	private static String retrieveMember(ArrayList<Member> MemberList, String output, int i) {
		String Member_name = MemberList.get(i).getName();
		String Member_gender = MemberList.get(i).getGender();
		int Member_mobile = MemberList.get(i).getMoblie();
		String Member_email = MemberList.get(i).getEmail();
		String Member_DOB = MemberList.get(i).getDOB();
		String Member_country = MemberList.get(i).getCountry();
		String Member_password = MemberList.get(i).getPassword();
		output += String.format("%-10s %-10s %-10s %-40s %-10s %-20s %-20s\n", Member_name,Member_gender,Member_mobile,Member_email,Member_DOB,Member_country,Member_password);
		return output;
	}
	public static void viewAllMembers(ArrayList<Member> MemberList) {
		C206_CaseStudy.setHeader("MEMBER LIST");
		String output = String.format("%-10s %-10s %-10s %-40s %-10s %-20s %-20s\n", "NAME", "GENDER",
				"MOBILE", "EMAIL","DOB","COUNTRY","PASSWORD");
		output += retrieveAllMember(MemberList);	
		System.out.println(output);
	}
	//delete jonathan
	public static String dMember() {
		String z = Helper.readString("Enter member Name > ");
		return z;
	}

	public static void deleteMember(ArrayList<Member> MemberList, String z) {
		for(int i = 0; i < MemberList.size(); i++) {
			if(z.equalsIgnoreCase(MemberList.get(i).getName()))  {
				MemberList.remove(i);
				System.out.println("Member deleted");
			}
			else {
				System.out.println("Member "+z+" not found");
			}
		}
    }
	//update john
	public static String uMember() {
		String z = Helper.readString("Enter member Name to update> ");
		return z;
	}
	private static void updateMemberDetails(ArrayList<Member> MemberList, String z) {
		String password = Helper.readString("Enter password > ");
		String country = Helper.readString("Enter country > ");
		int moblie = Helper.readInt("Enter moblie (zero if no change) > ");
		for(int i = 0; i < MemberList.size(); i++) {
			if(z.equalsIgnoreCase(MemberList.get(i).getName()))  {
				if(!password.equals("")) {
					MemberList.get(i).setPassword(password);
				}
				if(!country.equals("")) {
					MemberList.get(i).setCountry(country);
				}
				if(moblie!=0) {
					MemberList.get(i).setMoblie(moblie);
				}
				
				System.out.println("Member Updated");
			}
			else {
				System.out.println("Member "+z+" not found");
			}
		}
		
	}
	//search john
	public static String sMember() {
		String z = Helper.readString("Enter country> ");
		return z;
	}
	private static void searchMemberByCountryOfResidence(ArrayList<Member> MemberList, String z) {
		for(int i = 0; i < MemberList.size(); i++) {
			if(z.equalsIgnoreCase(MemberList.get(i).getCountry()))  {
				System.out.println(MemberList.get(i).toString());
				
			}
			
		}
		
	}

	private static void listAllCoursesForAMember(ArrayList<Member> memberList) {
		// TODO Auto-generated method stub
		Helper.readString("\nTodo.. (Press Enter)");
		
	}

	/* Course Options By yiqian*/
	//add course
	public static void addCourse(ArrayList<Course> courseList, ArrayList<CourseCategory> catList) {
		boolean unique=true;
		boolean categoryFound=false;
		int code = Helper.readInt("Enter course code > ");
		String name = Helper.readString("Enter course name > ");
		String des = Helper.readString("Enter description > ");
		String cat = Helper.readString("Enter course category > ");
		String duration = Helper.readString("Enter course duration > ");
		String pre_requisite = Helper.readString("Enter pre_requisite course > ");

		for(int i=0; i<courseList.size(); i++) {
			if(courseList.get(i).getCourse_code()==code) {
				unique=false;
			}
			if(catList.get(i).getCategory().equalsIgnoreCase(cat)) {
				categoryFound=true;
			}
		}
		if(unique==true && categoryFound==true) {
			Course co = new Course(code,name,des,cat,null,duration,pre_requisite,true);
			courseList.add(co);
			System.out.println("Course added.");
		}
		else if(categoryFound!=true) {
			System.out.println("Course's category not found.");
		}
		else if(unique!=true) {
			System.out.println("Course id not unique, cannot add!");
		}
	}
	public static void addCourse(ArrayList<Course> courseList, Course co) {
		courseList.add(co);
		System.out.println("Course added.");
	}	

	//view courseList
	public static String getCourseList(ArrayList<Course> courseList) {
		String output="";

		for(int i=0; i<courseList.size(); i++) {
			output += String.format("%-10d %-15s %-15s %-20s %-10s %-22s %-10b\n", courseList.get(i).getCourse_code(), courseList.get(i).getCourse_title(), courseList.get(i).getCourse_cat(), courseList.get(i).getDescription(), courseList.get(i).getCourse_duration(), courseList.get(i).getPre_requisite_course(), courseList.get(i).getIsAvailable());
		}
		return output;
	}
	public static void viewCourseList(ArrayList<Course> courseList) {
		if(courseList!=null) {
			String output = String.format("%-10s %-15s %-15s %-20s %-10s %-22s %-10s\n", "CODE", "TITLE", "CATEGORY", "DESCRIPTION", "DURATION", "PRE-REQUISITE COURSE", "AVAILABLILITY");
			output += getCourseList(courseList);
			System.out.println(output);
		}
		else {
			System.out.println("No courses in the list.");
		}
	}

	//delete course
	public static void deleteCourse(ArrayList<Course> courseList) {
		Course toDelete = null;
		int code = Helper.readInt("Enter course code > ");
		if(courseList==null) {
			System.out.println("No course to delete!");
		}
		else {
			for(int i=0; i<courseList.size(); i++) {
				if(courseList.get(i).getCourse_code()==code) {
					toDelete = courseList.get(i);
				}
			}
			if(toDelete.getCourse_cat()!=null || toDelete.getCourse_schedule()!=null) {
				System.out.println("Error, cannot delete!");
			}
			else {
				courseList.remove(toDelete);
				System.out.println("Course deleted successfully");
			}
		}
	}

	private static void updateCourseDetails(ArrayList<Course> course) {
		// TODO Auto-generated method stub
		Helper.readString("\nTodo.. (Press Enter)");
		
	}

	private static void searchCourseByCategoryName(ArrayList<Course> course) {
		// TODO Auto-generated method stub
		Helper.readString("\nTodo.. (Press Enter)");
		
	}

	private static void listAllCourseSchedulesForACourse(ArrayList<Course> course) {
		// TODO Auto-generated method stub
		Helper.readString("\nTodo.. (Press Enter)");
		
	}



	/* Course Category Options Daryl*/

	public static void addCourseCategory(ArrayList<CourseCategory> caList) {
		String category=Helper.readString("Enter Category Name >");
		String categoryDescription=Helper.readString("Enter Category Description >");
		boolean uniqueName = true;
		for (int i = 0; i < caList.size(); i++) {
			if(category.equalsIgnoreCase(caList.get(i).getCategory())) {
				uniqueName=false;
			}
		}
		CourseCategory cc= new CourseCategory(category, categoryDescription);
		if (uniqueName) {
			caList.add(cc);
			System.out.println("Category added");
		}else {
			System.out.println("Category name is not unique");
		}
	}	

	public static void addCourseCategory(ArrayList<CourseCategory> categoryList, CourseCategory cs) {

		categoryList.add(cs);
		System.out.println("CourseSchedule added");
	}


	public static String retrieveAllCourseCategories(ArrayList<CourseCategory> cList) {
		String output = "";

		for (int i = 0; i < cList.size(); i++) {

			output+= cList.get(i).toString();
		}
		return output;
	}

	public static void viewAllCourseCategories(ArrayList<CourseCategory> cList) {
		// TODO Auto-generated method stub
		C206_CaseStudy.setHeader("CATEGORY LIST");
		String output = String.format("%-20s %-30s\n", "CATEGORY NAME", "DESCRIPTION");
		output += retrieveAllCourseCategories(cList);	
		System.out.println(output);
	}

	public static void deleteCourseCategory(ArrayList<CourseCategory> cList) {
		// TODO Auto-generated method stub
		String catName = Helper.readString("Enter Category's name to delete > ");
		for (int i = 0; i < cList.size(); i++) {
			if(catName.equalsIgnoreCase(cList.get(i).getCategory())) {
				cList.remove(i);
			}
		}
	}
	

	private static void updateCourseCategoryDetails(ArrayList<CourseCategory> courseCategoryList) {
		// TODO Auto-generated method stub
		Helper.readString("\nTodo.. (Press Enter)");
		
	}

	private static void searchCourseCategoryByCategoryName(ArrayList<CourseCategory> courseCategoryList) {
		// TODO Auto-generated method stub
		Helper.readString("\nTodo.. (Press Enter)");
		
	}

	private static void listAllCoursesUnderACategory(ArrayList<CourseCategory> courseCategoryList) {
		// TODO Auto-generated method stub
		Helper.readString("\nTodo.. (Press Enter)");
		
	}

	/* Course Schedule Options; by Myron */

	// Add Course Schedule 1/2
	public static void addCourseSchedule(ArrayList<CourseSchedule> courseScheduleList) {
		int id = Helper.readInt("Enter Course Schedule ID > ");
		String course = Helper.readString("Enter Course that the Schedule is for > ");
		int price = Helper.readInt("Enter Course Schedule Price > ");
		String start_date = Helper.readString("Enter Course Schedule Start Date> ");
		String end_date = Helper.readString("Enter Course Schedule End Date> ");
		String start_time = Helper.readString("Enter Course Schedule Start Time > ");
		String end_time= Helper.readString("Enter Course Schedule End Time> ");
		String location = Helper.readString("Enter Course Schedule Location > ");

		doAddCourseSchedule(courseScheduleList, id, course, price, start_date, end_date, start_time, end_time, location);
		Helper.readString("\nCourse schedule added... (Press Enter)");
	}

	// Add Course Schedule 2/2
	public static void doAddCourseSchedule(ArrayList<CourseSchedule> courseScheduleList, int id, String course,
			int price, String start_date, String end_date, String start_time, String end_time, String location) {
		courseScheduleList.add(new CourseSchedule(id, course, price, start_date, end_date, start_time, end_time, location));
	}

	// View All Course Schedules
	public static void viewAllCourseSchedules(ArrayList<CourseSchedule> courseScheduleList) {
		if (courseScheduleList.size() == 0) {
			Helper.readString("\nNo course schedules to display... (Press Enter)");
			return;
		}

		printAllCourseschedules(courseScheduleList);
		Helper.readString("Course schedules displayed... (Press Enter)");
	}

	// Delete Course Schedule 1/2
	public static void DeleteCourseSchedule(ArrayList<CourseSchedule> courseScheduleList) {
		// Check that list is not empty.
		if(courseScheduleList.size() == 0) {
			Helper.readString("\nNo course schedules to delete.... (Press Enter)");
			return;
		}

		printAllCourseschedules(courseScheduleList);
		int id = Helper.readInt("Enter ID of course schedule to delete > ");
		CourseSchedule cs = getCoursescheduleFromListByID(courseScheduleList, id);

		// Check that course schedule was found.
		if (cs == null) {
			Helper.readString("\nCourse schedule not found... (Press Enter)");
			return;
		}

		doDeleteCourseschedule(courseScheduleList, cs);
		Helper.readString("\nCourse schedule deleted successfully... (Press Enter)");

	}
	
	// Delete Course Schedule 2/2
	public static void doDeleteCourseschedule(ArrayList<CourseSchedule> courseScheduleList, CourseSchedule cs) {
		courseScheduleList.remove(cs);
	}

	// CourseSchedule Other - 1
	public static CourseSchedule getCoursescheduleFromListByID(ArrayList<CourseSchedule> courseScheduleList, int id) {
		for(CourseSchedule cs : courseScheduleList) 
			if(cs.getCourse_schedule_id() == id)
				return cs;		
		return null;
	}	

	// CourseSchedule Other - 2
	public static void printAllCourseschedules(ArrayList<CourseSchedule> courseScheduleList) {
		String output="";
		output += String.format("%-10s %-30s %-20s %-20s %-20s %-20s %-20s %-20s\n", "ID", "FOR COURSE", "PRICE", "START DATE", "END DATE", "START TIME", "END TIME", "LOCATION");

		for(int i=0; i<courseScheduleList.size(); i++) {
			output += String.format("%-10d %-30s %-20d %-20s %-20s %-20s %-20s %-20s\n", courseScheduleList.get(i).getCourse_schedule_id(), courseScheduleList.get(i).getCourse(), courseScheduleList.get(i).getPrice(), courseScheduleList.get(i).getStart_date(), courseScheduleList.get(i).getEnd_date(), courseScheduleList.get(i).getStart_time(), courseScheduleList.get(i).getEnd_time(), courseScheduleList.get(i).getLocation());
		}

		System.out.println(output);
	}

	/* Registration Options by Boaz*/

	public static Registration inputRegistration() {
		int reg_id = Helper.readInt("Enter Registration ID > ");
		String course_name = Helper.readString("Enter Course to register for > ");

		Registration rc = new Registration(course_name, reg_id);
		return rc;
	}

	public static void registerForCourseSchedule(ArrayList<Registration> registrationList,Registration rc) {
		registrationList.add(rc);
		System.out.println("Registration added");
	}



	public static String retrieveAllRegistrations(ArrayList<Registration> registrationList) {
		String output = "";

		for (int i = 0; i < registrationList.size(); i++) {
			output += String.format("%-20s %-30s\n", registrationList.get(i).getCourse_name(), registrationList.get(i).getReg_id());
		}
		return output;
	}	

	public static void viewAllRegistrations(ArrayList<Registration> registrationList) {
		C206_CaseStudy.setHeader("REGISTRATION LIST");
		String output = String.format("%-20s %-30s\n", "COURSE NAME", "REGISTRATION ID");
		output += retrieveAllRegistrations(registrationList);	  
		System.out.println(output);
	}

	public static void deleteRegistration(ArrayList<Registration> registrationList) {
		int reg_id = Helper.readInt("Enter Registration ID to delete > ");
		for (int i = 0; i < registrationList.size(); i++) {
			if(reg_id == registrationList.get(i).getReg_id()) {
				registrationList.remove(i);
			}
		}
	}
}







