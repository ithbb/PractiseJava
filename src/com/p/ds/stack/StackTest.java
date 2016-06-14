package com.p.ds.stack;

import com.p.ds.list.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xguo on 6/1/2016.
 */
public class StackTest {

    Stack s = new Stack();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void pop() throws Exception {

    }

    @Test
    public void push() throws Exception {
        s.push("0");

        s.push("1");

        s.push("2");
        while (s.top != null) {
            Node d = s.pop();
            String s = (String) d.content;

            System.out.print(s);
        }
    }

}