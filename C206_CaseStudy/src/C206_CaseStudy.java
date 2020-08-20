import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		
		ArrayList<Registration> regList = new ArrayList<Registration>();
		ArrayList<CourseSchedule> courseList = new ArrayList<CourseSchedule>();
		ArrayList<CourseCategory> categoryList = new ArrayList<CourseCategory>();
		categoryList.add(new CourseCategory("Sport"));
		courseList.add(new CourseSchedule("12/12/2020", "12/12/2020", "12:00", "13:00", "Class", 10));
		int option = -1;
		while (option != 0) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			// Member Options
			if (option == 1) {
				C206_CaseStudy.setHeader("ADD NEW MEMBER");
				C206_CaseStudy.addNewMember();
			} else if (option == 2) {
				C206_CaseStudy.setHeader("VIEW ALL MEMBERS");	
				C206_CaseStudy.viewAllMembers();
			} else if (option == 3) {
				C206_CaseStudy.setHeader("DELETE MEMBER");
				C206_CaseStudy.deleteMember();

				// Course Options
			} else if (option == 4) {
				C206_CaseStudy.setHeader("ADD COURSE");	
				C206_CaseStudy.addCourse();
			} else if (option == 5) {
				C206_CaseStudy.setHeader("VIEW ALL COURSES");	
				C206_CaseStudy.viewAllCourses();
			} else if (option == 6) {
				C206_CaseStudy.setHeader("DELETE COURSE");
				C206_CaseStudy.deleteCourses();

				// Course Category Options
			} else if (option == 7) {
				C206_CaseStudy.setHeader("ADD COURSE CATEGORY");
				CourseCategory cs = inputCourseCategory();
				C206_CaseStudy.addCourseCategory(categoryList, cs);	
			} else if (option == 8) {
				C206_CaseStudy.setHeader("VIEW ALL COURSE CATEGORIES");
				C206_CaseStudy.viewAllCourseCategories();	
			} else if (option == 9) {
				C206_CaseStudy.setHeader("DELETE COURSE CATEGORY");
				C206_CaseStudy.deleteCourseCategory();

				// Course Schedule Options
			} else if (option == 10) {
				C206_CaseStudy.setHeader("ADD COURSE SCHEDULE ");	
				CourseSchedule cs = inputCourseSchedule();
				C206_CaseStudy.addCourseSchedule(courseList, cs);
			} else if (option == 11) {
				C206_CaseStudy.setHeader("VIEW ALL COURSE SCHEDULES");	
				C206_CaseStudy.viewAllCourseSchedules();
			} else if (option == 12) {
				C206_CaseStudy.setHeader("DELETE COURSE SCHEDULE");	
				C206_CaseStudy.DeleteCourseSchedule();

				// Registration Options
			} else if (option == 13) {
				C206_CaseStudy.setHeader("REGISTER FOR COURSE SCHEDULE ");
				Registration rc = inputRegistration();
				C206_CaseStudy.registerForCourseSchedule(regList, rc);
			} else if (option == 14) {
				C206_CaseStudy.setHeader("VIEW ALL REGISTRATIONS");		
				C206_CaseStudy.viewAllRegistrations(regList);
			} else if (option == 15) {
				C206_CaseStudy.setHeader("DELETE REGISTRATION");	
				C206_CaseStudy.deleteRegistration();

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
		System.out.println("10. Add Course Schedule ");
		System.out.println("11. View All Course Schedules");
		System.out.println("12. Delete Course Schedule");
		System.out.println("");
		System.out.println("Registration Options");
		System.out.println("13. Register for Course Schedule ");
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

	public static void addNewMember() {
		// TODO Auto-generated method stub
		Helper.readString("To be completed... (Press Enter)");

	}

	public static void viewAllMembers() {
		// TODO Auto-generated method stub
		Helper.readString("To be completed... (Press Enter)");

	}

	public static void deleteMember() {
		// TODO Auto-generated method stub
		Helper.readString("To be completed... (Press Enter)");

	}

	/* Course Options */

	public static void addCourse() {
		// TODO Auto-generated method stub
		Helper.readString("To be completed... (Press Enter)");

	}

	public static void viewAllCourses() {
		// TODO Auto-generated method stub
		Helper.readString("To be completed... (Press Enter)");

	}

	public static void deleteCourses() {
		// TODO Auto-generated method stub
		Helper.readString("To be completed... (Press Enter)");

	}

	/* Course Category Options */

	public static CourseCategory inputCourseCategory() {
		String category = Helper.readString("Enter category > ");
		

		CourseCategory cs= new CourseCategory(category);
		return cs;
		
	}
	public static void addCourseCategory(ArrayList<CourseCategory> categoryList, CourseCategory cs) {
		
		categoryList.add(cs);
		System.out.println("CourseSchedule added");
	}
	public static void addCourseCategory() {
		// TODO Auto-generated method stub
		Helper.readString("To be completed... (Press Enter)");

	}

	public static void viewAllCourseCategories() {
		// TODO Auto-generated method stub
		Helper.readString("To be completed... (Press Enter)");

	}

	public static void deleteCourseCategory() {
		// TODO Auto-generated method stub
		Helper.readString("To be completed... (Press Enter)");

	}

	/* Course Schedule Options */

	public static CourseSchedule inputCourseSchedule() {
		String date_start = Helper.readString("Enter start date > ");
		String date_end = Helper.readString("Enter end date > ");
		String time_start = Helper.readString("Enter start time > ");
		String time_end = Helper.readString("Enter end time > ");
		String location = Helper.readString("Enter location > ");
		int price = Helper.readInt("Enter price > ");

		CourseSchedule cs= new CourseSchedule(date_start,date_end,time_start,time_end,location,price);
		return cs;
		
	}
	public static void addCourseSchedule(ArrayList<CourseSchedule> courseList, CourseSchedule cs) {
		
		courseList.add(cs);
		System.out.println("CourseSchedule added");
	}

	public static void viewAllCourseSchedules() {
		// TODO Auto-generated method stub
		Helper.readString("To be completed... (Press Enter)");

	}

	public static void DeleteCourseSchedule() {
		// TODO Auto-generated method stub
		Helper.readString("To be completed... (Press Enter)");

	}

	/* Registration Options by Boaz*/

	public static Registration inputRegistration() {
		String reg_id = Helper.readString("Enter Registration ID > ");
		String course_name = Helper.readString("Enter Course to register for > ");
		

		Registration rc = new Registration(reg_id, course_name);
		return rc;
		
	}
	public static void registerForCourseSchedule(ArrayList<Registration> regList,Registration rc) {
		
		
		regList.add(rc);
		System.out.println("Registration added");
	}

	

	public static String retrieveAllRegistrations(ArrayList<Registration> regList) {
		String output = "";
 
		for (int i = 0; i < regList.size(); i++) {
			output += String.format("%-20s %-30s\n", regList.get(i).getCourse_name(), regList.get(i).getReg_id());
		}
		return output;
	}	
	public static void viewAllRegistrations(ArrayList<Registration> regList) {
		C206_CaseStudy.setHeader("REGISTRATION LIST");
		String output = String.format("%-20s %-30s\n", "REGISTRATION ID", "COURSE NAME");
		output += retrieveAllRegistrations(regList);	  
		System.out.println(output);
	}

	public static void deleteRegistration() {
		// TODO Auto-generated method stub
		Helper.readString("To be completed... (Press Enter)");

	}


//t  
}
