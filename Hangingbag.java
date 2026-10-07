import java.util.Scanner;
public class Hangingbag{

static boolean isdroped=false;
static String content="apple, banana";
static boolean there_question(Boolean parm){
	if (parm==true){
		isdroped=false;
		}
	return (isdroped) ? false : true;
	}
public static void main(String[] args){
	System.out.println("hello guys lets check the bag");
	Scanner sc=new Scanner(System.in);
	boolean is_it_hanging =sc.nextBoolean();
	if(there_question(is_it_hanging)){
		System.out.println("yeah its hanging");
	}
	else{
		System.out.println("nah bruh");
	}
	System.out.println("extra bonus contents in the bag "+content);
	}
}
		
