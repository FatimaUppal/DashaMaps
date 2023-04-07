package com.github.zipcodewilmington;

import java.beans.PropertyEditorSupport;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap implements HashMapX {
    Node [] arr= new Node[26];

    @Override
    public void set(String key, String value) {
    }

    @Override
    public String delete(String key){
        return null;
    }
    @Override
    public String get(String key){
        return null;
    }
    @Override
    public boolean isEmpty(){
        return false;
    }
    @Override
    public long size(){
        return 0;
    }

    @Override
    public long bucketSize(String key) {
        return 0;
    }


    public long getBucket(String k) {
        return 0;
    }
}
