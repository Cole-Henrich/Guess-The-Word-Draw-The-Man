import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    //][\/][ //-\ ][_) ]E  ][3 ``//  //-\  // ] _) ]][ ((5 << ]][ ]]p ][_ ]E   [[]] ][=   ][\/][ //-\ ((5 `][` ]E ][2    ][3 ][2 ]][ //-\ ][\][   ((5 ]E //-\
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        boolean isASCII = true;
        boolean isTwoPlayers = true;
        String playerOneName = "";
        String playerTwoName = "";
        p(getASCIIalphabet()[0]);
        //Both contain three pronouns: subjective, objective, and possessive forms.
        ArrayList<String> playerOnePronouns = new ArrayList<>();
        ArrayList<String> playerTwoPronouns = new ArrayList<>();

        StringBuilder allCaps = new StringBuilder();
        StringBuilder ASCIIword = new StringBuilder();
        StringBuilder progress = new StringBuilder();
        char[] lowercase = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        char[] uppercase = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };

            p("Hello! Welcome to 'draw-the-man' - a computerized edition of the classic Hang-Man!\n" +
                    "Are you familiar with the premise of the game?");
            Scanner s = new Scanner(System.in);
            String isFamiliar = s.next();
            if (isFamiliar.contains("n")) {
                p("No problem! Here is the premise of the game:");
                //Thread.sleep(5000);
                p(" One player tries to guess the other player's secret word.");
                //Thread.sleep(5000);
                p(" One player will mentally decide on a word they know that they think is unique, and let the other player know when the word has been chosen.");
                //Thread.sleep(5000);
                p(" The screen will display a series of blanks:");
                //Thread.sleep(2000);
                p("    ________    ________    ________    ________    ________    ________    ________   ________    ________    ________    ________ ");
                //Thread.sleep(3000);
                p("  Corresponding to the length of the word. There are 12 blanks above, meaning our example secret word has 12 letters.");
                //Thread.sleep(5000);
                p(" For example, the word could be 'polynomial' or 'rhinoceros', or ANY 12 letter word.");
                //Thread.sleep(6000);
                p(" The guessing player will then guess a letter. If the secret word contains the letter, the system will then fill in every occurrence of the letter.");
                //Thread.sleep(5000);
                p(" For example, if the guessing player entered 'o' and the word was 'rhinoceros', the blanks would fill in this way:");
                //Thread.sleep(6000);
                p(" _ _ _ _ o _ _ _ o _");
                //Thread.sleep(3000);
                p(" if the secret word does not contain the letter guessed, the letter will be entered into a word bank of incorrect letters, and the program will start to draw a figure.");
                //Thread.sleep(6000);
                p(" For every incorrect letter guessed, the program will draw another part of the figure.");
                //Thread.sleep(5000);
                p(" After 12 incorrect guesses, the figure becomes fully drawn; the guesser loses and the answerer reveals the word.");
                //Thread.sleep(5000);
                p(" In usual hangman, the figure would be a man being hanged. However, this is not your average hangman game!");
                //Thread.sleep(5000);
            }

            if (isFamiliar.contains("y")) p("Great!");
            p("Would you like to play in regular mode:");
            //Thread.sleep(1000);
            p(" _ _ _ _ _ _ _ _ _ _");
            //Thread.sleep(500);
            p("""
                                    
                    R H I N O C E R O S\s
                    _ _ _ _ _ _ _ _ _ _
                                    
                    """);
            //Thread.sleep(1000);
            p("Or would you like to play in ASCII Art Mode:");
            //Thread.sleep(1000);
            getasciiDemo();
            //Thread.sleep(1000);


            p("""
                    The game is set to ASCII Art Mode by default. If you prefer regular, type 'regular'.
                    If you prefer ascii, type anything other than regular.
                    Then hit enter.
                                 
                    """);
            Scanner s3 = new Scanner(System.in);
            String userInput3 = s3.next();
            if (userInput3.contains("reg") || userInput3.contains("norm")) isASCII = false;

            p("""
                    Do you want to play solo, or with another person?
                    Type '1' or 'solo'
                    or Type '2' or 'two-player'
                    """);
            Scanner s4 = new Scanner(System.in);
            String userInput4 = s4.next();
            if (userInput4.equals("1") || userInput4.contains("lo")) {
                isTwoPlayers = false;
            } else {
                isTwoPlayers = true;
            }
            if (isTwoPlayers) {
                p("""
                        Will you create the word - player 1
                        or will you guess the word - player 2?
                        Type '1' or '2' 
                        """);
                Scanner s5 = new Scanner(System.in);
                String userInput5 = s5.next();
                if (userInput5.equals("1")) {
                    for (int i = 0; i < 2; i++) {
                        ArrayList<String> playerPronouns = new ArrayList<>();
                        String player = "";
                        String otherplayer = "";
                        p("""
                                Hello! Thanks so much for playing!
                                What would you like your name to be?
                                """);
                        Scanner s6 = new Scanner(System.in);
                        String userInput6 = s6.next();
                        player = userInput6;
                        p("""
                                What would you like your pronouns to be? 
                                                
                                First, type how you would like to be referred to as a grammatical subject, for example, "they".
                                Next, type how you would like to be referred to as an grammatical object, for example, "them".
                                Finally, type how you would like to be referred to in the possessive, for example, "their(s)".
                                                
                                After each pronoun, press enter.
                                """);
                        p("subject:");
                        Scanner input_0 = new Scanner(System.in);
                        String pronoun_0 = input_0.next();
                        playerPronouns.add(pronoun_0);
                        p("object:");
                        Scanner input_1 = new Scanner(System.in);
                        String pronoun_1 = input_1.next();
                        playerPronouns.add(pronoun_1);
                        p("possessive:");
                        Scanner input_2 = new Scanner(System.in);
                        String pronoun_2 = input_2.next();
                        playerPronouns.add(pronoun_2);
                        p("Thanks, " + player + "! Now let your partner have a seat at the computer!");
                        if (i == 0) {
                            playerOneName = player;
                            playerOnePronouns = playerPronouns;
                        }
                        if (i == 1) {
                            playerTwoName = player;
                            playerTwoPronouns = playerPronouns;
                        }
                    }
                    p(playerOnePronouns);
                    p(playerTwoPronouns);
                    p("Thanks, " + playerTwoName + "! Okay, now turn your back! Tell " + playerOneName + " it's time to devise a brain-boggler of a word!");
                }

                Thread.sleep(2000);
                boolean wantsToPlay = true;
                while (wantsToPlay) {
                    p("Welcome back, " + playerOneName + "! Enter your word whenever you are ready.");
                    System.out.flush();
                    Scanner s10 = new Scanner(System.in);
                    String word = s10.next();
                    p(word.length());
                    for (int i = 0; i < word.length(); i++) {
                        char c = word.charAt(i);
                        for (int j = 0; j < lowercase.length; j++) {
                            char smallChar = lowercase[j];
                            char bigChar = uppercase[j];
                            if (c == smallChar) c = bigChar;
                        }
                        allCaps.append(c);
                    }
                    for (int i = 0; i < allCaps.length(); i++) {
                        char c = allCaps.charAt(i);
                        for (int j = 0; j < uppercase.length; j++) {
                            char bigChar = uppercase[j];
                            String ASCIIblock = getASCIIalphabet()[j];
                            if (c == bigChar) ASCIIword.append(ASCIIblock);
                        }
                    }
                    p(ASCIIword);
                    p("Nice word! That'll perplex " + playerTwoName + " for sure! Let " + playerTwoPronouns.get(1) + " know that " + playerTwoPronouns.get(0) + " can come back and start guessing...OOH, THIS WILL BE GOOD!");
                    p("Hello " + playerTwoName + "! Enter the first letter you are guessing, whenever you are ready.");
                    ArrayList<String> progressOnWord = new ArrayList<>();
                    ArrayList<String> ASCIIform = new ArrayList<>();
                    for (int i = 0; i < word.length(); i++) {
                        progressOnWord.add("0");
                        ASCIIform.add("0");
                    }
                    int numberCorrect = 0;
                    int numberWrong = 0;
                    String[] ASCIIalphabet = getASCIIalphabet();
                    String ASCIIblank = ASCIIalphabet[26];
                    String[] drawing = getDrawing();

                    for (int i = 0; i < 26; i++) {
                        p("Please enter the letter:");
                        Scanner sc = new Scanner(System.in);
                        String guess = sc.next();
                        int count = 0;
                        count = word.length() - word.replace("guess", "").length();
                        if (count > 0) {
                            for (int location = 0; location < word.length(); location++) {
                                String letter = String.valueOf(word.charAt(location));
                                if (letter.equalsIgnoreCase(guess)) {
                                    progressOnWord.set(location, guess);
                                }
                            }
                            numberCorrect += count;
                            p(numberCorrect);
                        }

                        for (int j = 0; j < progressOnWord.size(); j++) {
                            String wordPlace = progressOnWord.get(j);
                            if (wordPlace.equals("0")) {
                                ASCIIform.set(j, ASCIIblank);
                            }
                            for (int k = 0; k < lowercase.length; k++) {
                                String letter = String.valueOf(lowercase[k]);
                                String ASCIIletter = ASCIIalphabet[k];
                                if (wordPlace.equalsIgnoreCase(letter)) {
                                    ASCIIform.set(j, ASCIIletter);
                                }
                            }
                        }
                        p(ASCIIform);
                        if (!word.contains(guess)) {
                            numberWrong++;
                            p(drawing[numberWrong]);
                        }
                        if (numberWrong == (drawing.length - 1) || numberCorrect == word.length()) {
                            p("Good game! Would you like to play again?");
                            Scanner s00 = new Scanner(System.in);
                            String willPlay = s00.next();
                            if (willPlay.contains("y")) {
                                wantsToPlay = true;
                            }
                            if (willPlay.contains("n")) {
                                wantsToPlay = false;
                            }
                            break;
                        }
                    }
                }
        }
    }
