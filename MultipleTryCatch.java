             /*--------Multiple try-catch programme------- */
class Handling1{
    public static void main(String[] args){
        try{
            int a=5,b=0,c;
            c=a/b;
            System.out.print(c);
        }
        catch(ArithmeticException d){
            System.out.println(d);
            //System.out.println("we can't devide zero");
        }
        try{
            int a[]={5,6,41,25,78};
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException r){
            System.out.println(r);
            //System.out.println("beyond the array limit");
        }
    }
}
