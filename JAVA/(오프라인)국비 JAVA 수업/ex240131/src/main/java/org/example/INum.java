package org.example;

import java.util.Objects;

public class INum {
    private int num;

    public INum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((INum)obj).num;
    }

    @Override
    public int hashCode() {
        return 10;
    }

//    @Override
//    public int compareTo(Object o) {
//        return this.num-((INum) o).num;
//    }

    @Override
    public String toString() {
        return "INum{" +
                "num=" + num +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