public static ArrayList<String> getDictionary() throws FileNotFoundException {
    int Gatsbycount = 0;
    ArrayList<String> Gatsbyuniquewords = new ArrayList<>();
    File Gatsby = new File("/Users/cole.henrich/IdeaProjects/Guess-The-Word-Draw-The-Man/src/dictionary.txt");
    Scanner scanner01 = new Scanner(Gatsby);
    while (scanner01.hasNext()) {
        String dictionaryWord = scanner01.next();
        p(dictionaryWord);
        if (dictionaryWord.length() >= 10) {
            if (!dictionaryWord.contains("-")) {
                dictionaryWord = repeatedReplace(dictionaryWord);
                if (!Gatsbyuniquewords.contains(dictionaryWord)) {
                    Gatsbyuniquewords.add(dictionaryWord);
                    Gatsbycount++;
                }
            }
        }
    }
    p(Gatsbyuniquewords);
    p(Gatsbycount);
    int JungleBookcount = 0;
    ArrayList<String> JungleBookuniquewords = new ArrayList<>();
    File JungleBook = new File("/Users/cole.henrich/IdeaProjects/Guess-The-Word-Draw-The-Man/src/JungleBook.txt");
    Scanner scanner02 = new Scanner(JungleBook);
    while (scanner02.hasNext()) {
        String JungleBookDictionaryWord = scanner02.next();
        p(JungleBookDictionaryWord);
        if (JungleBookDictionaryWord.length() >= 8) {
                if (!JungleBookDictionaryWord.contains("-")) {
                    JungleBookDictionaryWord = repeatedReplace(JungleBookDictionaryWord);
                    if (!JungleBookuniquewords.contains(JungleBookDictionaryWord)) {
                        JungleBookuniquewords.add(JungleBookDictionaryWord);
                        JungleBookcount++;
                    }
                }
        }
    }
    p(JungleBookuniquewords);
    p(JungleBookcount);

    int FullDictionarycount = 0;
    ArrayList<String> FullDictionaryuniquewords = new ArrayList<>();
    File FullDictionary = new File("/Users/cole.henrich/IdeaProjects/Guess-The-Word-Draw-The-Man/src/JungleBook+Gatsby.txt");
    Scanner scanner03 = new Scanner(FullDictionary);
    while (scanner03.hasNext()) {
        String FullDictionaryDictionaryWord = scanner03.next();
        p(FullDictionaryDictionaryWord);
        if (FullDictionaryDictionaryWord.length() >= 8) {
                if (!FullDictionaryDictionaryWord.contains("-")) {
                    FullDictionaryDictionaryWord = repeatedReplace(FullDictionaryDictionaryWord);
                    if (!FullDictionaryuniquewords.contains(FullDictionaryDictionaryWord)) {
                        FullDictionaryuniquewords.add(FullDictionaryDictionaryWord);
                        FullDictionarycount++;
                    }
                }
        }
    }
    p(FullDictionaryuniquewords);
    p(FullDictionarycount);
    p("""
            Bummer you're lonely! It's ok, this game loves solo players! 
            Plus, we've got thousands of words so you can play for hours on end.
            A word will be generated for you to guess. You can pick which dictionary it comes from: 
            ------The Gatsby Dictionary-----
            
            The Gatsby Dictionary is composed of all the unique words over 9 letters occurring in the Great Gatsby.
            __________________________________
            """);
    p("If you choose the Gatsby Dictionary, your word can be one of " + Gatsbycount + " words. Wow, that's a lot!");

p("""
        ________The Jungle Book Dictionary----------
        
        Composed of all the unique words over 7 letters occurring in The Jungle Book. Rudyard Kipling likes short words!
        ______________________________________________
        """);
    p("If you choose the Jungle Book Dictionary, your word can be one of " + JungleBookcount + " words. Wow, that's a lot!");
p("""
        Finally, you can combine the two into one BIG MAMA DICTIONARY!!!
        
        """);
p("If you choose the BIG MAMA DICTIONARY, your word can be one of " + FullDictionarycount + " words. Wow...that is REALLY a lot!");

p("""
        So! You've seen the choices! Which do you choose? 
        Enter: 
        0 for the Great Gatsby Dictionary
        1 for the Jungle Book Dictionary
        2 for the BIG MAMA DICTIONARY!!!!!
        """);
ArrayList<String>Dictionary = new ArrayList<>();
Scanner s0001 = new Scanner(System.in);
String userInput0001 = s0001.next();

    if (userInput0001.equals("0")) {
        Dictionary = Gatsbyuniquewords;
    }
    if (userInput0001.equals("1")) {
        Dictionary = JungleBookuniquewords;
    }
    if (userInput0001.equals("2")) {
        Dictionary = FullDictionaryuniquewords;
    }
    return Dictionary;
}

    /**
     *  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .-----------------. .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.
     * | .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |
     * | |      __      | || |   ______     | || |     ______   | || |  ________    | || |  _________   | || |  _________   | || |    ______    | || |  ____  ____  | || |     _____    | || |     _____    | || |  ___  ____   | || |   _____      | || | ____    ____ | || | ____  _____  | || |     ____     | || |   ______     | || |    ___       | || |  _______     | || |    _______   | || |  _________   | || | _____  _____ | || | ____   ____  | || | _____  _____ | || |  ____  ____  | || |  ____  ____  | || |   ________   | |
     * | |     /  \     | || |  |_   _ \    | || |   .' ___  |  | || | |_   ___ `.  | || | |_   ___  |  | || | |_   ___  |  | || |  .' ___  |   | || | |_   ||   _| | || |    |_   _|   | || |    |_   _|   | || | |_  ||_  _|  | || |  |_   _|     | || ||_   \  /   _|| || ||_   \|_   _| | || |   .'    `.   | || |  |_   __ \   | || |  .'   '.     | || | |_   __ \    | || |   /  ___  |  | || | |  _   _  |  | || ||_   _||_   _|| || ||_  _| |_  _| | || ||_   _||_   _|| || | |_  _||_  _| | || | |_  _||_  _| | || |  |  __   _|  | |
     * | |    / /\ \    | || |    | |_) |   | || |  / .'   \_|  | || |   | |   `. \ | || |   | |_  \_|  | || |   | |_  \_|  | || | / .'   \_|   | || |   | |__| |   | || |      | |     | || |      | |     | || |   | |_/ /    | || |    | |       | || |  |   \/   |  | || |  |   \ | |   | || |  /  .--.  \  | || |    | |__) |  | || | /  .-.  \    | || |   | |__) |   | || |  |  (__ \_|  | || | |_/ | | \_|  | || |  | |    | |  | || |  \ \   / /   | || |  | | /\ | |  | || |   \ \  / /   | || |   \ \  / /   | || |  |_/  / /    | |
     * | |   / ____ \   | || |    |  __'.   | || |  | |         | || |   | |    | | | || |   |  _|  _   | || |   |  _|      | || | | |    ____  | || |   |  __  |   | || |      | |     | || |   _  | |     | || |   |  __'.    | || |    | |   _   | || |  | |\  /| |  | || |  | |\ \| |   | || |  | |    | |  | || |    |  ___/   | || | | |   | |    | || |   |  __ /    | || |   '.___`-.   | || |     | |      | || |  | '    ' |  | || |   \ \ / /    | || |  | |/  \| |  | || |    > `' <    | || |    \ \/ /    | || |     .'.' _   | |
     * | | _/ /    \ \_ | || |   _| |__) |  | || |  \ `.___.'\  | || |  _| |___.' / | || |  _| |___/ |  | || |  _| |_       | || | \ `.___]  _| | || |  _| |  | |_  | || |     _| |_    | || |  | |_' |     | || |  _| |  \ \_  | || |   _| |__/ |  | || | _| |_\/_| |_ | || | _| |_\   |_  | || |  \  `--'  /  | || |   _| |_      | || | \  `-'  \_   | || |  _| |  \ \_  | || |  |`\____) |  | || |    _| |_     | || |   \ `--' /   | || |    \ ' /     | || |  |   /\   |  | || |  _/ /'`\ \_  | || |    _|  |_    | || |   _/ /__/ |  | |
     * | ||____|  |____|| || |  |_______/   | || |   `._____.'  | || | |________.'  | || | |_________|  | || | |_____|      | || |  `._____.'   | || | |____||____| | || |    |_____|   | || |  `.___.'     | || | |____||____| | || |  |________|  | || ||_____||_____|| || ||_____|\____| | || |   `.____.'   | || |  |_____|     | || |  `.___.\__|  | || | |____| |___| | || |  |_______.'  | || |   |_____|    | || |    `.__.'    | || |     \_/      | || |  |__/  \__|  | || | |____||____| | || |   |______|   | || |  |________|  | |
     * | |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | |
     * | '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |
     *  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'
     */


    /**
     * @param string the String to be reformatted
     * @return string the String without any of
     * '"',',','.', '(', ')', '?',';','[',']', '{', '}', '/',':','!'
     * and no leading or trailing whitespaces.
     */
 public static String repeatedReplace(String string) {
     char[] repeatReplace = {
             '"',',','.', '(', ')', '?',';','[',']', '{', '}', '/',':', '!'
     };
     for (char toReplace : repeatReplace) {
         string = string.replace(toReplace, ' ');
     }
     string = string.strip();
     return string;
 }
 /**
  |   /_  ||``|||:::::  | ;    | |  |
  :   \_``[]--[]|::::'\_;'     )-'..`._
   \___.>`''-.||:.__,'     SSt |_______`>
 
 
 




 
 
               ||::::|  . :|  |==[]=:
               |||:::|  : ||  :  |  |
   ___ ___     '|;:::|  | |'   \=[]=|
  |   /_  ||``|||:::::  | ;    | |  |
  :   \_``[]--[]|::::'\_;'     )-'..`._
   \___.>`''-.||:.__,'     SSt |_______`>
 
 
 


 
 
               : /`. `.._(--.`':`':/ \
               |::::\     ,'/::;-))  /
               ||:::::  . .::':  :`-(
               ||::::|  . :|  |==[]=:
               |||:::|  : ||  :  |  |
   ___ ___     '|;:::|  | |'   \=[]=|
  |   /_  ||``|||:::::  | ;    | |  |
  :   \_``[]--[]|::::'\_;'     )-'..`._
   \___.>`''-.||:.__,'     SSt |_______`>
 
 



 
 
                 \ / `./  '  / /,' \
                 )\   /`._   ,'`._.-\
                /  `.'    )-'.-,' )__)
               : /`. `.._(--.`':`':/ \
               |::::\     ,'/::;-))  /
               ||:::::  . .::':  :`-(
               ||::::|  . :|  |==[]=:
               |||:::|  : ||  :  |  |
   ___ ___     '|;:::|  | |'   \=[]=|
  |   /_  ||``|||:::::  | ;    | |  |
  :   \_``[]--[]|::::'\_;'     )-'..`._
   \___.>`''-.||:.__,'     SSt |_______`>
 
 
 


 
 
                    ,'\ ,'  _.'.`:-.    \.-'
                  _/   `._,' ,')`;  `-'`'
                 / `.   ,' ,|_/ / \
                 \ / `./  '  / /,' \
                 )\   /`._   ,'`._.-\
                /  `.'    )-'.-,' )__)
               : /`. `.._(--.`':`':/ \
               |::::\     ,'/::;-))  /
               ||:::::  . .::':  :`-(
               ||::::|  . :|  |==[]=:
               |||:::|  : ||  :  |  |
   ___ ___     '|;:::|  | |'   \=[]=|
  |   /_  ||``|||:::::  | ;    | |  |
  :   \_``[]--[]|::::'\_;'     )-'..`._
   \___.>`''-.||:.__,'     SSt |_______`>
 
 
 


 
                                    _..--..
                        _.-''``';'-''-) ,.  \
                      ,'  _.-  ((    `-'  `._\
                    ,'\ ,'  _.'.`:-.    \.-'
                  _/   `._,' ,')`;  `-'`'
                 / `.   ,' ,|_/ / \
                 \ / `./  '  / /,' \
                 )\   /`._   ,'`._.-\
                /  `.'    )-'.-,' )__)
               : /`. `.._(--.`':`':/ \
               |::::\     ,'/::;-))  /
               ||:::::  . .::':  :`-(
               ||::::|  . :|  |==[]=:
               |||:::|  : ||  :  |  |
   ___ ___     '|;:::|  | |'   \=[]=|
  |   /_  ||``|||:::::  | ;    | |  |
  :   \_``[]--[]|::::'\_;'     )-'..`._
   \___.>`''-.||:.__,'     SSt |_______`>
 
 
 



 
 
                                    _..--..
                                  ,' _     \
                        _.-''``';'-''-) ,.  \
                      ,'  _.-  ((    `-'  `._\
                    ,'\ ,'  _.'.`:-.    \.-'
                  _/   `._,' ,')`;  `-'`'
                 / `.   ,' ,|_/ / \
                 \ / `./  '  / /,' \
                 )\   /`._   ,'`._.-\
                /  `.'    )-'.-,' )__)
               : /`. `.._(--.`':`':/ \
               |::::\     ,'/::;-))  /
               ||:::::  . .::':  :`-(                       |/    .          |
               ||::::|  . :|  |==[]=:                       .        -       \
               |||:::|  : ||  :  |  |                      /\           `     |
   ___ ___     '|;:::|  | |'   \=[]=|                     /  \                \
  |   /_  ||``|||:::::  | ;    | |  |                     \_.'\_               `-.
  :   \_``[]--[]|::::'\_;'     )-'..`._                 .-'\``:: ` .              \
   \___.>`''-.||:.__,'     SSt |_______`>              <_____:::.         . . \  _/
                                                             `+a:f:......jrei'''
 
 


 
 
                                    _..--..
                                  ,' _     \
                        _.-''``';'-''-) ,.  \
                      ,'  _.-  ((    `-'  `._\
                    ,'\ ,'  _.'.`:-.    \.-'
                  _/   `._,' ,')`;  `-'`'
                 / `.   ,' ,|_/ / \                          (    <_-'     \
                 \ / `./  '  / /,' \                        /|`         `. |
                 )\   /`._   ,'`._.-\                       |)            \'
                /  `.'    )-'.-,' )__)                      |\            `|
               : /`. `.._(--.`':`':/ \                      ) \             \
               |::::\     ,'/::;-))  /                      ( )`.            |
               ||:::::  . .::':  :`-(                       |/    .          |
               ||::::|  . :|  |==[]=:                       .        -       \
               |||:::|  : ||  :  |  |                      /\           `     |
   ___ ___     '|;:::|  | |'   \=[]=|                     /  \                \
  |   /_  ||``|||:::::  | ;    | |  |                     \_.'\_               `-.
  :   \_``[]--[]|::::'\_;'     )-'..`._                 .-'\``:: ` .              \
   \___.>`''-.||:.__,'     SSt |_______`>              <_____:::.         . . \  _/
                                                             `+a:f:......jrei'''
 
 


 
 
                                    _..--..   .  /"---\      | ` |      . |
                                  ,' _     \                 |  `/_..   , (
                        _.-''``';'-''-) ,.  \ '  '+/// |   .'/   \  ``-.) \
                      ,'  _.-  ((    `-'  `._\    `` \_/_.'  )    /`-._  ) |
                    ,'\ ,'  _.'.`:-.    \.-'                 /   <_L   )"  |
                  _/   `._,' ,')`;  `-'`'                    |     L  /    /
                 / `.   ,' ,|_/ / \                          (    <_-'     \
                 \ / `./  '  / /,' \                        /|`         `. |
                 )\   /`._   ,'`._.-\                       |)            \'
                /  `.'    )-'.-,' )__)                      |\            `|
               : /`. `.._(--.`':`':/ \                      ) \             \
               |::::\     ,'/::;-))  /                      ( )`.            |
               ||:::::  . .::':  :`-(                       |/    .          |
               ||::::|  . :|  |==[]=:                       .        -       \
               |||:::|  : ||  :  |  |                      /\           `     |
   ___ ___     '|;:::|  | |'   \=[]=|                     /  \                \
  |   /_  ||``|||:::::  | ;    | |  |                     \_.'\_               `-.
  :   \_``[]--[]|::::'\_;'     )-'..`._                 .-'\``:: ` .              \
   \___.>`''-.||:.__,'     SSt |_______`>              <_____:::.         . . \  _/
                                                             `+a:f:......jrei'''
 
 


 
 
                                                            .::( .         |
                                                            :::)           \
                                                            /\(            /
                                                           /)            ( |
                                                         .'  \  .       ./ /
                                                      _-'    |\  .        |
                                    _..--..   .  /"---\      | ` |      . |
                                  ,' _     \                 |  `/_..   , (
                        _.-''``';'-''-) ,.  \ '  '+/// |   .'/   \  ``-.) \
                      ,'  _.-  ((    `-'  `._\    `` \_/_.'  )    /`-._  ) |
                    ,'\ ,'  _.'.`:-.    \.-'                 /   <_L   )"  |
                  _/   `._,' ,')`;  `-'`'                    |     L  /    /
                 / `.   ,' ,|_/ / \                          (    <_-'     \
                 \ / `./  '  / /,' \                        /|`         `. |
                 )\   /`._   ,'`._.-\                       |)            \'
                /  `.'    )-'.-,' )__)                      |\            `|
               : /`. `.._(--.`':`':/ \                      ) \             \
               |::::\     ,'/::;-))  /                      ( )`.            |
               ||:::::  . .::':  :`-(                       |/    .          |
               ||::::|  . :|  |==[]=:                       .        -       \
               |||:::|  : ||  :  |  |                      /\           `     |
   ___ ___     '|;:::|  | |'   \=[]=|                     /  \                \
  |   /_  ||``|||:::::  | ;    | |  |                     \_.'\_               `-.
  :   \_``[]--[]|::::'\_;'     )-'..`._                 .-'\``:: ` .              \
   \___.>`''-.||:.__,'     SSt |_______`>              <_____:::.         . . \  _/
                                                             `+a:f:......jrei'''
 
 


 
                                                                .=## SSSSS
                                                                .####  SSSSs
                                                                ###::::SSSSS
                                                               .;:::""""SSS
                                                              .:;:'  . .  \\
                                                             .::/  '     .'|
                                                            .::( .         |
                                                            :::)           \
                                                            /\(            /
                                                           /)            ( |
                                                         .'  \  .       ./ /
                                                      _-'    |\  .        |
                                    _..--..   .  /"---\      | ` |      . |
                                  ,' _     \                 |  `/_..   , (
                        _.-''``';'-''-) ,.  \ '  '+/// |   .'/   \  ``-.) \
                      ,'  _.-  ((    `-'  `._\    `` \_/_.'  )    /`-._  ) |
                    ,'\ ,'  _.'.`:-.    \.-'                 /   <_L   )"  |
                  _/   `._,' ,')`;  `-'`'                    |     L  /    /
                 / `.   ,' ,|_/ / \                          (    <_-'     \
                 \ / `./  '  / /,' \                        /|`         `. |
                 )\   /`._   ,'`._.-\                       |)            \'
                /  `.'    )-'.-,' )__)                      |\            `|
               : /`. `.._(--.`':`':/ \                      ) \             \
               |::::\     ,'/::;-))  /                      ( )`.            |
               ||:::::  . .::':  :`-(                       |/    .          |
               ||::::|  . :|  |==[]=:                       .        -       \
               |||:::|  : ||  :  |  |                      /\           `     |
   ___ ___     '|;:::|  | |'   \=[]=|                     /  \                \
  |   /_  ||``|||:::::  | ;    | |  |                     \_.'\_               `-.
  :   \_``[]--[]|::::'\_;'     )-'..`._                 .-'\``:: ` .              \
   \___.>`''-.||:.__,'     SSt |_______`>              <_____:::.         . . \  _/
                                                             `+a:f:......jrei'''
 
 


                                                                 o .,<>., o
                                                                 |\/\/\/\/|
                                                                 '========'
                                                                 (_ SSSSSSs
                                                                 )a'`SSSSSs
                                                                /_   SSSSSS
                                                                .=## SSSSS
                                                                .####  SSSSs
                                                                ###::::SSSSS
                                                               .;:::""""SSS
                                                              .:;:'  . .  \\
                                                             .::/  '     .'|
                                                            .::( .         |
                                                            :::)           \
                                                            /\(            /
                                                           /)            ( |
                                                         .'  \  .       ./ /
                                                      _-'    |\  .        |
                                    _..--..   .  /"---\      | ` |      . |
            -=====================,' _     \=(#(7.#####()   |  `/_..   , (
                        _.-''``';'-''-) ,.  \ '  '+/// |   .'/   \  ``-.) \
                      ,'  _.-  ((    `-'  `._\    `` \_/_.'  )    /`-._  ) |
                    ,'\ ,'  _.'.`:-.    \.-'                 /   <_L   )"  |
                  _/   `._,' ,')`;  `-'`'                    |     L  /    /
                 / `.   ,' ,|_/ / \                          (    <_-'     \
                 \ / `./  '  / /,' \                        /|`         `. |
                 )\   /`._   ,'`._.-\                       |)            \'
                /  `.'    )-'.-,' )__)                      |\            `|
               : /`. `.._(--.`':`':/ \                      ) \             \
               |::::\     ,'/::;-))  /                      ( )`.            |
               ||:::::  . .::':  :`-(                       |/    .          |
               ||::::|  . :|  |==[]=:                       .        -       \
               |||:::|  : ||  :  |  |                      /\           `     |
   ___ ___     '|;:::|  | |'   \=[]=|                     /  \                \
  |   /_  ||``|||:::::  | ;    | |  |                     \_.'\_               `-.
  :   \_``[]--[]|::::'\_;'     )-'..`._                 .-'\``:: ` .              \
   \___.>`''-.||:.__,'     SSt |_______`>              <_____:::.         . . \  _/
                                                             `+a:f:......jrei'''
 
 
 */

