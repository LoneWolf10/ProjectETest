public class problem1 {
    public static void main(String[] args) {
        
      
        
                System.out.println(sumMultiples(1000));


    }
    
     public static int sumMultiples(int val){
         
         int[] sumMult = new int[val];
         int sum = 0;
         int counter = 0;
         
         for(int i = 0;i<val;i++){
             
         if(i%3 == 0|| i%5 == 0){
             sumMult[counter] = i;
             counter++;
         }
            
        }
    for(int i = 0;i<sumMult.length;i++){
        sum += sumMult[i];
    }
    return sum;
}
}