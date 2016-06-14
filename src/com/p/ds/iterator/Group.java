package com.p.ds.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xguo on 6/5/2016.
 */
public class Group<Person> implements Iterable<Person> {


    private String name;

    private int index = 0;

    private ArrayList<Person> pList;

    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator();
    }

    public Group() {
        //
    }

    public void addPerson(Person p) {
        if (p != null) {
            pList.add(p);
        }
    }



    class PersonIterator implements Iterator<Person> {

        public PersonIterator() {

        }

        @Override
        public boolean hasNext() {
            if (index >= pList.size() - 1) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Person next() {
            Person p = pList.get(index);
            index++;
            return p;
        }
    }
}
