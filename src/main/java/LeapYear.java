public class LeapYear {

    public static boolean yearcheck(int year) {
       return ((year%4 == 0) && (year%100 != 0) || (year%400 == 0));
    }
    public static void yearView() {
        int year;
        year = 1410;
        if(yearcheck(year)) {
            System.out.println("Rok " + year + " jest przestępny.");
        }   else {
            System.out.println("Podany rok nie jest przestępny.");
        }
    }
}
