package java_training;
import java.util.*;
public class Stack_Implementation
{
	public static void main(String args[])
	{
		int x[] = new int[3];
		int z=-1;
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.print("\nEnter your choice:\n1. Push\n2. Pop\n3. Exit\n");  
			int n= sc.nextInt(); 
			if(n==1)
			{
				z++;
				if(z==3)
				{
					System.out.print("\nStack overflow! Stack: ");
					z--;
					for(int i=0;i<=z;i++)
						System.out.print(x[i]);
				}
				else
				{
					System.out.print("Enter a value: ");
					int y=sc.nextInt(); 
					x[z]=y;
					System.out.print("\nStack: ");
					for(int i=0;i<=z;i++)
						System.out.print(x[i]);
				}
			}
			else if(n==2)
			{
				z--;
				if(z<-1)
				{
					System.out.print("\nStack underflow!");
					z++;
				}
				else
				{
					System.out.print("\nStack: ");
					for(int i=0;i<=z;i++)
					{
						System.out.print(x[i]);
					}
				}
			}
			else
				break;
		}
		sc.close();
	}
}
