/*
* Name: A.Arul Dhana Saam Prakash
* Original Craetion date: 07/15/2017
* Modified Date: 07/15/2017
* Author: A.Arul Dhana Saam Prakash
* Description: 
1.This class stores the question related information
*/
public class P2A3_ANTRONXAVIERARUL_QUESTION_aantronx {
    private String secretWord;//Variable to store the secret word
    private String hintForTheSecretWord;//Variable to store the hint of the secret word
   //Default Constructor to iniialize values
    public P2A3_ANTRONXAVIERARUL_QUESTION_aantronx() {
        secretWord = null;
        hintForTheSecretWord = null;
    }
    //This function returns the value of secretWord
    public String getSecretWord() {
        return secretWord;
    }
    //This function sets the value of secretWord
    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }
    //This function returns the value of hintForTheSecretWord
    public String getHintForTheSecretWord() {
        return hintForTheSecretWord;
    }
    //This function sets the value of hintForTheSecretWord
    public void setHintForTheSecretWord(String hintForTheSecretWord) {
        this.hintForTheSecretWord = hintForTheSecretWord;
    }
}