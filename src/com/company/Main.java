package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println(fibonachi(8));
       /* Tree tree1=new Tree();
        tree1.add(2);
        tree1.add(1);
        tree1.add(3);
        tree1.add(7);
        tree1.add(4);
        tree1.print();
        System.out.println(tree1);*/
    }

    private static int fibonachi(int n) {
     int f1=0,f2=1;
     int count=2;
     int result=0;
     while (count!=n){
         result=f1+f2;
         f1=f2;
         f2=result;
         count++;
     }
     return result;
    }
}
