public class PracticeMethod {

    public static void userInfo(String username, int age, String dob) {
        System.out.println("================== User Information================");
        System.out.println("Username :  " + username);
        System.out.println("Age : " + age);
        System.out.println("Date of Birth : " + dob);
    }

    public static int Multiply(int num1,int num2) {
        int result = num1 * num2;
        return result;
    }
    public static void main (String[] args) {
        
        userInfo("Ingdavann",18,"27,June, 2006");
        userInfo("Mi Ly Heng",18,"8,May, 2006");
        userInfo("Minea",18,"8,May, 2006");

        System.out.println("\n Result of multiply : " + Multiply(70,20));

    }
}
