package com.course.java;

/**
 * @author KyrianSun
 * @create 2021-05-21 22:03
 */
public class SingletonTest{
    public static void main(String[] args) {
//        Bank bank = new Bank();
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }
}

class Bank {
    private Bank() {
    }
    private static Bank instance = new Bank();
    public static Bank getInstance(){
        return instance;
    }
}



class CBBB {
    public static void main(String[] args) {
        CDDD bank1 = CDDD.getInstance();
        CDDD bank2 = CDDD.getInstance();
        System.out.println(bank1 == bank2);
    }
}
class CDDD{
    private CDDD() {
    }
    private static CDDD instance = null;
    public static CDDD getInstance(){
        if (instance == null){
            instance = new CDDD();
        }
        return instance;
    }
}