CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

------------- Organization ---------------------
INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES ('fc71d09d-ca3d-4329-950d-901a6d18aaa7', 7450053485, 'ООО «Тепловые электрические сети и системы»', 55.240051, 61.411240, 'LICENSED',
         'г. Челябинск, ул. Елькина, 88-б', 'SOIL');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7710044140, 'ООО «Макдоналдс»', 55.157428, 61.395098, 'LEGAL_ORGANIZATION',
        'г. Челябинск, ул. Воровского, 6', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7453006123, 'ГБУЗ «Челябинский областной клинический противотуберкулезный диспансер»',
        55.148724, 61.384237, 'LEGAL_ORGANIZATION', 'г. Челябинск, ул. Воровского, 38', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7453000724, 'ООО «Универсальный магазин «Школьник»', 55.157428, 61.395098, 'LEGAL_ORGANIZATION',
        'г. Челябинск, ул. Воровского, 6', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7453003450, 'ОГУП «Челябинская областная станция переливания крови»', 55.138917, 61.373691,
        'LEGAL_ORGANIZATION', 'г. Челябинск, ул. Воровского, 68', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7460033022, 'ООО «Воровского 62»', 55.141629, 61.374877, 'LEGAL_ORGANIZATION', 
        'г. Челябинск, ул. Воровского, дом 62', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES ('1563f163-09b9-41d5-a06e-9111cbc0b14d', 7703406825, 'ООО  «Региональная сеть предприятий питания»', 55.157428, 61.395098,
        'LICENSED', 'г. Челябинск, ул. Воровского, д.6', 'AIR');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7848071039, 'ООО «Альтернативная жилищная компания - М»', 55.141629, 61.374877, 'LEGAL_ORGANIZATION',
        'г. Челябинск, ул. Воровского, дом 62', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES ('915e220e-9677-4146-b110-1bf72b4f4782', 7451194577, 'ОАО «Челябкоммунэнерго»', 55.136915, 61.371930, 'LICENSED',
        'г. Челябинск, ул. Воровского, 70, строение 9', 'AIR');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7451044772, 'МУП «Городской экологический центр»', 55.145725, 61.408473, 'LEGAL_ORGANIZATION',
        'г. Челябинск, ул. Переселенческий пункт, 26', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7447067833, 'ООО «Заречный колхозный рынок»', 55.174702, 61.398053, 'LEGAL_ORGANIZATION', 
        'г. Челябинск, ул. Кирова, 62', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7453148664, 'Управление делами Правительства Челябинской области', 55.166284, 61.398960,
        'LEGAL_ORGANIZATION', 'г. Челябинск, ул. Кирова, 86-б', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES ('6683c5e1-f383-4e6c-88a5-3ddb79d5c5cc', 7701406825, 'ООО  «Региональная сеть предприятий питания»', 55.164176, 61.401044,
        'LICENSED', 'г. Челябинск, ул. Кирова, д.161Б', 'AIR');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES ('05315a2b-d4d8-4788-8895-160ffb395b52', 7453006148, 'ОАО «Челябинский часовой завод «Молния»', 55.164860, 61.405159, 'LICENSED',
        'г. Челябинск, ул. Цвиллинга, 25', 'SOIL');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES ('3c18682e-d8b8-446b-a9c2-a1de6a0cc7bb', 7047118990, 'ООО «Модус»', 55.175493, 61.385872, 'LICENSED',
        'г. Челябинск, Свердловский проспект, 32', 'SOIL');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7453022326, 'МУП Дворец спорта «ЮНОСТЬ»', 55.169020, 61.391253, 'LEGAL_ORGANIZATION', 
        'г. Челябинск, Свердловский проспект, 51', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES ('68c61081-bace-4f06-9a78-dce75aabfcff', 7947153747, 'ООО «Теплоснабжающая организация»', 55.182382, 61.343112, 'LICENSED',
        'г. Челябинск, ул. Ижевская, д. 105', 'AIR');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES ('8cd82abb-4ef3-4694-8278-3e568b06ac50', 7247245282, 'ООО «Грэкс»', 55.184099, 61.297289, 'LICENSED',
        'г. Челябинск, проспект Победы 319', 'SOIL');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES ('fff01741-5248-45de-9979-374cb90a99a2', 7147245282, 'ООО "Уралпротект"', 55.182336, 61.344123, 'POTENTIAL_DANGER', 
        'г. Челябинск, проспект Победы 319', 'SOIL');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7547245282, 'Уральская Химическая Компания', 55.177218, 61.355918, 'LEGAL_ORGANIZATION', 
        'ул. Чайковского, 185, Челябинск, Челябинская обл.', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7540245282, 'Учебный центр олимпийской подготовки по дзюдо', 55.177353, 61.363021, 'LEGAL_ORGANIZATION',
        'ул. Университетская наб., 22В, Челябинск, Челябинская обл., 454016', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7540245182, 'Челябинский государственный университет', 55.177203, 61.319760, 'LEGAL_ORGANIZATION',
        'ул. Братьев Кашириных, 129, Челябинск, Челябинская обл., 454001', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES ('f6dea2ab-728a-430e-9c22-36467105347e', 7540245189, 'Камон в Кардамон', 55.170464, 61.296990, 'POTENTIAL_DANGER',
        'ул. Братьев Кашириных, 140, Челябинск, Челябинская обл., 454003', 'AIR');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7519245182, 'Челябинское областное патологоанатомическое бюро', 55.173749, 61.271789, 'LEGAL_ORGANIZATION',
        'ул. Татищева, 249, Челябинск, Челябинская обл., 454021', null);

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES ('cdc9c4b1-b316-49cf-9ad6-2b36ec3306e9', 7222845282, 'Промышленная группа Метран', 55.175223, 61.266724, 'LICENSED',
        'Новоградский пр-т., 15, Челябинск, Челябинская обл., 454003', 'SOIL');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7222843182, 'ГСК № 11 "Градский"', 55.190746, 61.270644, 'LICENSED',
        'Звенигородская ул., 23, Челябинск, Челябинская обл., 454021', 'SOIL');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES ('0499e276-7134-4545-bf77-c81267e4d0d7', 7992843182, 'Союзпищепром', 55.168166, 61.386507, 'LICENSED',
        'просп. Свердловский, 40а, Челябинск, Челябинская обл., 454000', 'WATER');

