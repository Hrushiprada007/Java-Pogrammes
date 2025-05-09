class Stud{
    private int rollno;
    private String name;
    private String course;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
class Comapny{
    public static void main(String[] args){
        Stud s1=new Stud();
        s1.setRollno(74563);
        System.out.println(s1.getRollno());
        s1.setCourse("MCA");
        System.out.println(s1.getCourse());
        s1.setName("Hrushi");
        System.out.println(s1.getName());
        s1.setCourse("BBA");
        System.out.println(s1.getCourse());
        s1.setRollno(14782);
        System.out.println(s1.getRollno());

    }

}