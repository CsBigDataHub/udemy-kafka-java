DROP TABLE IF EXISTS greeting;
DROP TABLE IF EXISTS language_type;

-- CREATE TABLE IF NOT EXISTS greeting (


CREATE TABLE language_type (
  id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  type VARCHAR(255) UNIQUE NOT NULL,
  description TEXT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE greeting (
  id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  language VARCHAR(255) UNIQUE NOT NULL,
  translation VARCHAR(255) NOT NULL,
  description TEXT,
  language_type_id BIGINT(20) NOT NULL,
  FOREIGN KEY (language_type_id) REFERENCES language_type (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
