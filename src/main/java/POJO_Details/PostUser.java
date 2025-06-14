package POJO_Details;

public class PostUser {

	private String name;
	private String job;
	private String id;
	private String createdAt;

	public PostUser() { }
	public PostUser(String name,String job)
	{
		this.name=name;
		this.job=job;
	}
	
	//Getters and Setters
	public String getName() {return name;}
	public void setName(String name) {this.name=name;}
	
	
	public String getJob() {return job;}
	public void setJob(String job) {this.job=job;}
	
	
	public String getId() {return id;}
	public void setId(String id) { this.id = id; }
	
	public String getCreatedAt() {return createdAt;}
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }
    
    @Override
    public String toString()
    {
    	return "Response: { name= "+name+",job= "+job+",id= "+id+",createdAt= "+createdAt+" }";
    }

}
