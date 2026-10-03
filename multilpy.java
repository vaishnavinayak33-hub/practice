import java.util.Scanner;
public class multilpy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no : ");
        int n=sc.nextInt();
        int product=1;
        for(int i=1;i<=12;i++){
            product=12*i;
            System.out.println(n+" * "+i+" = "+product);

        }
    }
}