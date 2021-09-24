package java_training;
import java.util.*;
public class Queue_Implementation
{
	public static void main(String args[])
	{
		int x[] = new int[3];
		int z=-1;
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.print("\nEnter your choice:\n1. Enqueue\n2. Dequeue\n3. Exit\n");  
			int n= sc.nextInt(); 
			if(n==1)
			{
				z++;
				if(z==3)
				{
					System.out.print("\nQueue overflow! Queue: ");
					z--;
					for(int i=0;i<=z;i++)
						System.out.print(x[i]);
				}
				else
				{
					System.out.print("Enter a value: ");
					int y=sc.nextInt(); 
					x[z]=y;
					System.out.print("\nQueue: ");
					for(int i=0;i<=z;i++)
						System.out.print(x[i]);
				}
			}
			else if(n==2)
			{
				z--;
				if(z<-1)
				{
					System.out.print("\nQueue underflow!");
					z++;
				}
				else
				{
					System.out.print("\nQueue: ");
					for(int i=0;i<=z;i++)
					{
						x[i]=x[i+1];
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
