public class GradeReport {
    public static void main(String[] args) {
        int finalGrades = 7;
        if (finalGrades < 6) 
            System.out.println("Failed");
        else if (finalGrades == 6)
            System.out.println("Retake the test");
        else
            System.out.println("Passed");
        
    }
}