import java.util.Random;

public class Rugby {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];

        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            team1[i] = generateRandomAge(random);
            team2[i] = generateRandomAge(random);
        }

        System.out.println("Team 1 ages:");
        printAges(team1);
        System.out.println("Average age of team 1: " + averageAge(team1));

        System.out.println("\nTeam 2 ages:");
        printAges(team2);
        System.out.println("Average age of team 2: " + averageAge(team2));
    }

    public static int generateRandomAge(Random random) {
        return random.nextInt(23) + 18; // генерация возраста от 18 до 40 лет
    }

    public static double averageAge(int[] ages) {
        double sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return sum / ages.length;
    }

    public static void printAges(int[] ages) {
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();
    }
}