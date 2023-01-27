//A programme tht implements the logic for a cows and bulls guessing game the player has.
//RTSREC001
//Rector Ratsaka
//07 September 2022

public class CowsAndBulls {
 public final static int NUM_DIGITS = 4;
 public final static int MAX_VALUE = 9876;
 public final static int MIN_VALUE = 1234;
 public final static int MAX_GUESSES = 10;
 private int mysteryNum;
 private Result result;
 private int guesses;
 public CowsAndBulls(int seed) {
 // Create a CowsAndBulls game using the given randomisation seed value to generate
 // a mystery number of NUM_DIGITS length, and that gives the player MAX_GUESSES guesses.
 NumberPicker mystery = new NumberPicker(seed,1,9);
 mysteryNum = (((mystery.nextInt()*10)+mystery.nextInt())*10+mystery.nextInt())*10 + mystery.nextInt(); 
 guesses= MAX_GUESSES;
 }
 public int guessesRemaining() {
 // Obtain the number of guesses remaining.
 return guesses;
 }
 public Result guess(int guessNumber) {
 // Evaluates a guess that the mystery number is guessNumber, returning the outcome in the form
 // of a Result object. Decrements guesses remaining.
 // Assumes that game is not over.
 int bullCount = NumberUtils.countMatches(mysteryNum,guessNumber);
 int cowCount = NumberUtils.countIntersect(mysteryNum,guessNumber)-NumberUtils.countMatches(mysteryNum,guessNumber);
 guesses--;
 if (cowCount<0){
   cowCount=0;
   }
 result = new Result(cowCount,bullCount);
 return result;
 }
 public int giveUp() {
 // End the game, returning the secretNumber.
 guess(mysteryNum);
 return mysteryNum;
 }
 public boolean gameOver() {
 // Returns true if (i) the secret number has been guessed, or (ii) there are no more guesses. 
 try{
  if ((result.bulls()==4)||(guesses==0))
  return true;
 else
  return false;
 }
 catch (Exception e) {
  return false;
 }
 }
}