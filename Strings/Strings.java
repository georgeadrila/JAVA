package Strings;

public class Strings {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // String name;
        String name = new String("George");
        
        String name2 = new String("Adrian");

        if (name.equals(name2)) {
            System.out.println("The names are the same");
        } else {
            System.out.println("The names are different");
        }
    }
}
