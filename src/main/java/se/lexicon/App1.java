package se.lexicon;

public class App1 {
    public static void main(String[] args) {

        int size = NameRepository1.getSize();
        System.out.println(size);
        NameRepository1.setNames(new String[]{"Karl Andersson", "Casper Nilsson"});
        System.out.println(NameRepository1.getSize());
    }
}
