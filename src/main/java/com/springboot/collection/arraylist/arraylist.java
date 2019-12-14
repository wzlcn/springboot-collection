package com.springboot.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname arraylist
 * @Description TODO
 * @Date 2019/10/21 17:13
 * @Created by wangzhilong
 */
public class arraylist {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            iterator.remove();
        }
        System.out.println(list.size());
    }


}
