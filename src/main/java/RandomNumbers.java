import java.util.Random;

public class RandomNumbers {
    public static Random random = new Random();
    public static int maxNumber = random.nextInt(40) + 1;
    public static int minNumber = random.nextInt(40) + 1;

    private static int randomNumbers() {
        int sum = 0;

        while(sum < 5000){
            int randomNumber = random.nextInt(31);
            sum = sum + randomNumber;
            System.out.println("wylosowana liczba " + randomNumber);
            maxNumber = maxValue(randomNumber);
            minNumber = minValue(randomNumber);
        }
        return sum;
    }

    private static int maxValue(int randomNumber) {
        if (maxNumber < randomNumber) {
            maxNumber = randomNumber;
        }
        System.out.println("maksymalna wartosc " + maxNumber);
        return maxNumber;
    }

    private static int minValue(int randomNumber) {

        if (randomNumber < minNumber) {
            minNumber = randomNumber;
        }
        System.out.println("minimalna wartosc " + minNumber);
        return minNumber;
    }

    public static void main(String[] args) {
        randomNumbers();
    }
}