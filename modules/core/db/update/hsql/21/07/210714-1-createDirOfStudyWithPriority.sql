create table SELCOMMITTEE_DIR_OF_STUDY_WITH_PRIORITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DIRECTION_OF_STUDY_ID varchar(36) not null,
    PRIORITY varchar(50) not null,
    STUDENT_ID varchar(36),
    --
    primary key (ID)
);