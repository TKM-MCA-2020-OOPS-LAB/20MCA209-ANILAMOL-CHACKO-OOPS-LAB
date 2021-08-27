package myproject;

import java.util.*;
class Removelinkedlist
{
    public static void main(String[] args) 
    {
        LinkedList<String> list=new LinkedList<String>();
        Scanner sc=new Scanner(System.in);
        System.out.print("No of students that you want to add: ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.print("Add Student: ");
            String s=sc.next();
            list.add(s);
        }
        System.out.println();
        System.out.println("LinkedList After adding Students: ");
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        list.clear();
        System.out.println("Linked list After removing Students: " + list);

    }
}