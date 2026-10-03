public class Typecasting{
    public static void main(String[] args) {
        //implicit(widening) typecasting
        int num=100;
        System.out.println("INT:-"+num);
        double d=num;
        System.out.println("double "+d);

        //explicit typecasting
        double d2=109.99;
        System.out.println("double "+d2);
        int num2=(int)d2;
        System.out.println("INT:-"+num2);
        
    }
}