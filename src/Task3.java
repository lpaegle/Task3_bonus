import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        short day;
        short month;
        short year;
        short dateFormat;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a day of choice: ");
        day = scanner.nextShort();
        System.out.println("Please enter a month of choice: ");
        month = scanner.nextShort();
        System.out.println("Please enter a year of choice: ");
        year = scanner.nextShort();

        System.out.println("Please select the date formatting. 1 - YYYY/MM/DD, 2 - YYYY.MM.DD: ");
        dateFormat = scanner.nextShort();

        if (dateFormat == 1){
            System.out.println("Date is " + year + "/" + month + "/" + day);
        }else if (dateFormat == 2){
            System.out.println("Date is " + year + "." + month + "." + day);
        }else{
            System.out.println("Unidentified value!");
        }

    }

}
