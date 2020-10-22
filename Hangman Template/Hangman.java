// Things we need for the hangman game
// 1. A way to get guesses from the user - we've done user input
// 2. A list of words from which to select the word to be guessed - we've done arrays
// 3. A way to know which letters of the word have been guessed - explained here
// 4. A way to randomly select a word from the list - explained here
// 5. Various loops to support the game play - we've done loops

import java.util.Random;

public class Hangman
{
    Random r;
    GetData get;
    String[] words = {"marsh", "swamp","mountain","peninsula","beach"};
    String word; // to hold the chosen word
    boolean finished = false;
    int badGuessCount=0;  // int variable for tracking number of guesses
    boolean [] foundLetters;  // boolean array to mark which letters have been found
    String entryWord =" ";  // String variable for user's guesses
    
    public Hangman()
    {
      r = new Random();
      get = new GetData();
      playAGame();
    }
    
    public void playAGame()
    { 
        // choose a word from the list of words
        word = words[r.nextInt(words.length)];
        // create a boolean array the size of the word
        foundLetters = new boolean[word.length()];
        
        while (!finished)
        {
            showGallows(); // print the gallows and person
            showWord();
            getGuess();
            checkGuess();
             if (badGuessCount==6)
             {
                 System.out.print('\u000C');
                 showGallows();
                 System.out.println("Sorry, but you lost.");
                 System.out.println("The word was: "+word);
                 finished=true;
             }
        }
    }

    public void showGallows()
    {
        System.out.print('\u000C');
        if (badGuessCount==0)
           man_0();
           
        // you need to add more if statements here!
        
        System.out.println("\n");
    }
 
    public boolean showWord()
    {
         boolean goodGuess = false;
         char ch = entryWord.charAt(0);
         for (int lc=0; lc < word.length(); lc++)
             if (foundLetters[lc]==true)
             {
               System.out.print(word.charAt(lc)+" ");
             }
             else if (word.charAt(lc)==ch)
                  {
                      System.out.print(word.charAt(lc)+" ");
                      foundLetters[lc] = true;
                      goodGuess = true;
                   }
                   else
                       System.out.print("_ ");
         return goodGuess;
    }
          
    public void getGuess()
    {
         // you need to add code here to get a user's guess
    }
      
    public void checkGuess()
    {
        // you need to add code here that will check the user's guess
        // NOTE: you can use the code below when you want to show the user something
        // before continuing with the game
        //System.out.println("Press the Return key to continue!");
        //String pause = get.aWord();   
                   
    }
      
    public void completedMan()
    {
       System.out.println("_____");
       System.out.println("|   |");
       System.out.println("|   o");
       System.out.println("|  /|\\"); //why the double \\, because the \ has special meaning
       System.out.println("|  / \\"); //and so using 2 tell Java to just print the 2nd
    }
    
    public void man_0()
    {
       System.out.println("_____");
       System.out.println("|   |");
       System.out.println("|   ");
       System.out.println("|   "); //why the double \\, because the \ has special meaning
       System.out.println("|   "); //and so using 2 tell Java to just print the 2nd
    }
    
    public void man_1()
    {
       System.out.println("_____");
       System.out.println("|   |");
       System.out.println("|   o");
       System.out.println("|    "); //why the double \\, because the \ has special meaning
       System.out.println("|    "); //and so using 2 tell Java to just print the 2nd
    }
    
    public void man_2()
    {
       System.out.println("_____");
       System.out.println("|   |");
       System.out.println("|   o");
       System.out.println("|   | "); //why the double \\, because the \ has special meaning
       System.out.println("|    "); //and so using 2 tell Java to just print the 2nd
    }
    
    public void man_3()
    {
       System.out.println("_____");
       System.out.println("|   |");
       System.out.println("|   o");
       System.out.println("|  /| "); //why the double \\, because the \ has special meaning
       System.out.println("|    "); //and so using 2 tell Java to just print the 2nd
    }
    
    public void man_4()
    {
       System.out.println("_____");
       System.out.println("|   |");
       System.out.println("|   o");
       System.out.println("|  /|\\ "); //why the double \\, because the \ has special meaning
       System.out.println("|    "); //and so using 2 tell Java to just print the 2nd
    }
    
    public void man_5()
    {
       System.out.println("_____");
       System.out.println("|   |");
       System.out.println("|   o");
       System.out.println("|  /|\\ "); //why the double \\, because the \ has special meaning
       System.out.println("|    \\"); //and so using 2 tell Java to just print the 2nd
    }
}
