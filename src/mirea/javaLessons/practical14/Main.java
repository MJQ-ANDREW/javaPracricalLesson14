package mirea.javaLessons.practical14;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println(Ex2("abcdefghijklmnopqrstuv18340"));
        //System.out.println(Ex2("abcdefghijklmnoasdfasdpqrstuv18340"));
        //Ex3("Цены 30.06 USD 50.30 RUS 60.12 EU 11,23");
        System.out.println(Ex7("F032_Password"));
        System.out.println(Ex7("TrySpy1"));
        System.out.println(Ex7("smart_pass"));
        System.out.println(Ex7("A007"));
        //System.out.println(Ex6("user@example.com"));
        //System.out.println(Ex6("user@@@example.com"));
        //System.out.println(Ex6("user@example..com"));
    }

    public static boolean Ex2(String str){
        Pattern p = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static void Ex3(String str){
        Pattern p = Pattern.compile("([\\d]+\\.[\\d]{2} (USD|RUS|EU))");
        Matcher m = p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }
    }

    public static boolean Ex7(String str){
        Pattern p = Pattern.compile("(?=.+[A-Z])(?=.+[a-z])(?=.+[0-1])([\\w]{8,})");
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static boolean Ex6(String str){
        Pattern p = Pattern.compile("(\\w+)@(\\w+)(\\.)(ru|com)");
        Matcher m = p.matcher(str);
        return m.matches();
    }
}
