import tester.*;

interface IGamePiece {
  //To get the value of a GamePiece
  int getValue();
  
  //To merge two GamePieces
  IGamePiece merge(IGamePiece mergePiece);
  
  //To check whether a GamePiece was created according to 2048 rules
  boolean isValid();
}

class BaseTile implements IGamePiece {
  int value;

  BaseTile(int value) {
    this.value = value;
  }
  
  public int getValue() {
    return this.value;
  }

  public IGamePiece merge(IGamePiece mergePiece) {
    return new MergeTile(this, mergePiece);
  }

  public boolean isValid() {
    return true;
  } 
}

class MergeTile implements IGamePiece {
  IGamePiece piece1;
  IGamePiece piece2;
  
  MergeTile(IGamePiece piece1, IGamePiece piece2) {
    this.piece1 = piece1;
    this.piece2 = piece2;
  }
  
  public int getValue() {
    return this.piece1.getValue() + this.piece2.getValue();
  }
  
  public IGamePiece merge(IGamePiece mergePiece) {
    return new MergeTile(this, mergePiece);
  }

  public boolean isValid() {
    return this.piece1.getValue() == this.piece2.getValue() &&
        this.piece1.isValid() &&
        this.piece2.isValid();
  }
}

class ExamplesGamePiece {
  IGamePiece base2 = new BaseTile(2);
  IGamePiece base4 = new BaseTile(4);
  IGamePiece four = new MergeTile(new BaseTile(2), new BaseTile(2));
  boolean testGetValue(Tester t) {
    return t.checkExpect(four.getValue(), 4);
  }
  
  boolean testMerge(Tester t) {
    return t.checkExpect(this.base2.merge(this.base2), this.four);
  }
  
}