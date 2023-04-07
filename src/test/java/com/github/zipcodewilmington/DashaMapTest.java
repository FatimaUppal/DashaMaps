package com.github.zipcodewilmington;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.text.resources.cldr.ext.FormatData_hsb;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap1Test {
    DashaMap map;
    @Before
    public void before(){
        map= new DashaMap();
    }
    @Test
    public void setTest(){
        String key ="key";
        String value="value";
        long expected= 1;

        map.set(key,value);
        long actual = map.bucketSize(key);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void deleteTest() {
        String key= "key";
        String value= "value";

        long expected =0;
        map.set(key, value);

        map.delete(key);
        long actual= map.bucketSize(key);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getTest() {
        String key= "key";
        String expected= "expected";
        map.set(key, expected);

        String actual = map.get(key);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isEmptyTest1() {
        String key= "key";
        String expected= "expected";

        map.set(key, expected);

        Assert.assertFalse(map.isEmpty());
    }
    @Test
    public void isEmptyTest2() {
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void sizeTest(){
        long expected = 2;

        map.set("i dont know", "same thing");
        map.set("i dont care", "anything");

        long actual= map.size();

        Assert.assertEquals(expected,actual);
    }
}
