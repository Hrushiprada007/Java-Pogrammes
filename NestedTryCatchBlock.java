                       /*-----Nested Try Block----*/
class NestedTry{
    public static void main(String[] args){
        try {
            try {
                int a[]={14,15,16,17};
                System.out.println(a[3]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println(10/0);
        }
        catch(ArithmeticException f){
            System.out.println(f);
        }
    }
}