import java.util.*;
public class linkedlist
{
    Node head=null;
    Node first=null;
    Node last=null;
    
    
    class Node
    {
    int data;
    Node next;
    Node(int d)
    {
    data=d;
    }
    }
    void add(int data)
    {
    Node o=new Node(data);
    o.next=null;
    if (head==null)
    {
    head=o;
    return;
    }
    Node last=head;
    while(last.next!=null)
    {
    last=last.next;
    }
    last.next=o;
    }
void AlternatingSplit()
{
Node h=head;
Node l=head.next;
while(h!=null&&l!=null)
{
if (first==null&&last==null)
{
    first=h;
    last=l;
}
h.next=l.next;
if (h.next!=null&&h.next.next!=null)
{
l.next=h.next.next;
}
h=h.next;
l=l.next;
}
}



















void print()
{
while(first!=null)
{
System.out.print(first.data+" ");
first=first.next;
}
System.out.println();
while(last!=null)
{
System.out.print(last.data+" ");
last=last.next;
}
}

public static void main(String g[])
{
    Scanner sc=new Scanner(System.in);
    linkedlist obj=new linkedlist();
    System.out.println("enter no. of elements ");
   int n=sc.nextInt();
   int a;
   for(int i=0;i<n;i++)
   {
a=sc.nextInt();
      obj.add(a);
}
   obj.AlternatingSplit();
   obj.print();
      
}
}