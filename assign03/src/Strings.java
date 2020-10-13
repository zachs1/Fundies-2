// CS 2510, Assignment 3

import tester.*;

// to represent a list of Strings
interface ILoString {
  // combine all Strings in this list into one
  String combine();
  
  // sort all Strings in this list as if all letters are lowercase
  ILoString sort();
  
  // insert a string in this list in sorted manner
  ILoString insert(String prev);
  
  // is this list of Strings sorted?
  boolean isSorted();
  
  // checks if the previous string in this list is alphabetically sorted
  // with regard to the first string in this.rest
  boolean isSortedHelp(String prev);
  
  // interleaves this ILoString with the given ILoString, where the first
  // value is from this list
  ILoString interleave(ILoString loString);
  
  // merges this sorted ILoString with the given sorted ILoString into
  // a new sorted ILoString, including duplicates
  ILoString merge(ILoString loString);
  
  // reverses the order of this ILoString
  ILoString reverse();
  
  // helps reverse the order of strings in this ILoString
  // acc: the reversed list so far
  ILoString reverseAcc(ILoString listSoFar, String prev);
  
  // checks if this ILoString contains pairs of identical strings
  // (i.e. the first and second string are the same, third and fourth are the same, etc.
  boolean isDoubledList();
  
  // helps check if this list is doubled by comparing the previous string in this ILoString
  // to the next string for every other index
  boolean isDoubledHelp(String prev, int idx);
  
  // checks if this list contains words reading the list in either order
  boolean isPalindromeList();
}

// to represent an empty list of Strings
class MtLoString implements ILoString {
  MtLoString(){}
  
  /*
  TEMPLATE
  FIELDS:
  METHODS:
  ... this.combine() ...                     -- String
  ... this.sort() ...                        -- ILoString
  ... this.insert(String) ...                -- ILoString
  ... this.isSorted ...                      -- boolean
  ... this.isSortedHelp(String) ...          -- ILoString
  ... this.interleave(ILoString) ...         -- ILoString
  ... this.merge(ILoString) ...              -- ILoString
  ... this.reverse() ...                     -- ILoString
  ... this.reverseAcc(ILoString, String) ... -- ILoString
  ... this.isDoubledList() ...               -- boolean
  ... this.isDoubledHelp(String, int) ...    -- boolean
  ... this.isPalindromeList() ...            -- boolean
  
  METHODS FOR FIELDS:
  */
  
  // combine all Strings in this list into one
  public String combine() {
    /* TEMPLATE: everything in the template for MtLoString */
    return "";
  }

  // sort all Strings in this list as if all letters are lowercase
  @Override
  public ILoString sort() {
    /* TEMPLATE: everything in the template for MtLoString */
    return this;
  }
  
  // insert a string in this list in sorted manner
  @Override
  public ILoString insert(String prev) {
    /* TEMPLATE: everything in the template for MtLoString, plus
     * Fields of parameters:
     * 
     * Methods on parameters:
     * ... prev.compareTo(String) ...   -- int 
     */
    return new ConsLoString(prev, this);
  }

  // is this list of Strings sorted?
  @Override
  public boolean isSorted() {
    /* TEMPLATE: everything in the template for MtLoString */
    return true;
  }

  // called at the last step of sorting a ConsLoString. If sort() reaches this depth,
  // return true as there are no more strings to check order of
  @Override
  public boolean isSortedHelp(String prev) {
    /* TEMPLATE: everything in the template for MtLoString, plus
     * Fields of parameters:
     * 
     * Methods on parameters:
     * ... prev.compareTo(String) ...   -- int 
     */
    return true;
  }

  // interleaves this ILoString with the given ILoString, where the first
  // value is from this list
  @Override
  public ILoString interleave(ILoString loString) {
    /* TEMPLATE: everything in the template for MtLoString, plus
     * Fields of parameters:
     * ... loString.first ...           -- String
     * ... loString.rest ...            -- ILoString
     * 
     * Methods on parameters:
     * ... loString.combine() ...                     -- String
     * ... loString.sort() ...                        -- ILoString
     * ... loString.insert(String) ...                -- ILoString
     * ... loString.isSorted ...                      -- boolean
     * ... loString.isSortedHelp(String) ...          -- ILoString
     * ... loString.interleave(ILoString) ...         -- ILoString
     * ... loString.merge(ILoString) ...              -- ILoString
     * ... loString.reverse() ...                     -- ILoString
     * ... loString.reverseAcc(ILoString, String) ... -- ILoString
     * ... loString.isDoubledList() ...               -- boolean
     * ... loString.isDoubledHelp(String, int) ...    -- boolean
     * ... loString.isPalindromeList() ...            -- boolean
     */
    return loString;
  }

