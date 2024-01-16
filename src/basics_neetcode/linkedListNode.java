package basics_neetcode;

public class linkedListNode {
	int value;
	linkedListNode next;
	
	//Constructor
	public linkedListNode(int value) {
		this.value = value;
	}
	
	public linkedListNode(int value, linkedListNode next){
		this.value = value;
		this.next=next;
		
	}
}
