package guvi_set911;
import java.util.*;
public class Pgm10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1="";
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)>='0'&&s.charAt(i)<='9')
		s1+=s.charAt(i);
	else
		continue;
}
System.out.println(s1);
	}

}
