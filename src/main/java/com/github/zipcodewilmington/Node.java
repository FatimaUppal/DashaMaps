package com.github.zipcodewilmington;

public class Node {
    String value;
    Node next;
    String key;

    public Node(String key, String value) {
        this.value = value;
        this.key = key;
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
