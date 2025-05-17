package S08.CHALLENGE_01.classes;

import S08.CHALLENGE_01.interfaces.DialogueManager;

public class TextDialogue implements DialogueManager{

    @Override
    public void showDialogue(String character, String dialogue) {
        System.out.println(character + ": -" + dialogue);
    }

}
