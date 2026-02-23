import java.util.Scanner;
class bintodec{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a binary number:");
        int binary=sc.nextInt();
        int decimal=0;
        int power=0;
        while(binary!=0){
            int lastdigit=binary%10;
            decimal+=lastdigit*Math.pow(2,power);
            binary=binary/10;
        }
        System.out.println("Binary number: "+binary);
        System.out.println("Decimal value: "+decimal);
    }
}