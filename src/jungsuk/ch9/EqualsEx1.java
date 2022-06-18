package jungsuk.ch9;

import java.sql.SQLOutput;

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
}


public class EqualsEx1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        System.out.println("v1 hashcode :: " + v1.hashCode());
        System.out.println("v2 hashcode :: " + v2.hashCode());
        if (v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");

        v2 = v1;
        System.out.println("v1 hashcode :: " + v1.hashCode());
        System.out.println("v2 hashcode :: " + v2.hashCode());
        if (v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");
    }
}
