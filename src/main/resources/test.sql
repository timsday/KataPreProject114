-- Создание таблицы для User(ов) – не должно приводить к исключению, если такая таблица уже существует
--CREATE TABLE IF NOT EXISTS users (
--  id bigint NOT NULL AUTO_INCREMENT,
--  name varchar(80) NOT NULL,
--  lastName varchar(80) NOT NULL,
--  age tinyint NOT NULL,
--  PRIMARY KEY (id),
--  UNIQUE KEY id_UNIQUE (id)
--) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Удаление таблицы User(ов) – не должно приводить к исключению, если таблицы не существует
--DROP TABLE users;
---- Очистка содержания таблицы
--TRUNCATE users;
---- Добавление User в таблицу
--INSERT INTO users VALUES (id, 'Timur', 'Dyakov', 29);
INSERT INTO users (name, `lastName`, age) values ('a', 'b', '1');
---- Удаление User из таблицы ( по id )
--DELETE * FROM users WHERE ID = ;
---- Получение всех User(ов) из таблицы
SELECT * FROM users;