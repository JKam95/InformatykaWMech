package Laboratoria1;

public class TimeHistory extends Sequence {
	protected double sensitivity;

	
	public TimeHistory() {
		sensitivity = 0;

	}
	
	public String toString() {
		return super.toString() + "\nsensitivity= " + sensitivity;
	}

};