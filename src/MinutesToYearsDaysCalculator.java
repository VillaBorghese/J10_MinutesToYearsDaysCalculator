public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long totalDays = minutes / (24 * 60);
            long years = totalDays / 365;
            long days = totalDays % 365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
}
