ALTER DATABASE `OOMPA_LOOMPA_DB` CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;

USE OOMPA_LOOMPA_DB;

CREATE TABLE IF NOT EXISTS `T_OOMPA_LOOMPA` (
   `ID` BIGINT NOT NULL AUTO_INCREMENT,
   NAME VARCHAR(100) NOT NULL,
   AGE SMALLINT NOT NULL,
   JOB VARCHAR(100) NOT NULL,
   HEIGHT FLOAT (10,2) NOT NULL,
   WEIGHT FLOAT (10,2) NOT NULL,
   DESCRIPTION VARCHAR(100) NULL,
   CREATED_AT DATETIME NOT NULL,
   UPDATED_AT DATETIME NULL,
   PRIMARY KEY (`ID`)
) ENGINE=INNODB  DEFAULT CHARSET=UTF8MB4;

CREATE INDEX IDX_T_OOMPA_LOOMPA ON `T_OOMPA_LOOMPA` (NAME, JOB, AGE);

