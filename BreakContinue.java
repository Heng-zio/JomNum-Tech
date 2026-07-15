public class BreakContinue {

    public static void main(String[] args) {
        //1. break
        for (int i = 1; i <= 10; i++ ) {
            if (i == 8) {
                System.out.println("Break the system at index : " + i);
                break;
            }else {
                System.out.println("Iteration : " + i);
            }
        }
        //2. continue
        for (int j= 1; j<= 10; j++) {
            if (j == 8) {
                System.out.println("Skip the process at index : " + j);
                continue;
            }else {
                System.out.println("Iteration : " + j);
            }
        }
    }
}