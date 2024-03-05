//IMPLEMENTATION OF DATA TYPE AND VARIABLRS IN JAVA
public class exp1a{
    public static void main(String []args){
        byte num1=100;
        short num2=5000;
        int num3=10000;
        long num4=15000000L;
        float num5=6.75f;
        double num6=19.79d;
        boolean flag1=true;
        boolean flag2=false;
        char grade='A';
        String str="Hello World";
        System.out.println("Different types of Data Types in Java:");
        System.out.println("byte:"+num1);
        System.out.println("short:"+num2);
        System.out.println("short:"+num3);
        System.out.println("short:"+num4);
        System.out.println("short:"+num5);
        System.out.println("short:"+num6);
        System.out.println("short:"+flag1);
        System.out.println("short:"+flag2);
        System.out.println("short:"+grade);
        System.out.println("String:"+str);
        //Widening
        int a=10;
        float f=a;
        System.out.println(a);
        System.out.println("After widening"+f);
        //narrowing 
        float b=10.5f;
        //int c=b;//compiler time error
        int c=(int)b;
        System.out.println(b);
        System.out.println("After narrowing:+c");
        //final variable
        final int myNum=15;
        //myNum=20;//will generate erroe:cant assign value ti final variable
        System.out.println("Final variable value:"+myNum);
        System.out.print(b);
    }
}