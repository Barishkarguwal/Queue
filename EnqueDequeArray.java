package queue;

public class EnqueDequeArray {
                  int max;
                  int queue[];
                  int front=-1;
                  int rear;
                  
                  EnqueDequeArray(int maxsize){
                	  max=maxsize;
                	  queue=new int[max];
                	  rear=max-1;
                  }
                  public static void main(String args[]){
                	  EnqueDequeArray obj=new EnqueDequeArray(5);
                	  obj.enque(1);
                	  obj.enque(3);
                	  obj.enque(5);
                	  obj.enque(7);
                	  obj.enque(9);
                	  obj.print();
                	  
                	  System.out.println(obj.deque());
                	  System.out.println(obj.deque());
                	  System.out.println(obj.deque());
                	  System.out.println(obj.deque());
                	  System.out.println(obj.deque());
                  }
                  public void enque(int en){
                	  if(front==-1){
                		  queue[++front]=en;
                	  rear=front;
                	  }
                	  
                	  else{
                		  if(rear==(max-1)){
                			  System.out.println("queue overflowed");
                		  }
                		  queue[++rear]=en;
                	  }  
                		  
                  }
                  public void print(){
                	  for(int i=0;i<max;i++){
                		  System.out.println(queue[i]);
                	  }
                  }
                  public int deque(){
                	  if(front==-1||front>rear){
                		  System.out.println("queue underflowed");
                		  return 0;
                	  }
                	  else{
                		  return queue[front++];
                	  }
                  }
                  
}
