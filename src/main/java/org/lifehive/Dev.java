package org.lifehive;

public class Dev {
    static private int objCount = 0;

    public int getObjNo() {
        return objNo;
    }

    public Dev(Computer com) {
        this.com = com;
    }

    public void setObjNo(int objNo) {
        this.objNo = objNo;
    }

    private int objNo;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    private Computer com;
    Dev() {
        objCount++;
        objNo = objCount;
        System.out.println("Hii Baby... I am Object no." + objCount);
    }
    public void build() {
        System.out.println("Hii Dev...I am using object no. " + objNo);
        com.start();
    }
}
