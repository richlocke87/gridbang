package uk.co.exoticcavalcade

import scala.collection.mutable.MutableList

/**
 * Main Crossword Creator singleton
 */
object CrosswordCreator {
    
    /**
     * Main method
     */
    def main(args: Array[String]) {
        if (args.length > 0) {
            val letterCounts = args.foldLeft(new HashMap[Char, Int])(processWord)
            val words = args.map(new Word(_))
            words.foreach(word => println(word.value))
        }
    }
    
    def processWord(letterCounts: HashMap[Char, Int], word: String) {
        val letterCounts = word.charArray.foldLeft(new HashMap[Char, Int])((b, a) => b(a) = b(a) == Nil ? 1 : b(a) + 1)
    }
    
}

class Word(w: String) {
    var value: String = w
}