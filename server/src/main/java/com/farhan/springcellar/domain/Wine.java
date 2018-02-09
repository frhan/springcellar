package com.farhan.springcellar.domain;

import org.springframework.data.annotation.Id;

public class Wine {

  @Id
  public String id;

  private String name;
  private String image;
  private String description;
  private int price;
  private String grapes;

  public Wine(){}

  public Wine(String name, String image, String description, int price, String grapes) {
    this.name = name;
    this.image = image;
    this.description = description;
    this.price = price;
    this.grapes = grapes;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGrapes() {
    return grapes;
  }

  public void setGrapes(String grapes) {
    this.grapes = grapes;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getId() {
    return id;
  }

  @Override
  public String toString() {
    return String.format(
            "Wine[id=%s, name='%s', grapes='%s']",
            id, name, grapes);
  }


}
