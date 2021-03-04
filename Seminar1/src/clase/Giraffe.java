package clase;

public class Giraffe extends Animal{
	private int inaltime;
	public Giraffe(String name,int inaltime) {
		super(name);
		this.inaltime=inaltime;
	}
	public Giraffe(String name) {
		super(name);
		this.inaltime=200;
	}
	public int getInaltime() {
		return inaltime;
	}
	public void setInaltime(int inaltime) {
		this.inaltime = inaltime;
	}
	
}
