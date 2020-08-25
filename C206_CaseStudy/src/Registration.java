
public class Registration extends CourseSchedule{
	
	private int reg_id;
	private String reg_date;
	private boolean status;
	private boolean statuscancel;
	
	
 
     
		// TODO Auto-generated constructor stub
	public Registration(int course_schedule_id, String course, int price, String start_date, String end_date,
				String start_time, String end_time, String location, int reg_id, String reg_date, boolean status,
				boolean statuscancel) {
			super(course_schedule_id, course, price, start_date, end_date, start_time, end_time, location);
			this.reg_id = reg_id;
			this.reg_date = reg_date;
			this.status = status;
			this.statuscancel = statuscancel;
		}




	public int getReg_id() {
		return reg_id;
	}
	
	public String getReg_date()	{
		return reg_date;
	}




	public String getStatus() {
		if(status == true) {
			return "Pending";
			
		}
		else {
			return "Cancelled";
		}
	}




	public void setStatus(boolean status) {
		this.status = status;
	}




	public boolean isStatuscancel() {
		return statuscancel;
	}




	public void setStatuscancel(boolean statuscancel) {
		this.statuscancel = statuscancel;
	}
	
	

}
