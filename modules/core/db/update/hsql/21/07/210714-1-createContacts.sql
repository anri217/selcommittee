create table SELCOMMITTEE_CONTACTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PERMANENT_REGISTRATION_ADDRESS_COUNTRY varchar(255) not null,
    PERMANENT_REGISTRATION_ADDRESS_REGION varchar(255) not null,
    PERMANENT_REGISTRATION_ADDRESS_LOCALITY varchar(255) not null,
    PERMANENT_REGISTRATION_ADDRESS_STREET varchar(255) not null,
    PERMANENT_REGISTRATION_ADDRESS_HOUSE integer not null,
    PERMANENT_REGISTRATION_ADDRESS_BUILDING varchar(3) not null,
    PERMANENT_REGISTRATION_ADDRESS_FLAT integer not null,
    PERMANENT_REGISTRATION_ADDRESS_ZIP_CODE integer not null,
    LIVING_ADDRESS_COUNTRY varchar(255) not null,
    LIVING_ADDRESS_REGION varchar(255) not null,
    LIVING_ADDRESS_LOCALITY varchar(255) not null,
    LIVING_ADDRESS_STREET varchar(255) not null,
    LIVING_ADDRESS_HOUSE integer not null,
    LIVING_ADDRESS_BUILDING varchar(3) not null,
    LIVING_ADDRESS_FLAT integer not null,
    LIVING_ADDRESS_ZIP_CODE integer not null,
    --
    MAIN_CELL_PHONE integer not null,
    ADDITIONAL_CELL_PHONE integer,
    --
    primary key (ID)
);