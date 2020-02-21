public class SimpleArray {
    public static void main(String[] args) {

        String[] animals = new String[]{"dog", "cat", "turtle", "monkey","fish"};
        String monkey = animals[3];
        System.out.println(monkey);

        int numberOfElements = animals.length;
        System.out.println("Moja tablica ma długość " + numberOfElements + " elementów.");
    }
}
