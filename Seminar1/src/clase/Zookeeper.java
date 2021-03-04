package clase;

public class Zookeeper {
	private String name;
	
	public Zookeeper(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void feedAnimal(Animal a) {
		System.out.println(this.name+" feeds "+a.getName());
	}
	
}
