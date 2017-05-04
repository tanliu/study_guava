package com.tanliu.test.base;

import com.google.common.base.Splitter;
import junit.framework.TestCase;

/**
 * @author TanLiu
 * @create 2017-05-04 15:37
 **/
public class Suppliertester extends TestCase {

    private static final Splitter COMMA_SPLITTER = Splitter.on(',');

    public void testSplitNullString(){
        try {
            COMMA_SPLITTER.split(null);
        }catch (NullPointerException e){
            System.out.println("e");
        }
    }






}