  // merges this sorted ILoString with the given sorted ILoString into
  // a new sorted ILoString, including duplicates
  @Override
  public ILoString merge(ILoString loString) {
    /* TEMPLATE: everything in the template for MtLoString, plus
     * Fields of parameters:
     * ... loString.first ...           -- String
     * ... loString.rest ...            -- ILoString
     * 
     * Methods on parameters:
     * ... loString.combine() ...                     -- String
     * ... loString.sort() ...                        -- ILoString
     * ... loString.insert(String) ...                -- ILoString
     * ... loString.isSorted ...                      -- boolean
     * ... loString.isSortedHelp(String) ...          -- ILoString
     * ... loString.interleave(ILoString) ...         -- ILoString
     * ... loString.merge(ILoString) ...              -- ILoString
     * ... loString.reverse() ...                     -- ILoString
     * ... loString.reverseAcc(ILoString, String) ... -- ILoString
     * ... loString.isDoubledList() ...               -- boolean
     * ... loString.isDoubledHelp(String, int) ...    -- boolean
     * ... loString.isPalindromeList() ...            -- boolean
     */
    return loString;
  }

  // reverses the order of this ILoString
  @Override
  public ILoString reverse() {
    /* TEMPLATE: everything in the template for MtLoString */
    return this;
  }

  // helps reverse the order of strings in this ILoString
  // acc: the reversed list so far
  @Override
  public ILoString reverseAcc(ILoString listSoFar, String prev) {
    /* TEMPLATE: everything in the template for MtLoString, plus
     * Fields of parameters:
     * ... loString.first ...           -- String
     * ... loString.rest ...            -- ILoString
     * 
     * Methods on parameters:
     * ... loString.combine() ...                     -- String
     * ... loString.sort() ...                        -- ILoString
     * ... loString.insert(String) ...                -- ILoString
     * ... loString.isSorted ...                      -- boolean
     * ... loString.isSortedHelp(String) ...          -- ILoString
     * ... loString.interleave(ILoString) ...         -- ILoString
     * ... loString.merge(ILoString) ...              -- ILoString
     * ... loString.reverse() ...                     -- ILoString
     * ... loString.reverseAcc(ILoString, String) ... -- ILoString
     * ... loString.isDoubledList() ...               -- boolean
     * ... loString.isDoubledHelp(String, int) ...    -- boolean
     * ... loString.isPalindromeList() ...            -- boolean
     */
    return new ConsLoString(prev, listSoFar);
  }

  // checks if this ILoString contains pairs of identical strings
  // (i.e. the first and second string are the same, third and fourth are the same, etc.
  @Override
  public boolean isDoubledList() {
    /* TEMPLATE: everything in the template for MtLoString */
    return true;
  }

  // helps check if this list is doubled by comparing the previous string in this ILoString
  // to the next string for every other index
  @Override
  public boolean isDoubledHelp(String prev, int idx) {
    /* TEMPLATE: everything in the template for MtLoString, plus
     * Fields of parameters:
     * 
     * Methods on parameters:
     * ... prev.compareTo(String) ...   -- int 
     */
    return (idx % 2 == 0);
  }

  // checks if this list contains words reading the list in either order
  @Override
  public boolean isPalindromeList() {
    /* TEMPLATE: everything in the template for MtLoString */
    return true;
  }  
}

// to represent a nonempty list of Strings
class ConsLoString implements ILoString {
  String first;
  ILoString rest;
  
  ConsLoString(String first, ILoString rest) {
    this.first = first;
    this.rest = rest;  
  }
  
  /*
   TEMPLATE
   FIELDS:
   ... this.first ...         -- String
   ... this.rest ...          -- ILoString
   
   METHODS
   ... this.combine() ...                     -- String
   ... this.sort() ...                        -- ILoString
   ... this.insert(String) ...                -- ILoString
   ... this.isSorted ...                      -- boolean
   ... this.isSortedHelp(String) ...          -- ILoString
   ... this.interleave(ILoString) ...         -- ILoString
   ... this.merge(ILoString) ...              -- ILoString
   ... this.reverse() ...                     -- ILoString
   ... this.reverseAcc(ILoString, String) ... -- ILoString
   ... this.isDoubledList() ...               -- boolean
   ... this.isDoubledHelp(String, int) ...    -- boolean
   ... this.isPalindromeList() ...            -- boolean
   
   METHODS FOR FIELDS
   ... this.first.concat(String) ...        -- String
   ... this.first.compareTo(String) ...     -- int
   ... this.rest.combine() ...              -- String
   
   */
  
