
import java.util.*;  
public class WeeklyCodingChallenges {


    public static void main(String[] args) {

        

       Scanner sc= new Scanner(System.in); 
       System.out.println("Starting problem 1 of the logic challenge"+\n); 

       System.out.print("Enter a phrase or word ");  
       String a= sc.nexLine();  
       System.out.println("Enter a second phrase or word ");  
       String b= sc.nextLine();  

       // This is the output for Problem 1 of the weekly challenge
       System.out.print("The longest sub sequence is "+ problemOne(a,b));

       //This is the output for Problem 2 of the weekly challege

       int[] arr = {5, 6, 2, 9, 15, 12};
       problemTwo(arr);

       //Answer to Problem 3
       Q1C7A1B2F3A1B7E4

    }

    public static String problemOne(String a, String b) {

         List<Character> charList = new ArrayList<Character>();

         if(a.length() >= b.length()){

           for(int i=0;i<b.length();i++){

              if(a.charAt(i) == b.charAt(i)){

                 charList.add(b.charAt(i)); 
                    
              }
                  
           }

         }

         String strVal;
         
         for(char c:charList){

         strVal += String.valueOf(c);

         }
         return strVal;

    }

    public static void problemTwo(int[] arr){

        int maxNum = arr[0];
        int minNum = arr[0];

        for(int i: arr){

          if(i > maxNum){
            
             maxNum = i;
          }
        }

        for(int j: arr){

          if(j < minNum){
            
             minNum = j;
          }
        }
        System.out.println("The max number in the array is "+ maxNum);
        System.out.println("The min number in the array is "+ minNum);
        

    }


}