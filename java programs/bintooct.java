import java.util.Scanner;
class bintooct{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number:");
        String binary=sc.nextLine();
        String oct=" ";
        int value;
        while(binary.length() % 3 !=0){
            binary='0'+binary;
        }
        for(int i=0; i<binary.length(); i+=3){
            value=0;
            value+=(binary.charAt(i)-'0')*4;
            value+=(binary.charAt(i+1)-'0')*2;
            value+=(binary.charAt(i+2)-'0')*1;
            oct=oct+value;
        }
        System.out.println("octal number: "+oct);
    }
}