import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no : ");
        int num=sc.nextInt();
        int unit=1;
        while(num!=0){
            unit=num%10;
            System.out.print(unit);
            num=num/10;
        }
    }
}