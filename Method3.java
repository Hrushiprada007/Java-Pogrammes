class Animalpro{
    String color,name;
    int age;
    void inobj(String a,String c ,int b){
        color=a;
        age=b;
        name=c;
    }
    void display(){
        System.out.print(name+" "+color+" "+age);
    }
    public static void main(String[] args){
        Animalpro titan=new Animalpro();
        titan.inobj("yellow","Titan",22);
        titan.display();
    }
}