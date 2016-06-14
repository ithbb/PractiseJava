package com.p.ds.list;

/**
 * Class Node {
    Object content;
    Node next;
   }

 Write a method to reverse the list in place.  In other words, don't copy the entire list into another data structure.

 For example:
 Node reversedList = reverseList(originalList);

 */
public class ReverseList {

    public static void main(String[] args) {

        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        n1.content = "n1";
        n2.content = "n2";
        n3.content = "n3";
        n1.next = n2;
        n2.next = n3;
        System.out.println("Before:");
        Node p = n1;
        while (p != null) {
            System.out.println(p.content);
            p = p.next;
        }
        System.out.println("After:");
        Node reversedList = reverseList(n1);
        while (reversedList != null) {
            System.out.println(reversedList.content);
            reversedList = reversedList.next;
        }
    }

    public static Node reverseList(Node head) {

        if (head == null) {
            return null;
        }

        Node pre = null;
        Node after;
        while(head != null) {
            after = head.next;
            head.next = pre;
            pre = head;
            head = after;
        }

        return pre;
    }
}


