import java.util.*;

public class MyClass 
{
   
 public static void main(String args[]) {
  
       Scanner s=new Scanner(System.in);
  
  int a=s.nextInt();
  
  int start=1;
   
 int b=(a*4)-4;
  
  int[][] v=new int[(2*a)-1][(2*a)-1];
  
  for(int i=0;i<(2*a)-1;i++) {
  
  	if(i<a) {

    		for(int j=0;j<(2*a)-1;j++) {

    		    if(j<a){
 
   			if(j==a-i-1) {
 
   				System.out.print(start++  + " ");
 
   			}
    			
else
    			
{
    				
System.out.print(0+" ");
    			
}
    		
}
    		
if(j>=a){
    		
    if(j==i+a-1){
    		
        System.out.print(b--+" ");
    	
	    }
    	
	    else
    		
    {
    		 
       System.out.print(0+" ");
    		
    }
    	
	}
    
	
	}
    
	}
  
int c=(2*a)-2;
    
	if(i>=a){
    
	    for(int j=0;j<(2*a)-1;j++){
    
	       if(j<a){
    	
        if(j==i-a+1){
    	      
      System.out.print(start++ +" ");
    
	        }
    
	        else
   
 	        {
    	
            System.out.print(0+" ");
    
	        }
    	
    }
    	
    if(j>=a){
    
	        if(j==c-i+a-1){
    
	            System.out.print(b--+" ");
    	
            c--;
    	
        }
    	  
      else
    	 
       {
    	  
          System.out.print(0+" ");
    
	        }
    	  
      
    	    }
    	
    }
    
	}
    
	System.out.println();
   
 }

    }

}
