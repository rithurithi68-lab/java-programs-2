import java.util.Scanner;
class armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum=sum+(int)Math.pow(digit,4);
            temp=temp/10;
        }
        System.out.println("sum= "+sum);
        if(sum==num)
            System.out.println("armstrong number");
        else 
            System.out.println("not an armstrong number"); 
    }
}

