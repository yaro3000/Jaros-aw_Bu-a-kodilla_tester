public class FirstClass {
    public static void main(String[] args)  {
        Notebook notebook = new Notebook(600, 1000, 2015);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        Notebook oldNotebook = new Notebook(1200, 500, 2015);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        Notebook funnyNotebook = new Notebook(1000,1300,2017);
        System.out.println(funnyNotebook.weight + " " + funnyNotebook.price + " " + funnyNotebook.year);
        funnyNotebook.checkPrice();
        funnyNotebook.checkWeight();
        funnyNotebook.checkYear();
        Notebook modernNotebook = new Notebook(1800,1600,2019);
        System.out.println(modernNotebook.weight + " " + modernNotebook.price + " " + modernNotebook.year);
        modernNotebook.checkPrice();
        modernNotebook.checkWeight();
        modernNotebook.checkYear();
        Notebook oldSchoolNotebook = new Notebook(500,800,2010);
        System.out.println(oldSchoolNotebook.weight + " " + oldSchoolNotebook.price + " " + oldSchoolNotebook.year);
        oldSchoolNotebook.checkPrice();
        oldSchoolNotebook.checkWeight();
        oldSchoolNotebook.checkYear();
        LeapYear leapYear = new LeapYear();
        leapYear.yearViev();
    }
}
