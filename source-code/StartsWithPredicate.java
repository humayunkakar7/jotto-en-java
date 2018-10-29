//==============================================================================
// Jotto
//
// @description: Module for providing functions to work with StartsWithPredicate
// objects
// @author: Humayun Khan
// @version: 1.0 
//==============================================================================

public class StartsWithPredicate implements IWordPredicate {
   private String testString;
   private int difficulty;

   public StartsWithPredicate(String aString, int aLevel) {
      testString = aString;
      difficulty = aLevel;
   } // Constructor

   // See interface (IWordPredicate.java file).
   public boolean isOK(Word aWord) {
      return (aWord.getWord().startsWith(testString) &&
         (aWord.getDifficulty() == difficulty));
   } // isOK
}
