package PageActions;

import java.util.Random;

import org.openqa.selenium.By;

public class Reuseable_Script2 {
	
	
	// Generate Random String
	
	public static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 5) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
	
	//Generate Random Number
	
		public static int getNumber() {
			
				  
				    { 
			        // create instance of Random class 
			        Random rand = new Random(); 
			  
			        // Generate random integers in range 0 to 999 
			        int rand_int1 = rand.nextInt(1000); 
			        int rand_int2 = rand.nextInt(1000); 
			  
			        // Print random integers 
			        System.out.println("Random Integers: "+rand_int1); 
			        System.out.println("Random Integers: "+rand_int2); 
			  
			        // Generate Random doubles 
			        double rand_dub1 = rand.nextDouble(); 
			        double rand_dub2 = rand.nextDouble(); 
			  
			        // Print random doubles 
			        System.out.println("Random Doubles: "+rand_dub1); 
			        System.out.println("Random Doubles: "+rand_dub2); 
			        
			        return  rand_int1;
			    } 
		}
}
				    	
				    
				    
				    
				    
	