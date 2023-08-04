package utility;

public class StringMethod {
    private String input;

    // Getter and Setter for input
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    // Method to convert the String to lowercase
    public String convertToLowercase() {
        return input.toLowerCase();
    }

    // Method to convert the String to uppercase
    public String convertToUppercase() {
        return input.toUpperCase();
    }

    // Method to find the first character in the string
    public String findFirstCharacter() {
        if (input.isEmpty()) {
            return "Input string is empty";
        }
        return String.valueOf(input.charAt(0));
    }

    // Method to return string length
    public String getLength() {
        return String.valueOf(input.length());
    }

    // Method to trim the input string
    public String trimInputString() {
        return input.trim();
    }
}

