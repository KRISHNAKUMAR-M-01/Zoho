package String;

public class RemoveDulicate {
    public static void main(String[] args) {
        String str = "Programming";
        System.out.println("After removing the dulicate:" + Duplicate(str));
        System.out.println("After removing the dulicate:" + removeDuplicate(str));


    }

    public static String Duplicate(String str) {
        String string = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                string += str.charAt(i);
            }
        }
        return string;
    }

    public static String removeDuplicate(String str) {
        String string = "";
        for (int i = 0; i < str.length(); i++) {
            if (string.indexOf(str.charAt(i)) == -1) {
                string += str.charAt(i);
            }
        }
        return string;
    }
}