  // combine all Strings in this list into one
  public String combine() {
    /* TEMPLATE: everything in the template for ConsLoString */
    return this.first.concat(this.rest.combine());
  }
  
  // sort all Strings in this list as if all letters are lowercase
  @Override
  public ILoString sort() {
    /* TEMPLATE: everything in the template for ConsLoString */
    return this.rest.sort().insert(this.first);
  }
  
  // insert a string in this list in sorted manner
  @Override
  public ILoString insert(String prev) {
    /* TEMPLATE: everything in the template for ConsLoString, plus
     * Fields of parameters:
     * 
     * Methods on parameters:
     * ... prev.compareTo(String) ...   -- int 
     */
    if (prev.toLowerCase().compareTo(this.first.toLowerCase()) > 0) { 
      return new ConsLoString(this.first, this.rest.insert(prev));
    }
    else {
      return new ConsLoString(prev, this);
    }
  }
  
  // is this list of Strings sorted?
  @Override
  public boolean isSorted() {
    /* TEMPLATE: everything in the template for ConsLoString */
    return this.rest.isSortedHelp(this.first);
  }
  
  // checks if the previous string in this list is alphabetically sorted
  // with regard to the first string in this.rest
  @Override
  public boolean isSortedHelp(String prev) {
    /* TEMPLATE: everything in the template for ConsLoString, plus
     * Fields of parameters:
     * 
     * Methods on parameters:
     * ... prev.compareTo(String) ...   -- int 
     */
    if (prev.toLowerCase().compareTo(this.first.toLowerCase()) <= 0) {
      return this.rest.isSortedHelp(this.first)
          && this.rest.isSortedHelp(prev);
    }
    else {
      return false;
    }
  }
  
  // interleaves this ILoString with the given ILoString, where the first
  // value is from this list
  @Override
  public ILoString interleave(ILoString loString) {
    /* TEMPLATE: everything in the template for ConsLoString, plus
     * Fields of parameters:
     * ... loString.first ...           -- String
     * ... loString.rest ...            -- ILoString
     * 
     * Methods on parameters:
     * ... loString.combine() ...                     -- String
     * ... loString.sort() ...                        -- ILoString
     * ... loString.insert(String) ...                -- ILoString
     * ... loString.isSorted ...                      -- boolean
     * ... loString.isSortedHelp(String) ...          -- ILoString
     * ... loString.interleave(ILoString) ...         -- ILoString
     * ... loString.merge(ILoString) ...              -- ILoString
     * ... loString.reverse() ...                     -- ILoString
     * ... loString.reverseAcc(ILoString, String) ... -- ILoString
     * ... loString.isDoubledList() ...               -- boolean
     * ... loString.isDoubledHelp(String, int) ...    -- boolean
     * ... loString.isPalindromeList() ...            -- boolean
     */
    return new ConsLoString(this.first, loString.interleave(this.rest));
  }
  
  // merges this sorted ILoString with the given sorted ILoString into
  // a new sorted ILoString, including duplicates
  @Override
  public ILoString merge(ILoString loString) {
    /* TEMPLATE: everything in the template for ConsLoString, plus
     * Fields of parameters:
     * ... loString.first ...           -- String
     * ... loString.rest ...            -- ILoString
     * 
     * Methods on parameters:
     * ... loString.combine() ...                     -- String
     * ... loString.sort() ...                        -- ILoString
     * ... loString.insert(String) ...                -- ILoString
     * ... loString.isSorted ...                      -- boolean
     * ... loString.isSortedHelp(String) ...          -- ILoString
     * ... loString.interleave(ILoString) ...         -- ILoString
     * ... loString.merge(ILoString) ...              -- ILoString
     * ... loString.reverse() ...                     -- ILoString
     * ... loString.reverseAcc(ILoString, String) ... -- ILoString
     * ... loString.isDoubledList() ...               -- boolean
     * ... loString.isDoubledHelp(String, int) ...    -- boolean
     * ... loString.isPalindromeList() ...            -- boolean
     */
    ILoString mergedLoString = new ConsLoString(this.first, this.rest.merge(loString));
    return mergedLoString.sort();
  }
  
