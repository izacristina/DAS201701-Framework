
public abstract class Resources {
	private String name;
	private String description;
	private int number;
	
	public void create(String name, String description, int number){
		
	}
	public void delete(){
		
	}
	public boolean update(){
		return true;
	}
	public void visualize(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
