package S07.CHALLENGE_01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SimulationRecord {
    public static void main(String[] args) {
        //Path
        Path path = Paths.get("config");
        Path file = path.resolve("parameters.txt");

        //Content
        String simulationData = """
                Cycle Time: 55.8 seconds
                Line Speed: 1.2 m/s
                Number of Stations: 8
                """;

        try {
            //Save
            if (!Files.exists(path)) {
                Files.createDirectory(path);
                System.out.println("📁 Created 'config/' directory.");
            }

            Files.write(file, simulationData.getBytes());
            System.out.println("✅ Parameters saved to: " + file);

            //Read
            if (Files.exists(file)) {
                String content = Files.readString(file);
                System.out.println("\n📄 File content:\n" + content);
            } else System.out.println("⚠️ File not found: " + file);

        } catch (IOException e) {
            System.err.println("❌ Error working with the file: " + e.getMessage());
        }
    }
}
