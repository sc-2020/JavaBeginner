package com.company;

public class StringPracticeSet {
    public static void main(String[] args) {

//        Question 1
        String name = "Sakshi Chaudhari";
        name = name.toLowerCase();
        System.out.println(name);

//        Question 2
        String text = "to lower case";
        text = text.replace(" ", "_");
        System.out.println(text);

//        Question 3
        String letter = "Dear <|name|>, Thanks a lot.";
        System.out.println(letter);
        letter = letter.replace("<|name|>", name);
        System.out.println(letter);

//        Question 4
        String myString = "This  string   contains double and triple   spaces.";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

//        Question 5
        String letter2 = "Dear Harry,\n \tThis Java Course is nice.\n\tThanks.";
        System.out.println(letter2);
    }
}
