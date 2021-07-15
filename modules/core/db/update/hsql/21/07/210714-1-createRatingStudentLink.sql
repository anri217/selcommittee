create table SELCOMMITTEE_RATING_STUDENT_LINK (
    RATING_ID varchar(36) not null,
    STUDENT_ID varchar(36) not null,
    primary key (RATING_ID, STUDENT_ID)
);
