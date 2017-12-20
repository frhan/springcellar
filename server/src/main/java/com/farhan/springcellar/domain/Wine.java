package com.farhan.springcellar.domain;

import org.springframework.data.annotation.Id;

public class Wine {

  @Id
  public String id;

  private String name;
  private String grapes;

  public Wine() {}

  public Wine(String name, String grapes) {
    this.name = name;
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
