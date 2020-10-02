public class Stack{
	int top=-1; //keeping top as null
	int size=0;//initialize size as zero
	int[] array= new int[5]; // seting the array size
	// intput value to the array
	public void push(int e){
		if(size==0){
			array[0]=e;
		}
		else{
			array[top+1]=e;
			top=top+1;
		}
		size = size + 1;
		System.out.println(e);
	} //pop the top element in the array
	public int pop(){
		if(size==0){    //cheaking size of the array
			System.out.println("Your size is empty");
		}
		else{
			top= top-1;
			size=size - 1;
		}
		return array[top+1];//Showing which index is poping
	}// checking the top element
	public int top(){
		if(array[top]==-1){
			return 0;
		}
		else{
			return array[top];
		}
	}// checking the total size
	public int size(){
		return size;
	}//checking the size empty or not
	public boolean isEmpty(){
		if(size==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String arg[]){
		Stack obj=new Stack();
		obj.push(50);
		obj.push(76);
		obj.push(80);
		obj.push(90);
		obj.push(99);

		System.out.println("You pop the element:"+obj.pop());
		System.out.println("Number of size is:"+obj.size());
		System.out.println("Your new top element after poped is:"+obj.top());
		System.out.println("Number of size is:"+obj.isEmpty());
	}
}