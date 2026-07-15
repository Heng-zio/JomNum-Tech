public class HorizontailData {

    public static void main (String[] args) {

        int [] scores = { 12, 23, 56, 67, 12, 78};

        System.out.println("The length of Array : " + scores.length);
        
        System.out.println("Access index 0 : " + scores[0]);

        System.out.println("Access index 4 : " + scores[4]);


        System.out.println("Access the last element : " + scores[scores.length -1]);

        for (int i = 0; i < scores.length; i++) {

            
        System.out.println("Loop the array at index : " + i + " with value : " + scores[i]);
        }

        scores[4] = 100;
        scores[scores.length - 1] = 500;

        for (int i = 0; i < scores.length; i++) {

            System.out.println("Loop the updated array at index " + i + " with value : " + scores[i]);
        }
    }
}