public static void p(Object object_to_print){
        System.out.println(object_to_print);
    }
    /**
     * Prints 12 block ascii blanks and block ascii 'rhinoceros' for demonstration of typeface option.
     * @throws InterruptedException
     */
public static void getasciiDemo() throws InterruptedException {
       //Thread.sleep(1000);

        p("""
                .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.\s
                | .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |
                | |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | |
                | |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | |
                | |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | |
                | |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | |
                | |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | |
                | |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | |
                | |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | |
                | '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |
                 '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'\s""");

       //Thread.sleep(1000);
        p("""
                .----------------.  .----------------.  .----------------.  .-----------------. .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.
                         | .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |
                         | |  _______     | || |  ____  ____  | || |     _____    | || | ____  _____  | || |     ____     | || |     ______   | || |  _________   | || |  _______     | || |     ____     | || |    _______   | |
                         | | |_   __ \\    | || | |_   ||   _| | || |    |_   _|   | || ||_   \\|_   _| | || |   .'    `.   | || |   .' ___  |  | || | |_   ___  |  | || | |_   __ \\    | || |   .'    `.   | || |   /  ___  |  | |
                         | |   | |__) |   | || |   | |__| |   | || |      | |     | || |  |   \\ | |   | || |  /  .--.  \\  | || |  / .'   \\_|  | || |   | |_  \\_|  | || |   | |__) |   | || |  /  .--.  \\  | || |  |  (__ \\_|  | |
                         | |   |  __ /    | || |   |  __  |   | || |      | |     | || |  | |\\ \\| |   | || |  | |    | |  | || |  | |         | || |   |  _|  _   | || |   |  __ /    | || |  | |    | |  | || |   '.___`-.   | |
                         | |  _| |  \\ \\_  | || |  _| |  | |_  | || |     _| |_    | || | _| |_\\   |_  | || |  \\  `--'  /  | || |  \\ `.___.'\\  | || |  _| |___/ |  | || |  _| |  \\ \\_  | || |  \\  `--'  /  | || |  |`\\____) |  | |
                         | | |____| |___| | || | |____||____| | || |    |_____|   | || ||_____|\\____| | || |   `.____.'   | || |   `._____.'  | || | |_________|  | || | |____| |___| | || |   `.____.'   | || |  |_______.'  | |
                         | |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | |
                         | '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |
                         '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'""");


}

    /**
     *
     * @return ASCIIalphabet the alphabet in ASCII block letters
     */
        public static String[] getASCIIalphabet() {
        String[] ASCIIalphabet = {
                """
 .----------------.\s
| .--------------. |
| |      __      | |
| |     /  \\     | |
| |    / /\\ \\    | |
| |   / ____ \\   | |
| | _/ /    \\ \\_ | |
| ||____|  |____|| |
| |              | |
| '--------------' |
 '----------------'\s""",

                """
 .----------------.\s
| .--------------. |
| |   ______     | |
| |  |_   _ \\    | |
| |    | |_) |   | |
| |    |  __'.   | |
| |   _| |__) |  | |
| |  |_______/   | |
| |              | |
| '--------------' |
 '----------------'\s""",
                """
 .----------------.\s
| .--------------. |
| |     ______   | |
| |   .' ___  |  | |
| |  / .'   \\_|  | |
| |  | |         | |
| |  \\ `.___.'\\  | |
| |   `._____.'  | |
| |              | |
| '--------------' |
 '----------------'\s""",
                """
 .----------------.\s
| .--------------. |
| |  ________    | |
| | |_   ___ `.  | |
| |   | |   `. \\ | |
| |   | |    | | | |
| |  _| |___.' / | |
| | |________.'  | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |  _________   | |
| | |_   ___  |  | |
| |   | |_  \\_|  | |
| |   |  _|  _   | |
| |  _| |___/ |  | |
| | |_________|  | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |  _________   | |
| | |_   ___  |  | |
| |   | |_  \\_|  | |
| |   |  _|      | |
| |  _| |_       | |
| | |_____|      | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |    ______    | |
| |  .' ___  |   | |
| | / .'   \\_|   | |
| | | |    ____  | |
| | \\ `.___]  _| | |
| |  `._____.'   | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |  ____  ____  | |
| | |_   ||   _| | |
| |   | |__| |   | |
| |   |  __  |   | |
| |  _| |  | |_  | |
| | |____||____| | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |     _____    | |
| |    |_   _|   | |
| |      | |     | |
| |      | |     | |
| |     _| |_    | |
| |    |_____|   | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |     _____    | |
| |    |_   _|   | |
| |      | |     | |
| |   _  | |     | |
| |  | |_' |     | |
| |  `.___.'     | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |  ___  ____   | |
| | |_  ||_  _|  | |
| |   | |_/ /    | |
| |   |  __'.    | |
| |  _| |  \\ \\_  | |
| | |____||____| | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |   _____      | |
| |  |_   _|     | |
| |    | |       | |
| |    | |   _   | |
| |   _| |__/ |  | |
| |  |________|  | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| | ____    ____ | |
| ||_   \\  /   _|| |
| |  |   \\/   |  | |
| |  | |\\  /| |  | |
| | _| |_\\/_| |_ | |
| ||_____||_____|| |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .-----------------.
| .--------------. |
| | ____  _____  | |
| ||_   \\|_   _| | |
| |  |   \\ | |   | |
| |  | |\\ \\| |   | |
| | _| |_\\   |_  | |
| ||_____|\\____| | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |     ____     | |
| |   .'    `.   | |
| |  /  .--.  \\  | |
| |  | |    | |  | |
| |  \\  `--'  /  | |
| |   `.____.'   | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |   ______     | |
| |  |_   __ \\   | |
| |    | |__) |  | |
| |    |  ___/   | |
| |   _| |_      | |
| |  |_____|     | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |    ___       | |
| |  .'   '.     | |
| | /  .-.  \\    | |
| | | |   | |    | |
| | \\  `-'  \\_   | |
| |  `.___.\\__|  | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |  _______     | |
| | |_   __ \\    | |
| |   | |__) |   | |
| |   |  __ /    | |
| |  _| |  \\ \\_  | |
| | |____| |___| | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |    _______   | |
| |   /  ___  |  | |
| |  |  (__ \\_|  | |
| |   '.___`-.   | |
| |  |`\\____) |  | |
| |  |_______.'  | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |  _________   | |
| | |  _   _  |  | |
| | |_/ | | \\_|  | |
| |     | |      | |
| |    _| |_     | |
| |   |_____|    | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| | _____  _____ | |
| ||_   _||_   _|| |
| |  | |    | |  | |
| |  | '    ' |  | |
| |   \\ `--' /   | |
| |    `.__.'    | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| | ____   ____  | |
| ||_  _| |_  _| | |
| |  \\ \\   / /   | |
| |   \\ \\ / /    | |
| |    \\ ' /     | |
| |     \\_/      | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| | _____  _____ | |
| ||_   _||_   _|| |
| |  | | /\\ | |  | |
| |  | |/  \\| |  | |
| |  |   /\\   |  | |
| |  |__/  \\__|  | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |  ____  ____  | |
| | |_  _||_  _| | |
| |   \\ \\  / /   | |
| |    > `' <    | |
| |  _/ /'`\\ \\_  | |
| | |____||____| | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |  ____  ____  | |
| | |_  _||_  _| | |
| |   \\ \\  / /   | |
| |    \\ \\/ /    | |
| |    _|  |_    | |
| |   |______|   | |
| |              | |
| '--------------' |
 '----------------'\s""", """
 .----------------.\s
| .--------------. |
| |   ________   | |
| |  |  __   _|  | |
| |  |_/  / /    | |
| |     .'.' _   | |
| |   _/ /__/ |  | |
| |  |________|  | |
| |              | |
| '--------------' |
 '----------------'\s""",
                """
.----------------.s
| .--------------. |
| |              | |
| |              | |
| |              | |
| |              | |
| |              | |
| |              | |
| |              | |
| '--------------' |
 '----------------'\\"""
        };
        return ASCIIalphabet;
    }

    /**
     *
     * @return the drawing
     */
    public static String[] getDrawing(){
        String[] drawing = {
                """
|   /_  ||``|||:::::  | ;    | |  |
:   \\_``[]--[]|::::'\\_;'     )-'..`._
  \\___.>`''-.||:.__,'     SSt |_______`>""",
                """
               ||::::|  . :|  |==[]=:
               |||:::|  : ||  :  |  |
   ___ ___     '|;:::|  | |'   \\=[]=|
  |   /_  ||``|||:::::  | ;    | |  |
  :   \\_``[]--[]|::::'\\_;'     )-'..`._
   \\___.>`''-.||:.__,'     SSt |_______`>""",
                """
               : /`. `.._(--.`':`':/ \\
               |::::\\     ,'/::;-))  /
               ||:::::  . .::':  :`-(
               ||::::|  . :|  |==[]=:
               |||:::|  : ||  :  |  |
   ___ ___     '|;:::|  | |'   \\=[]=|
  |   /_  ||``|||:::::  | ;    | |  |
  :   \\_``[]--[]|::::'\\_;'     )-'..`._
   \\___.>`''-.||:.__,'     SSt |_______`>""",
                """
                 \\ / `./  '  / /,' \\
                 )\\   /`._   ,'`._.-\\
                /  `.'    )-'.-,' )__)
               : /`. `.._(--.`':`':/ \\
               |::::\\     ,'/::;-))  /
               ||:::::  . .::':  :`-(
               ||::::|  . :|  |==[]=:
               |||:::|  : ||  :  |  |
   ___ ___     '|;:::|  | |'   \\=[]=|
  |   /_  ||``|||:::::  | ;    | |  |
  :   \\_``[]--[]|::::'\\_;'     )-'..`._
   \\___.>`''-.||:.__,'     SSt |_______`>""",
                """
                                          ,'\\ ,'  _.'.`:-.    \\.-'
                                        _/   `._,' ,')`;  `-'`'
                                       / `.   ,' ,|_/ / \\
                                       \\ / `./  '  / /,' \\
                                       )\\   /`._   ,'`._.-\\
                                      /  `.'    )-'.-,' )__)
                                     : /`. `.._(--.`':`':/ \\
                                     |::::\\     ,'/::;-))  /
                                     ||:::::  . .::':  :`-(
                                     ||::::|  . :|  |==[]=:
                                     |||:::|  : ||  :  |  |
                         ___ ___     '|;:::|  | |'   \\=[]=|
                        |   /_  ||``|||:::::  | ;    | |  |
                        :   \\_``[]--[]|::::'\\_;'     )-'..`._
                         \\___.>`''-.||:.__,'     SSt |_______`>""".indent(2),
                """
                                                           _..--..
                                              _.-''``';'-''-) ,.  \\
                                            ,'  _.-  ((    `-'  `._\\
                                          ,'\\ ,'  _.'.`:-.    \\.-'
                                        _/   `._,' ,')`;  `-'`'
                                       / `.   ,' ,|_/ / \\
                                       \\ / `./  '  / /,' \\
                                       )\\   /`._   ,'`._.-\\
                                      /  `.'    )-'.-,' )__)
                                     : /`. `.._(--.`':`':/ \\
                                     |::::\\     ,'/::;-))  /
                                     ||:::::  . .::':  :`-(
                                     ||::::|  . :|  |==[]=:
                                     |||:::|  : ||  :  |  |
                         ___ ___     '|;:::|  | |'   \\=[]=|
                        |   /_  ||``|||:::::  | ;    | |  |
                        :   \\_``[]--[]|::::'\\_;'     )-'..`._
                         \\___.>`''-.||:.__,'     SSt |_______`>""".indent(2),
                """
                                                          _..--..
                                                        ,' _     \\
                                              _.-''``';'-''-) ,.  \\
                                            ,'  _.-  ((    `-'  `._\\
                                          ,'\\ ,'  _.'.`:-.    \\.-'
                                        _/   `._,' ,')`;  `-'`'
                                       / `.   ,' ,|_/ / \\
                                       \\ / `./  '  / /,' \\
                                       )\\   /`._   ,'`._.-\\
                                      /  `.'    )-'.-,' )__)
                                     : /`. `.._(--.`':`':/ \\
                                     |::::\\     ,'/::;-))  /
                                     ||:::::  . .::':  :`-(                       |/    .          |
                                     ||::::|  . :|  |==[]=:                       .        -       \\
                                     |||:::|  : ||  :  |  |                      /\\           `     |
                         ___ ___     '|;:::|  | |'   \\=[]=|                     /  \\                \\
                        |   /_  ||``|||:::::  | ;    | |  |                     \\_.'\\_               `-.
                        :   \\_``[]--[]|::::'\\_;'     )-'..`._                 .-'\\``:: ` .              \\
                         \\___.>`''-.||:.__,'     SSt |_______`>              <_____:::.         . . \\  _/
                                                                                   `+a:f:......jrei'''""".indent(2),
                """
                                    _..--..
                                  ,' _     \\
                        _.-''``';'-''-) ,.  \\
                      ,'  _.-  ((    `-'  `._\\
                    ,'\\ ,'  _.'.`:-.    \\.-'
                  _/   `._,' ,')`;  `-'`'
                 / `.   ,' ,|_/ / \\                          (    <_-'     \\
                 \\ / `./  '  / /,' \\                        /|`         `. |
                 )\\   /`._   ,'`._.-\\                       |)            \\'
                /  `.'    )-'.-,' )__)                      |\\            `|
               : /`. `.._(--.`':`':/ \\                      ) \\             \\
               |::::\\     ,'/::;-))  /                      ( )`.            |
               ||:::::  . .::':  :`-(                       |/    .          |
               ||::::|  . :|  |==[]=:                       .        -       \\
               |||:::|  : ||  :  |  |                      /\\           `     |
   ___ ___     '|;:::|  | |'   \\=[]=|                     /  \\                \\
  |   /_  ||``|||:::::  | ;    | |  |                     \\_.'\\_               `-.
  :   \\_``[]--[]|::::'\\_;'     )-'..`._                 .-'\\``:: ` .              \\
   \\___.>`''-.||:.__,'     SSt |_______`>              <_____:::.         . . \\  _/
                                                             `+a:f:......jrei'''""",
                """
                                    _..--..   .  /"---\\      | ` |      . |
                                  ,' _     \\                 |  `/_..   , (
                        _.-''``';'-''-) ,.  \\ '  '+/// |   .'/   \\  ``-.) \\
                      ,'  _.-  ((    `-'  `._\\    `` \\_/_.'  )    /`-._  ) |
                    ,'\\ ,'  _.'.`:-.    \\.-'                 /   <_L   )"  |
                  _/   `._,' ,')`;  `-'`'                    |     L  /    /
                 / `.   ,' ,|_/ / \\                          (    <_-'     \\
                 \\ / `./  '  / /,' \\                        /|`         `. |
                 )\\   /`._   ,'`._.-\\                       |)            \\'
                /  `.'    )-'.-,' )__)                      |\\            `|
               : /`. `.._(--.`':`':/ \\                      ) \\             \\
               |::::\\     ,'/::;-))  /                      ( )`.            |
               ||:::::  . .::':  :`-(                       |/    .          |
               ||::::|  . :|  |==[]=:                       .        -       \\
               |||:::|  : ||  :  |  |                      /\\           `     |
   ___ ___     '|;:::|  | |'   \\=[]=|                     /  \\                \\
  |   /_  ||``|||:::::  | ;    | |  |                     \\_.'\\_               `-.
  :   \\_``[]--[]|::::'\\_;'     )-'..`._                 .-'\\``:: ` .              \\
   \\___.>`''-.||:.__,'     SSt |_______`>              <_____:::.         . . \\  _/
                                                             `+a:f:......jrei'''""",
                """
                                                            .::( .         |
                                                            :::)           \\
                                                            /\\(            /
                                                           /)            ( |
                                                         .'  \\  .       ./ /
                                                      _-'    |\\  .        |
                                    _..--..   .  /"---\\      | ` |      . |
                                  ,' _     \\                 |  `/_..   , (
                        _.-''``';'-''-) ,.  \\ '  '+/// |   .'/   \\  ``-.) \\
                      ,'  _.-  ((    `-'  `._\\    `` \\_/_.'  )    /`-._  ) |
                    ,'\\ ,'  _.'.`:-.    \\.-'                 /   <_L   )"  |
                  _/   `._,' ,')`;  `-'`'                    |     L  /    /
                 / `.   ,' ,|_/ / \\                          (    <_-'     \\
                 \\ / `./  '  / /,' \\                        /|`         `. |
                 )\\   /`._   ,'`._.-\\                       |)            \\'
                /  `.'    )-'.-,' )__)                      |\\            `|
               : /`. `.._(--.`':`':/ \\                      ) \\             \\
               |::::\\     ,'/::;-))  /                      ( )`.            |
               ||:::::  . .::':  :`-(                       |/    .          |
               ||::::|  . :|  |==[]=:                       .        -       \\
               |||:::|  : ||  :  |  |                      /\\           `     |
   ___ ___     '|;:::|  | |'   \\=[]=|                     /  \\                \\
  |   /_  ||``|||:::::  | ;    | |  |                     \\_.'\\_               `-.
  :   \\_``[]--[]|::::'\\_;'     )-'..`._                 .-'\\``:: ` .              \\
   \\___.>`''-.||:.__,'     SSt |_______`>              <_____:::.         . . \\  _/
                                                             `+a:f:......jrei'''""",
                """
                                                                 .=## SSSSS
                                                                .####  SSSSs
                                                                ###::::SSSSS
                                                               .;:::""\""SSS
                                                              .:;:'  . .  \\\\
                                                             .::/  '     .'|
                                                            .::( .         |
                                                            :::)           \\
                                                            /\\(            /
                                                           /)            ( |
                                                         .'  \\  .       ./ /
                                                      _-'    |\\  .        |
                                    _..--..   .  /"---\\      | ` |      . |
                                  ,' _     \\                 |  `/_..   , (
                        _.-''``';'-''-) ,.  \\ '  '+/// |   .'/   \\  ``-.) \\
                      ,'  _.-  ((    `-'  `._\\    `` \\_/_.'  )    /`-._  ) |
                    ,'\\ ,'  _.'.`:-.    \\.-'                 /   <_L   )"  |
                  _/   `._,' ,')`;  `-'`'                    |     L  /    /
                 / `.   ,' ,|_/ / \\                          (    <_-'     \\
                 \\ / `./  '  / /,' \\                        /|`         `. |
                 )\\   /`._   ,'`._.-\\                       |)            \\'
                /  `.'    )-'.-,' )__)                      |\\            `|
               : /`. `.._(--.`':`':/ \\                      ) \\             \\
               |::::\\     ,'/::;-))  /                      ( )`.            |
               ||:::::  . .::':  :`-(                       |/    .          |
               ||::::|  . :|  |==[]=:                       .        -       \\
               |||:::|  : ||  :  |  |                      /\\           `     |
   ___ ___     '|;:::|  | |'   \\=[]=|                     /  \\                \\
  |   /_  ||``|||:::::  | ;    | |  |                     \\_.'\\_               `-.
  :   \\_``[]--[]|::::'\\_;'     )-'..`._                 .-'\\``:: ` .              \\
   \\___.>`''-.||:.__,'     SSt |_______`>              <_____:::.         . . \\  _/
                                                             `+a:f:......jrei'''""",
                """


                                                                 o .,<>., o
                                                                 |\\/\\/\\/\\/|
                                                                 '========'
                                                                 (_ SSSSSSs
                                                                 )a'`SSSSSs
                                                                /_   SSSSSS
                                                                .=## SSSSS
                                                                .####  SSSSs
                                                                ###::::SSSSS
                                                               .;:::""\""SSS
                                                              .:;:'  . .  \\\\
                                                             .::/  '     .'|
                                                            .::( .         |
                                                            :::)           \\
                                                            /\\(            /
                                                           /)            ( |
                                                         .'  \\  .       ./ /
                                                      _-'    |\\  .        |
                                    _..--..   .  /"---\\      | ` |      . |
            -=====================,' _     \\=(#(7.#####()   |  `/_..   , (
                        _.-''``';'-''-) ,.  \\ '  '+/// |   .'/   \\  ``-.) \\
                      ,'  _.-  ((    `-'  `._\\    `` \\_/_.'  )    /`-._  ) |
                    ,'\\ ,'  _.'.`:-.    \\.-'                 /   <_L   )"  |
                  _/   `._,' ,')`;  `-'`'                    |     L  /    /
                 / `.   ,' ,|_/ / \\                          (    <_-'     \\
                 \\ / `./  '  / /,' \\                        /|`         `. |
                 )\\   /`._   ,'`._.-\\                       |)            \\'
                /  `.'    )-'.-,' )__)                      |\\            `|
               : /`. `.._(--.`':`':/ \\                      ) \\             \\
               |::::\\     ,'/::;-))  /                      ( )`.            |
               ||:::::  . .::':  :`-(                       |/    .          |
               ||::::|  . :|  |==[]=:                       .        -       \\
               |||:::|  : ||  :  |  |                      /\\           `     |
   ___ ___     '|;:::|  | |'   \\=[]=|                     /  \\                \\
  |   /_  ||``|||:::::  | ;    | |  |                     \\_.'\\_               `-.
  :   \\_``[]--[]|::::'\\_;'     )-'..`._                 .-'\\``:: ` .              \\
   \\___.>`''-.||:.__,'     SSt |_______`>              <_____:::.         . . \\  _/
                                                             `+a:f:......jrei'''
\s
\s""",
        };
        return drawing;
    }
}

