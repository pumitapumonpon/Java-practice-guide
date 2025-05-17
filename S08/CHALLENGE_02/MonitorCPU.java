package S08.CHALLENGE_02;

import java.util.HashSet;
import java.util.Scanner;

public class MonitorCPU {
    public static void main(String[] args) {
        HashSet<Integer> cpuRecords = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("🖥️ CPU Usage Monitor");
            System.out.println("Enter CPU usage for servers (0-100). Type 'done' to finish.");

            while (true) {
                System.out.print("CPU Usage (%): ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("done")) {
                    break;
                }

                try {
                    int usage = Integer.parseInt(input);

                    // Validate range
                    if (usage < 0 || usage > 100) {
                        System.out.println("⚠️ Invalid range. Please enter a value between 0 and 100.");
                        continue;
                    }

                    // Check for duplicates
                    if (!cpuRecords.add(usage)) {
                        System.out.println("🔁 Duplicate value ignored: " + usage + "%");
                        continue;
                    }

                    // Check for critical threshold
                    if (usage > 95) {
                        throw new CriticalConsumptionException("🚨 Critical CPU usage detected: " + usage + "%");
                    }

                    System.out.println("✅ Recorded: " + usage + "%");

                } catch (NumberFormatException e) {
                    System.out.println("❌ Invalid input. Please enter a numeric value.");
                } catch (CriticalConsumptionException e) {
                    System.out.println(e.getMessage());
                }
            }

        } finally {
            System.out.println("🔚 Monitoring session ended.");
            scanner.close();
        }
    }
}
