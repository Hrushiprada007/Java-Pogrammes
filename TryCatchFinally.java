class Handling{
    public static void main(String[] args){
        try{
            System.out.println("Welcome to Exception Handling class");
            int m=20, n=0,p;
            p=m/n;
            System.out.println(p);
        }
        catch(Exception a){
            System.out.println("Handle the exception");
            System.out.println("It can't devide by zero");
        }
        finally {
            System.out.println("Hello Java");
        }
    }
}
