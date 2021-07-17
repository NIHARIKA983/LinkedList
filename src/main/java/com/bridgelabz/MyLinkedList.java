package com.bridgelabz;

public class MyLinkedList<K> {
    public INode head;
    public INode tail;
    public static int count;
    public static int getCount() {
        return count;
    }

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(INode<K> myNode){
        if (this.head == null){
            this.head = myNode;
        }
        if (this.tail == null){
            this.tail = myNode;
        }else{
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public void add(INode newNode ) {
        if (this.tail == null)
            this.tail = newNode ;
        if (this.head == null)
            this.head = newNode ;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    public void addElement(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        }
        else {
            INode tempNode = this.head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(newNode);
            this.tail = newNode;
        }
    }
    public void insert(INode myNode,INode newNode){
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
    public INode popLast(){
        INode tempNode = this.head;
        while(!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode.setNext(null);
        return tempNode;
    }

    public INode search(INode newNode){
        int count = 0;
        INode tempNode = this.head;
        while (!tempNode.getNext().equals(newNode)) {
            tempNode = tempNode.getNext();
        }
        return tempNode.getNext();
    }
    //Method to delete an element at any index in Linked List
    public INode deleteAtIndex(INode element) {
        count--;
        if (head.equals(element)) {
            INode del = head;
            head = head.getNext();
            return del;
        }
        INode tempDeleteNode= head;
        while (!tempDeleteNode.getNext().equals(element)) {
            tempDeleteNode = tempDeleteNode.getNext();
        }
        INode tempNode = tempDeleteNode.getNext();
        tempDeleteNode.setNext(tempDeleteNode.getNext().getNext());
        return tempNode;
    }
    //Method for sorting Element in Linked List
    public void sorted(INode newNode) {
        count++;
        INode currentNode = this.head;
        INode prevNode = null;
        while (currentNode != null && (int) newNode.getKey() > (int) currentNode.getKey()) {
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (prevNode == null) {
            this.head = newNode;
        } else {
            prevNode.setNext(newNode);
        }
        newNode.setNext(currentNode);
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
