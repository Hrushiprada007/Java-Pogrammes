class NestedBlock{
    public static void main(String[] args){
        try{
            int a=10,b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            String b="HRUSHI";
            System.out.println(b.toLowerCase());
        }
        catch(NullPointerException n){
            System.out.println(n);
        }System.out.print("Main Method ended");
    }

}
