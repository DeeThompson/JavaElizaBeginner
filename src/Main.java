import java.lang.ref.PhantomReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String rep = "", hedges, qualifiers;
                Random r = new Random();
                int x = 1 + r.nextInt(2);
                int hedgeorqual = 0;


                //Sample hedges
                HashMap<Integer, String> map2 = new HashMap<Integer, String>();
                map2.put(0, "Please tell me more");
                map2.put(1, "Many of my patients tell me the same thing");
                map2.put(2, "It is getting late, maybe we had better quit");

                HashMap<String, String> map = new HashMap<String, String>();

                map.put("i", "you");
                map.put("me", "you");
                map.put("my", "your");
                map.put("am", "are");



                while (!rep.equalsIgnoreCase("i am feeling great")) {
                    hedgeorqual = r.nextInt(2);
                    if (hedgeorqual == 0) {
                        System.out.println(map2.get(r.nextInt(3)));
                    }
                    System.out.println("Good day. What is your problem? Enter your response here" + "or 'quit'");



                    rep = sc.nextLine();
                    if (rep.equalsIgnoreCase("i am feeling great") || rep.equalsIgnoreCase("Q")) {
                        break;
                    } else {

//iterating over keys only
                        for (String key : map.keySet()) {
                            //System.out.println("Key = " + key);
                            if(rep.contains(key)) {
                                rep = rep.replaceAll(key,map.get(key));
                            }


                        }

                        System.out.println(rep);



                    }



                }




            }

                }

