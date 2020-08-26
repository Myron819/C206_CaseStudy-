import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		ArrayList<Member> MemberList = new ArrayList<Member>();
		ArrayList<Course> CourseList = new ArrayList<Course>();
		ArrayList<CourseCategory> CourseCategoryList = new ArrayList<CourseCategory>();
		ArrayList<CourseSchedule> courseScheduleList = new ArrayList<CourseSchedule>();
		ArrayList<Registration> registrationList = new ArrayList<Registration>();
		
		MemberList.add(new Member("John","Male",84440720,"John@gmail.com","22/07/2020","Singapore","pass1234"));
		
		ArrayList<CourseSchedule> courseScheduleMathList = new ArrayList<CourseSchedule>();
		ArrayList<CourseSchedule> courseScheduleScienceList = new ArrayList<CourseSchedule>();
		CourseSchedule cs1 = new CourseSchedule(1,"Math",50,"1/1/2020","1/5/2020","12pm","2pm","Woodlands");
		courseScheduleMathList.add(cs1);
		CourseSchedule cs2 = new CourseSchedule(2,"Math",70,"3/1/2020","3/3/2020","5pm","6pm","Bukit Batok" );
		courseScheduleMathList.add(cs2);
		CourseSchedule cs3 = new CourseSchedule(3,"Science",100,"1/1/2020","1/5/2020","12pm","2pm","Pasir Ris" );
		courseScheduleScienceList.add(cs3);
		CourseCategory cc1 = new CourseCategory("Math","Mathematics is the study of numbers, shapes and patterns.");
		CourseCategoryList.add(cc1);
		CourseCategory cc2 = new CourseCategory("Science", "Science is the pursuit and application of knowledge and understanding of the natural and social world following a systematic methodology based on evidence.");
		CourseCategoryList.add(cc2);
		CourseList.add(new Course(1,"Addition","1+1",cc1,courseScheduleMathList,"From Jan to June",null));
		CourseList.add(new Course(2,"Subtraction","1-1",cc1,courseScheduleMathList,"From Jan to June",null));
		CourseList.add(new Course(3,"Science","Plants",cc2,courseScheduleScienceList,"From Feb to June",null));
		
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
				Member z = uMember();
				C206_CaseStudy.updateMemberDetails(MemberList,z);
			} else if (option == 5) {
				C206_CaseStudy.setHeader("SEARCH MEMBER BY COUNTRY OF RESIDENCE");
				String z = sMember();
				C206_CaseStudy.searchMemberByCountryOfResidence(MemberList,z);
			} else if (option == 6) {
				C206_CaseStudy.setHeader("LIST ALL COURSES FOR A MEMBER");
				C206_CaseStudy.listAllCoursesForAMember(MemberList);

			// Course Options (Yi Qian) 
				
			} else if (option == 7) {
				C206_CaseStudy.setHeader("ADD COURSE");	
				C206_CaseStudy.addCourseUser(CourseList, CourseCategoryList);
			} else if (option == 8) {
				C206_CaseStudy.setHeader("VIEW ALL COURSES");	
				C206_CaseStudy.viewCourseList(CourseList);
			} else if (option == 9) {
				C206_CaseStudy.setHeader("DELETE COURSE");
				C206_CaseStudy.deleteCourseUser(CourseList);

			} else if (option == 10) {
				C206_CaseStudy.updateCourseDetails(CourseList,CourseCategoryList);
			} else if (option == 11) {
				C206_CaseStudy.setHeader("SEARCH COURSE BY CATEGORY NAME");
				C206_CaseStudy.searchCourseByCategoryName(CourseList,CourseCategoryList);
			} else if (option == 12) {
				C206_CaseStudy.setHeader("LIST ALL COURSE SCHEDULES FOR COURSE");
				C206_CaseStudy.listAllCourseSchedulesForACourse(CourseList);

			// Course Category Options (Daryl)
				
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

			// Course Schedule Options (Myron)
				
			} else if (option == 19) {
				C206_CaseStudy.setHeader("ADD COURSE SCHEDULE ");	
				C206_CaseStudy.addCourseSchedule(courseScheduleList);
			} else if (option == 20) {
				C206_CaseStudy.setHeader("VIEW ALL COURSE SCHEDULES");	
				C206_CaseStudy.viewAllCourseSchedules(courseScheduleList);
			} else if (option == 21) {
				C206_CaseStudy.setHeader("DELETE COURSE SCHEDULE");	
				C206_CaseStudy.DeleteCourseSchedule(courseScheduleList);

			} else if (option == 22) {
				C206_CaseStudy.setHeader("UPDATE COURSE SCHEDULE DETAILS");	
				C206_CaseStudy.updateCourseScheduleDetails(courseScheduleList);
			} else if (option == 23) {
				C206_CaseStudy.setHeader("SEARCH COURSE SCHEDULE BY PRICE");	
				C206_CaseStudy.searchCourseScheduleByPrice(courseScheduleList);
			} else if (option == 24) {
				C206_CaseStudy.setHeader("LIST ALL MEMBERS REGISTERED FOR A COURSE SCHEDULE");	
				C206_CaseStudy.listAllMembersRegisteredForASchedule(courseScheduleList);

			// Registration Options (Boaz)

			} else if (option == 25) {
				C206_CaseStudy.setHeader("REGISTER FOR COURSE SCHEDULE ");
				Registration rc = inputRegistration();
				C206_CaseStudy.registerForCourseSchedule(registrationList, rc);
			} else if (option == 26) {
				C206_CaseStudy.setHeader("VIEW ALL REGISTRATIONS");		
				C206_CaseStudy.viewAllRegistrations(registrationList);
			} else if (option == 27) {
				C206_CaseStudy.setHeader("DELETE REGISTRATION");	
				C206_CaseStudy.deleteRegistration(registrationList);

			} else if (option == 28) {
				C206_CaseStudy.setHeader("UPDATE COURSE REGISTRATION STATUS ");
				C206_CaseStudy.updateRegistrationStatus(registrationList);
			} else if (option == 29) {
				C206_CaseStudy.setHeader("SEARCH REGISTRATION STATUS BY COURSE ID");		
				C206_CaseStudy.searchRegistrationStatusByCourseID(registrationList);
			} else if (option == 30) {
				C206_CaseStudy.setHeader("LIST ALL COURSE SCHEDULES LISTED BY A MEMBER");	
				C206_CaseStudy.listAllCourseSchedulesListedByAMember(registrationList);

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
	public static Member uMember() {
		String name = Helper.readString("Enter member Name to update> ");
		String password = Helper.readString("Enter password > ");
		String country = Helper.readString("Enter country > ");
		int moblie = Helper.readInt("Enter moblie (zero if no change) > ");
		Member z= new Member(name, "", moblie, "", "", country, password);
		return z;
	}
	public static void updateMemberDetails(ArrayList<Member> MemberList, Member z) {
		
		for(int i = 0; i < MemberList.size(); i++) {
			if(z.getName().equalsIgnoreCase(MemberList.get(i).getName()))  {
				if(!z.getPassword().equals("")) {
					MemberList.get(i).setPassword(z.getPassword());
				}
				if(!z.getCountry().equals("")) {
					MemberList.get(i).setCountry(z.getCountry());
				}
				if(z.getMoblie()!=0) {
					MemberList.get(i).setMoblie(z.getMoblie());
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
	public static void searchMemberByCountryOfResidence(ArrayList<Member> MemberList, String z) {
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
	public static void addCourseUser(ArrayList<Course> courseList, ArrayList<CourseCategory> catList) {
		
		int code = Helper.readInt("Enter course code > ");
		String name = Helper.readString("Enter course name > ");
		String des = Helper.readString("Enter description > ");
		String cat = Helper.readString("Enter course category > ");
		String duration = Helper.readString("Enter course duration > ");
		String pre_requisite = Helper.readString("Enter pre_requisite course > ");
		
		//call addCourse
		addCourse(code, name, des, cat, duration, pre_requisite, courseList, catList);
	}
	
	public static void addCourse(int code, String name, String des, String cat, String duration, String pre_requisite, ArrayList<Course> courseList, ArrayList<CourseCategory> catList) {
		boolean unique=false;
		boolean categoryFound=false;
		CourseCategory cc1 = null;
		
		//check whether course code entered is inside the course list
		for(int i=0; i<courseList.size(); i++) {
			if(courseList.get(i).getCourse_code()!=code) {
				unique=true;
				}
			}
		//check whether course category is inside the course list
		for(int i=0; i<catList.size();i++) {
			if(catList.get(i).getCategory().equalsIgnoreCase(cat)) {
				categoryFound=true;
				cc1=catList.get(i);
				}
			}
		//if the course is unique and the category can be found
		if(unique==true && categoryFound==true) {
			Course co = new Course(code,name,des,cc1,duration,pre_requisite);
			courseList.add(co);
			System.out.println("Course added."); 
			}
		else if(categoryFound==false) {
			System.out.println("Course's category not found."); 
			}
		else if(unique==false) {
			System.out.println("Course code not unique, cannot add!"); 
			}
		}	

	//view courseList
	public static String getCourseList(ArrayList<Course> courseList) {
		String output="";

		for(int i=0; i<courseList.size(); i++) {
			Course current = courseList.get(i);
			int code = current.getCourse_code();
			String title = current.getCourse_title();
			String cat = current.getCourse_cat().getCategory();
			String description = current.getDescription();
			String duration = current.getCourse_duration();
			String pre = current.getPre_requisite_course();
			String available = "";
			if(current.getIsAvailable()) {
				available = "Yes";
			}
			else {
				available = "No";
			}
			
			output += String.format("%-10d %-15s %-15s %-20s %-20s %-22s %-10s\n", code, title, cat, description, duration, pre, available);
		}
		return output;
	}
	public static void viewCourseList(ArrayList<Course> courseList) {
		if(courseList!=null) {
			String output = String.format("%-10s %-15s %-15s %-20s %-20s %-22s %-10s\n", "CODE", "TITLE", "CATEGORY", "DESCRIPTION", "DURATION", "PRE-REQUISITE COURSE", "AVAILABLE");
			output += getCourseList(courseList);
			System.out.println(output);
		}
		else {
			System.out.println("No courses in the list.");
		}
	}

	//delete course
	public static void deleteCourseUser(ArrayList<Course> courseList) {
		int code = Helper.readInt("Enter course code > ");
		deleteCourse(code, courseList);
		
	}
	
	public static void deleteCourse(int code, ArrayList<Course> courseList) {
		Course toDelete = null;
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

	public static void updateCourseDetails(ArrayList<Course> course, ArrayList<CourseCategory> catList) {
		boolean CourseFound=false;
		Course object=null;
		int editCourseCode = Helper.readInt("Enter the course code you want to edit >" );
		
		//find whether the course code entered is inside the list
		for(int i=0; i<course.size();i++) {
			if(course.get(i).getCourse_code()==editCourseCode) {
				CourseFound=true;
				object=course.get(i);
			}
		}
		if(CourseFound==true) {
			updateCourseMenu();
			int option = -1;
			while (option != 7) {
			option = Helper.readInt("Enter an option > ");
			
			if(option==1) {
				String title = Helper.readString("Enter new course title > ");
				object.setCourse_title(title);
				System.out.println("Course title updated!");
			}
			else if(option==2) {
				CourseCategory found=null;
				boolean f=false;
				String cat = Helper.readString("Enter new course category > ");
				for(int i=0; i<catList.size();i++) {
					if(catList.get(i).getCategory().equalsIgnoreCase(cat)) {
						found=catList.get(i);
						f=true;
					}
				}
				if(f==true) {
					object.setCourse_cat(found);
					System.out.println("Course category updated!");
				}
				else {
					System.out.println("Course category not found!");
				}
			}
			else if(option==3) {
				String des = Helper.readString("Enter new description > ");
				object.setDescription(des);
				System.out.println("Course description updated!");
			}
			else if(option==4) {
				String duration = Helper.readString("Enter new course duration > ");
				object.setCourse_duration(duration);
				System.out.println("Course duration updated!");
			}
			else if(option==5) {
				String pre_requisite = Helper.readString("Enter new pre-requisite course > ");
				object.setPre_requisite_course(pre_requisite);
				System.out.println("Pre-requisite course updated!");
			}
			else if(option==6) {
				boolean available=true;
				String yn = Helper.readString("Enter new availability of course (Yes/No) > ");
				if(yn.equalsIgnoreCase("yes")) {
					available=true;
				}
				else {
					available=false;
				}
				object.setIsAvailable(available);
				System.out.println("Course availability updated!");
			}
			else if(option==7) {
				System.out.println("Exit from update options.");
			}
			else {
				System.out.println("Please enter a valid option!");
				updateCourseMenu();
			}
		}
		}
		else {
			System.out.println("Course not found.");
		}	
	}
	
	private static void updateCourseMenu() {
		C206_CaseStudy.setHeader("COURSE MANAGEMENT SYSTEM");
		System.out.println("UPDATE OPTIONS\n" + 
				"1. Edit Course title\n" + 
				"2. Edit Course category name\n" + 
				"3. Edit Course description\n" + 
				"4. Edit Course duration\n" + 
				"5. Edit pre-requisite course\n" + 
				"6. Edit course availability\n" +
				"7. Exit Update Menu"
				);
		Helper.line(80, "-");
	}
	
	//search course by category name
	private static void searchCourseByCategoryName(ArrayList<Course> course, ArrayList<CourseCategory> catList) {
		boolean found=false;
		ArrayList<Course> courseFound = new ArrayList<Course>();
		String cat = Helper.readString("Enter the course category you want to search for >");
		// find whether the category input is inside the category list
		for(int i=0; i<catList.size();i++) {
			if(catList.get(i).getCategory().equalsIgnoreCase(cat)) {
				found=true;
			}
		}
		if(found==true) {
			for(int i=0;i<course.size();i++) {
				if(course.get(i).getCourse_cat().getCategory().equalsIgnoreCase(cat)) {
					courseFound.add(course.get(i));
				}
			}
			viewCourseList(courseFound);
		}
	}
	
	//list all course schedule
	private static void listAllCourseSchedulesForACourse(ArrayList<Course> course) {
		boolean found=false;
		Course courseFound=null;
		String courseSearch = Helper.readString("Enter the course you want to search for >");
		// find whether the course input is inside the course list
		for(int i=0; i<course.size();i++) {
			if(course.get(i).getCourse_title().equalsIgnoreCase(courseSearch)) {
				courseFound=course.get(i);
				found=true;
				
			}
		}
		if(found==true) {
			if(courseFound.getCourse_schedule()!=null) {
				ArrayList<CourseSchedule> scheduleGet = courseFound.getCourse_schedule();
				String output = String.format("%-15s %-15s %-15s %-20s %-20s %-22s %-15s %-15s\n", "SCHEDULE ID", "TITLE", "COURSE", "START DATE", "END DATE", "START TIMING", "END TIMING", "LOCATION");
				for(int i=0; i<scheduleGet.size();i++) {
					output += String.format("%-15d %-15s %-15s %-20s %-20s %-22s %-15s %-15s\n", scheduleGet.get(i).getCourse_schedule_id(), scheduleGet.get(i).getCourse(), scheduleGet.get(i).getPrice(), scheduleGet.get(i).getStart_date(), scheduleGet.get(i).getEnd_date(), scheduleGet.get(i).getStart_time(), scheduleGet.get(i).getEnd_time(), scheduleGet.get(i).getLocation());
				}
				System.out.println(output);
			}
		}
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
		String category=Helper.readString("Enter Category Name >");
		String categoryDescription=Helper.readString("Enter Category Description >");

		for (int i = 0; i <courseCategoryList.size(); i++) {
			if (courseCategoryList.get(i).getCategory().equalsIgnoreCase(category)) {
				courseCategoryList.get(i).setCategoryDesc(categoryDescription);
				System.out.println("Member Updated");
			}else {
				System.out.println("Member "+category+" not found");
			}
		}
		
	}

	private static void searchCourseCategoryByCategoryName(ArrayList<CourseCategory> courseCategoryList) {
		// TODO Auto-generated method stub
		String category=Helper.readString("Enter Category Name >");
		boolean found =false;
		for (int i = 0; i < courseCategoryList.size(); i++) {
			if (courseCategoryList.get(i).getCategory().equalsIgnoreCase(category)) {
				C206_CaseStudy.setHeader("CATEGORY FOUND");
				String output = String.format("%-20s %-30s\n", "CATEGORY NAME", "DESCRIPTION");
				output+= courseCategoryList.toString();
				System.out.println(output);
				found=true;
			}
		}
		
		if (!found) {
			System.out.println("Category not found");
		}
		
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
		if (courseScheduleList.isEmpty()) {
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
	
	// -----------
	
	// Update Course Schedule 1/2
	private static void updateCourseScheduleDetails(ArrayList<CourseSchedule> courseScheduleList) {
		if(courseScheduleList.size() == 0) {
			Helper.readString("\nNo course schedules to update.... (Press Enter)");
			return;
		}
		printAllCourseschedules(courseScheduleList);
		
		int id = Helper.readInt("Enter ID of course schedule to update > ");
		
		// Get all course schedules from list by
		CourseSchedule cs = getCoursescheduleFromListByID(courseScheduleList, id);
		if (cs == null) {
			Helper.readString("\nCourse schedule not found... (Press Enter)");
			return;
		}
		
		int newID = Helper.readInt("Enter new Course Schedule ID > ");
		String course = Helper.readString("Enter Course that the Schedule is for > ");
		int price = Helper.readInt("Enter Course Schedule Price > ");
		String start_date = Helper.readString("Enter Course Schedule Start Date> ");
		String end_date = Helper.readString("Enter Course Schedule End Date> ");
		String start_time = Helper.readString("Enter Course Schedule Start Time > ");
		String end_time= Helper.readString("Enter Course Schedule End Time> ");
		String location = Helper.readString("Enter Course Schedule Location > ");
		doUpdateCourseSchedule(courseScheduleList, cs, newID, course, price, start_date, end_date, start_time, end_time, location);
		
		Helper.readString("\nCourse schedule updated... (Press Enter)");
		
	}
	
	// Update Course Schedule 2/2
	public static void doUpdateCourseSchedule(ArrayList<CourseSchedule> courseScheduleList, CourseSchedule cs, int newID,
			String course, int price, String start_date, String end_date, String start_time, String end_time, String location) {
		cs.setCourse_schedule_id(newID);
		cs.setCourse(course);
		cs.setPrice(price);
		cs.setStart_date(start_date);
		cs.setEnd_date(end_date);
		cs.setStart_time(start_time);
		cs.setEnd_time(end_time);
		cs.setLocation(location);
	}

	// Search Course Schedule by Price
	private static void searchCourseScheduleByPrice(ArrayList<CourseSchedule> courseScheduleList) {
		// Check if list is empty
		if(courseScheduleList.isEmpty()) {
			Helper.readString("\nNo course schedules to search.... (Press Enter)");
			return;
		}
		
		int price = Helper.readInt("Enter Price to Search Course Schedules By > ");
		
		// Get all course schedules of specified price from list and put into new list
		ArrayList<CourseSchedule> foundCsList = getCourseschedulesFromListByPrice(courseScheduleList, price);
		
		// Check if new list is empty
		if (foundCsList.isEmpty()) {
			Helper.readString("\nNo Course Schedules of specified price found.. (Press Enter)");
			return;
		}
		
		printAllCourseschedules(foundCsList);
		Helper.readString("\nCourse schedule search results displayed.. (Press Enter)");
		
	}

	// Course Schedule - Other 8
	private static ArrayList<CourseSchedule> getCourseschedulesFromListByPrice(
			ArrayList<CourseSchedule> courseScheduleList, int price) {
		ArrayList<CourseSchedule> foundCsList = new ArrayList<CourseSchedule>();
		for (CourseSchedule cs : courseScheduleList) {
			if (cs.getPrice() == price) {
				foundCsList.add(cs);
			}
		}
		return foundCsList;
	}

	private static void listAllMembersRegisteredForASchedule(ArrayList<CourseSchedule> courseScheduleList) {
		
		
		
		
		
		
		
		Helper.readString("\nAll members registered for a Course Schedule listed... (Press Enter)");
		
	}
	

	/* Registration Options by Boaz*/

	public static Registration inputRegistration() {
		int course_schedule_id = Helper.readInt("Enter course_schedule_id > ");
		String course = Helper.readString("Enter Course > ");
		int price = Helper.readInt("Enter price > ");
		String start_date = Helper.readString("Enter start_date > ");
		String end_date = Helper.readString("Enter end_date > ");
		String start_time = Helper.readString("Enter start_time > ");
		String end_time = Helper.readString("Enter end_time > ");
		String location = Helper.readString("Enter location > ");
		int reg_id = Helper.readInt("Enter reg_id > ");
		String reg_date = Helper.readString("Enter reg_date > ");
		boolean status = Helper.readBoolean("Enter status (true/ false) > ");
		boolean statuscancel = Helper.readBoolean("Enter statuscancel (true/ false) > ");

		Registration rc = new Registration(course_schedule_id, course, price, start_date, end_date, start_time, end_time, location, course_schedule_id, course, status, statuscancel);
		return rc;
	}

	public static void registerForCourseSchedule(ArrayList<Registration> registrationList,Registration rc) {
		registrationList.add(rc);
		System.out.println("Registration added");
	}



	public static String retrieveAllRegistrations(ArrayList<Registration> registrationList) {
		String output = "";

		for (int i = 0; i < registrationList.size(); i++) {
			output += String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-30s\n",
					registrationList.get(i).getCourse_schedule_id(), registrationList.get(i).getCourse() , 
					registrationList.get(i).getPrice(), registrationList.get(i).getStart_date(),
					registrationList.get(i).getEnd_date(), registrationList.get(i).getStart_time(),
					registrationList.get(i).getEnd_time(), registrationList.get(i).getLocation(),
					registrationList.get(i).getReg_id(), registrationList.get(i).getReg_date(),
					registrationList.get(i).isStatus(), registrationList.get(i).isStatuscancel());
		}
		return output;
	}	

	public static void viewAllRegistrations(ArrayList<Registration> registrationList) {
		C206_CaseStudy.setHeader("REGISTRATION LIST");
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-30s\\n"
				,"COURSE SCHEDULE ID", "COURSE ", "PRICE", "START DATE", "END DATE", "START TIME"
				, "END TIME", "LOCATION", "REGISTRATION ID", "REGISTRATION DATE", "STATUS", "STATUS CANCEL");
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
	
	
	public static Registration getRegistrationListByID(ArrayList<Registration> registrationList, int id) {
		for(Registration r : registrationList) 
			if(r.getReg_id() == id)
				return r;		
		return null;
	}	

	private static void updateRegistrationStatus(ArrayList<Registration> registrationList) {
		// TODO Auto-generated method stub
		Helper.readString("Update Registration Status");
		if(registrationList.size() == 0) {
			Helper.readString("\nNo Registration schedules to update.... (Press Enter)");
			return;
		}
		viewAllRegistrations(registrationList);
		
		int id = Helper.readInt("Enter ID of Registration Status to update > ");
		
		
		Registration  r = getRegistrationListByID(registrationList, id);
		if (r == null) {
			Helper.readString("\nRegistration not found... (Press Enter)");
			return;
		}
		
		
		boolean status = Helper.readBoolean("Enter status (true/ false) > ");
		boolean statuscancel = Helper.readBoolean("Enter statuscancel (true/ false) > ");
		doUpdateRegistration( r, status, statuscancel);
		
		Helper.readString("\nCourse schedule updated... (Press Enter)");
		
	}
	/**
	 * @param status
	 * @param statuscancel
	 */
	private static void doUpdateRegistration(Registration r, boolean status, boolean statuscancel) {
		
		// TODO Auto-generated method stub
		r.setStatus(status);
		r.setStatuscancel(statuscancel);
		
	}

	
	private static void searchRegistrationStatusByCourseID(ArrayList<Registration> registrationList) {
		// TODO Auto-generated method stub
		Helper.readString("\nTodo.. (Press Enter)");
		if(registrationList.isEmpty()) {
			Helper.readString("\nNo Registrations to search for.... ((Press Enter)");
			return;
		}
		
		int course_schedule_id = Helper.readInt("Enter Course ID to search for Registration Status > ");
		
		ArrayList<Registration> foundRegList = getRegistrationStatusFromListByID(registrationList, course_schedule_id);
		
		if(foundRegList.isEmpty()) {
			Helper.readString("\nNo Registrations found from specified Course Schedule ID.... ((Press Enter)");
			return;
		}
		
		viewAllRegistrations(registrationList);
		Helper.readString("\nNo Registrations search results displayed.... ((Press Enter)");
				
	}
	private static ArrayList<Registration> getRegistrationStatusFromListByID(
			ArrayList<Registration> registrationList, int course_schedule_id) {
		ArrayList<Registration> foundRegList = new ArrayList<Registration>();
		for (Registration r : registrationList) {
			if (r.getCourse_schedule_id() == course_schedule_id) {
				foundRegList.add(r);
			}
		}
		return foundRegList;
	}
	
	

	private static void listAllCourseSchedulesListedByAMember(ArrayList<Registration> registrationList) {
		// TODO Auto-generated method stub
		Helper.readString("\nTodo.. (Press Enter)");
		
	}
}







