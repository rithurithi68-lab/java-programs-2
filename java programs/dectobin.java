import java.util.Scanner;
class dectobin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int decimal=sc.nextInt();
        String binary=" ";
        while(decimal!=0){
            int remainder=decimal%2;
            binary=remainder+binary;
            decimal=decimal/2;
        }
        System.out.println("Binary number: "+binary);
    }
}