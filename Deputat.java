package VerhovnaRada;

import java.util.Scanner;

public class Deputat extends Human {
    String surename;
    String name;
    int age;
    boolean bribe;
    int bribeValue;
    Scanner scanner = new Scanner(System.in);


//    ---------------------ЗРОБИТИ ТАК ЩОБ МЕТОД ВЕРТАВ СТРІНГОВЕ ЗНАЧЕНЯ----------------------------
    public void takeBribe() {
        if (bribe == false) {
            System.out.println(this.name + " " + this.surename + " не бере хабарів");
        } else if (bribe == true) {
            System.out.println("Please input bribe value give to " + this.name + " " + this.surename + " below:");
            Scanner scanner = new Scanner(System.in);
            bribeValue = scanner.nextInt();
            if (bribeValue > 5000) {
                System.out.println("Міліція ув'язить " + this.name + " " + this.surename);
            } else if (bribeValue < 5000) {
                this.bribeValue = bribeValue;
            }
        }
    }
//----------------------------------------------------------------------------------------------------
    public void nameYourself() {
        System.out.println(this);
    }

    public Deputat() {
    }

    public Deputat(double weight, double height, String surename, String name, int age, boolean bribe) {
        super(weight, height);
        this.surename = surename;
        this.name = name;
        this.age = age;
        this.bribe = bribe;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribe() {
        return bribe;
    }

    public void setBribe(boolean bribe) {
        this.bribe = bribe;
    }


    @Override
    public String toString() {
        return "Deputat: " +
                "\nsurename: " + surename +
                "\nname: " + name +
                "\nage: " + age +
                "\nbribe: " + bribe +
                "\nweight: " + weight +
                "\nheight: " + height +
                "\nbribeValue: " + bribeValue;
    }

}
