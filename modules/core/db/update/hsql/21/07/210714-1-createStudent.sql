create table SELCOMMITTEE_STUDENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DOCUMENT_CARD_PASSPORT integer not null,
    DOCUMENT_CARD_PIPN integer not null,
    DOCUMENT_CARD_INDIVIDUAL_TAXPAYER_NUM integer not null,
    --
    NAME varchar(255) not null,
    SURNAME varchar(255) not null,
    PATRONYMIC varchar(255),
    SEX varchar(50) not null,
    DATE_OF_BIRTH date not null,
    CIPHER varchar(255) not null,
    CITIZENSHIP varchar(255) not null,
    IS_HOSTEL_NEED boolean not null,
    CONTACTS_ID varchar(36) not null,
    --
    primary key (ID)
);