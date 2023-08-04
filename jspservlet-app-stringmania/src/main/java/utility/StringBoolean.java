package utility;

public class StringBoolean {
     private String input1;
     private String input2;
     public String getInput1() {
        return input1;
    }
    public void setInput1(String input1) {
        this.input1 = input1;    }
        public String getInput2() {        return input2;    }
        public void setInput2(String input2) {        this.input2 = input2;    }
        public boolean contains(String input1 , String input2) {        return input1.contains(input2);    }
        public boolean startsWith(String ip1, String ip2) {        return ip1.startsWith(String.valueOf(ip2));    }
        public boolean endsWith(String i1,String i2) {        return i1.endsWith(String.valueOf(i2));    }
        public boolean equals(String ip1,String ip2) {        return ip1.equals(ip2);    }
        public boolean equalsIgnoreCase(String input1,String input2) {        return input1.equalsIgnoreCase(input2);    }}