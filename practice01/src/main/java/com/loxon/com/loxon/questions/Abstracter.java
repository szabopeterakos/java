package com.loxon.com.loxon.questions;

public abstract class Abstracter {

    public static final int AGE;
    protected String name;

    static {
        AGE = 33;
    }

    public Abstracter(String name) {
        this.name = name;
    }

    public Abstracter() {
    }
}
