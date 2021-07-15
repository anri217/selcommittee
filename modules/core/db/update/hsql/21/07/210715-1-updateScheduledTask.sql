insert into SYS_SCHEDULED_TASK
(ID, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, DEFINED_BY, SYS_TENANT_ID, BEAN_NAME, METHOD_NAME, CLASS_NAME, SCRIPT_NAME, USER_NAME, IS_SINGLETON, IS_ACTIVE, PERIOD_, TIMEOUT, START_DATE, CRON, SCHEDULING_TYPE, TIME_FRAME, START_DELAY, PERMITTED_SERVERS, LOG_START, LOG_FINISH, LAST_START_TIME, LAST_START_SERVER, METHOD_PARAMS, DESCRIPTION)
values ('30a30609-12a9-7395-d390-0294675ec814', '2021-07-15 14:30:23', 'admin', '2021-07-15 14:30:23', null, null, null, 'B', null, 'selcommittee_RatingScheduler', 'schedule', null, null, null, null, null, null, null, null, '0 * * * * *', 'C', null, null, null, null, null, null, null, '<?xml version="1.0" encoding="UTF-8"?>

<params/>
', null);
