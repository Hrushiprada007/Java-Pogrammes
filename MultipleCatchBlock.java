class Multicatch{
    public static void main(String[] args){
        try{
            double a=10,b=4,c;
            c=a/b;
            System.out.println(c);

            int arr[]={3,7,8,9,10};
            System.out.println(arr[3]);

            //String str="hrushi";
            String str="null";
            System.out.println(str.toUpperCase());
        }
        catch(ArithmeticException a){
            System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException b){
            System.out.println(b);
        }
        catch(Exception c){
            System.out.println(c);
        }

    }
}