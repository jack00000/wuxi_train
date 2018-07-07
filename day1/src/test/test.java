package test;

public class test {
    public static void main(String args[]){
        Zidan z=new Zidan(100,true);
        Tanke t=new Tanke(500,true);
        System.out.println(z.getBleed());
        System.out.println(z.getLive());
        System.out.println(t.getBleed());
        System.out.println(t.getLive());

        z.zi2Tanke(t);
        System.out.println();

        System.out.println(z.getBleed());
        System.out.println(z.getLive());
        System.out.println(t.getBleed());
        System.out.println(t.getLive());

    }
}
/*
 output 100
        true
        500
        true

        50
        true
        450
        true*/
