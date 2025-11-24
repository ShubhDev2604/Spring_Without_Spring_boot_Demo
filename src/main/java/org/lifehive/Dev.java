package org.lifehive;

public class Dev {
    static private int objCount = 0;

    public int getObjNo() {
        return objNo;
    }

    public void setObjNo(int objNo) {
        this.objNo = objNo;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Dev(int objNo, Laptop laptop) {
        this.objNo = objNo;
        this.laptop = laptop;
        System.out.println("Hii Baby... I am Object no." + objNo);
    }

    private int objNo;
    private Laptop laptop;
    Dev() {
        objCount++;
        objNo = objCount;
        System.out.println("Hii Baby... I am Object no." + objCount);
    }
    public void build() {
        System.out.println("Hii Dev...I am using object no. " + objNo);
        laptop.start();
    }
}
