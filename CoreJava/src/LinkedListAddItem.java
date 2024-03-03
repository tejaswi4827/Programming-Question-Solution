import java.security.PublicKey;

class Node {
	Node next;
	int item;

	public Node(int item) {
		this.item = item;
	}
}

public class LinkedListAddItem {

	// add 5 node in linkedlist
	// create linkedlist from array
	// take two variable of type node like head and tail
	// if head is null the initialize head and tail to new node
	// else tail will refer to newnode i.e tail.next =newNode;
	// and again tail = newNode;
	// at last return head that will have starting node reference

	public static Node addNode(int[] a) {
		Node head = null;
		Node tail = null;
		for (int item : a) {
			Node newNode = new Node(item);

			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

//		System.out.println(head.item);
		return head;

	}

	// add single node at end of linkedlist

	public static Node addNodeAtEnd(Node head, int item) {
		Node root = head;
		if (head == null) {
			System.out.println("head is null");
			return null;
		}
		while (head.next != null) {
			head = head.next;
		}
		head.next = new Node(item);
		return root;
	}

// add node in the beginning of linkedlist
	public static Node addNodeAtBeginning(Node head, int value) {

		if (head == null) {
			System.out.println("head is null");
			return null;
		}

		// create a node then refer new node to already exixting node head
		// then assign newnode to head and return head
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
		return head;
	}

// insert a node after a given node of value 4
	public static Node addNodeAtAnyPosition(Node head, int position, int data) {
		Node rootNode = head;
		if (head == null) {
			System.out.println("head is null");
			return null;
		}

		Node newNode = new Node(data);
		while (head.item != position) {
			head = head.next;

		}

		newNode.next = head.next;
		head.next = newNode;
		return rootNode;

	}

	// iterate through node
	public static void printNode(Node rootNode) {

		while (rootNode != null) {
			System.out.print(rootNode.item + " ");
			rootNode = rootNode.next;
		}

	}
// to reverse node of linked list in java 
	private static Node reverseList(Node rootNode) {
		Node headNode = rootNode;
		Node curNode = headNode;
		Node prevNode = null;
		while (headNode != null) {
			  curNode=headNode.next;
			  headNode.next = prevNode;
			  prevNode=headNode;
			  headNode =curNode;
			
			
		}

		return prevNode;

	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		Node rootNode = LinkedListAddItem.addNode(a);
		// stored this for using other operation like adding one node at end of list

// print all the node after addding from array
		System.out.println("*************** 5 item from the array added to linkedlist **********************");
		LinkedListAddItem.printNode(rootNode); // 1 2 3 4 5
//		add single node at end of linkedlist
		Node addedNodeAtLast = LinkedListAddItem.addNodeAtEnd(rootNode, 10);
		System.out.println();
		System.out.println("***************  Node of value 10 added  after 5 **********************");
		LinkedListAddItem.printNode(addedNodeAtLast); // 1 2 3 4 5 10

		// add node at the first place

		Node addedNodeAtBeggining = LinkedListAddItem.addNodeAtBeginning(rootNode, 100);
		System.out.println();
		System.out.println("***************  Node of value 100 added  before 1 **********************");
		LinkedListAddItem.printNode(addedNodeAtBeggining); // 100 1 2 3 4 5 10

		// add node after 4 value of linked list
		Node addNodeAfter4 = LinkedListAddItem.addNodeAtAnyPosition(rootNode, 4, 400);
		System.out.println();
		System.out.println("***************  Node of value 400 added after 4 **********************");
		LinkedListAddItem.printNode(addNodeAfter4); // 100 1 2 3 4 5 10

	Node resNode= LinkedListAddItem.reverseList(rootNode);
	System.out.println("reverse node");
		LinkedListAddItem.printNode(resNode);
	}

}