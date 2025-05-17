package S08.CHALLENGE_01.classes;

import java.util.Scanner;

import S08.CHALLENGE_01.interfaces.DecisionLogic;

public class BinaryDecision implements DecisionLogic{
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String evaluateDicision() {
        System.out.println("What path will the hero choose?");
        System.out.println("A: Sunlit path");
        System.out.println("B: Dark forest");
        System.out.print("👉 Your choice (A/B): ");
        return scanner.nextLine().trim();

    }

}
