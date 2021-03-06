package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test//UC1
    public void given3NumbersWhenLinkedShouldPassedLikedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
    //UC2
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
    //UC3

    @Test
    public void given3NumbersWhenAppendedToLinkedListShouldBeAddedToLast() {
        MyNode<Integer>myFirstNode = new MyNode<>(56);
        MyNode<Integer>mySecondNode = new MyNode<>(30);
        MyNode<Integer>myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    //UC4
    @Test
    public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    
    //Uc5
    @Test
    public void given3NumbersWhenPoppedShouldRemoveTheFirstNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.pop();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(mySecondNode) &&
                myLinkedList.head.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
    //UC6
    @Test
    public void given3NumbersWhenPoppedShouldRemoveTheLastNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.popLast();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode);
        Assert.assertTrue(result);
    }
    //UC7
    @Test
    public void given3NumbersWhenSearched30ShouldGiveItsPosition() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        Assert.assertEquals(myLinkedList.search(mySecondNode),mySecondNode);
    }
    //UC8
    @Test
    public void given3NumbersShouldSearchElementAndThenAddOneElementAfterThatInLinkedList() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyNode<Integer> myNewNode=new MyNode<>(40);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addElement(myFirstNode);
        myLinkedList.addElement(mySecondNode);
        myLinkedList.addElement(myThirdNode);
        INode element=myLinkedList.search(mySecondNode);
        myLinkedList.insert(element, myNewNode);
        myLinkedList.printMyNodes();
        boolean result =myLinkedList.head.equals(myFirstNode)
                && myLinkedList.head.getNext().equals(mySecondNode)
                &&myLinkedList.head.getNext().getNext().equals(myNewNode)
                && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    //UC9
    @Test
    public void given3NumbersShouldAddElementAndDeleteAtAnyIndexInLinkedList() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyNode<Integer> myNewNode=new MyNode<>(40);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addElement(myFirstNode);
        myLinkedList.addElement(mySecondNode);
        myLinkedList.addElement(myThirdNode);
        INode element=myLinkedList.search(mySecondNode);
        myLinkedList.insert(element, myNewNode);
        myLinkedList.deleteAtIndex(myNewNode);
        myLinkedList.printMyNodes();
        boolean result =myLinkedList.head.equals(myFirstNode)
                && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    //UC10
    @Test
    public void given4NumbersShouldSortedInASECorderInLinkedList() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyNode<Integer> myNewNode=new MyNode<>(40);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.sorted(myFirstNode);
        myLinkedList.sorted(mySecondNode);
        myLinkedList.sorted(myThirdNode);
        myLinkedList.sorted(myNewNode);
        myLinkedList.printMyNodes();
        System.out.println(MyLinkedList.getCount());
        boolean result =myLinkedList.head.equals(mySecondNode)
                && myLinkedList.head.getNext().equals(myNewNode)
                &&myLinkedList.head.getNext().getNext().equals(myFirstNode)
                && myLinkedList.head.getNext().getNext().getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
