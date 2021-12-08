package day03;

public class Cesar extends Encryption {

    private int offset;

    public Cesar(int offset) {
        this.offset = offset;
    }

    public String encrypts(String input) {
        StringBuilder sb = new StringBuilder(input.toUpperCase());
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, changeLetter(sb.charAt(i)));
        }
        return sb.toString();
    }

    private char changeLetter(char c) {
        if (Character.isAlphabetic(c)) {
            return (char) ('A' + (c - 'A' + offset) % ('Z' - 'A'));
        }
        return c;
    }
}
