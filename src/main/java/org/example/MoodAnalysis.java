package org.example;

public class MoodAnalysis {
    public String msg;

    public MoodAnalysis(String msg) {
        this.msg = msg;
    }

    public String mood() {
        try {
            if(msg.contains("Sad")) {
                return "SAD";
            }else {
                return "HAPPY";
            }
        }catch(NullPointerException ex) {
            System.out.println("Enter valid mood ");
            return "HAPPY";
        }
    }
}
