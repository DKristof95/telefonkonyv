package org.acme;

public enum Type {
    Type1("Normál"),
    Type2("Távmeghallgatás"),
    Type3("Védett távmeghallgatás");
    private String type;
    Type(String type) {
        this.type = type;
    }
    public String getType() {return type;}
}
