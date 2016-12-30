package linkedList;

public class LinkedList {
	Node head;
	
	class Node{
		Object data;
		Node next;
		
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	
	public static void main(String[] args) {
		
	}
}
