import java.util.Scanner;
public class foreachloop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a={10,20,30,40};
        for(int score : a){
            System.out.println(score);
        }
    }
}