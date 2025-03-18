public class gradingSystem {
    public static void main(String[] args) {
        int result = 33;
        // Convert score in rage of 100 to x/10 (1-10) scale
        int gradeCategory = result / 10;
        switch (gradeCategory) {
            case 10: // For result score (100)
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            case 5:
                System.out.println("Grade: E");
                break;

            default:
                System.out.println("Fail");
        }
    }
}
