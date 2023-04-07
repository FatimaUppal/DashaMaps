package com.github.zipcodewilmington;

import java.beans.PropertyEditorSupport;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap implements HashMapX {
    Node [] arr= new Node[26];
    private int HashFunctionOne(String input) {
        if (input.length() > 0) {
            return input.toLowerCase().charAt(0) -97;
        }
        return -1;
    }

    @Override
    public void set(String key, String value) {
        int index= HashFunctionOne(key);
        Node current=arr[index];
        if(current== null){
            arr[index]= new Node(key, value);
            return;
        }
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(new Node(key, value));
    }

    @Override
    public String delete(String key){
        Node current= arr[HashFunctionOne(key)];
        Node previous= null;
        while(current != null){
            if(current.getKey().equals(key)){
                String val= current.getValue();
                current= current.getNext();
                previous.setNext(current);
                return val;
            }
            previous= current;
            current= current.getNext();
        }
        return null;
    }
    @Override
    public String get(String key){
        int index= HashFunctionOne(key);
        Node current= arr[index];
        while(current != null){
            if(current.getKey().equals(key)){
                return current.getValue();
            }
            current = current.next;
        }
        return null;
    }
    @Override
    public boolean isEmpty(){
        return size()==0;
    }
    @Override
    public long size(){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            Node current= arr[i];
            while(current != null){
                count++;
                current=current.getNext();
            }
        }
        return count;
    }

    @Override
    public long bucketSize(String key) {
        long count= 0;
        Node current= arr[HashFunctionOne(key)];
        while(current != null){
            count++;
            current=current.getNext();
        }
        return count;
    }



}
