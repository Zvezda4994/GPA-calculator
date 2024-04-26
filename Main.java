import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the course name: ");
        String courseName = in.nextLine();
        Course course = new Course(courseName);

        System.out.println("Enter number of individual components:");
        int numberOfComponents = in.nextInt();

        for (int i=0; i<numberOfComponents; i++) {
            System.out.println("Enter weight for component " + (i+1) + ": ");
            double weight = in.nextDouble();

            System.out.println("Enter score for component " + (i+1) + ": ");
            double score = in.nextDouble();

            course.addComponent(weight, score);
        }

        double totalWeightedScores = 0;
        double totalWeights = 0;

        for (Component component : course.getComponents()) {
            totalWeightedScores += component.getScore() * (component.getWeight() / 100);
            totalWeights += component.getWeight();
        }

        if (Math.abs(totalWeights - 100.0) < 0.001) {
            System.out.printf("Your final grade for %s is: %.2f", course.getName(), totalWeightedScores);
        } else {
            System.out.println("Something's missing, total weights didn't add up to 100");
        }
       

       
    }
}