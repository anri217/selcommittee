create table SELCOMMITTEE_DIRECTION_OF_STUDY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CIPHER varchar(255) not null,
    NAME varchar(255) not null,
    NUM_OF_BUDGET_PLACES integer not null,
    PASSING_POINTS integer not null,
    --
    primary key (ID)
);