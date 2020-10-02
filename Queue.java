public class Queue{
	int front=-1;
	int rear=-1;
	int first=-1;
	int size=0;//initialize size as zero
	int[] array= new int[5];
	public void enqueue(int e){
		if(size==0){
			array[0]=e;
			first=array[0];
			front=0;
			rear=0;
		}
		else{
			array[rear+1]=e;
		}
		size = size + 1;
		System.out.println(e);
	}
	public int dequeue(){
		if(size==0){
			System.out.println("Queue is empty");
		}
		else{
			front=front+1;
		}
		size = size -1;
		return array[front-1];


	}
	public int first(){
		if(size==0){
			return 0;
		}
		else{
			return array[front];
		}

	}
	public boolean isEmpty(){
		if(size==0){
			return true;
		}
		else{
			return false;
		}
	}
	public int len(){
		return size;
	}
	public static void main(String arg[]) {
		Queue obj=new Queue();
		obj.enqueue(5);
		obj.enqueue(10);
		obj.enqueue(6);
		obj.enqueue(9);
		obj.enqueue(2);
		obj.enqueue(4);
		System.out.println("you remove the number:" +obj.dequeue());
		System.out.println("First elemet is:" +obj.first());
		System.out.println("Cheking size empty:"+obj.isEmpty());
		System.out.println("Number of element:" +obj.len());

	}
}
