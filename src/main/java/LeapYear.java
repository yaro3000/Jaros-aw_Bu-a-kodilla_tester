public class LeapYear {
    public static boolean yearCheck(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    public void yearView(int year) {
        if (yearCheck(year)) {
            System.out.println(year + " jest rokiem przestępnym.");
        } else {
            System.out.println("Podany rok " + year + " nie jest rokiem przestępnym.");
        }
    }
}