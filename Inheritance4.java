class Student3{
    int rolno,marks;
    String name;
    void input(){
        System.out.println("Enter the rollno,marks and name:"+" "+"Welcome!...");
    }
}
class child extends Student3{
    void disp(){
        rolno=234;
        marks=543;
        name="Bapuni";
        System.out.println(rolno+" "+marks+" "+name);
    }
    public static void main(String[] args){
        child d1=new child();
        d1.disp();
        d1.input();

    }
}