
CREATE TABLE "wine"(
  "id" bigint NOT NULL AUTO_INCREMENT,
  "name" VARCHAR(255) NOT NULL ,
  "year" VARCHAR(4),
  "grapes" VARCHAR(100),
  "country" VARCHAR(100),
  "region" VARCHAR(100),
  "description" longtext,
  "picture" VARCHAR(100),
  PRIMARY KEY ("id")
)

