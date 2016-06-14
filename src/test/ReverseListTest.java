package test;

import static org.junit.Assert.*;

import com.p.ds.list.Node;
import com.p.ds.list.ReverseList;

/**
 * Created by xguo on 6/1/2016.
 */
public class ReverseListTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void reverseList() throws Exception {
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
        Node reversedList = ReverseList.reverseList(n1);
        while (reversedList != null) {
            System.out.println(reversedList.content);
            reversedList = reversedList.next;
        }
    }

}