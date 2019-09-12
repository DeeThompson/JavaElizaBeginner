
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String rep = "";
                while (!rep.equalsIgnoreCase("i am feeling great")) {
                    System.out.println("Good day. What is your problem? Enter your response here" + "or 'quit'");


                    rep = sc.nextLine();
                    if (rep.equalsIgnoreCase("i am feeling great") || rep.equalsIgnoreCase("Q")) {
                        break;
                    } else {
                        System.out.println(rep);
                    }
                }
            }
        }
