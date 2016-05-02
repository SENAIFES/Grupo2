
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema dbtodolist
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dbtodolist` DEFAULT CHARACTER SET latin1 ;
USE `dbtodolist` ;

-- -----------------------------------------------------
-- Table `dbtodolist`.`lista`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbtodolist`.`lista` (
  `idlista` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idlista`),
  UNIQUE INDEX `idlista_UNIQUE` (`idlista` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `dbtodolist`.`tarefa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbtodolist`.`tarefa` (
  `idtarefa` INT(11) NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  `dtexecucao` DATE NULL DEFAULT NULL,
  `dtexecutada` TINYINT(1) NULL DEFAULT NULL,
  `fk_idlista` INT(11) NOT NULL,
  PRIMARY KEY (`idtarefa`),
  UNIQUE INDEX `idtarefa_UNIQUE` (`idtarefa` ASC),
  INDEX `fk_lista_idx` (`fk_idlista` ASC),
  CONSTRAINT `fk_lista`
    FOREIGN KEY (`fk_idlista`)
    REFERENCES `dbtodolist`.`lista` (`idlista`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

select * from tarefa;
select * from lista;

