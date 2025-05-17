package S06.CHALLENGE_02;

import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

class Topic implements Comparable<Topic> {
    private String title;
    private int priority;

    public Topic(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPriority() {
        return this.priority;
    }

    @Override
    public int compareTo(Topic other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    @Override
    public String toString() {
        return title + " (Priority: " + priority + ")";
    }
}

public class EducationalPlanning {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Topic> activeTopics = new CopyOnWriteArrayList<>();

        // Adding topics
        activeTopics.add(new Topic("Reading Comprehension", 2));
        activeTopics.add(new Topic("Basic Math", 1));
        activeTopics.add(new Topic("Environmental Care", 3));

        // Sort by title 
        Collections.sort(activeTopics);
        System.out.println("📚 Topics sorted alphabetically:");
        for (Topic topic : activeTopics) {
            System.out.println("- " + topic);
        }

        // Sort by priority using Comparator
        activeTopics.sort(Comparator.comparingInt(Topic::getPriority));
        System.out.println("\n🔥 Topics sorted by priority (1 = urgent → 3 = optional):");
        for (Topic topic : activeTopics) {
            System.out.println("- " + topic);
        }

        // Concurrent resource repository per topic
        ConcurrentHashMap<String, String> sharedResources = new ConcurrentHashMap<>();
        sharedResources.put("Reading Comprehension", "https://resources.edu/reading");
        sharedResources.put("Basic Math", "https://resources.edu/math");
        sharedResources.put("Environmental Care", "https://resources.edu/environment");

        // Show all shared resources
        System.out.println("\n🔗 Shared Resources Repository:");
        for (String topicTitle : sharedResources.keySet()) {
            System.out.println("- " + topicTitle + " → " + sharedResources.get(topicTitle));
        }
    }
}
