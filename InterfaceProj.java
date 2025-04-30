import java.util.Scanner;
interface Client{
    void input();//public+abstract
    void output();
}
class Raju implements Client{
    String name;double sal;
    public  void input(){
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Username:");
        name=r.nextLine();
        System.out.print("Enter your Salary:");
        sal=r.nextDouble();
    }
    public void output(){
        System.out.println(name+" your salary in this month "+sal);
    }
    public static void main(String[] args){
        Client c1=new Raju();
        c1.input();
        c1.output();
    }
}
