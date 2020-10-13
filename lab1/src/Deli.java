interface IMenuItem {}

class Sandwich implements IMenuItem {
  String name;
  int price;
  String bread;
  String filling1;
  String filling2;
  
  Sandwich(String name, int price, String bread, String filling1, String filling2) {
    this.name = name;
    this.price = price;
    this.bread = bread;
    this.filling1 = filling1;
    this.filling2 = filling2;
  }
}

class Soup implements IMenuItem {
  String name;
  int price;
  boolean isVegetarian;
  
  Soup(String name, int price, boolean isVegetarian) {
    this.name = name;
    this.price = price;
    this.isVegetarian = isVegetarian;
  }
}

class Salad implements IMenuItem {
  String name;
  int price;
  boolean isVegetarian;
  String dressing;
  
  Salad(String name, int price, boolean isVegetarian, String dressing) {
    this.name = name;
    this.price = price;
    this.isVegetarian = isVegetarian;
    this.dressing = dressing;
  }
}

class ExamplesDeli {
  ExamplesDeli() {};
  
  IMenuItem sandwich1 = new Sandwich("Ham and Cheese", 500, "Wheat", "ham", "Cheese");
  IMenuItem sandwich2 = new Sandwich("PB&J", 300, "White", "Peanut Butter", "Jelly");
  
  IMenuItem soup1 = new Soup("Tomato", 300, true);
  IMenuItem soup2 = new Soup("Clam Chowder", 500, false);
  
  IMenuItem salad1 = new Salad("House", 400, true, "Italian");
  IMenuItem salad2 = new Salad("Chicken Caesar", 500, false, "Caesar");
}
