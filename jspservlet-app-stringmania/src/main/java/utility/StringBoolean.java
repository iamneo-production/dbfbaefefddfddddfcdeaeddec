package utility;

public class StringBoolean {
    private String input1;
    private String input2;

    // Getter and Setter for input1
    public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) {
        this.input1 = input1;
    }

    // Getter and Setter for input2
    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }

    // Method to check if the string1 contains string2
    public boolean containsString() {
        return input1.contains(input2);
    }

    // Method to check if the string starts with the given letter
    public boolean startsWithLetter() {
        if (input1.isEmpty() || input2.isEmpty()) {
            return false;
        }
        char startChar = input2.charAt(0);
        return input1.charAt(0) == startChar;
    }

    // Method to check if the string end with the given letter
    public boolean endsWithLetter() {
        if (input1.isEmpty() || input2.isEmpty()) {
            return false;
        }
        char endChar = input2.charAt(0);
        return input1.charAt(input1.length() - 1) == endChar;
    }

    // Method to check if two strings are equal
    public boolean areEqual() {
        return input1.equals(input2);
    }

    // Method to check if two strings are equal by ignoring the case
    public boolean areEqualIgnoreCase() {
        return input1.equalsIgnoreCase(input2);
    }
}