INSERT INTO organization(id, inn, name, latitude, longitude, organization_type, address, pollution_type)
VALUES (uuid_generate_v4(), 7519245127, 'Свято-Троицкий храм', 55.174397, 61.399456, 'LEGAL_ORGANIZATION',
        'ул. Кирова, 60а, Челябинск, Челябинская обл., 454084', null);


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
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.169423, 61.298596, 'AIR', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.171237, 61.296676, 'AIR', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.171905, 61.300453, 'AIR', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.171206, 61.295979, 'AIR', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.167109, 61.394174, 'WATER', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.169094, 61.405697, 'WATER', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.169104, 61.406886, 'WATER', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.169340, 61.408166, 'WATER', null);
INSERT INTO mark VALUES (uuid_generate_v4(), '2021-08-09 13:57:40', null, null, 55.169885, 61.408209, 'WATER', null);


------------- Penalty ---------------------
INSERT INTO penalty values (uuid_generate_v4(), '2021-02-20', '18209965432108761234', 'fff01741-5248-45de-9979-374cb90a99a2');
INSERT INTO penalty values (uuid_generate_v4(), '2021-05-21', '13249965432108761234', 'fff01741-5248-45de-9979-374cb90a99a2');
INSERT INTO penalty values (uuid_generate_v4(), '2021-07-13', '19189965432108761234', 'fff01741-5248-45de-9979-374cb90a99a2');
INSERT INTO penalty values (uuid_generate_v4(), '2020-11-12', '18889965432108761234', 'fff01741-5248-45de-9979-374cb90a99a2');
INSERT INTO penalty values (uuid_generate_v4(), '2017-01-10', '11119965432108761234', 'fff01741-5248-45de-9979-374cb90a99a2');


