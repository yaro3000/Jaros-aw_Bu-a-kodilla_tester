public class LeapYear {
    public static boolean yearCheck(int year) {
        return ((year%4 == 0) && (year%100 !=0) || (year%400 == 0));
    }
    public void yearViev() {
        int year;
        year = 2016;
        if(yearCheck(year)) {
            System.out.println(year + " jest rokiem przestępnym.");
        } else {
            System.out.println("Podany rok nie jest rokiem przestępnym.");
        }
    }
}