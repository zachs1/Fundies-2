//To represent housing in game
interface IHousing {}

//To represent Transportation in game
interface ITransportation {}

//A class to represent a Hut
class Hut implements IHousing {
  int capacity;
  int population;
  
  Hut(int capacity, int population) {
    this.capacity = capacity;
    this.population = population;
  }
}

//A class to represent an Inn
class Inn implements IHousing {
  String name;
  int capacity;
  int population;
  int stalls;
  
  Inn(String name, int capacity, int population, int stalls) {
    this.name = name;
    this.capacity = capacity;
    this.population = population;
    this.stalls = stalls;
  }
}

//A class to represent a Castle
class Castle implements IHousing {
  String name;
  String familyName;
  int population;
  int carriageHouse;
  
  Castle(String name, String familyName, int population, int carriageHouse) {
    this.name = name;
    this.familyName = familyName;
    this.population = population;
    this.carriageHouse = carriageHouse;
  }
}

//A class to represent a Horse
class Horse implements ITransportation {
  IHousing from;
  IHousing to;
  String name;
  String color;
  
  Horse(IHousing from, IHousing to, String name, String color) {
    this.from = from;
    this.to = to;
    this.name = name;
    this.color = color;
  }
}

//A class to represent a Carriage
class Carriage implements ITransportation {
  IHousing from;
  IHousing to;
  int tonnage;
  
  Carriage(IHousing from, IHousing to, int tonnage) {
    this.from = from;
    this.to = to;
    this.tonnage = tonnage;
  }
}

class ExamplesTravel {
  IHousing hovel = new Hut(5, 1);
  IHousing winterfell = new Castle("Winterfell", "Stark", 500, 6);
  IHousing crossroads = new Inn("Inn At The Crossroads", 40, 20, 12);
  IHousing castleBlack = new Castle("Castle Black", "The Night's Watch", 200, 4);
  IHousing inn2 = new Inn("Bearfist's Inn", 50, 20, 10);
  IHousing hut2 = new Hut(6, 2);
  
  ITransportation horse1 = new Horse(hovel, winterfell, "Tony", "Black");
  ITransportation horse2 = new Horse(hut2, castleBlack, "Princess", "Brown");
  
  ITransportation carriage1 = new Carriage(crossroads, winterfell, 5);
  ITransportation carriage2 = new Carriage(winterfell, crossroads, 6);
}