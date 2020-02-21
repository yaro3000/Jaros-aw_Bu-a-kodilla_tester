public class Loops {

    static int[] array = new int[]{33, 23, 12, 22, 56, 34};

    private static int sumNumbers(int[] numbers) {
        int add = 0;
        for (int i = 0; i < numbers.length; i++) {
            add = add + numbers[i];
        }
        return add;
    }

    public static void main(String[] args) {

        String[] names = new String[]{"Zygfyrd", "Gwidon", "Frolentyna"};
        int numberOfELements = names.length;
        for (int i = 0; i < numberOfELements; i++) {
            System.out.println(names[i]);
        }
        System.out.println(sumNumbers(array));

        int n = 0;
        while(n <= 10) {
            System.out.println(n);
            n++;
        }
    }
}
