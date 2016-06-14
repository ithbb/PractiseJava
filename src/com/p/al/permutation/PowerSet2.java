package com.p.al.permutation;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by xguo on 6/9/2016.
 */
public class PowerSet2 {

    public PowerSet2(int n) {
        ArrayList<ArrayList<Integer>> rt = new ArrayList<>();
        if (n < 0) {
            return;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        calPowerSet2(rt, list, n);
        System.out.println(rt.toString());
        return;
    }

    private void calPowerSet2(ArrayList<ArrayList<Integer>> rt, ArrayList<Integer> list, int n) {


        rt.add(new ArrayList<Integer>(list));

        if (n == 0) {

            return;
        }
        for (int i = 0; i < n; i++) {


            calPowerSet2(rt, list, n-1);
            list.remove(list.size() - 1);
        }
    }
}
