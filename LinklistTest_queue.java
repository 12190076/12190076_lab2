public class LinklistTest_queue
{
	public static void main(String[] arg)
	{
		Linklist_queue obj = new Linklist_queue();

		obj.enqueue(5);
		obj.enqueue(6);
		obj.enqueue(7);
		obj.enqueue(4);

		assert(obj.size()==4);
		assert(obj.isEmpty()==false);
		assert(obj.first()==5);
		assert(obj.dequeue()==5);
		assert(obj.size()==3);

		System.out.println("You Nailed it!... You did it correctly");
	}
}