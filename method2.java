class MethodAnimal{
    String color,name;
    int age,weight;
    void pobj(String c,String d,int a,int b){
        color=c;
        name=d;
        age=a;
        weight=b;
    }
    void display(){
        System.out.print(name+" "+color+" "+age+" "+weight);
    }
    public static void main(String[] args){
        MethodAnimal burzo=new MethodAnimal();
        burzo.pobj("red","lorry",13,65);
        burzo.display();

    }
}