package com.kjss.node;

public class Node {

	private int value;
	//左子节点
	private Node left; 
	//右子节点
	private Node right;
	//节点本身
	private Node node;
	
	public Node() {
    }

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}
    
}
