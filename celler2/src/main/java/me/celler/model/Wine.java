package me.celler.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Getter @Setter @NoArgsConstructor
public class Wine {

  @Id
  private String id;

  private String name;
  private String image;
  private String description;
  private int price;
  private String grapes;
  private String country;
  private String region;
  private int year;

  public Wine(String name, String image, String description,
              int price, String grapes,
              String country, String region, int year) {
    this.name = name;
    this.image = image;
    this.description = description;
    this.price = price;
    this.grapes = grapes;
    this.country = country;
    this.region = region;
    this.year = year;
  }

  public Wine getUpdatedWine(final Wine wine){
    this.country = wine.country;
    this.name = wine.name;
    return this;
  }
}
