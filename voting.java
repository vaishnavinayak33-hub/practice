import java.util.Scanner;
public class voting{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age : ");
        int age=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        if(age>=18){
            System.out.println("eligible "+name);
        }
        else{
            System.out.println("not eligible "+name);
        }
        sc.close();
    }
}