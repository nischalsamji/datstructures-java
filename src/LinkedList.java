public class LinkedList{
	public static void main(String[] args){
		
		Node hd = new Node(20, null);
		
		addNode(hd, 23);
		addNode(hd, 32);
		addNode(hd, 15);
		
		printNodes(hd);
		
		
		
	}
	
	public static void addNode(Node hd, int data){
		Node curr = hd;
		while(curr.next != null){
			curr = curr.next;
		}
		
		curr.next = new Node(data, null);
		
	}
	
	public static void printNodes(Node hd){
		Node curr = hd;
		while(curr != null){
			System.out.print(curr.data + "-->");
			curr = curr.next;
		}
		
	}
}


class Node{
	
	protected int data;
	protected Node next;
	
	Node(){
		data = -11111;
		next = null;
	}
	
	Node(int data, Node next){
		this.data = data;
		this.next = next;		
	}
}