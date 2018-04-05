package Laboratoria1;

import Laboratoria1.Packet;

public class Sequence<T> extends Packet {
protected int channelNr;
protected String unit;
protected double resolution;
protected Class <T> buffer;

public Sequence(Class<T> buffer) {
	channelNr = 0;
	unit = "empty";
	resolution = 0;
	Class<T> buffer = 0;

}

public String toString() {
	
	return super.toString() + "\nchannelNr= " + channelNr + "\nunit= " + unit + "\nresolution= " + resolution + "\nbuffer" + (T[]) buffer;
}

}
