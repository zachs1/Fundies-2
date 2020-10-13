import tester.Tester;

//to represent a list of strings
interface ILoString {
  //concatenates the strings in this list in reverse order
  String reverseConcat();
  // helps concatenate the strings in this list in reverse order
  // accumulator: the reversed concatenated string so far
  String reverseConcatAcc(String acc);
}

//a class to represent a non-empty list of strings
class ConsLoString implements ILoString {
  String first;
  ILoString rest;

  ConsLoString(String first, ILoString rest) {
    this.first = first;
    this.rest = rest;
  }
  
  /* fields: 
   *  this.first ... String
   *  this.rest ...  ILoString
   * methods:
   *  this.reverseConcat() ... String
   *  this.reverseConcatAcc(String) ... String
   * methods for fields: 
   *  this.rest.reverseConcat() ... String
   *  this.rest.reverseConcatAcc(String) ... String
   * 
   */

  //produce the reversed concatenated string from this list
  public String reverseConcat() {
    return this.reverseConcatAcc("");
  }

  // helps concatenate the strings in this non-empty list in reverse order
  // accumulator: the reversed concatenated string so far
  public String reverseConcatAcc(String acc) {
    return this.rest.reverseConcatAcc(this.first + " " + acc); 
  } 
}

//a class to represent an empty list of strings
class MtLoString implements ILoString {
  MtLoString() { }

  @Override
  public String reverseConcat() {
    return "";
  }

  // helps concatenate the strings in this empty list in reverse order
  // accumulator: keeps track of the reversed concatenated string so far
  public String reverseConcatAcc(String acc) {
    return acc;
  }


}
interface IDraw {
  ILoString wonAgainst();
  ILoString wonAgainstAcc(ILoString acc, String winner);
  boolean isWinner(String name);
}

class SeedPlayer implements IDraw {
  String name;

  SeedPlayer(String name) {
    this.name = name;
  }

  @Override
  public ILoString wonAgainst() {
    return new MtLoString();
  }

  @Override
  public ILoString wonAgainstAcc(ILoString acc, String winner) {
    if (this.name == winner) {
      return acc;
    }
    else {
      return new ConsLoString(this.name, acc);
    }
  }

  @Override
  public boolean isWinner(String name) {
    return false;
  }
}

class PlayResult implements IDraw {
  String winner;
  IDraw one;
  IDraw two;
  
  PlayResult(String winner, IDraw one, IDraw two) {
    this.winner = winner;
    this.one = one;
    this.two = two;
  }

  @Override
  public ILoString wonAgainst() {
    return this.wonAgainstAcc(new MtLoString(), this.winner);
  }

  @Override
  public ILoString wonAgainstAcc(ILoString acc, String winner) {
    if (this.one.isWinner(this.winner)) {
      return this.one.wonAgainstAcc(this.two.wonAgainstAcc(acc, winner),  winner);
    }
    else {
      return this.two.wonAgainstAcc(this.one.wonAgainstAcc(acc, winner), winner);
    }  
  }

  @Override
  public boolean isWinner(String name) {
    return this.winner == name;
  }
  
  
}

class ExamplesDraw {
  IDraw djokovic = new SeedPlayer("Djokovic");
  IDraw goffin = new SeedPlayer("Goffin");
  IDraw pella = new SeedPlayer("Pella");
  IDraw agut = new SeedPlayer("Agut");
   
  IDraw semiFinal1 = new PlayResult("Djokovic",djokovic,goffin);
  IDraw semiFinal2 = new PlayResult("Agut",agut,pella);
   
  IDraw final1 = new PlayResult("Djokovic",semiFinal1,semiFinal2);
  // IDraw final2 = new PlayResult("Federer",semiFinal4,semiFinal3);
   
  // IDraw winner = new PlayResult("Djokovic",final1,final2);
  
  boolean testWonAgainst(Tester t) {
    return t.checkExpect(semiFinal2.wonAgainst(), 
        new ConsLoString("Pella", new MtLoString()));
  }
}