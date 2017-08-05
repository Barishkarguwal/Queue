package queue;

import java.util.*;

public class implementStackUSINGQUEUE {
                   Queue<Integer> q;
                   Queue<Integer> temp;
                   
                   implementStackUSINGQUEUE(){
                	   q=new LinkedList<Integer>();
                	   temp=new LinkedList<Integer>();
                   }
             public static void main(String args[]){
            	 implementStackUSINGQUEUE stack=new implementStackUSINGQUEUE();
            	 stack.push(1);
            	 stack.push(2);
            	 stack.push(3);
            	 stack.push(4);
            	 stack.push(5);
            	 stack.pop();
            	 stack.peek();
            	 stack.display();
             }
             public void push(int i){
            	 if(q.size()==0){
            		 q.add(i);
            	 }
            	 else{
            		 int l=q.size();
            	 for(int k=0;k<l;k++)
            		 temp.add(q.remove());
            	 
            	 q.add(i);
            	 for(int j=0;j<l;j++)
            		 q.add(temp.remove());
            	 }
             }
             public int pop(){
            	 
            	 if(q.size()==0)
            		 System.out.println("underflow");
            		 
            	 return q.remove();
             }
             public int peek(){
            	 if(q.size()==0)
            		 System.out.println("underflow");
            	 
            	 return q.peek();
             }
             public void display(){
            	 int len=q.size();
            	  Iterator it=q.iterator();
            	   while(it.hasNext()){
            		   System.out.println(it.next()+" ");
            	   }
            	 
             }
}
