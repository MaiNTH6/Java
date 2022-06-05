package lab_06;

//        String myStr = "100 minutes";
//        NOT using REGEX, extract digit character from that String
//        Expected output: "100".
//        EX: "12345nabc678" -> "12345678"

public class Lab06_3 {

    public static void main(String[] args) {
        boolean result = true;
        String myStr = "100 minutes";
        for (int i = 0; i < myStr.length(); i++) {
            if (myStr.charAt(i) != ' ') {

                System.out.println(myStr.charAt(i) + "' is a digit?:" + Character.isDigit(myStr.charAt(i)));
//
            }
        }
    }
}