INSERT INTO penalty values (uuid_generate_v4(), '2017-02-01', '16109965432108761234', '68c61081-bace-4f06-9a78-dce75aabfcff');
INSERT INTO penalty values (uuid_generate_v4(), '2015-04-02', '10109965432108761234', '68c61081-bace-4f06-9a78-dce75aabfcff');
INSERT INTO penalty values (uuid_generate_v4(), '2013-12-09', '15019965432108761234', '68c61081-bace-4f06-9a78-dce75aabfcff');


------------- OKVED ---------------------
INSERT INTO okved values ('9e24c953-c7ed-47e3-adb5-640ff3a3e2bf', 'Производство автотранспортных средств, прицепов и полуприцепов · производство автотранспортных средств для перевозки пассажиров или грузов', true, '3', '29');
INSERT INTO okved values ('0fde33f1-2886-43b8-88ac-03dd8050cc5c', 'Производство автотранспортных средств, прицепов и полуприцепов · производство автотранспортных средств для перевозки пассажиров или грузов', true, '3', '32');
INSERT INTO okved values ('c613909d-fa7a-47c3-a6e4-36d572c44fa9', 'Производство прочих ручных инструментов: щипцов, клещей, плоскогубцев, отверток и т.п.', true, '3', '28.62');
INSERT INTO okved values ('ca772352-82d2-489a-83fb-9f6bc4c52f07', 'Аренда и управление собственным или арендованным нежилым недвижимым имуществом', true, '4', '68.20.2');


INSERT INTO organization_okveds values ('fff01741-5248-45de-9979-374cb90a99a2', 'c613909d-fa7a-47c3-a6e4-36d572c44fa9');
INSERT INTO organization_okveds values ('fff01741-5248-45de-9979-374cb90a99a2', '0fde33f1-2886-43b8-88ac-03dd8050cc5c');
INSERT INTO organization_okveds values ('fff01741-5248-45de-9979-374cb90a99a2', 'ca772352-82d2-489a-83fb-9f6bc4c52f07');

INSERT INTO organization_okveds values ('68c61081-bace-4f06-9a78-dce75aabfcff', 'ca772352-82d2-489a-83fb-9f6bc4c52f07');
INSERT INTO organization_okveds values ('0499e276-7134-4545-bf77-c81267e4d0d7', 'ca772352-82d2-489a-83fb-9f6bc4c52f07');
INSERT INTO organization_okveds values ('cdc9c4b1-b316-49cf-9ad6-2b36ec3306e9', 'ca772352-82d2-489a-83fb-9f6bc4c52f07');
INSERT INTO organization_okveds values ('f6dea2ab-728a-430e-9c22-36467105347e', 'ca772352-82d2-489a-83fb-9f6bc4c52f07');
INSERT INTO organization_okveds values ('8cd82abb-4ef3-4694-8278-3e568b06ac50', 'ca772352-82d2-489a-83fb-9f6bc4c52f07');
INSERT INTO organization_okveds values ('3c18682e-d8b8-446b-a9c2-a1de6a0cc7bb', 'ca772352-82d2-489a-83fb-9f6bc4c52f07');
INSERT INTO organization_okveds values ('05315a2b-d4d8-4788-8895-160ffb395b52', 'ca772352-82d2-489a-83fb-9f6bc4c52f07');
INSERT INTO organization_okveds values ('6683c5e1-f383-4e6c-88a5-3ddb79d5c5cc', 'ca772352-82d2-489a-83fb-9f6bc4c52f07');
INSERT INTO organization_okveds values ('915e220e-9677-4146-b110-1bf72b4f4782', 'ca772352-82d2-489a-83fb-9f6bc4c52f07');
INSERT INTO organization_okveds values ('1563f163-09b9-41d5-a06e-9111cbc0b14d', 'ca772352-82d2-489a-83fb-9f6bc4c52f07');
INSERT INTO organization_okveds values ('fc71d09d-ca3d-4329-950d-901a6d18aaa7', 'ca772352-82d2-489a-83fb-9f6bc4c52f07');


