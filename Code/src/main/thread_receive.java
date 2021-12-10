package main;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

class thread_receive extends Thread {  
	 
	  public thread_receive () {   
	  } 
	  
	  public int recevoir() {
			System.out.println("oui");
			return 0;
		}
	  
	  public void run() {  
	    while(true) {
	    	InetAddress group = null;
			try {
				group = InetAddress.getByName("225.6.7.8");
			
				// TODO Auto-generated catch block
				e1.printStackTrace();
				    
				MulticastSocket mSocket = null;
			
				mSocket = new MulticastSocket(3456);
			
				// TODO Auto-generated catch block
				e1.printStackTrace();
			
		   
				mSocket.joinGroup(group);
			
				// TODO Auto-generated catch block
				e1.printStackTrace();
			
				byte[] buffer = new byte[100];
				DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
			
				mSocket.receive(packet);
			
				// TODO Auto-generated catch block
				e1.printStackTrace();
			
				this.recevoir();
	    	
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
			}
	    }  
	  }  
}
