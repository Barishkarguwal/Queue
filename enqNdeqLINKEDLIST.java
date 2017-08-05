package queue;

public class enqNdeqLINKEDLIST {
                         node front=null;
                         node rear;
                       static class node{
                    	   int data;
                    	   node next;
                    	   node(int new_data){
                    		   data=new_data;
                    		   next=null;
                    		   
                    	   }
                       }
                       public static void main(String args[]){
                    	   enqNdeqLINKEDLIST obj=new enqNdeqLINKEDLIST();
                    	   obj.enque(1);
                    	   obj.enque(3);
                     	  obj.enque(5);
                     	  obj.enque(7);
                     	  obj.enque(9);
                     	  
                     	  System.out.println(obj.deque());
                     	  System.out.println(obj.deque());
                     	  System.out.println(obj.deque());
                     	  System.out.println(obj.deque());
                     	  System.out.println(obj.deque());
                       }
                       public void enque(int new_data1){
                    	   node new_node=new node(new_data1);
                    	   
                    	   if(front==null){
                    		   front=new_node;
                    		   rear=front;
                    	   }
                    	   else{
                    		   rear.next=new_node;
                    		   rear=new_node;
                    	   }
                       }
                       public int deque(){
                    	   int temp=0;
                    	   if(front!=null){
                    		   temp=front.data;
                    		   front=front.next;
                    		   return temp;
                    	   }
                    	   else{
                    		   System.out.println("queue underflowed");
                    		   return 0;
                    	   }
                       }
}
