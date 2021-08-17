import java.util.Scanner;
import java.util.ArrayList;

	

public class Main {


   public static void main(String[] args){
	
	   Scanner userIn = new Scanner(System.in);
	   
	   System.out.println("Enter a phrase: ");
	   
	   String phrase = userIn.nextLine();
	   
	   System.out.println("Enter a number from 1 to 20");
	   
	   int aNum = userIn.nextInt();
	   
	   System.out.println(bucketize(phrase,aNum));
	   
	
	}
	
	public static ArrayList<String> bucketize(String aPhrase, int number) {
		
		int inNumIndex = number - 1;
		int prevIndex = 0;
		int spaceIndex = 0;
		
		ArrayList<String> bucketList = new ArrayList<String>();
		//In the jungle 
		
		
		//At the moment eh logic below cannot isolate the last word in a phrase, still working on it
		
		while(inNumIndex <= aPhrase.length()){
			
			for(int i = prevIndex; i <= inNumIndex;i++){
				
				if(aPhrase.charAt(i) != ' '){
					
					for(int j = inNumIndex; j >= prevIndex;j-- ){
						
						if(aPhrase.charAt(j) == ' '){
							
							bucketList.add(aPhrase.substring(spaceIndex,j));
							spaceIndex = j;
						}
					}
				}
			}
			
			prevIndex = inNumIndex;
			inNumIndex = inNumIndex + inNumIndex;
		
		}
		
	   
	
		
		return bucketList;
		
	}
	

}