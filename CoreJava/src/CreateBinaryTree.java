
public class CreateBinaryTree {
	public class Node {
		Node left, right;
		int key;

		Node(int data) {
			key = data;
		}
	}

//10 6 12 4 8
	public Node createTree(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}

		// System.out.println(root.key);
		if (root.key > value)
			root.left = createTree(root.left, value);
		else
			root.right = createTree(root.right, value);
		return root;
	}

	private void inOrder(Node root) {
		if (root == null)
			return;

		inOrder(root.left);
		System.out.println(root.key);
		inOrder(root.right);
	}

	private void preOrder(Node root) {
		if (root == null)
			return;
		System.out.println(root.key);
		preOrder(root.left);

		preOrder(root.right);
	}

	private void postOrder(Node root) {
		if (root == null)
			return;

		postOrder(root.left);

		postOrder(root.right);
		System.out.println(root.key);
	}

	public static void main(String[] args) {
		Node root = null;
		CreateBinaryTree obj = new CreateBinaryTree();
		// call like this if inner class is static
		// CreateBinaryTree.Node nodeObj = new CreateBinaryTree.Node(0);
		// call like this if inner class is not static
		// CreateBinaryTree.Node nodeObj = obj.new Node(array[i]);
		int array[] = {10,6,12,4,8};
//		for (int i = 0; i < array.length; i++) {
//			array[i] = i + 1;
//		}
		for (int i = 0; i < array.length; i++) {

			root = obj.createTree(root, array[i]);
		}
		System.out.println("InOrder traversal");
		obj.inOrder(root);
		System.out.println("pre order traversal");
		obj.preOrder(root);
		System.out.println("post order traversal");
		obj.postOrder(root);

	}

}
