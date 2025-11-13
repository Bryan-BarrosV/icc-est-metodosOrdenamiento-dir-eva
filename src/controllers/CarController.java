package controllers;

import models.Car;

public class CarController {
  public void sortByName(Car[] cars){
    for (int i = 0; i < cars.length-1; i++) {
      int minIndex = i;
      for (int j = i+1; j < cars.length; j++) {
        if (cars[j].getName().compareTo(cars[minIndex].getName())<0) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        Car temp = cars[i];
        cars[i] = cars[minIndex];
        cars[minIndex]= temp;
      }
    }
  }
}
