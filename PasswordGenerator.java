import java.security.SecureRandom;

public class PasswordGenerator {

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";

    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();

        // Use at least one character from each category
        password.append(getRandomChar(UPPER, random));
        password.append(getRandomChar(LOWER, random));
        password.append(getRandomChar(DIGITS, random));
        password.append(getRandomChar(SPECIAL, random));

        // Generate the remaining characters
        for (int i = 4; i < length; i++) {
            String category = getRandomCategory(random);
            password.append(getRandomChar(category, random));
        }

        // Shuffle the password to make it more random
        return shuffleString(password.toString(), random);
    }

    private static char getRandomChar(String characters, SecureRandom random) {
        int index = random.nextInt(characters.length());
        return characters.charAt(index);
    }

    private static String getRandomCategory(SecureRandom random) {
        int category = random.nextInt(3);
        switch (category) {
            case 0:
                return UPPER;
            case 1:
                return LOWER;
            case 2:
                return DIGITS;
            default:
                return SPECIAL;
        }
    }

    private static String shuffleString(String input, SecureRandom random) {
        char[] characters = input.toCharArray();
        for (int i = characters.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = characters[index];
            characters[index] = characters[i];
            characters[i] = temp;
        }
        return new String(characters);
    }

    public static void main(String[] args) {
        int passwordLength = 8;
        String generatedPassword = generatePassword(passwordLength);
        System.out.println("Generated Password: " + generatedPassword);
    }
}
