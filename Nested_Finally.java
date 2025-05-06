class NesteFinally {
    public static void main(String[] args) {
        try {
            String a = "hrushi";
            System.out.println(a.toUpperCase());
        }
        catch(Exception b){
            System.out.println(b);
        }
        finally {
            try{
                System.out.println(10/0);
            }
            catch(ArithmeticException c){
                System.out.println(c);
            }
            finally {
                System.out.println("Welcome to Hruhi's Java class");
            }
        }
    }
}