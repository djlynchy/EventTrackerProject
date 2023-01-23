-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema reloadDB
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `reloadDB` ;

-- -----------------------------------------------------
-- Schema reloadDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `reloadDB` DEFAULT CHARACTER SET utf8 ;
USE `reloadDB` ;

-- -----------------------------------------------------
-- Table `pistol`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pistol` ;

CREATE TABLE IF NOT EXISTS `pistol` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `caliber` VARCHAR(45) NULL,
  `bullet(weight` INT NULL,
  `powder(brand)` VARCHAR(45) NULL,
  `powder(weight)` INT NULL,
  `favorite load` TINYINT(1) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `rifle`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `rifle` ;

CREATE TABLE IF NOT EXISTS `rifle` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `caliber` VARCHAR(45) NULL,
  `bullet(weight` INT NULL,
  `powder(brand)` VARCHAR(45) NULL,
  `powder(weight)` INT NULL,
  `favorite load` TINYINT(1) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `shotgun`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `shotgun` ;

CREATE TABLE IF NOT EXISTS `shotgun` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `caliber` VARCHAR(45) NULL,
  `bullet(weight` INT NULL,
  `powder(brand)` VARCHAR(45) NULL,
  `powder(weight)` INT NULL,
  `favorite load` TINYINT(1) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `reload`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `reload` ;

CREATE TABLE IF NOT EXISTS `reload` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `caliber` VARCHAR(45) NULL,
  `bullet(weight)` INT NULL,
  `powder(brand)` VARCHAR(45) NULL,
  `powder(weight)` INT NULL,
  `favorite load` TINYINT(1) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS reloader@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'reloader'@'localhost' IDENTIFIED BY 'reloader';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'reloader'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
