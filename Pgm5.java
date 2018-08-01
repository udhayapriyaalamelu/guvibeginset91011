package guvi_set911;
import java.util.*;
public class Pgm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char ch[]=s.toCharArray();
String s1="";
String s2="";
for(int i=0;i<ch.length;i++)
{
	if(i%2==0) {
		s1+=ch[i];
	}
	else
	{
		s2+=ch[i];
	}
}
	System.out.print(s1+" "+s2);
	}

}
