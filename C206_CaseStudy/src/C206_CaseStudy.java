import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		ArrayList<Member> MemberList = new ArrayList<Member>();
		ArrayList<Course> Course = new ArrayList<Course>();
		ArrayList<CourseCategory> CourseCategoryList = new ArrayList<CourseCategory>();
		ArrayList<CourseSchedule> courseScheduleList = new ArrayList<CourseSchedule>();
		ArrayList<Registration> registrationList = new ArrayList<Registration>();
		MemberList.add(new Member("John","Male",84440720,"John@gmail.com","22/07/2020","Singapore","pass1234"));		
		int option = -1;
		while (option != 0) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			// Member Options
			if (option == 1) {
				C206_CaseStudy.setHeader("ADD NEW MEMBER");
				Member m = inputMember();
				C206_CaseStudy.addNewMember(MemberList, m);
			} else if (option == 2) {
				C206_CaseStudy.setHeader("VIEW ALL MEMBERS");	
				C206_CaseStudy.viewAllMembers(MemberList);
			} else if (option == 3) {
				C206_CaseStudy.setHeader("DELETE MEMBER");
				C206_CaseStudy.deleteMember(MemberList);

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
				C206_CaseStudy.addCourseSchedule();
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
//Retrieve
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

	public static void deleteMember(ArrayList<Member> MemberList) {
		String name = Helper.readString("Enter member's name to delete > ");
		for (int i = 0; i < MemberList.size(); i++) {
			if(name == MemberList.get(i).getName()) {
				MemberList.remove(i);
			}
		}
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
	

	public static void viewAllCourseCategories() {
		// TODO Auto-generated method stub
		Helper.readString("To be completed... (Press Enter)");

	}

	public static void deleteCourseCategory() {
		// TODO Auto-generated method stub
		Helper.readString("To be completed... (Press Enter)");

	}

	/* Course Schedule Options */

	public static void addCourseSchedule() {
		Helper.readString("To be completed... (Press Enter)");
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
