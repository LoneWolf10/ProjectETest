
public class problem2 {
    public static void main(String[] args) {
        
      
        
                System.out.println(sumOfEvenFib());


    }
    
     public static int sumOfEvenFib(){
    	 int currFibVal = 1;
     int currentFib = 0;
     int fibsum = 0;
    	 
    	 
    	 while(currentFib < 4000000){
    		 if(currentFib%2==0)
         fibsum+=currentFib;
    		 
    		currentFib =  findFib(currFibVal++);
    	 }
    	 
    	 return fibsum;
         
         
}
     
     public static int findFib(int val) {
    	 int x = 0;
    	 if(val == 0) {
    		 return 0;
    	 }
    	 if(val == 1) {
    		 return 1;
     }
     if(val == 2) {
    	 return 2;
     }
  x =  findFib(val-1) + findFib(val-2);
  
  return x;
}
}