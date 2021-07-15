-- begin SELCOMMITTEE_EXAM_RESULTS
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
)^
-- end SELCOMMITTEE_EXAM_RESULTS
-- begin SELCOMMITTEE_RATING
create table SELCOMMITTEE_RATING (
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
    --
    primary key (ID)
)^
-- end SELCOMMITTEE_RATING
-- begin SELCOMMITTEE_DISCIPLINE
create table SELCOMMITTEE_DISCIPLINE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end SELCOMMITTEE_DISCIPLINE
-- begin SELCOMMITTEE_DIR_OF_STUDY_WITH_PRIORITY
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
)^
-- end SELCOMMITTEE_DIR_OF_STUDY_WITH_PRIORITY
-- begin SELCOMMITTEE_STUDENT
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
)^
-- end SELCOMMITTEE_STUDENT
-- begin SELCOMMITTEE_CONTACTS
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
)^
-- end SELCOMMITTEE_CONTACTS
-- begin SELCOMMITTEE_DIRECTION_OF_STUDY
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
)^
-- end SELCOMMITTEE_DIRECTION_OF_STUDY
-- begin SELCOMMITTEE_ADMISSIONS_CAMPAIGN
create table SELCOMMITTEE_ADMISSIONS_CAMPAIGN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    YEAR_ integer not null,
    --
    primary key (ID)
)^
-- end SELCOMMITTEE_ADMISSIONS_CAMPAIGN
-- begin SELCOMMITTEE_RATING_STUDENT_LINK
create table SELCOMMITTEE_RATING_STUDENT_LINK (
    RATING_ID varchar(36) not null,
    STUDENT_ID varchar(36) not null,
    primary key (RATING_ID, STUDENT_ID)
)^
-- end SELCOMMITTEE_RATING_STUDENT_LINK
-- begin SELCOMMITTEE_ADMISSIONS_CAMPAIGN_STUDENT_LINK
create table SELCOMMITTEE_ADMISSIONS_CAMPAIGN_STUDENT_LINK (
    ADMISSIONS_CAMPAIGN_ID varchar(36) not null,
    STUDENT_ID varchar(36) not null,
    primary key (ADMISSIONS_CAMPAIGN_ID, STUDENT_ID)
)^
-- end SELCOMMITTEE_ADMISSIONS_CAMPAIGN_STUDENT_LINK
-- begin SELCOMMITTEE_ADMISSIONS_CAMPAIGN_DIRECTION_OF_STUDY_LINK
create table SELCOMMITTEE_ADMISSIONS_CAMPAIGN_DIRECTION_OF_STUDY_LINK (
    ADMISSIONS_CAMPAIGN_ID varchar(36) not null,
    DIRECTION_OF_STUDY_ID varchar(36) not null,
    primary key (ADMISSIONS_CAMPAIGN_ID, DIRECTION_OF_STUDY_ID)
)^
-- end SELCOMMITTEE_ADMISSIONS_CAMPAIGN_DIRECTION_OF_STUDY_LINK
