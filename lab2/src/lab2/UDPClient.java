package lab2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import Laboratoria1.Packet;
import Laboratoria1.TimeHistory;

public class UDPClient {
	public static void main(String[] args) {
		DatagramSocket aSocket = null;
		Scanner scanner = null;
		
		try {
			// args contain server hostname
			byte[] buffer = new byte[1024];
			InetAddress aHost = InetAddress.getByName("localhost");
			int serverPort = 9876;
			aSocket = new DatagramSocket();
			scanner = new Scanner(System.in);
			
			String device = "DEVICE";
			String description = "DESCRPIT";
			long date = 1;
			int channelNr = 1;
			String unit = "UNIT";
			double resolution = 1;
			Double[] tabt = new Double[3];
			tabt[0]=1.0;
			tabt[1]=5.5;
			tabt[2]=2.3;
			double sensitivity = 1;
			

			TimeHistory<Double> packet = new TimeHistory<Double>(device, description, date, channelNr, unit, resolution, tabt, sensitivity);
				System.out.println(packet);
				byte[] data = Tools.serialize(packet);
				DatagramPacket request = new DatagramPacket(data, data.length, aHost, serverPort);
				aSocket.send(request);
				DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
				aSocket.receive(reply);
				System.out.println("Reply: " + new String(reply.getData(), 0, reply.getLength()));
				Packet read = (Packet)Tools.deserialize(reply.getData());
				
				System.out.println(read);
			
		} catch (SocketException ex) {
			Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnknownHostException ex) {
			Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			aSocket.close();
			scanner.close();
		}
		
	}
}
