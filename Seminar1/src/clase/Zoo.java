package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	public Zookeeper zookeeper;
	public List<Animal> animals;
	
	public Zoo(Zookeeper z, List<Animal> animals) {
		super();
		this.zookeeper = z;
		this.animals = animals;
	}

	public Zoo() {
		super();
		this.zookeeper = new Zookeeper("Gigel");
		this.animals = new ArrayList<>();
	}
	
	public Zookeeper getZookeeper() {
		return zookeeper;
	}


	public void setZookeeper(Zookeeper z) {
		this.zookeeper = z;
	}


	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	
	public void feedAllAnimals() {
		for(Animal a : this.animals) {
			zookeeper.feedAnimal(a);
		}
	}
	public void addAnimal(Animal a) {
		this.animals.add(a);
	}
	
}
