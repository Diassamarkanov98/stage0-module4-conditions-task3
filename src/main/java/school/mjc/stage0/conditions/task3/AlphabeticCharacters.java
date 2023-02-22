package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if(String. valueOf(character).matches("[a-zA-Z]+")){
            if(character == 'a' || character == 'e' || character == 'o' || character == 'i' || character == 'u'){
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }



    }
}
