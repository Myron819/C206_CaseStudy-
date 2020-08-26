public class Registration{
    
    private int course_schedule_id;
    private String memberEmail;
    private int price;
    private String start_date;
    private String end_date;
    private String start_time;
    private String end_time; 
    private String location;
    private int reg_id;
    private String reg_date;
    private boolean status;
    private boolean statuscancel;
    
    public Registration(int course_schedule_id, String memberEmail, int price, String start_date, String end_date,
            String start_time, String end_time, String location, int reg_id, String reg_date, boolean status,
            boolean statuscancel) {
        super();
        this.course_schedule_id = course_schedule_id;
        this.memberEmail = memberEmail;
        this.price = price;
        this.start_date = start_date;
        this.end_date = end_date;
        this.start_time = start_time;
        this.end_time = end_time;
        this.location = location;
        this.reg_id = reg_id;
        this.reg_date = reg_date;
        this.status = status;
        this.statuscancel = statuscancel;
    }

 

    public int getCourse_schedule_id() {
        return course_schedule_id;
    }

 

    public void setCourse_schedule_id(int course_schedule_id) {
        this.course_schedule_id = course_schedule_id;
    }

 

    public String getMemberEmail() {
        return memberEmail;
    }

 

    public void setMemberEmail(String course) {
        this.memberEmail = course;
    }

 

    public int getPrice() {
        return price;
    }

 

    public void setPrice(int price) {
        this.price = price;
    }

 

    public String getStart_date() {
        return start_date;
    }

 

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

 

    public String getEnd_date() {
        return end_date;
    }

 

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

 

    public String getStart_time() {
        return start_time;
    }

 

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

 

    public String getEnd_time() {
        return end_time;
    }

 

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

 

    public String getLocation() {
        return location;
    }

 

    public void setLocation(String location) {
        this.location = location;
    }

 

    public int getReg_id() {
        return reg_id;
    }

 

    public void setReg_id(int reg_id) {
        this.reg_id = reg_id;
    }

 

    public String getReg_date() {
        return reg_date;
    }

 

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }

 

    public boolean isStatus() {
        return status;
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
