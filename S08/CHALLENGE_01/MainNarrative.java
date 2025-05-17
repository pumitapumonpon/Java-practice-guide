package S08.CHALLENGE_01;


import S08.CHALLENGE_01.classes.*;
import S08.CHALLENGE_01.interfaces.*;

public class MainNarrative {
    private final StoryTransition transition;
    private final DialogueManager dialogue;
    private final DecisionLogic decisionLogic;

    public MainNarrative(StoryTransition transition, DialogueManager dialogue, DecisionLogic decisionLogic) {
        this.transition = transition;
        this.dialogue = dialogue;
        this.decisionLogic = decisionLogic;
    }

    public void runScene(){
        dialogue.showDialogue("Batman", "I hear something evil coming...");
        String decision = decisionLogic.evaluateDicision();
        transition.nextScene(decision);
        dialogue.showDialogue("Superman", "Who are you?");
    }

    public static void main(String[] args) {
        StoryTransition transition = new SimpleTransition();
        DialogueManager dialogue = new TextDialogue();
        DecisionLogic decision = new BinaryDecision();

        MainNarrative narrative = new MainNarrative(transition, dialogue, decision);
        narrative.runScene();
    }
}
