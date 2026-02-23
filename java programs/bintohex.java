import java.util.Scanner;
class bintohex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number:");
        String binary=sc.nextLine();
        String hex=" ";
        int value;
        while(binary.length() % 4 !=0){
            binary='0'+binary;
        }
        for(int i=0; i<binary.length(); i+=4){
            value=0;
            value+=(binary.charAt(i)-'0')*8;
            value+=(binary.charAt(i+1)-'0')*4;
            value+=(binary.charAt(i+2)-'0')*2;
            value+=(binary.charAt(i+3)-'0')*1;
            hex=hex+value;
            if(value<10){
                hex=hex+value;
            }
            else{
                hex=hex+(char)('A'+value-10);
            }
            System.out.println("Hexadecimal value: "+hex);
            
         }
    }
}
    

