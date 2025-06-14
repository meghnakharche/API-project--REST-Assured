package POJO_Details;

public class PutUser {
	
	private String name;
    private String job;
    private String updatedAt;

	PutUser(){    }
	
	public PutUser(String name,String job) {
		this.name=name;
		this.job=job;	
	}
	 // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getJob() { return job; }
    public void setJob(String job) { this.job = job; }
    
    public String getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(String updatedAt) { this.updatedAt = updatedAt; }
    
    @Override
    public String toString() {
        return "Response:{name=" + name + ", job=" + job + ", updatedAt=" + updatedAt + "}";
    }
    

}
