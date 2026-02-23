import java.util.Scanner;
class dectooct{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a decimal number:");
        int decimal=sc.nextInt();
        String octal=" ";
        while(decimal!=0){
            int remainder=decimal%8;
            octal=remainder+octal;
            decimal=decimal/8;
        }
        System.out.println("octal number: "+octal);
    }
}