package guvi_set911;
import java.util.*;
public class Pgm9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char ch[]=s.toCharArray();
Arrays.sort(ch);
for(int i=0;i<ch.length;i++)
{
	System.out.print(ch[i]);
}
	}

}
