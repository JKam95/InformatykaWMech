package Laboratoria1;

import Laboratoria1.Packet;
import Laboratoria1.Sequence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Packet test = new Packet();
		System.out.printf(test.toString());
		Sequence test1 = new Sequence();
		System.out.printf(test1.toString());
		TimeHistory test2 = new TimeHistory();
		System.out.printf(test2.toString());
		Spectrum test3 = new Spectrum();
		System.out.printf(test3.toString());
		Alarm test4 = new Alarm();
		System.out.printf(test4.toString());
	}
	
	

}
