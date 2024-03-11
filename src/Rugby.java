import java.util.ArrayList;
import java.util.Random;

public class Rugby {
    public static void main(String[] args) {
        ArrayList<Integer> team1 = new ArrayList<>();
        ArrayList<Integer> team2 = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            int age;
            do {
                age = random.nextInt(40 - 18 + 1) + 18;
            } while (age % 10 == 4 || age % 10 == 9);

            if (i < 12) {
                team1.add(age);
            } else {
                team2.add(age);
            }
        }

        System.out.println("Team 1 ages:");
        for (int age : team1) {
            System.out.print(age + " ");
        }
        System.out.println("\nAverage age of team 1: " + averageAge(team1));

        System.out.println("\nTeam 2 ages:");
        for (int age : team2) {
            System.out.print(age + " ");
        }
        System.out.println("\nAverage age of team 2: " + averageAge(team2));
    }

    public static double averageAge(ArrayList<Integer> ages) {
        double sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return sum / ages.size();
    }
}