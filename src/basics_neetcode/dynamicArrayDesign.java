package basics_neetcode;

public class dynamicArrayDesign {
	private int capacity;
	private int size;
	private int[] darr;
	
	//Constructor to assign the capacity of the dynamic array 
	public  dynamicArrayDesign(int capacity) {
		//Checking if capacity is > 0
		if (capacity >0) {
			System.out.println("Creating a new dynamic array");
			this.capacity = capacity;
			this.size=0;
			this.darr = new int[this.capacity];
		}
		else {
			System.out.println("Invalid input for capacity");
		}
	}
	
	//Returns the element at index i
	public int get(int i) {
		return darr[i];
	}
	
	//Sets the element at index i with the value n;
	public void set(int i, int n) {
		if(i>capacity) {
			System.out.println("Cannot set element in the specified index as index is out of range");
		}
		else {
			darr[i] = n;	
		}
	}
	
	//Insert element into the last position of the array
	public void pushback(int n){
		if(size == capacity) {
			System.out.println("Doubling capacity of the dynamic array");
			resize();
		}
		System.out.println("Adding value to the end of dyanmic array");
		darr[size]=n;
		size+=1;
	}
	
	public int popback() {
		
		if(size==0) {
			return (Integer) null;
		}
		else {
			int last = darr[size];
			size-=1;
			return last;
		}
	}
	
	private void resize() {
		capacity*=2;
		int[] newArr = new int[capacity];
		for(int i=0; i< size; i++) {
			newArr[i]=darr[i];
		}
		darr=newArr;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getCapacity() {
		return capacity;
	}

}

