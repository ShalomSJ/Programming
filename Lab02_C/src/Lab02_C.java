import java.util.Scanner;

public class Lab02_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1,word2;
        System.out.println("Enter two words separated by spaces:");
        word1= sc.next();
        word2=sc.next();

        if(word1.length()==word2.length()){
            String output= word1.toUpperCase();
            System.out.println("You have only entered one word:"+ " " +output );
        }else{
            System.out.println("You have entered two words:\"" + word1.toLowerCase() +  "\" and \""  + word2.toLowerCase() + "\"" );
        }
    }
}
