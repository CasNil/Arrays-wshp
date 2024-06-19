package se.lexicon;

import java.util.Arrays;

public class NameRepository1 {

    private static String[] names;

    public static int getSize() {

        return names == null ? 0 : names.length;
    }

    public static void setNames(String[] newNames) {

        names = newNames;
    }

    public static void clear() {
        names = null;
    }

    public static String[] findAll() {
        return names.clone();
    }

    public static String find(final String fullName) {
        for (String name : names) {
            if (name != null && name.equals(fullName)) {
                return name;
            }
        }
        return null;
    }

    public static boolean add(final String fullName) {
        String nameInList = find(fullName);
        if (nameInList != null) {
            return false;
        }
        String[] newNames = Arrays.copyOf(names, names.length + 1);
        newNames[names.length] = fullName;
        setNames(newNames);
        return true;
    }

    public static void print() {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static String[] findByFirstName(final String firstName) {
        int matchCount = 0;
        int index = 0;

        for (String name : names) {
            String[] fullName = name.split(" ");
            String firstName1 = fullName[0];
            if (firstName1.equals(firstName)) {
                matchCount++;
            }
        }
        String[] matches = new String[matchCount];
        for (String name : names) {
            String[] fullName = name.split(" ");
            String firstName1 = fullName[0];
            if (firstName1.equals(firstName)) {
                matches[index++] = name;
            }
        }
        return matches;
    }

    public static String[] findByLastName(final String lastName) {
        int matchCount = 0;
        int index = 0;

        for (String name : names) {
            String[] fullName = name.split(" ");
            String lastName1 = fullName[1];
            if (lastName1.equals(lastName)) {
                matchCount++;
            }
        }
        String[] matches = new String[matchCount];
        for (String name : names) {
            String[] fullName = name.split(" ");
            String lastName1 = fullName[1];
            if (lastName1.equals(lastName)) {
                matches[index++] = name;
            }
        }
        return matches;
    }

    public static boolean update(final String original, final String updatedName) {
        if (find(original) == null || find(updatedName) != null) {
            return false;
        }

        String[] newNamesLength = new String[getSize()];
        int index = 0;
        for (String name : names) {
            if (!name.equals(original)) {
                newNamesLength[index++] = name;
            }
        }
        newNamesLength[getSize() - 1] = updatedName;
        setNames(newNamesLength);
        return true;
    }

    public static boolean remove(final String fullName) {
        if (find(fullName) == null) {
            return false;
        }
        String[] newNamesLength = new String[getSize() - 1];
        int index = 0;
        for (String name : names) {
            if (!name.equals(fullName)) {
                newNamesLength[index++] = name;
            }
        }
        setNames(newNamesLength);
        return true;
    }
}
