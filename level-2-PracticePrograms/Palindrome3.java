// check palindrome

import java.util.Scanner;
public class Palindrome3{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String text = sc.next();
		
		
		PalindromeChecker obj = new PalindromeChecker(text);
		boolean ans = obj.palindromeCheck();
		
		if(ans) {
			System.out.println("The String is a palindrome");
		}else{
			System.out.println("The String is not a palindrome");
		}
		
		
		sc.close();
	}
}

// creating the mobile phone class
public class PalindromeChecker{
	String text;
	
	
	//constructor
	PalindromeChecker(String text){
		this.text = text;
	}
	
	public boolean palindromeCheck(){
      int start = 0;
	  int end = text.length() - 1;
	  
	  while(start < end ){
		  char a = text.charAt(start);
		  char b = text.charAt(end);
		  
		  if(a != b){
			  return false;
		  }
		  start++;
		  end--;
	  }
	  return true;
	}
	
	
}