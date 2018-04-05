package Laboratoria1;

public  class Packet {
protected String device;
protected String description;
protected long date;

public Packet() {
	device = "empty";
	description = "empty";
	date = 0;

}

public String toString() {
	return "\ndevice= " + device + "\ndescription= " + description + "\ndate= " + date;
}




};