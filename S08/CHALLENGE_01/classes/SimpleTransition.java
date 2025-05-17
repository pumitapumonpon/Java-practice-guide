package S08.CHALLENGE_01.classes;

import S08.CHALLENGE_01.interfaces.StoryTransition;

public class SimpleTransition implements StoryTransition {

    @Override
    public void nextScene(String decision) {
        switch (decision.toLowerCase()) {
            case "a":
                System.out.println("🌅 Scene: The hero walks down the sunlit path.");
                break;
            case "b":
                System.out.println("🌌 Scene: The hero ventures into the dark forest.");
                break;
            default:
                System.out.println("❓ Unknown path. The hero's fate is uncertain.");
        }
    }


}
