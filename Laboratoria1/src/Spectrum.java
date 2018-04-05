package Laboratoria1;

public class Spectrum extends Sequence {
	protected String scaling;
	
	public Spectrum() {
		scaling = "empty";
	}
	
	public String toString() {
		return super.toString() + "\nscaling= " + scaling;
	}
}
