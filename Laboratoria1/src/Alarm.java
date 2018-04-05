package Laboratoria1;

public class Alarm extends Packet {

	protected int channelNr;
	protected double threshold;
	protected int direction;
	
	public Alarm() {
		channelNr = 0;
		threshold = 0;
		direction = 0;
	}
	
	public String toString() {
		return super.toString() + "\nchannel= " + channelNr + "\nthreshold= " + threshold + "\ndirection= " + direction;
	}
}
