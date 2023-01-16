
package sentencegenerator;


public class Game {

public String generator() {    
    
String [] firstWord = {"Jó","Jobb","Legjobb","Kíváló","Megbízható","Tökéletes","Leges legjobb","Pazar","Pompás"};

String [] secondWord = {"megoldás","eredmény","kivételezés","lehetőség","választás","döntés","cél"};

String [] thirdWord = {"neked!","nekik","mindenkinek","a városnak","az országnak","a megyének","a régiónak","a kontinensnek","a világnak","a világ egyetemnek"};



    int oneLength = firstWord.length;
    int secondLength = secondWord.length;
    int thirdLength = thirdWord.length;
    
    int random1 = (int) (Math.random() * oneLength);
    int random2 = (int) (Math.random() * secondLength); 
    int random3 = (int) (Math.random() * thirdLength);
    
    String sentence = firstWord[random1] + " " + secondWord [random2] + " " + thirdWord[random3];
    
    return sentence;
}    


    

    
}
