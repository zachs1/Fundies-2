//To represent a Taco
interface ITaco {}

//A class to represent a Filled Taco
class Filled implements ITaco {
  ITaco taco;
  String filling;
  
  Filled(ITaco taco, String filling) {
    this.taco = taco;
    this.filling = filling;
  }
}

//A class to represent an Empty Shell
class EmptyShell implements ITaco {
  boolean softShell;
  
  EmptyShell(boolean softShell) {
    this.softShell = softShell;
  }
}

class ExamplesTaco {
  ITaco t1 = new Filled(new EmptyShell(true), "cheddar cheese");
  ITaco t2 = new Filled(t1, "lettuce");
  ITaco t3 = new Filled(t2, "salsa");
  ITaco t4 = new Filled(new EmptyShell(false), "sour cream");
  ITaco t5 = new Filled(t4, "guacamole");
  
  ITaco order1 = new Filled(t3, "carnitas");
  ITaco order2 = new Filled(t5, "veggies");
}