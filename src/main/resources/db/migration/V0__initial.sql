CREATE TABLE courses (
   id BIGINT(20) NOT NULL AUTO_INCREMENT,
   name VARCHAR(254) NOT NULL,
   token MEDIUMTEXT NOT NULL,
   created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);