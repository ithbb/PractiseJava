package com.p.ds.list;

/**
 * Created by xguo on 6/1/2016.
 */
public class Node {
    public Object content;
    public Node next;
    public Node() {

    }
    public Node(Object c, Node n) {
        content = c;
        next = n;
    }
}
