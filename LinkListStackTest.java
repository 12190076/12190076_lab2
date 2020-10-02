//Queue function using linklist
public class LinkListStackTest{
	public static void main(String[] args) {
		LinklistStack obj = new LinklistStack();

		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		System.out.println("First element is: "+obj.first());
		System.out.println("Number of element is: "+obj.len());
		System.out.println("Element you pop is: "+obj.dequeue());

		System.out.println("First element after pop is: "+obj.first());
		System.out.println("Last element after pop is: "+obj.las());
		System.out.println("Number of element after pop is: "+obj.len());
	}
}