public class Display {

    public static void main (String[] args) {

        int age = 18;
        char gender = 'M';
        float height = 1.7542f;
        boolean isStudent = true;
        double avScore = 99.12;
        System.out.printf("Age : %d" , age);
        System.out.printf("\nGender : %c" , gender);
        System.out.printf("\nHeight : %.2f" , height);
        System.out.printf("\nisStudent : %b" , isStudent);
        System.out.printf("\nAverage Score : %f\n" , avScore); 

        String firstName = "Heng";
        String lastName = "Mi Ly";
        String fullName = firstName + " " + lastName;
        String myFullName = firstName.concat(" ").concat(lastName);
        System.out.println("==========Connection String===========");
        
       
        System.out.println("Full Name: " + fullName);

        System.out.println("My full name: " + myFullName);
    }
}
