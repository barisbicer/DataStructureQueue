
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue=new Queue();
		
//		queue.enqueue(10);
    	queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.show();
	
		queue.dequeue();
		queue.dequeue();
	
		queue.show();
		
//		queue.enqueue(50);
//		queue.enqueue(60);
	
		System.out.println("Size:"+queue.isEmpty());
		
		System.out.println("Size:"+queue.getSize());
		queue.show();
		
	

	}

}
