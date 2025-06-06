/*class NPE{
    public static void main(String[] args){
        String str=null;
        try{
            System.out.println(str.toUpperCase());
        }
        catch(NullPointerException r){
            System.out.println("null can't be casted");
        }
    }
}
class NPE{
    public static void main(String[] args){
        String str="hrushi";
        try{
            System.out.println(str.toUpperCase());
        }
        catch(NullPointerException r){
            System.out.println("null can't be casted");
        }
    }
}*/
class NPE{
    public static void main(String[] args){
        String str="HRUSHI";
        try{
            System.out.println(str.toLowerCase());
        }
        catch(NullPointerException r){
            System.out.println("null can't be casted");
        }
    }
}