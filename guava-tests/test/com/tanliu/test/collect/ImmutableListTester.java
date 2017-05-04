package com.tanliu.test.collect;

import com.google.common.collect.ImmutableList;
import com.google.monitoring.runtime.instrumentation.common.com.google.common.base.Function;
import com.google.monitoring.runtime.instrumentation.common.com.google.common.collect.Lists;
import junit.framework.TestCase;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/**
 * @author TanLiu
 * @create 2017-05-04 16:53
 **/
public class ImmutableListTester extends TestCase {

    public void testList(){
        List<String> jdkStrings= Arrays.asList("1","2","3","4");
        Lists.transform(jdkStrings, new Function<String, Object>() {

            @Nullable
            @Override
            public Object apply(@Nullable String s) {
                return null;
            }
        });
/*        List<String> subList = jdkStrings.subList(1, 3);
        Collections.reverse(subList);*/
        ImmutableList<String> strings = ImmutableList.copyOf(jdkStrings);
        ImmutableList<String> subIList = strings.subList(1,3);
        ImmutableList<String> reverse = subIList.reverse();
        System.out.println(strings);

    }
}
