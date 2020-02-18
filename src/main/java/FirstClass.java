public class FirstClass {
    public static void main(String[] args)  {

        Notebook notebook = new Notebook(600, 1000, 2015);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        Notebook oldNotebook = new Notebook(1200, 500, 2015);
        Notebook funnyNotebook = new Notebook(1000,1300,2017);
        Notebook modernNotebook = new Notebook(1800,1600,2019);
        Notebook oldSchoolNotebook = new Notebook(500,800,2010);

        checkAllTest(notebook);
        checkAllTest(heavyNotebook);
        checkAllTest(oldNotebook);
        checkAllTest(funnyNotebook);
        checkAllTest(modernNotebook);
        checkAllTest(oldSchoolNotebook);

        LeapYear.yearViev();
    }

    private static void checkAllTest(Notebook notebook) {
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
    }
}
