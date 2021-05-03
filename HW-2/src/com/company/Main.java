package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Task2
        int x1=-1, x2=-4, x3=-10;
        int y1=1, y2=6, y3=2;

        System.out.println( "The area of triangle with coordinates ("+x1+","+y1+"; "+x2+","+y2+"; "+x3+","+y3+"; is:"+square(x1,x2,x3,y1,y2,y3));
//Task3
        System.out.println("Input your number please: ");

        int number=in.nextInt();
        System.out.println("The number (" +number+") "+(isEven(number)?"is even":"isn`t even"));

//Task4

        System.out.println("How much nambers do you want input? ");
        int[] num= new int[in.nextInt()];
        System.out.println("Input this numbers please: ");
        for (int i=0;i< num.length;i++){
            System.out.println((i+1)+" number is : ");
            num[i]=in.nextInt();
        }

        int tempArray[]= less(num);
        int resalt[] =new int[tempArray[tempArray.length-1]];
        for(int i=0;i<resalt.length;i++){
            resalt[i]=tempArray[i];
        }

        System.out.println(" The less absolute value of your numbers"+(tempArray[tempArray.length-1]>1?" are:":" is: "));
        for(int i=0; i<resalt.length;i++){
            System.out.println(resalt[i]);
        }
    }

    public static double square (int x1, int x2,int x3,int y1,int y2,int y3){
        double square,sideA,sideB,sideC,p;

        sideA = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        sideB = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        sideC = Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        p=(sideA+sideB+sideC)/2;
        square=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        return  square;
    }

    public static boolean isEven(int num){
        boolean even= (num%2==0?true:false);
        return even;
    }

    public static int[] less(int[] num) {
        int count=0;
        int[] lessNumber=new int[num.length+1];
        lessNumber[0]=num[0];
        for(int i=0;i<num.length;i++){
            if (mod(num[i])<mod(num[count])){
                count=i;
            }
        }
        for(int i=0,j=0;i<num.length;i++){
            if (mod(num[i])==mod(num[count])){
                lessNumber[j]=num[i];
                j++;
                lessNumber[num.length]=j;
            }
        }

        return lessNumber;
    }
    //Вычисление модуля числа
    public static int mod(int num){
        num= (num<0?num*-1:num);
        return num;
    }

}
