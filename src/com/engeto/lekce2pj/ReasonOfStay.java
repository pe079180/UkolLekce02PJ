package com.engeto.lekce2pj;

public enum ReasonOfStay {
    BUSINESS("business trip"), HOLIDAY("holiday stay");
    final String description;

    ReasonOfStay(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

}
