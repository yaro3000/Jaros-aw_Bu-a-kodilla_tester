import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FirstClass {
    public static void main(String[] args) {
        Random random = new Random();
        Notebook notebook = new Notebook(600, 1000, 2015);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        Notebook oldNotebook = new Notebook(1200, 500, 2015);
        Notebook funnyNotebook = new Notebook(1000, 1300, 2017);
        Notebook modernNotebook = new Notebook(1800, 1600, 2019);
        Notebook oldSchoolNotebook = new Notebook(500, 800, 2010);

        List<Notebook> notebookList = new ArrayList<>();
        notebookList.add(notebook);
        notebookList.add(heavyNotebook);
        notebookList.add(oldNotebook);
        notebookList.add(funnyNotebook);
        notebookList.add(modernNotebook);
        notebookList.add(oldSchoolNotebook);

        for (int i = 0; i < 100; i++) {
            notebookList.add(new Notebook(random.nextInt(1000), random.nextInt(1200), random.nextInt(2000)));
        }
        for (Notebook computer : notebookList) {
            checkAllParameters(computer);
        }

        LeapYear leapYear = new LeapYear();
        leapYear.yearView(random.nextInt(2020));
    }

    private static void checkAllParameters(Notebook computer) {
        System.out.println(computer.weight + " " + computer.price + " " + computer.year);
        computer.checkPrice();
        computer.checkWeight();
        computer.checkYear();
    }
}

