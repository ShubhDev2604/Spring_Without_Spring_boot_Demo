package org.lifehive;

public class Dev {
    static private int objCount = 0;
    private int objNo;
    Dev() {
        objCount++;
        objNo = objCount;
        System.out.println("Hii Baby... I am Object no." + objCount);
    }
    public void build() {
        System.out.println("Hii Dev...I am using object no. " + objNo);
    }
}
