-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema reloaddb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `reloaddb` ;

-- -----------------------------------------------------
-- Schema reloaddb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `reloaddb` DEFAULT CHARACTER SET utf8 ;
USE `reloaddb` ;

-- -----------------------------------------------------
-- Table `reload`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `reload` ;

CREATE TABLE IF NOT EXISTS `reload` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `caliber` VARCHAR(45) NULL,
  `bullet_brand` VARCHAR(45) NULL,
  `bullet_type` VARCHAR(45) NULL,
  `bullet_weight` INT NULL,
  `powder_brand` VARCHAR(45) NULL,
  `powder_type` VARCHAR(45) NULL,
  `powder_weight` INT NULL,
  `primer_brand` VARCHAR(45) NULL,
  `primer_type` VARCHAR(45) NULL,
  `favorite_load` TINYINT(1) NULL,
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

-- -----------------------------------------------------
-- Data for table `reload`
-- -----------------------------------------------------
START TRANSACTION;
USE `reloaddb`;
INSERT INTO `reload` (`id`, `caliber`, `bullet_brand`, `bullet_type`, `bullet_weight`, `powder_brand`, `powder_type`, `powder_weight`, `primer_brand`, `primer_type`, `favorite_load`) VALUES (1, '9mm', 'RMR', 'FMJ', 124, 'Hodgdon', NULL, 6.6, 'CCI', '500', 0);
INSERT INTO `reload` (`id`, `caliber`, `bullet_brand`, `bullet_type`, `bullet_weight`, `powder_brand`, `powder_type`, `powder_weight`, `primer_brand`, `primer_type`, `favorite_load`) VALUES (2, '9mm', 'Hornaday', 'JHP', 100, 'Hodgdon', NULL, 6.0, 'CCI', '500', 0);
INSERT INTO `reload` (`id`, `caliber`, `bullet_brand`, `bullet_type`, `bullet_weight`, `powder_brand`, `powder_type`, `powder_weight`, `primer_brand`, `primer_type`, `favorite_load`) VALUES (3, '5.56', 'Hornaday', 'FMJ', 62, 'Hodgdon', NULL, 25.2, 'Federal', '205', 0);
INSERT INTO `reload` (`id`, `caliber`, `bullet_brand`, `bullet_type`, `bullet_weight`, `powder_brand`, `powder_type`, `powder_weight`, `primer_brand`, `primer_type`, `favorite_load`) VALUES (4, '5.56', 'Barnes', 'JHP', 55, 'IMR', NULL, 24.6, 'Federal', '205', 0);
INSERT INTO `reload` (`id`, `caliber`, `bullet_brand`, `bullet_type`, `bullet_weight`, `powder_brand`, `powder_type`, `powder_weight`, `primer_brand`, `primer_type`, `favorite_load`) VALUES (5, '.45', 'Barnes', 'FMJ', 185, 'Alliant Powder', NULL, 8.5, 'Federal', '105', 0);
INSERT INTO `reload` (`id`, `caliber`, `bullet_brand`, `bullet_type`, `bullet_weight`, `powder_brand`, `powder_type`, `powder_weight`, `primer_brand`, `primer_type`, `favorite_load`) VALUES (6, '.458 Socom', 'Hornaday', 'FTX', 325, 'IMR ', NULL, 33.2, 'CCI', '200', 0);

COMMIT;

