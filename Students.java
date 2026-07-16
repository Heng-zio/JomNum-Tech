public class Students {
    int studentAge;
    String studentName;
    static String schoolName = "JomNum Tic";

    Students (){
        this("Minea",21);
    }

    Students (String studentName,int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public void display() {
        System.out.println("Student name : " + studentName);
        System.out.println("Student age : " + studentAge);
        System.out.println("School : " + schoolName);
    }

    public static void main(String[] args) {
        Students obj = new Students();
        obj.display();
    }
}