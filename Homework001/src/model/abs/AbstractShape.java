package com.mainacad.abs;

public abstract class AbstractShape implements com.mainacad.abs.Shape, Comparable<com.mainacad.abs.Shape>{
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(com.mainacad.abs.Shape o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        }
        return 0;
    }
}
