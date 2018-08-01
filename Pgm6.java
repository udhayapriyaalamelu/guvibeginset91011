package guvi_set911;
import java.util.*;
public class Pgm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char c[]=s.toCharArray();
int flag=0;
for(int i=0;i<c.length;i++)
{  for(int j=i+1;j<c.length;j++)
	if(c[i]==c[j])
		flag=1;
	else
	continue;
}
if(flag==1)
	System.out.println("No");
else
	System.out.println("Yes");
	}

}
