class why{
    int age;
    String name;
    float marks;
    why(){
        age=45;
        name="Sovan";
        marks=57.9f;
        System.out.println(age+" "+name+" "+marks);
    }
    why(why H){
        age=H.age;
        name=H.name;
        marks=H.marks;
       System.out.println(age+" "+name+" "+marks);
    }
}
class Z{
    public static void main(String[] args){
        why t3=new why();
        why t4=new why(t3);
    }
}