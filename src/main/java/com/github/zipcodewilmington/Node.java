package com.github.zipcodewilmington;

public class Node {
    String data;
    Node next;

    public Node(String data){
        this.data= data;
        next=null;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data=data;

    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node node) {
        this.next = node;
    }
