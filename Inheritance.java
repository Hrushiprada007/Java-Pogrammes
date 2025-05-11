class Student {
    int rollno, marks;
    String name;

    void input() {
        System.out.println("Enter rollno, marks, and name:");
    }

    class Child1 extends Student {
        void display() {
            rollno = 12;
            marks = 560;
            name = "lorems";
            System.out.println(rollno + " " + name + " " + marks);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        Student student = new Student();
        // Use the outer class instance to create an instance of the inner class
        Student.Child1 t1 = student.new Child1();
        t1.input();
        t1.display();
    }
}