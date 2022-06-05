package lab_06;
//        String url = "https://google.com";
//        Check http OR https; domain name, .com OR .net

import sun.font.TrueTypeFont;

public class Lab06_4 {
    public static void main(String[] args) {

        String url = "https://google.com";

        // Check chuoi co chua https hay khong?

        if(url.indexOf("https")!=-1) {
            System.out.println("Chuoi co chua 'https'");
        }else {
            System.out.println("Chuoi khong chua 'https'");
        }
        // Check chuoi co chua .com hay khong?

        boolean checkDomain = true;
        if(url.contains(".com")){
            System.out.println("Chuoi co chua '.com'");
        }
        else {
            System.out.println("Chuoi khong chua '.com'");
        }

    }
}
