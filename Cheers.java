// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String name = (args[0]).toUpperCase();
            int cheersNum = Integer.parseInt(args[1]);
            int wordLength = name.length();
            String specialChars = "AEFHILMNORSX";
            for (int i = 0; i < wordLength; i++) {
                char c = name.charAt(i);
                if (specialChars.indexOf(c) != -1) {
                        System.out.println("Give me an " + c + ": " + c + "!");
                } else {
                        System.out.println("Give me a  " + c + ": " + c + "!");
                }
            }
            System.out.println("What does that spell?");          
            for (int j = 0; j < cheersNum; j++) {
                System.out.println(name + "!!!"); 
            }              
        }
}
