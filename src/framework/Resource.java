package framework;

public abstract class Resource {
	private String name;
	private String description;
	private int number;
	
	public abstract void save();
	public abstract void delete();
	public abstract boolean update();
	public abstract void visualize();
	
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
