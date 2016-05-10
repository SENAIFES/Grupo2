create database dbtodolist;
use dbtodolist;

CREATE TABLE `dbtodolist`.`lista` (
  `idLista` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idLista`));


CREATE TABLE `dbtodolist`.`tarefa` (
  `idTarefa` INT NOT NULL AUTO_INCREMENT,
  `Descricao` VARCHAR(45) NOT NULL,
  `Prazo` DATE NOT NULL,
  `Feito` TINYINT NOT NULL,
  `idlista` INT NOT NULL,
  PRIMARY KEY (`idTarefa`),
  INDEX `FK_idlista_idx` (`idlista` ASC),
  CONSTRAINT `FK_idlista`
    FOREIGN KEY (`idlista`)
    REFERENCES `dbtodolist`.`lista` (`idLista`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION);
