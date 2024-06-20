package se.lexicon;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int size = NameRepository1.getSize();
        System.out.println("Size of array is: " + size);
        NameRepository1.setNames(new String[]{"Erik Svensson", "Mehrdad Javan"});
        System.out.println(NameRepository1.getSize());
        String name = NameRepository1.find("Jaffar byn");
        System.out.println(name);
        boolean success = NameRepository1.add("Kalles Kaviar");
        NameRepository1.print();
        String[] findFirstName = NameRepository1.findByFirstName("Kalles");
        System.out.println(Arrays.toString(findFirstName));
        String[] findLastName = NameRepository1.findByLastName("Javan");
        System.out.println(Arrays.toString(findLastName));
        boolean success1 = NameRepository1.update("Kalles Kaviar", "Casper Nilsson");
        System.out.println(success1);
        NameRepository1.print();
        boolean success2 = NameRepository1.remove("Casper Nilsson");
        System.out.println(success2);
        NameRepository1.print();
    }
}
