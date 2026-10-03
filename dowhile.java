import java.util.Scanner;
public class dowhile{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        do{
            System.out.println("Enter password :");
            int pass=sc.nextInt();
            if(pass==1234){
                System.out.println("correct");
                break;
            }
            else{
                System.out.println("try again");
                
            }
            i++;
        }while(i!=3);
        System.out.println("Blocked");
    }
}
