// To represent a place of interest
interface IPlaceOfInterest {}

// To represent a list of Features
interface ILoFeature {}

//to represent a Feature
interface IFeature {}

// To represent an empty list of Features
class MtLoFeature implements ILoFeature {}

// To represent a List Of Features
class ConsLoFeature implements ILoFeature {
  IFeature first;
  ILoFeature rest;
  
  ConsLoFeature(IFeature first, ILoFeature rest) {
    this.first = first;
    this.rest = rest;
  }
  
}

// to represent a Place
class Place implements IPlaceOfInterest {
  String name;
  ILoFeature features;
  
  Place(String name, ILoFeature features) {
    this.name = name;
    this.features = features;
  }
}

// to represent a Restaurant
class Restaurant implements IFeature {
  String name;
  String type;
  double rating;
  
  Restaurant(String name, String type, double rating) {
    this.name = name;
    this.type = type;
    this.rating = rating;
  }
  
}

// to represent a Venue
class Venue implements IFeature {
  String name;
  String type;
  int maxCapacity;
  
  Venue(String name, String type, int maxCapacity) {
    this.name = name;
    this.type = type;
    this.maxCapacity = maxCapacity;
  }
  
}

// to represent a Shuttle
class Shuttle implements IFeature {
  String name;
  IPlaceOfInterest destination;
  
  Shuttle(String name, IPlaceOfInterest destination) {
    this.name = name;
    this.destination = destination;
  } 
  
}