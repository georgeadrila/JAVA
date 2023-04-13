package Vectors;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector obj = new Vector();
        int length = args.length;
        for (int i = 0; i < length; i++) {
            obj.addElement(args[i]);
        }

        int size = obj.size();
        String array[] = new String[size];
        obj.copyInto(array);
        System.out.println("The elements of the vector are: ");
        for (int i = 0; i < size; i++) {
            array[i] = (String) obj.elementAt(i);
            System.out.println(array[i]);
        }
    }
}
