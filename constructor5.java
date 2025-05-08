class Employee5{
    String name;
    int marks;
    Employee5(String name,int marks){
        this.name=name;
        this.marks=marks;
        System.out.println(name+" "+marks);
    }
    public static void main (String[] args){
        Employee5 e1=new Employee5("lorerm",11223);
        Employee5 e2=new Employee5("Helllo",90988);
    }
}