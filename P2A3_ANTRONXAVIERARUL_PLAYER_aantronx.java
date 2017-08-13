
import java.util.ArrayList;
public class P2A3_ANTRONXAVIERARUL_PLAYER_aantronx {
    private String playerName;
    private ArrayList < String > secretWord = new ArrayList < String > ();
    private ArrayList < Character > enteredCharacters = new ArrayList < Character > ();
    private ArrayList < String > enteredWords = new ArrayList < String > ();
    private int countOfLettersUnIdentified;
    private boolean foundaMatch;
    private boolean isAlreadyGuessed;
    private boolean isQuitTheGame;
    private boolean isGameWon;
    private int userChoice;
    private int tickCount;
    public boolean getIsQuitTheGame() {
        return isQuitTheGame;
    }
    public void setIsQuitTheGame(boolean isQuitTheGame) {
        this.isQuitTheGame = isQuitTheGame;
    }
    public boolean getIsGameWon() {
        return isGameWon;
    }
    public void setIsGameWon(boolean isGameWon) {
        this.isGameWon = isGameWon;
    }
    public int getTickCount() {
        return tickCount;
    }
    public void setTickCount(int tickCount) {
        this.tickCount = tickCount;
    }
    public boolean getFoundaMatch() {
        return foundaMatch;
    }
    public void setFoundaMatch(boolean foundaMatch) {
        this.foundaMatch = foundaMatch;
    }
    public boolean getIsAlreadyGuessed() {
        return isAlreadyGuessed;
    }
    public void setIsAlreadyGuessed(boolean isAlreadyGuessed) {
        this.isAlreadyGuessed = isAlreadyGuessed;
    }
    public int getUserChoice() {
        return userChoice;
    }
    public void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }
    public ArrayList < String > getSecretWordList() {
        return secretWord;
    }
    public void setSecretWord(ArrayList < String > secretWord) {
        this.secretWord = secretWord;
    }
    public int getCountOfLettersUnIdentified() {
        return countOfLettersUnIdentified;
    }
    public void setCountOfLettersUnIdentified(int countOfLettersUnIdentified) {
        this.countOfLettersUnIdentified = countOfLettersUnIdentified;
    }
    public ArrayList < Character > getEnteredCharacters() {
        return enteredCharacters;
    }
    public void setEnteredCharacters(ArrayList < Character > enteredCharacters) {
        this.enteredCharacters = enteredCharacters;
    }
    public ArrayList < String > getEnteredWords() {
        return enteredWords;
    }
    public void setEnteredWords(ArrayList < String > enteredWords) {
        this.enteredWords = enteredWords;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
 
}
