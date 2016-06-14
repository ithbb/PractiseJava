package com.p.ds.stack;

import com.p.ds.list.Node;

/**
 * Created by xguo on 6/1/2016.
 */
public class Stack {

    Node top = null;

    Node pop() {
        if (top != null) {
            Node node = top;
            top = top.next;
            return node;
        }
        return null;
    }

    void push(Object item) {
        Node node = new Node(item, top);
        top = node;
    }


}
