package com.example;

import java.util.Random;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Car extends Rectangle {
  String name;
  Random ran = new Random();
  Text text = new Text();
  public Car(String name, Color color, int y) {
    this.name = name;
    this.text.setText(name);
    
    this.setFill(color);
    this.setY(y);
    this.setX(20);
    this.setHeight(30);
    this.setWidth(50);
  }
  public void move() {
    double x = this.getX() + ran.nextInt(18);
    this.setX(x);
  }
}
