/*insert into books(title, rating, description, publisher_id, genre)
values ('To kill a Mocking bird','4.3','Published in 1960, this timeless classic explores human behaviour and the collective conscience of The Deep South in the early 20th century. Humour entwines the delicate strands of prejudice, hatred, hypocrisy, love and innocence to create one of the best novels ever written.','1','Southern Gothic'),
       ('1984','4.2','Although 1984 has passed us by, George Orwell’s dystopian, totalitarian world of control, fear and lies has never been more relevant. Delve into the life of Winston Smith as he struggles with his developing human nature in a world where individuality, freewill and love are forbidden.','2','Political'),
       ('The Lord of the Rings','4.5','Middle Earth is a wonderful, expansive fantasy world filled with turmoil, heroes, evil and innocence. Although our protagonist Frodo Baggins’ quest seems impossible to complete, this trilogy is a tale of triumph in the most impossible circumstances.','3','Fantasy'),
       ('The Great Gatsby','3.9','Published in 1925, Fitzgerald’s The Great Gatsby explores the decadence of the Jazz Age, and one man’s introduction into a world where even those with the most indulgent lives cannot earn love.','4','Fiction'),
       ('The Book Thief','4.4','Set in Germany during 1939, The Book Thief follows Liesel as she rescues books from the tyranny of Nazi rule. Meanwhile, her family has hidden a Jewish fighter in their basement and death looks down on the family, narrating our tale. Experience bravery that is rarely found in the world, and friendship that is formed in the most unlikely of situations.','5','Historical Fiction');
*/
update books set publisher_id = 1 where book_id = 7;
update books set publisher_id = 2 where book_id = 8;
update books set publisher_id = 3 where book_id = 9;
update books set publisher_id = 4 where book_id = 10;
update books set publisher_id = 5 where book_id = 11;
update books set publisher_id = 6 where book_id = 12;