package com.engeto.lekce2pj;

public enum YesNo {
    YES("yes"), NO ("no");
    final String description;

    YesNo(String description){ this.description=description;}

    @Override
    public String toString() {
        return description;
    }
}
