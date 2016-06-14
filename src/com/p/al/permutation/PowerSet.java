package com.p.al.permutation;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by xguo on 6/8/2016.
 */
public class PowerSet {


    public PowerSet(int n) {
        ArrayList<ArrayList<Integer>> rt = new ArrayList<>();
        if (n < 0) {
            return;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        rt = calPowerSet(list, n);
        System.out.println(rt.toString());
        return;
    }


    private ArrayList<ArrayList<Integer>> calPowerSet(ArrayList<Integer> list, int n) {

        //powerSet(n) = powerSet(n-1) + {powerset(n-1),n}
        ArrayList<ArrayList<Integer>> rt =  new ArrayList<ArrayList<Integer>>();
        if (n == 0) {
            rt.add(new ArrayList<Integer>());
            ArrayList<Integer> list0 = new ArrayList<Integer>();
            list0.add(0);
            rt.add(list0);
            return rt;

        } else {
            ArrayList<ArrayList<Integer>> tmpRt = calPowerSet(list, n-1);
            //rt = new ArrayList<ArrayList<Integer>>(tmpRt);

            for(int i = 0; i < tmpRt.size(); i++) {
                rt.add(tmpRt.get(i));
                ArrayList<Integer> tmpList= new ArrayList<>();
                tmpList.addAll(tmpRt.get(i));
                tmpList.add(n);
                rt.add(tmpList);
        }
            return rt;
        }
        // ArrayList<Integer> listN = new ArrayList<Integer>();
        //listN.add(n);
        // rt.add(list)
        }

}