package com.p.ds.queue;

import com.p.ds.list.Node;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xguo on 6/1/2016.
 */
public class QueueTest {

    Queue q = new Queue();

    @Test
    public void enqueue() throws Exception {

        q.enqueue("0");
        Node node1 = new Node("1", null);
        q.enqueue("1");
        Node node2 = new Node("2", null);
        q.enqueue("2");
        while (q.first != null && q.last != null) {
            Node d = q.dequeue();
            String s = (String) d.content;

            System.out.print(s);
        }

    }

    @Test
    public void dequeue() throws Exception {

    }

}