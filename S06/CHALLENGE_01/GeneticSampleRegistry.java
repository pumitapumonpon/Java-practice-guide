package S06.CHALLENGE_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class GeneticSampleRegistry {
    public static void main(String[] args) {
        ArrayList<String> samples = new ArrayList<>();

        samples.add("Homo sapiens");
        samples.add("Mus musculus");
        samples.add("Arabidopsis thaliana");
        samples.add("Homo sapiens");

        HashSet<String> uniqueSpecies = new HashSet<>(samples);

        HashMap<String, String> sampleToResearcher = new HashMap<>();
        sampleToResearcher.put("M-001", "Dra. López");
        sampleToResearcher.put("M-002", "Dra. Hernández");
        sampleToResearcher.put("M-003", "Mtra. Ortega");
        sampleToResearcher.put("M-004", "Dra. López");

        System.out.println("📥 Full and ordered list of received species:");
        for (String species : samples) {
            System.out.println("- " + species);
        }

        System.out.println("\n🧬 Unique species processed:");
        for (String species : uniqueSpecies) {
            System.out.println("- " + species);
        }

        System.out.println("\n🧑‍🔬 Sample ID → Researcher association:");
        for (Map.Entry<String, String> entry : sampleToResearcher.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n🔍 Enter a sample ID to search for (e.g., M-002): ");
        String searchId = scanner.nextLine();

        if (sampleToResearcher.containsKey(searchId)) {
            System.out.println("The researcher responsible for sample " + searchId + " is: " +
                sampleToResearcher.get(searchId));
        } else {
            System.out.println("⚠️ Sample with ID " + searchId + " was not found.");
        }

        scanner.close();

    }
}
