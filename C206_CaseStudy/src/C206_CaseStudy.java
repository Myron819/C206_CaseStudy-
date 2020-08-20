import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		ArrayList<Member> MemberList = new ArrayList<Member>();
		ArrayList<Course> Course = new ArrayList<Course>();
		ArrayList<CourseCategory> CourseCategoryList = new ArrayList<CourseCategory>();
		ArrayList<CourseSchedule> courseScheduleList = new ArrayList<CourseSchedule>();
		ArrayList<Registration> registrationList = new ArrayList<Registration>();
		MemberList.add(new Member("John","Male",84440720,"John@gmail.com","22/07/2020","Singapore","pass1234"));	//Jonathan, I wrote this casue i dont think the arry works without it	
		Course.add(new Course(1,"Addition","1+1","Math","Tuesdays"));
		int option = -1;
		while (option != 0) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			// Member Options; Jonathan
			if (option == 1) {
				C206_CaseStudy.setHeader("ADD NEW MEMBER");
				Member m = inputMember();
				C206_CaseStudy.addNewMember(MemberList, m);
			} else if (option == 2) {
				C206_CaseStudy.setHeader("VIEW ALL MEMBERS");	
				C206_CaseStudy.viewAllMembers(MemberList);
			} else if (option == 3) {
				C206_CaseStudy.setHeader("DELETE MEMBER");
				int z = dMember();
				C206_CaseStudy.deleteMember(MemberList,z);

				// Course Options
			} else if (option == 4) {
				C206_CaseStudy.setHeader("ADD COURSE");	
				C206_CaseStudy.addCourse(Course, CourseCategoryList);
			} else if (option == 5) {
				C206_CaseStudy.setHeader("VIEW ALL COURSES");	
				C206_CaseStudy.viewCourseList(Course);
			} else if (option == 6) {
				C206_CaseStudy.setHeader("DELETE COURSE");
				C206_CaseStudy.deleteCourse(Course);

				// Course Category Options
			} else if (option == 7) {
				C206_CaseStudy.setHeader("ADD COURSE CATEGORY");
				C206_CaseStudy.addCourseCategory(CourseCategoryList);

			} else if (option == 8) {
				C206_CaseStudy.setHeader("VIEW ALL COURSE CATEGORIES");
				C206_CaseStudy.viewAllCourseCategories(CourseCategoryList);	
			} else if (option == 9) {
				C206_CaseStudy.setHeader("DELETE COURSE CATEGORY");
				C206_CaseStudy.deleteCourseCategory(CourseCategoryList);

				// Course Schedule Options
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
		System.out.println("Member Options");
		System.out.println("1. Add New Member");
		System.out.println("2. View All Members");
		System.out.println("3. Delete Member");
		System.out.println("");
		System.out.println("Course Options");
		System.out.println("4. Add Course");
		System.out.println("5. View All Courses");
		System.out.println("6. Delete Course");
		System.out.println("");
		System.out.println("Course Category Options");
		System.out.println("7. Add Course Category");
		System.out.println("8. View All Course Categories");
		System.out.println("9. Delete Course Category");
		System.out.println("");
		System.out.println("Course Schedule Options");
		System.out.println("10. Add Course Schedule");
		System.out.println("11. View All Course Schedules");
		System.out.println("12. Delete Course Schedule");
		System.out.println("");
		System.out.println("Registration Options");
		System.out.println("13. Register for Course Schedule");
		System.out.println("14. View All Registrations");
		System.out.println("15. Delete Registration");
		System.out.println("");
		System.out.println("Other Options");
		System.out.println("0. Quit ");
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
	public static int dMember() {
		int z = Helper.readInt("Enter member index > ");
		return z;
	}
	public static void deleteMember(ArrayList<Member> MemberList, int z) {

		MemberList.remove(z-1);


	}

	/* Course Options By yiqian*/
	//add course
	public static void addCourse(ArrayList<Course> courseList, ArrayList<CourseCategory> catList) {
		boolean unique=true;
		boolean categoryFound=false;
		int id = Helper.readInt("Enter course id > ");
		String name = Helper.readString("Enter course name > ");
		String des = Helper.readString("Enter description > ");
		String cat = Helper.readString("Enter course category > ");
		String schedule = Helper.readString("Enter course schedule > ");

		for(int i=0; i<courseList.size(); i++) {
			if(courseList.get(i).getCourse_id()==id) {
				unique=false;
			}
			if(courseList.get(i).getCourse_cat().equalsIgnoreCase(cat)) {
				categoryFound=true;
			}
		}
		if(unique==true && categoryFound==true) {
			Course co = new Course(id,name,des,cat,schedule);
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
			output += String.format("%-10d %-15s %-15s %-10b\n", courseList.get(i).getCourse_id(), courseList.get(i).getCourse_name(), courseList.get(i).getDescription(), courseList.get(i).getCourse_cat(),courseList.get(i).getIsAvailable());
		}
		return output;
	}
	public static void viewCourseList(ArrayList<Course> courseList) {
		if(courseList!=null) {
			String output = String.format("%-10s %-15s %-15s %-10s\n", "ID", "NAME", "DESCRIPTION", "CATEGORY", "AVAILABLE");
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
		int id = Helper.readInt("Enter course id > ");
		if(courseList==null) {
			System.out.println("No course to delete!");
		}
		else {
			for(int i=0; i<courseList.size(); i++) {
				if(courseList.get(i).getCourse_id()==id) {
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

	/* Course Schedule Options; by Myron */

	// Add Course Schedule
	public static void addCourseSchedule(ArrayList<CourseSchedule> courseScheduleList) {
		int id = Helper.readInt("Enter Course Schedule ID > ");
		String course = Helper.readString("Enter Course that the Schedule is for > ");
		int price = Helper.readInt("Enter Course Schedule Price > ");
		String start_date = Helper.readString("Enter Course Schedule Start Date> ");
		String end_date = Helper.readString("Enter Course Schedule End Date> ");
		String start_time = Helper.readString("Enter Course Schedule Start Time > ");
		String end_time= Helper.readString("Enter Course Schedule End Time> ");
		String location = Helper.readString("Enter Course Schedule Location > ");

		courseScheduleList.add(new CourseSchedule(id, course, price, start_date, end_date, start_time, end_time, location));
		Helper.readString("\nCourse schedule added... (Press Enter)");
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

	// Delete Course Schedule
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

		courseScheduleList.remove(cs);
		Helper.readString("\nCourse schedule deleted successfully... (Press Enter)");

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







