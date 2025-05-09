class  Employee3{
    private int empid;
    public void setEmpid(int eid){
        empid=eid;
    }
    public int getEmpid(){
        return empid;
    }
}
class Company{
    public static void main(String[] args){
        Employee3 e1=new Employee3();
        e1.setEmpid(14856);
        System.out.println(e1.getEmpid());
    }
}