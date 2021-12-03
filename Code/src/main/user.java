package main;

//on va l'utiliser pour Mac jcrois
import java.net.InetAddress;
import otherUser.java; //include otherUser

public class user {
	int addressMac;
	String psuedo;
	otherUser[] listOtherUsers;
	
	public user(int addressMac, String psuedo) {	
		this.addressMac = addressMac;
		this.psuedo = psuedo;
	}
	
	
	public int connect() {		
		return 0;
	}
}
