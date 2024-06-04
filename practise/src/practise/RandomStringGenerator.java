package practise;
import java.util.Random;

public class RandomStringGenerator {
    
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final int STRING_LENGTH = 5;

    public static String[] generateRandomStrings(int count) {
        String[] randomStrings = new String[count];
        Random random = new Random();
        
        for (int i = 0; i < count; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < STRING_LENGTH; j++) {
                int randomIndex = random.nextInt(CHARACTERS.length());
                sb.append(CHARACTERS.charAt(randomIndex));
            }
            randomStrings[i] = sb.toString();
        }
        
        return randomStrings;
    }

    public static void main(String[] args) {
        String[] randomStringsArray = generateRandomStrings(10);
        for (String randomString : randomStringsArray) {
            System.out.println(randomString);
        }
    }
}