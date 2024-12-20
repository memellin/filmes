INSERT INTO tb_movie_list (title) VALUES ('Drama');
INSERT INTO tb_movie_list (title) VALUES ('Sci-fi');
INSERT INTO tb_movie (title, movie_year, film_maker, genre, img_url, short_description, long_description)
VALUES (
           'The Godfather',
           1972,
           'Francis Ford Coppola',
           'Crime, Drama',
           'https://example.com/godfather.png',
           'A saga da família Corleone, mostrando os desafios e o poder do patriarca Don Vito Corleone.',
           'Um épico sobre lealdade, poder e traição dentro da máfia ítalo-americana, que explora relações familiares e o impacto das escolhas'
       );
INSERT INTO tb_movie (title, movie_year, film_maker, genre, img_url, short_description, long_description)
VALUES (
           'The Shawshank Redemption',
           1994,
           'Frank Darabont',
           'Drama',
           'https://example.com/shawshank.png',
           'A história de um homem condenado à prisão perpétua que encontra esperança e amizade na penitenciária.',
           'Um conto inspirador de resiliência e superação, mostrando como a esperança pode libertar a alma, mesmo nos lugares mais sombrios.'
       );

INSERT INTO tb_movie (title, movie_year, film_maker, genre, img_url, short_description, long_description)
VALUES (
           'Inception',
           2010,
           'Christopher Nolan',
           'Sci-Fi, Thriller',
           'https://example.com/inception.png',
           'Um ladrão que invade sonhos para roubar segredos corporativos recebe a missão de implantar uma ideia em vez de extraí-la.',
           'Uma jornada alucinante pelos mistérios da mente humana, onde sonhos e realidade se entrelaçam em camadas complexas.'
       );

INSERT INTO tb_movie (title, movie_year, film_maker, genre, img_url, short_description, long_description)
VALUES (
           'The Dark Knight',
           2008,
           'Christopher Nolan',
           'Action, Crime, Drama',
           'https://example.com/darkknight.png',
           'Batman enfrenta o caótico Coringa, que ameaça destruir Gotham City.',
           'Uma batalha psicológica e física entre o Cavaleiro das Trevas e um inimigo implacável que desafia sua moralidade e propósito.'
       );

INSERT INTO tb_movie (title, movie_year, film_maker, genre, img_url, short_description, long_description)
VALUES (
           'Pulp Fiction',
           1994,
           'Quentin Tarantino',
           'Crime, Drama',
           'https://example.com/pulpfiction.png',
           'Histórias interligadas de crime, redenção e reviravoltas inesperadas em Los Angeles.',
           'Uma obra-prima irreverente, cheia de diálogos marcantes, personagens excêntricos e uma narrativa não linear.'
       );

INSERT INTO tb_movie (title, movie_year, film_maker, genre, img_url, short_description, long_description)
VALUES (
    'Schindlers List',
    1993,
    'Steven Spielberg',
    'Biography, Drama, History',
    'https://example.com/schindler.png',
    'A história de Oskar Schindler, que salvou centenas de judeus durante o Holocausto.',
           'Uma poderosa narrativa sobre coragem, humanidade e os horrores da guerra, baseada em fatos reais.'
       );

INSERT INTO tb_movie (title, movie_year, film_maker, genre, img_url, short_description, long_description)
VALUES (
           'Forrest Gump',
           1994,
           'Robert Zemeckis',
           'Drama, Romance',
           'https://example.com/forrestgump.png',
           'A vida extraordinária de um homem simples que vive eventos históricos icônicos.',
           'Uma jornada emocional e encantadora sobre amor, perda e a simplicidade da vida contada através de olhos inocentes.'
       );

INSERT INTO tb_movie (title, movie_year, film_maker, genre, img_url, short_description, long_description)
VALUES (
           'Fight Club',
           1999,
           'David Fincher',
           'Drama',
           'https://example.com/fightclub.png',
           'Um insatisfeito com sua vida corporativa se envolve em um clube de luta underground.',
           'Um mergulho na psique humana, explorando temas de identidade, consumismo e rebelião contra a conformidade.'
       );

INSERT INTO tb_movie (title, movie_year, film_maker, genre, img_url, short_description, long_description)
VALUES (
           'The Matrix',
           1999,
           'Lana Wachowski, Lilly Wachowski',
           'Action, Sci-Fi',
           'https://example.com/matrix.png',
           'Um programador descobre que sua realidade é uma simulação e lidera uma rebelião contra seus opressores.',
           'Um marco na ficção científica que combina filosofia, ação espetacular e efeitos visuais revolucionários.'
       );

INSERT INTO tb_movie (title, movie_year, film_maker, genre, img_url, short_description, long_description)
VALUES (
           'Gladiator',
           2000,
           'Ridley Scott',
           'Action, Adventure, Drama',
           'https://example.com/gladiator.png',
           'Um general romano traído busca vingança contra o imperador corrupto que destruiu sua família.',
           'Uma épica história de honra, vingança e coragem ambientada na arena de gladiadores da Roma antiga.'
       );

-- Lista 1
INSERT INTO tb_belonging (list_id, movie_id, position) VALUES (1, 1, 0);
INSERT INTO tb_belonging (list_id, movie_id, position) VALUES (1, 2, 1);
INSERT INTO tb_belonging (list_id, movie_id, position) VALUES (1, 3, 2);
INSERT INTO tb_belonging (list_id, movie_id, position) VALUES (1, 4, 3);
INSERT INTO tb_belonging (list_id, movie_id, position) VALUES (1, 5, 4);

-- Lista 2
INSERT INTO tb_belonging (list_id, movie_id, position) VALUES (2, 6, 0);
INSERT INTO tb_belonging (list_id, movie_id, position) VALUES (2, 7, 1);
INSERT INTO tb_belonging (list_id, movie_id, position) VALUES (2, 8, 2);
INSERT INTO tb_belonging (list_id, movie_id, position) VALUES (2, 9, 3);
INSERT INTO tb_belonging (list_id, movie_id, position) VALUES (2, 10, 4);
