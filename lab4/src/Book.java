interface IBook {
  int daysOverdue(int today);
  boolean isOverdue(int today);
  double computeFine(int today);
}

abstract class ABook implements IBook {
  String title;
  int dayTaken;
  
  ABook(String title, int dayTaken) {
    this.title = title;
    this.dayTaken = dayTaken;
  }
 
  public  int daysOverdue(int today) {
    return today - this.dayTaken - 14;
  };
  
  public boolean isOverdue(int today) {
    return this.daysOverdue(today) > 0;
  }
  
  public  double computeFine(int today) {
    int daysOverdue = this.daysOverdue(today);
    if (daysOverdue > 0) {
      return daysOverdue * 0.2;
    }
    else {
      return 0;
    }
  };
}

class Book extends ABook {
  String author;
  int dayTaken;
  
  Book(String title, String author, int dayTaken) {
    super(title, dayTaken);
    this.author = author;
  }
  
}

class RefBook extends ABook {

  RefBook(String title, int dayTaken) {
    super(title, dayTaken);
  }

  @Override
  public int daysOverdue(int today) {
    return today - this.dayTaken - 2;

  }

  @Override
  public double computeFine(int today) {
    int daysOverdue = this.daysOverdue(today);
    if (daysOverdue > 0) {
      return daysOverdue * 0.1;
    }
    else {
      return 0;
    }
  }
  
}

class AudioBook extends ABook {
  String author;
  int dayTaken;
  
  AudioBook(String title, String author, int dayTaken) {
    super(title, dayTaken);
    this.author = author;
  }

  
}