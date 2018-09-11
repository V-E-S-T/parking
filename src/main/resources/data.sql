INSERT INTO users (user_id, firstname, lastname, email, password) VALUES
  (1, 'Mark', 'Tven', 'mark@yandex.ru', 'password'),
  (2, 'Santa', 'Klaus', 'santa@gmail.com', 'password'),
  (3, 'Maria', 'Korn', 'maria@gmail.com', 'password'),
  (4, 'Alex', 'Braun', 'alex@gmail.com', 'password'),
  (5, 'Michail', 'Klaus', 'michail@gmail.com', 'password');

INSERT INTO cars (car_id, model, number, user_id) VALUES
  (1, 'LEXUS RX 350', 'OD 2558 AK', 1),
  (2, 'LEXUS LX 300', 'OD 6598 BK', 1),
  (3, 'MERСEDES L200', 'OD 2365 BB', 2),
  (4, 'RENAULT MEGANE', 'OD 5252 AA', 3),
  (5, 'AUDI A100', 'OD 7788 MM', 5),
  (6, 'SUBARU IMPREZA', 'OD 5454 AK', 5),
  (7, 'Nissan Primera', 'OD 3698 TN', 5);