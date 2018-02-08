package com.company;

public enum conditions {

    NICE(5), GOOD(4), BAD(2);

    private final int condition_quality;

    conditions(int condition_quality) {
        this.condition_quality = condition_quality;
    }

    public int getCondition_quality() {
        return condition_quality;
    }
}


