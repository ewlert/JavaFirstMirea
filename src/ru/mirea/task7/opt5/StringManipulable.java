package ru.mirea.task7.opt5;

public interface StringManipulable {
    int countCharacters(String s);
    String oddCharacters(String s);
    String reverseString(String s);
}

class StringFunc implements StringManipulable {
    public int countCharacters(String s) {
        return s.length();
    }
    public String oddCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}

class Main {
    public static void main(String[] args) {
        StringFunc stringFunc = new StringFunc();
        System.out.println(stringFunc.countCharacters("dsrgdf"));
        System.out.println(stringFunc.oddCharacters("dfghrtr"));
        System.out.println(stringFunc.reverseString("qwretwr"));
    }
}
