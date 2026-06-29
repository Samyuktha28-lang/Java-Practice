import java.util.Scanner;

public class Palindrome {
	  public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a String: ");
	    String str=sc.nextLine();
	    char[]ch=str.toCharArray();
	    
	    int a=0;
	    int b=ch.length-1;
	    boolean flag=true;
	    
	    while(b>a){
	      if(ch[b]!=ch[a]){
	    	  
	        flag =false;
	        break;
	      }
	      a++;
	      b--;
	    }
	    if(flag){
	      System.out.println("YES");
	    }
	    else{
	       System.out.println("NO");
	    }sc.close();
	 }
}
      
