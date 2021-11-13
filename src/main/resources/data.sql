CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
------------- Organization ---------------------
INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (0, 7450053485, 'ООО «Тепловые электрические сети и системы»', 55.240051, 61.411240, 'LICENSED',
         true, 'г. Челябинск, ул. Елькина, 88-б', 'SOIL');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (2, 7710044140, 'ООО «Макдоналдс»', 55.157428, 61.395098, 'LEGAL_ORGANIZATION', false,
        'г. Челябинск, ул. Воровского, 6', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (3, 7453006123, 'ГБУЗ «Челябинский областной клинический противотуберкулезный диспансер»',
        55.148724, 61.384237, 'LEGAL_ORGANIZATION', false, 'г. Челябинск, ул. Воровского, 38', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (4, 7453000724, 'ООО «Универсальный магазин «Школьник»', 55.157428, 61.395098, 'LEGAL_ORGANIZATION',
        false, 'г. Челябинск, ул. Воровского, 6', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (5, 7453003450, 'ОГУП «Челябинская областная станция переливания крови»', 55.138917, 61.373691,
        'LEGAL_ORGANIZATION', false, 'г. Челябинск, ул. Воровского, 68', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (6, 7460033022, 'ООО «Воровского 62»', 55.141629, 61.374877, 'LEGAL_ORGANIZATION', false,
        'г. Челябинск, ул. Воровского, дом 62', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (7, 7703406825, 'ООО  «Региональная сеть предприятий питания»', 55.157428, 61.395098,
        'LICENSED', true, 'г. Челябинск, ул. Воровского, д.6', 'AIR');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (8, 7448071039, 'ООО «Альтернативная жилищная компания - М»', 55.141629, 61.374877, 'LEGAL_ORGANIZATION',
        false, 'г. Челябинск, ул. Воровского, дом 62', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (9, 7451194577, 'ОАО «Челябкоммунэнерго»', 55.136915, 61.371930, 'LICENSED', true,
        'г. Челябинск, ул. Воровского, 70, строение 9', 'AIR');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (10, 7451044772, 'МУП «Городской экологический центр»', 55.145725, 61.408473, 'LEGAL_ORGANIZATION',
        false, 'г. Челябинск, ул. Переселенческий пункт, 26', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (11, 7447067833, 'ООО «Заречный колхозный рынок»', 55.174702, 61.398053, 'LEGAL_ORGANIZATION', false,
        'г. Челябинск, ул. Кирова, 62', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (12, 7453148664, 'Управление делами Правительства Челябинской области', 55.166284, 61.398960,
        'LEGAL_ORGANIZATION', false, 'г. Челябинск, ул. Кирова, 86-б', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (13, 7703406825, 'ООО  «Региональная сеть предприятий питания»', 55.164176, 61.401044,
        'LICENSED', true, 'г. Челябинск, ул. Кирова, д.161Б', 'AIR');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (14, 7453006148, 'ОАО «Челябинский часовой завод «Молния»', 55.164860, 61.405159, 'LICENSED',
        true, 'г. Челябинск, ул. Цвиллинга, 25', 'SOIL');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (15, 7447118990, 'ООО «Модус»', 55.175493, 61.385872, 'LICENSED', true,
        'г. Челябинск, Свердловский проспект, 32', 'SOIL');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (16, 7453022326, 'МУП Дворец спорта «ЮНОСТЬ»', 55.169020, 61.391253, 'LEGAL_ORGANIZATION', false,
        'г. Челябинск, Свердловский проспект, 51', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (17, 7447153747, 'ООО «Теплоснабжающая организация»', 55.182382, 61.343112, 'LICENSED',
        true, 'г. Челябинск, ул. Ижевская, д. 105', 'AIR');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (18, 7447245282, 'ООО «Грэкс»', 55.184099, 61.297289, 'LICENSED', false,
        'г. Челябинск, проспект Победы 319', 'SOIL');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (19, 7447245282, 'ООО "Уралпротект"', 55.182336, 61.344123, 'POTENTIAL_DANGER', true,
        'г. Челябинск, проспект Победы 319', 'SOIL');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, is_okved_danger,
                         address, pollution_type)
VALUES (20, 7447245282, 'Уральская Химическая Компания', 55.177218, 61.355918, 'LEGAL_ORGANIZATION', false,
        'ул. Чайковского, 185, Челябинск, Челябинская обл.', null);


------------- Mark ---------------------
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.182465, 61.341370, 'WATER', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.182128, 61.340931, 'AIR', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.182048, 61.338378, 'SOIL', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.181368, 61.339215, 'SOIL', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.179628, 61.344139, 'SOIL', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.180682, 61.348860, 'AIR', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.174052, 61.349200, 'WATER', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.189601, 61.312599, 'AIR', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.180674, 61.320359, 'AIR', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.168693, 61.440923, 'SOIL', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.168472, 61.440826, 'SOIL', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.168472, 61.441974, 'SOIL', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.168362, 61.437060, 'SOIL', null);


------------- Penalty ---------------------
INSERT INTO penalty values (uuid_generate_v4(), '2021-02-20', '18209965432108761234', 19);
INSERT INTO penalty values (uuid_generate_v4(), '2021-05-21', '13249965432108761234', 19);
INSERT INTO penalty values (uuid_generate_v4(), '2021-07-13', '19189965432108761234', 19);
INSERT INTO penalty values (uuid_generate_v4(), '2020-11-12', '18889965432108761234', 19);
INSERT INTO penalty values (uuid_generate_v4(), '2017-01-10', '11119965432108761234', 19);


INSERT INTO penalty values (uuid_generate_v4(), '2017-02-01', '16109965432108761234', 17);
INSERT INTO penalty values (uuid_generate_v4(), '2015-04-02', '10109965432108761234', 17);
INSERT INTO penalty values (uuid_generate_v4(), '2013-12-09', '15019965432108761234', 17);
