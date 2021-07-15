alter table SELCOMMITTEE_STUDENT add constraint FK_SELCOMMITTEE_STUDENT_ON_CONTACTS foreign key (CONTACTS_ID) references SELCOMMITTEE_CONTACTS(ID);
create unique index IDX_SELCOMMITTEE_STUDENT_UNIQ_DOCUMENT_CARD_PASSPORT on SELCOMMITTEE_STUDENT (document_card_passport);
create index IDX_SELCOMMITTEE_STUDENT_ON_CONTACTS on SELCOMMITTEE_STUDENT (CONTACTS_ID);