  // reverses the order of this ILoString
  @Override
  public ILoString reverse() {
    /* TEMPLATE: everything in the template for ConsLoString */
    return this.rest.reverseAcc(new MtLoString(), this.first);
  }
  
  // helps reverse the order of strings in this ILoString
  // acc: the reversed list so far
  @Override
  public ILoString reverseAcc(ILoString listSoFar, String prev) {
    /* TEMPLATE: everything in the template for ConsLoString, plus
     * Fields of parameters:
     * ... loString.first ...           -- String
     * ... loString.rest ...            -- ILoString
     * 
     * Methods on parameters:
     * ... loString.combine() ...                     -- String
     * ... loString.sort() ...                        -- ILoString
     * ... loString.insert(String) ...                -- ILoString
     * ... loString.isSorted ...                      -- boolean
     * ... loString.isSortedHelp(String) ...          -- ILoString
     * ... loString.interleave(ILoString) ...         -- ILoString
     * ... loString.merge(ILoString) ...              -- ILoString
     * ... loString.reverse() ...                     -- ILoString
     * ... loString.reverseAcc(ILoString, String) ... -- ILoString
     * ... loString.isDoubledList() ...               -- boolean
     * ... loString.isDoubledHelp(String, int) ...    -- boolean
     * ... loString.isPalindromeList() ...            -- boolean
     */
    ILoString soFar = new ConsLoString(prev, listSoFar);
    return this.rest.reverseAcc(soFar, this.first);
  }
  
  // checks if this ILoString contains pairs of identical strings
  // (i.e. the first and second string are the same, third and fourth are the same, etc.)
  @Override
  public boolean isDoubledList() {
    /* TEMPLATE: everything in the template for ConsLoString */
    return this.rest.isDoubledHelp(this.first, 1);
  }

  // helps check if this list is doubled by comparing the previous string in this ILoString
  // to the next string for every other index
  @Override
  public boolean isDoubledHelp(String prev, int idx) {
    /* TEMPLATE: everything in the template for ConsLoString, plus
     * Fields of parameters:
     * 
     * Methods on parameters:
     * ... prev.compareTo(String) ...   -- int 
     */
    if (idx % 2 != 0) {
      if (this.first.compareTo(prev) == 0) {
        return this.rest.isDoubledHelp(this.first, idx + 1);
      }
      else {
        return false;
      }
    }        
    else {
      return this.rest.isDoubledHelp(this.first, idx + 1);
    }
  }

  // checks if this list contains words reading the list in either order
  @Override
  public boolean isPalindromeList() {
    /* TEMPLATE: everything in the template for ConsLoString */
    ILoString reversed = this.reverse();
    ILoString interleaved = this.interleave(reversed);
    return interleaved.isDoubledList();
  }  
    
}

// to represent examples for lists of strings
class ExamplesStrings {
    
  ILoString mary = new ConsLoString("Mary ", 
      new ConsLoString("had ",
        new ConsLoString("a ",
          new ConsLoString("little ",
            new ConsLoString("lamb.", new MtLoString())))));
  
  ILoString marySorted = new ConsLoString("a ", 
      new ConsLoString("had ", 
          new ConsLoString("lamb.", 
              new ConsLoString("little ", 
                  new ConsLoString("Mary ", new MtLoString())))));
  
  ILoString mt = new MtLoString();
  ILoString abc = new ConsLoString("a", 
      new ConsLoString("b", 
          new ConsLoString("c", mt)));
  ILoString def = new ConsLoString("d", 
      new ConsLoString("e", 
          new ConsLoString("f", mt)));
  
  ILoString doubled = new ConsLoString("this",
      new ConsLoString("this",
          new ConsLoString("is", 
              new ConsLoString("is", 
                  new ConsLoString("doubled.", 
                      new ConsLoString("doubled.", this.mt))))));
  
  ILoString restDoubled = new ConsLoString("this",
      new ConsLoString("is", 
          new ConsLoString("is", 
              new ConsLoString("doubled.", 
                  new ConsLoString("doubled.", this.mt)))));
  
  ILoString palindrome = new ConsLoString("this",
      new ConsLoString("is", 
          new ConsLoString("a", 
              new ConsLoString("palindrome", 
                  new ConsLoString("a", 
                      new ConsLoString("is", 
                          new ConsLoString("this", this.mt)))))));
  
  // test the method combine for the lists of Strings
  boolean testCombine(Tester t) {
    return t.checkExpect(this.mary.combine(), "Mary had a little lamb.");
  }
  
