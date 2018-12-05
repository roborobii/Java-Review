public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);

        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(-1024);

        System.out.println(bark(true, 23));

        System.out.println(isLeapYear(0));

        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
    }
    public static void checkNumber(int number) {
        if (number > 0) System.out.println("positive");
        else if (number < 0) System.out.println("negative");
        else System.out.println("zero");
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) System.out.println("Invalid Value");
        else System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " +  (kiloBytes % 1024) + " KB");
    }
    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) return false;
        if (barking && (hourOfDay > 22 || hourOfDay >= 0 && hourOfDay < 8)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
        return false;
    }
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        return ((int) (a*1000) == (int) (b*1000));
    }
}