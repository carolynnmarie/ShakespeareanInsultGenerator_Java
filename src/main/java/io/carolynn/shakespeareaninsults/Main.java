package io.carolynn.shakespeareaninsults;

public class Main {
    public static void main(String[] args){
        RandomInsultGenerator generator = new RandomInsultGenerator();
        String input = generator.pickRandomOrClassic();
        System.out.println(input);
    }
}
