package io.carolynn.shakespeareaninsults;

import java.util.Scanner;

public class RandomInsultGenerator {

    private Insults insults;

    public RandomInsultGenerator(){
        this.insults = new Insults();
    }

    public String createRandomInsult(){
        int one = (int)Math.round(Math.random()*(insults.getPartOne().size()-1));
        int two = (int)Math.round(Math.random()*(insults.getPartTwo().size()-1));
        int three = (int)Math.round(Math.random()*(insults.getPartThree().size()-1));
        return "Thou " + insults.getPartOne().get(one) + " " + insults.getPartTwo().get(two) + " " + insults.getPartThree().get(three);
    }

    public String getRandomClassicInsult(){
        int random = (int)Math.round(Math.random()*(insults.getClassics().size()-1));
        return insults.getClassics().get(random);
    }

    public String pickRandomOrClassic(){
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        String quote = "";
        System.out.println("Would you like a classic Shakespearean insult or would you like to create your own random Shakespearean insult?  " +
                "Type classic for a classic insult or type random for a random insult");
        answer = scanner.nextLine().toLowerCase();
        if (answer.equals("classic")) {
            quote = getRandomClassicInsult();
        } else if (answer.equals("random")) {
            quote = createRandomInsult();
        } else {
            System.out.println("invalid input.");
        }
        return quote;
    }
}
