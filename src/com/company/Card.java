package com.company;

public class Card {
    private String name;
    private int value;
    private String suite;

    @Override
    public String toString() {
        return name + " of " + suite;
    }

    public Card(String name, int value, String suite) {
        this.name = name;
        this.value = value;
        this.suite = suite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }


}
