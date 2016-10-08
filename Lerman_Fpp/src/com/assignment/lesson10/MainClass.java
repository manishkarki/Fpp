package com.assignment.lesson10;

public class MainClass {

	public static void main(String[] args) {
		MyBST my = new MyBST();
//		int [] array = {15,12,9,56,1,16,19,22,3,100,2,25};
		int [] array = {80,70,90,88};
		for(Integer put: array){
			my.insert(put);
		}
		
		System.out.print("----No. Of Nodes::");
		System.out.println(BinaryNode.getCountNode());;
		System.out.println("----In order Tree-------");
		my.printTree();
		System.out.println("----Pre order Tree------");
		my.printPreTree();
		System.out.println("----Post Order Tree-----");
		my.printPostTree();
		System.out.print("----Leaves Count--------");
		System.out.println(my.countLeaves());
		System.out.println("----Right Pre Tree");
		my.printRightTree();
		System.out.println("----Right In Tree");
		my.printInRightTree();
		System.out.println("-----No .of left nodes----");
		System.out.println(my.countLeftNodes());;
		System.out.println("-----Minimum------");
		System.out.println(my.findMinimum());
		System.out.println("check all even");
		System.out.println(my.allEven());
		System.out.println("-----Maximum------");
		System.out.println(my.findMaximum());
	}
}
