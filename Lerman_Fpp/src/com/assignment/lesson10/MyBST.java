package com.assignment.lesson10;

public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.getLeft());
			System.out.println(t.getElement());
			printTree(t.getRight());
		} // An INORDER Traversal
	}

	/**
	 * Prints the values in the nodes of the tree in LRE order.
	 */
	public void printPostTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printPostTree(root);
	}

	private void printPostTree(BinaryNode t) {
		if (t != null) {
			printPostTree(t.getLeft());
			printPostTree(t.getRight());
			System.out.println(t.getElement());
		} // A Post-ORDER Traversal
	}

	/**
	 * Prints the values in the nodes of the tree in ELR order.
	 */
	public void printPreTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printPreTree(root);
	}

	private void printPreTree(BinaryNode t) {
		if (t != null) {
			System.out.println(t.getElement());
			printPreTree(t.getLeft());
			printPreTree(t.getRight());
		} // A Pre-ORDER Traversal
	}

	// Assume the data in the Node is an Integer.

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x, null, null);
			return;
		}

		BinaryNode n = root;
		boolean inserted = false;
		// System.out.println("!inserted+"+!inserted);
		while (!inserted) {
			if (x.compareTo(n.getElement()) < 0) {
				// space found on the left
				if (n.getLeft() == null) {
					n.setLeft(new BinaryNode(x, null, null));
					inserted = true;
				}
				// keep looking for a place to insert (a null)
				else {
					n = n.getLeft();
				}
			} else if (x.compareTo(n.getElement()) > 0) {
				// space found on the right
				if (n.getRight() == null) {
					n.setRight(new BinaryNode(x, null, null));
					inserted = true;
				}
				// keep looking for a place to insert (a null)
				else {
					n = n.getRight();
				}
			}
		}

	}

	public void printRightTree() {
		if (root == null)
			System.out.println("Empty tree");
		else {
			System.out.println(root.getElement());
			BinaryNode n = root.getRight();
			printRightTree(n);
		}
	}

	private void printRightTree(BinaryNode n) {
		if (n != null) {
			System.out.println(n.getElement());
			printRightTree(n.getLeft());
			printRightTree(n.getRight());

		}

	}

	public void printInRightTree() {
		if (root == null)
			System.out.println("Empty tree");
		else {
			BinaryNode n = root.getRight();
			printInRightTree(n);
		}
	}

	private void printInRightTree(BinaryNode n) {
		if (n != null) {
			printInRightTree(n.getLeft());
			System.out.println(n.getElement());
			printInRightTree(n.getRight());
		}

	}

	public int countLeaves() {
		BinaryNode n = root;
		if (n == null)
			return 0;
		else
			return countLeaves(n);

	}

	private int countLeaves(BinaryNode n) {
		// int countLeaves = 0;
		if (n == null) { // base condition
			return 0;
		}
		if (n.getLeft() == null && n.getRight() == null) // leaf condition
			return 1;

		return countLeaves(n.getLeft()) + countLeaves(n.getRight()); // carries
																		// on up
																		// to
																		// base
																		// condition
	}

	public int countLeftNodes() {
		if (root == null)
			return 0;
		return countLeftNodes(root.getLeft());
	}

	private int countLeftNodes(BinaryNode left) {
		if (left == null)
			return 0;
		return 1+ countLeftNodes(left.getLeft())+ countLeftNodes(left.getRight());
	}
	
	public int findMinimum(){
		if(root == null)
			return 0;
		return findMinimum(root.getLeft());
	}

	private int findMinimum(BinaryNode left) {
		if(left.getLeft() == null)
			return left.getElement();
		
		return findMinimum(left.getLeft());
	}
	
	public boolean allEven(){
		if(root == null)
			return false;
		return allEven(root);
	}

	private boolean allEven(BinaryNode root2) {
		if(root2 == null)
			return true;
		if(root2.getElement() %2 != 0)
			return false;
		return allEven(root2.getLeft())&& allEven(root2.getRight());
	}
	
	public int findMaximum(){
		if(root == null)
			return 0;
		if(root.getRight() == null)
			return root.getElement();
		return findMaximum(root.getRight());
	}

	private int findMaximum(BinaryNode right) {
		if(right.getRight() == null)
			return right.getElement();
		return findMaximum(right.getRight());
	}

}
