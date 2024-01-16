package basics_neetcode;
import java.util.ArrayList;

public class singlyLinkedListDesign{
	
	
	private linkedListNode head;
	private linkedListNode tail;
	
	//Constructor : creates a dummy list
	public singlyLinkedListDesign() {
		this.head = new linkedListNode(-1);
		this.tail = this.head;
	}
	
	
	
	public int get(int index) {
		linkedListNode curr = head.next;
		int i=0;
		while(curr != null) {
			if(i==index) {
				return curr.value;
			}
			i++;
			curr = curr.next;
		}
		return -1;
	}
	
	public void insertHead(int value) {
		//creating a new node and assigning the value.
		linkedListNode newNode = new linkedListNode(value);
		//the next node after new node is the list's head node.
		newNode.next=head.next;
		//the head node should now be moved to new node as the new node becomes head now.
		head.next = newNode;
		//if it is an empty list before head insertion, tail should also be same as head. 
		if(newNode.next == null) {
			tail = newNode;
		}
	}
	
	public void insertTail(int value) {
		//assigning value to the next node of tail
		this.tail.next = new linkedListNode(value);
		//moving the tail to tail.next
		this.tail = this.tail.next;
	}
	
	//removes value in the index
	public boolean remove(int index) {
		
		linkedListNode curr = this.head;
		int i=0;
		while ( i< index && curr != null) {
			i++;
			curr = curr.next;
		}
		if (curr != null && curr.next != null) {
			// if it is the last node being removed
			if(curr.next == this.tail) {
				this.tail = curr;
			}
			//Initial or middle node to be removed
			//skipping the node to be removed and assigning the next one as link
			curr.next = curr.next.next; 	
			return true;
		}
		return false;
	}
	
	//returns the array of all the values in the linkedlist
	public ArrayList<Integer> getValues(){
		//creating new array list to store the value of linked list traversed
		ArrayList<Integer> arrVal = new ArrayList();
		//creating curr to traverse the linked list
		linkedListNode curr = this.head.next;
		while(curr!=null) {
			//adding all the values to array list
			arrVal.add(curr.value);
			//moving to the next node in the linked list
			curr=curr.next;
		}
		return arrVal;
	}
	
	public static void main(String [] args) {
		//Creating an instance of the class
		singlyLinkedListDesign llcheck = new singlyLinkedListDesign();
		llcheck.insertHead(1);
		llcheck.insertTail(2);
		llcheck.insertTail(3);
		llcheck.insertTail(4);
		System.out.println(llcheck.getValues());
		llcheck.insertHead(5);
		System.out.println(llcheck.getValues());
		System.out.println(llcheck.remove(3));
		System.out.println(llcheck.getValues());
		System.out.println(llcheck.get(3));
	}
	
		
	
}
