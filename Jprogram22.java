import java.util.Scanner;
class Check{
    public static void main(String args[]){
        char ch;
        System.out.print("Enter a character in our alphabet:");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);

        if(ch=='a'|| ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'|| ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            System.out.println("vowel:"+ch);
        }
        else{
            System.out.println("consonant:"+ch);
        }
    }
}