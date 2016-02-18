public class LinkedList{
	public static void main(String[] args){
		
		Node hd = new Node(20, null);
		
		addNode(hd, 23);
		addNode(hd, 32);
		addNode(hd, 15);
		
		printNodes(hd);
		printNodes(reverseList(hd));
		
		
		deleteNode(hd, 32);
		
	}
	
	public static void addNode(Node hd, int data){
		Node curr = hd;
		while(curr.next != null){
			curr = curr.next;
		}
		
		curr.next = new Node(data, null);
		
	}
	
	public static Node reverseList(Node hd){
		
		Node curr = hd;
		Node prev =  null;
		while(curr!= null){
			Node nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;		
		}
		
		return prev;
	}
	
	public static boolean deleteNode(Node hd, int data){
		
		Node curr = hd;
		Node prev = null;
		while(curr!=null)
		{
			
			if(curr.data == data){
				
			}
		}
		
		
		return true;
	}
	
	public static void printNodes(Node hd){
		Node curr = hd;
		while(curr != null){
			System.out.print(curr.data + "-->");
			curr = curr.next;
		}
		System.out.println();
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