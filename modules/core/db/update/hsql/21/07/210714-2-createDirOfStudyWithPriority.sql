alter table SELCOMMITTEE_DIR_OF_STUDY_WITH_PRIORITY add constraint FK_SELCOMMITTEE_DIR_OF_STUDY_WITH_PRIORITY_ON_DIRECTION_OF_STUDY foreign key (DIRECTION_OF_STUDY_ID) references SELCOMMITTEE_DIRECTION_OF_STUDY(ID);
alter table SELCOMMITTEE_DIR_OF_STUDY_WITH_PRIORITY add constraint FK_SELCOMMITTEE_DIR_OF_STUDY_WITH_PRIORITY_ON_STUDENT foreign key (STUDENT_ID) references SELCOMMITTEE_STUDENT(ID);
create index IDX_SELCOMMITTEE_DIR_OF_STUDY_WITH_PRIORITY_ON_DIRECTION_OF_STUDY on SELCOMMITTEE_DIR_OF_STUDY_WITH_PRIORITY (DIRECTION_OF_STUDY_ID);
create index IDX_SELCOMMITTEE_DIR_OF_STUDY_WITH_PRIORITY_ON_STUDENT on SELCOMMITTEE_DIR_OF_STUDY_WITH_PRIORITY (STUDENT_ID);