  boolean testSort(Tester t) {
    return t.checkExpect(this.mary.sort(), this.marySorted)
        && t.checkExpect(this.abc.sort(), this.abc)
        && t.checkExpect(this.mt.sort(), this.mt);
  }
  
  boolean testIsSorted(Tester t) {
    return t.checkExpect(this.mary.isSorted(), false)
        && t.checkExpect(this.marySorted.isSorted(), true)
        && t.checkExpect(this.mt.isSorted(), true);
  }
  
  boolean testIsSortedHelp(Tester t) {
    return t.checkExpect(this.mt.isSortedHelp("word"), true)
        && t.checkExpect(this.mary.isSortedHelp("word"), false)
        && t.checkExpect(this.marySorted.isSortedHelp("a"), true);
  }
  
  boolean testInterleave(Tester t) {
    return t.checkExpect(this.mary.interleave(this.mt), this.mary)
        && t.checkExpect(this.mt.interleave(this.mary), this.mary)
        && t.checkExpect(this.abc.interleave(this.def), 
            new ConsLoString("a", 
                new ConsLoString("d", 
                    new ConsLoString("b", 
                        new ConsLoString("e",
                            new ConsLoString("c",
                                new ConsLoString("f", this.mt)))))))
        && t.checkExpect(this.def.interleave(this.abc), 
            new ConsLoString("d", 
                new ConsLoString("a", 
                    new ConsLoString("e", 
                        new ConsLoString("b",
                            new ConsLoString("f",
                                new ConsLoString("c", this.mt)))))));
  }
  
  boolean testMerge(Tester t) {
    return t.checkExpect(this.mt.merge(mt), mt)
        && t.checkExpect(this.abc.merge(this.def), 
            new ConsLoString("a", 
                new ConsLoString("b", 
                    new ConsLoString("c", 
                        new ConsLoString("d",
                            new ConsLoString("e",
                                new ConsLoString("f", this.mt)))))))
            && t.checkExpect(this.def.merge(this.abc), 
                new ConsLoString("a", 
                    new ConsLoString("b", 
                        new ConsLoString("c", 
                            new ConsLoString("d",
                                new ConsLoString("e",
                                    new ConsLoString("f", this.mt)))))));
  }
  
  boolean testReverse(Tester t) {
    return t.checkExpect(this.mt.reverse(), this.mt)
        && t.checkExpect(this.abc.reverse(),
            new ConsLoString("c", 
                new ConsLoString("b",
                    new ConsLoString("a", this.mt))))
        && t.checkExpect(this.mary.reverse(), 
            new ConsLoString("lamb.", 
                new ConsLoString("little ", 
                    new ConsLoString("a ", 
                        new ConsLoString("had ", 
                            new ConsLoString("Mary ", new MtLoString()))))));
  }
  
  boolean testReverseAcc(Tester t) {
    return t.checkExpect(this.mt.reverseAcc(this.mt, "word"), 
        new ConsLoString("word", this.mt))
        && t.checkExpect(this.mary.reverseAcc(this.mt, "!"), 
            new ConsLoString("lamb.", 
                new ConsLoString("little ", 
                    new ConsLoString("a ", 
                        new ConsLoString("had ", 
                            new ConsLoString("Mary ", 
                                new ConsLoString("!", new MtLoString())))))));
  }
  
  boolean testIsDoubledList(Tester t) {
    return t.checkExpect(this.mt.isDoubledList(), true)
        && t.checkExpect(this.mary.isDoubledList(), false)
        && t.checkExpect(this.doubled.isDoubledList(), true);
  }
  
  boolean testIsDoubledHelp(Tester t) {
    return t.checkExpect(this.mt.isDoubledHelp("word", 0), true)
        && t.checkExpect(this.mt.isDoubledHelp("word", 1), false)
        && t.checkExpect(this.mary.isDoubledHelp("Mary", 0), false)
        && t.checkExpect(this.doubled.isDoubledHelp("this", 0), true)
        && t.checkExpect(this.restDoubled.isDoubledHelp("wrong", 0), false)
        && t.checkExpect(this.restDoubled.isDoubledHelp("this", 50), false);
  }
  
  boolean testIsPalindromeList(Tester t) {
    return t.checkExpect(this.palindrome.isPalindromeList(), true)
        && t.checkExpect(this.mt.isPalindromeList(), true)
        && t.checkExpect(this.mary.isPalindromeList(), false)
        && t.checkExpect(this.abc.isPalindromeList(), false);
  } 
}