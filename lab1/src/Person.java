import tester.*;

class Person {
  String name;
  String gender;
  int age;
  Address address;
  
  Person(String name, int age, String gender, Address address) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.address = address;
  }
}

class Address {
  String city;
  String state;
  
  Address(String city, String state) {
    this.city = city;
    this.state = state;
  }
}

class ExamplesPerson {
  ExamplesPerson() {};
  
  Address a1 = new Address("Boston", "MA");
  Address a2 = new Address("Warwick", "RI");
  Address a3 = new Address("Nashua", "NH");
  
  Person p1 = new Person("Tim", 23, "Male", a1);
  Person p2 = new Person("Kate", 22, "Female", a2);
  Person p3 = new Person("Rebecca", 31, "Non-binary", a3);
      
}