package com.assignment.lesson10;

public class BinaryNode {
	
	private Integer element; 
	private BinaryNode left;       
	private BinaryNode right;
	private static int countNode=0; 
	BinaryNode(Integer element)
	{
		this(element,null,null); 
		
	}
	
	BinaryNode(Integer element, BinaryNode left, BinaryNode right)
	{
		this.setElement(element);
		this.setLeft(left);
		this.setRight(right);
		countNode++;
	}
	public static int getCountNode()
	{
		return countNode;
	} 
	public Integer getElement() {
		return element;
	}

	public void setElement(Integer element) {
		this.element = element;
	}

	public BinaryNode getLeft() {
		return left;
	}

	public void setLeft(BinaryNode left) {
		this.left = left;
	}

	public BinaryNode getRight() {
		return right;
	}

	 
	public void setRight(BinaryNode right) {
		this.right = right;
	}

}
