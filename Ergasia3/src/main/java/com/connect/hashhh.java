package com.connect;

 import com.connect.*;

  
public class hashhh   
{  
    
	public static void getAlphaNumericString(int n){
    
    	 String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                 + "0123456789"
                 + "abcdefghijklmnopqrstuvxyz"; 

// create StringBuffer size of AlphaNumericString 
StringBuilder sb = new StringBuilder("password");


	}
	public String bytesToHex(byte[] hash) {
	    StringBuffer hexString = new StringBuffer();
	    for (int i = 0; i < hash.length; i++) {
	    String hex = Integer.toHexString(0xff & hash[i]);
	    if(hex.length() == 1) hexString.append('0');
	        hexString.append(hex);
	    }
	    return hexString.toString();
	
	

	}
}
    
 
