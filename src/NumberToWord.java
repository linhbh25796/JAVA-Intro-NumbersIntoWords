import java.util.Scanner;


public class NumberToWord {

    public static String checkUnit(int unit) {
        switch (unit) {
            case 0:
                return "";
            case 1:
                return "Một";
            case 2:
                return "Hai";
            case 3:
                return "Ba";
            case 4:
                return "Bốn";
            case 5:
                return "Năm";
            case 6:
                return "Sáu";
            case 7:
                return "Bảy";
            case 8:
                return "Tám";
            case 9:
                return "Chín";

        }
        return "";
    }

    public static String checkDozens(int dozens) {
        switch (dozens) {
            case 1:
                return "Mười";
            case 2:
                return "Hai mươi";
            case 3:
                return "Ba mươi";
            case 4:
                return "Bốn mươi";
            case 5:
                return "Năm mươi";
            case 6:
                return "Sáu mươi";
            case 7:
                return "Bảy mươi ";
            case 8:
                return "Tám mươi";
            case 9:
                return "Chín mươi";

        }
        return "";
    }

    public static String checkTenToNineteen(int number) {
        switch (number) {
            case 10:
                return "Mười";
            case 11:
                return "Mười một";
            case 12:
                return "Mười hai";
            case 13:
                return "Mười ba";
            case 14:
                return "Mười bốn";
            case 15:
                return "Mười lăm";
            case 16:
                return "Mười sáu";
            case 17:
                return "Mười bảy ";
            case 18:
                return "Mười tám";
            case 19:
                return "Mười chín";
        }
        return "";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 1;
        while (number > 0) {
            System.out.println("Nhập số: ");
            number = scanner.nextInt();
            int hundred = Math.floorDiv(number, 100);
            int dozen = Math.floorDiv((number- hundred*100), 10);
            int balance = number % 10;

            if (number < 10) {
                System.out.println(checkUnit(number));
            } else if (number < 20) {
                System.out.println(checkTenToNineteen(number));
            } else if (number < 100) {
                System.out.println(checkDozens(dozen) + " " + checkUnit(balance));
            } else if (number < 1000) {
                if (number % 100 == balance) {
                    System.out.println(checkUnit(hundred) + " trăm " + " linh " + " " + checkUnit(balance));
                }
                else if (number %100 != balance){
                    System.out.println(checkUnit(hundred) + " trăm " + checkDozens(dozen) + " " + checkUnit(balance));
                }
            }

        }

    }
}