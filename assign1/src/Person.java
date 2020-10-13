//A class to represent a person
class Person {
  String name;
  int yob;
  String state;
  boolean citizen;
  
  Person(String name, int yob, String state, boolean citizen) {
    this.name = name;
    this.yob = yob;
    this.state = state;
    this.citizen = citizen;
  }
  /* fields: 
   *  this.name ... String
   *  this.yob ... int
   *  this.state ... String
   *  this.citizen ... boolean
   * methods:
   * methods for fields:
   */
}

class ExamplesPerson {
  Person jackie = new Person("Jackie Robinson", 1920, "NY", true);
  Person ella = new Person("Ella Yelich-O'Connor", 1996, "CA", false);
  Person p3 = new Person("Zachary Stern", 1997, "MA", true);
}