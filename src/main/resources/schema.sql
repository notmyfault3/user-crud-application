CREATE DATABASE IF NOT EXISTS `user_management`;

USE `user_management`;

CREATE TABLE IF NOT EXISTS `user` (
	`id` INT NOT NULL PRIMARY KEY auto_increment,
    `first_name` VARCHAR(50) NOT NULL,
    `last_name` VARCHAR(50) NOT NULL,
    `email` VARCHAR(50) NOT NULL
);