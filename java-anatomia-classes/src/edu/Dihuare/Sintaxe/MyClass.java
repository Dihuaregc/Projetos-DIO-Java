package edu.Dihuare.Sintaxe;

public class MyClass {
    
    public static void main(String[] args) {
        
        String firstName = "Dihuare";
        String secondName = "Gadelha";
        String fullName = completeName(firstName, secondName);
        System.out.println(fullName);
    }
    public static String completeName (String firstName, String secondName) {
        return firstName + " " + secondName;
    
}
}