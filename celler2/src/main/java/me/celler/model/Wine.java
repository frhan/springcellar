package me.celler.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Getter @Setter @NoArgsConstructor
public class Wine {

  @Id
  private String id;

  @NonNull
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
    this.name = wine.name;
    this.image = wine.image;
    this.description = wine.description;
    this.price = wine.price;
    this.grapes = wine.grapes;
    this.country = wine.country;
    this.region = wine.region;
    this.year = wine.year;
    return this;
  }
}
