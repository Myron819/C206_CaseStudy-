public class CourseCategory {
	
	private String Category;
	private String categoryDesc;
	
	

	public CourseCategory(String Category,String categoryDesc) {
		super();
		this.Category = Category;
		this.categoryDesc = categoryDesc;
	}




	public String getCategoryDesc() {
		return categoryDesc;
	}




	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}




	public void setCategory(String category) {
		Category = category;
	}




	public String getCategory() {
		return Category;
	}




	@Override
	public String toString() {
		String output =String.format("%-20s %-30s\n",getCategory(),getCategoryDesc());
		return output;
	}
	
	
		
 //  

}