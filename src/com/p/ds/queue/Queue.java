package com.p.ds.queue;

import com.p.ds.list.Node;

/**
 * Created by xguo on 6/1/2016.
 */
public class Queue {

    Node first, last;

    void enqueue(String item) {
        Node newNode = new Node(item, null);
        if (last != null) {
            last.next = newNode;
            last = newNode;
        } else {
            first = newNode;
            last = newNode;
        }

    }

    Node dequeue() {
        if (first == null) {
            return null;
        }
        Node tmp = first;
        first = first.next;
        tmp.next = null;
        return tmp;
    }
}
