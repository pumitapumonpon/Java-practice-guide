package S07.CHALLENGE_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LogAnalyzer {
    public static void main(String[] args) {
        Path path = Paths.get("errors.log");
        Path errorFile = Paths.get("error_log_summary.txt");
        int totalLines = 0;
        int errorCount = 0;
        int warningCount = 0;

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;

            while ((line = reader.readLine()) != null) {
                totalLines++;

                if (line.contains("ERROR")) {
                    errorCount++;
                }

                if (line.contains("WARNING")) {
                    warningCount++;
                }
            }

            System.out.println("📋 Log Summary Report:");
            System.out.println("Total lines read: " + totalLines);
            System.out.println("Number of ERRORs: " + errorCount);
            System.out.println("Number of WARNINGs: " + warningCount);

            int affectedLines = errorCount + warningCount;
            double percentage = totalLines > 0 ? (affectedLines * 100.0) / totalLines : 0;
            System.out.printf("⚠️ Percentage of lines with ERROR or WARNING: %.2f%%\n", percentage);
        } catch (IOException e) {
            System.out.println("❌ Error al procesar el archivo: " + e.getMessage());

            try {
                Files.writeString(errorFile, "Failed to process log: " + e.getMessage());
                System.out.println("💾 Error message written to: " + errorFile);
            } catch (IOException writeError) {
                System.err.println("❌ Failed to write error log: " + writeError.getMessage());
            }
        }


    }
}
