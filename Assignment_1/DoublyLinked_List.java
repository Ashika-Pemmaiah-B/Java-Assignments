package java_training;

import java.util.Scanner;

public class DoublyLinked_List 
{
	Node head;
	class Node 
	{
		int data;
		Node next, previous;
		Node(int val)
		{
			this.data = val;
			next = previous = null;
		}
	}
	void insert(int data)
	{
		Node new_node = new Node(data);
		if (head == null) 
			head = new_node;
		else 
		{
			Node last = head;
			while (last.next != null) 
				last = last.next;
			last.next = new_node;
			new_node.previous = last;
		}
	}
	
	void delete(int data)
	{
		Node currNode = head;
		Node prev = null;
		Node nxt = null;
        if (currNode != null && currNode.data == data)
            head = currNode.next;
        else
        {
        	while (currNode != null && currNode.data != data)
        	{
        		prev = currNode;
        		currNode = currNode.next;
        		if(currNode!= null)
        			nxt = currNode.next;
        	}
        	if (currNode != null)
        	{
        		prev.next = currNode.next;
        		if (nxt != null)
        			nxt.previous = currNode.previous;
        	}
        	else
        		System.out.println(data + " not found!");
        }

	}
	void display()
	{
		Node currNode = head;
		System.out.print("LinkedList: ");
		while (currNode != null) 
		{
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}

	public static void main(String[] args)
	{
		DoublyLinked_List l = new DoublyLinked_List();
		Scanner s= new Scanner(System.in);
		while(true)
		{
			System.out.println("\n\nEnter your choice:\n1. Insert Value\n2. Delete Value\n3. Exit");  
			int n= s.nextInt(); 
			if(n==1)
			{
				System.out.print("Enter integer value to be inserted: ");
				int val= s.nextInt(); 
				l.insert(val);
				l.display();
			}
			else if(n==2)
			{
				System.out.print("Enter integer value to be deleted: ");
				int val= s.nextInt(); 
				l.delete(val);
				l.display();
			}
			else
				break;
		}
	}
}
