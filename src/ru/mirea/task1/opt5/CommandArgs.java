package ru.mirea.task1.opt5;

public class CommandArgs {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент №" + i + ": args[" + i + "]=" + args[i]);
        }
    }
}
