package com.company.selcommittee.web.screens.dirofstudywithpriority;

import com.haulmont.cuba.gui.screen.*;
import com.company.selcommittee.entity.DirOfStudyWithPriority;

@UiController("selcommittee_DirOfStudyWithPriority.edit")
@UiDescriptor("dir-of-study-with-priority-edit.xml")
@EditedEntityContainer("dirOfStudyWithPriorityDc")
@LoadDataBeforeShow
public class DirOfStudyWithPriorityEdit extends StandardEditor<DirOfStudyWithPriority> {
}