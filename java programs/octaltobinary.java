import java.util.Scanner;
class octaltobinary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a octal number:");
        int octal=sc.nextInt();
        int decimal=0;
        int power=0;
        while(octal!=0){
            int lastdigit=octal%10;
            decimal+=lastdigit*Math.pow(8,0);
            octal=octal/10;
        }
        String binary=" ";
        while(decimal!=0){
            int remainder=decimal%2;
            binary=remainder+binary;
            decimal=decimal/2;
        }
        System.out.println("Decimal value: "+decimal);
        System.out.println("binary value: "+octal);
    }
}