
public class Variables{
    //class variable
    static int classvar=1;
    //instance variable
    public String geek;
    public int i;
    //constructor
    public Variables(){
        this.geek="vaishnavi";
    }
    public static void main(String[] args){
       Variables obj=new Variables();
       System.out.println("My name is "+obj.geek);
       System.out.println(obj.i);
       System.out.println(classvar);
    }
}