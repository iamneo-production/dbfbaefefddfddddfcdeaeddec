package utility;

public class StringAdvanceMethod {
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

    // Method to concatenate two strings
    public String concatenateStrings() {
        return input1 + input2;
    }

    // Method to split two strings
    public String[] splitStrings() {
        return input1.split(input2);
    }

    // Method to find the first character in the string
    public String findFirstCharacter() {
        if (input1.isEmpty()) {
            return "Input string is empty";
        }
        return String.valueOf(input1.charAt(0));
    }

    // Method to find the index of the string
    public String findIndexOfString() {
        int index = input1.indexOf(input2);
        if (index != -1) {
            return String.valueOf(index);
        }
        return "String not found";
    }

    // Method to trim the input string
    public String trimInputString() {
        return input1.trim();
    }
}

