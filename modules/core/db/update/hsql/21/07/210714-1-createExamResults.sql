create table SELCOMMITTEE_EXAM_RESULTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DISCIPLINE_ID varchar(36) not null,
    POINTS_COUNT integer not null,
    STUDENT_ID varchar(36),
    --
    primary key (ID)
);