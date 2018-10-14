# FINDING-THE-ORDER-OF-NUMBER
package oxygen.com;
import java.util.Scanner;
public class Order {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a<b && a<c && b>a && b<c && c>a && c>b)
		{
			System.out.println("increasing order");
		}
		else if(a>b && a>c && b<a && b>c && c<a && c<b)
		{
			System.out.println("decreasing order");

		}
		else
		{
			System.out.println("neither increasing nor decreasing");
		}
}
}
OUTPUT:
4
3
5
neither increasing nor decreasing
