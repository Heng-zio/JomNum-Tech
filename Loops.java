public class Loops {

    public static void main (String[] args) {

        int i = 1;
        do {
        
            System.out.println("Checking Student # " + i);
            i++;
        }while(i < 10);
   
        System.out.println("\n============================================");

        char[] letters = {'A','B','C','D','E','F'};

        System.out.println("Using For Loop");

        for (int j = 0; j < letters.length; j++) {

            System.out.println("Letter " + j + ": " + letters[j]);
            System.out.println("\n=========================================\n");

         System.out.println("Using For-Each Loop");

         for (char letter : letters) {

             System.out.println("letter: " + letter );
         }
        }
    }
}
