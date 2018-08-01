package guvi_set911;
import java.util.*;
public class Pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String c=sc.nextLine();
int a=sc.nextInt();
int b=sc.nextInt();

switch(c)
{
case "+":
	System.out.println((a+b)+" ");
	break;
case "-":
	System.out.println((a-b)+" ");
	break;
case "*":
	System.out.println((a*b)+" ");
	break;
case "/":
	System.out.println((a/b)+" ");
	break;
case "%":
	System.out.println((a%b)+" ");
	break;
	default:
		System.out.println("invalid");
		break;
	
}
	}

}
