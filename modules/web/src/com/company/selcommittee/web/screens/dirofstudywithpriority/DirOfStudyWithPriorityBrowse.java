package com.company.selcommittee.web.screens.dirofstudywithpriority;

import com.haulmont.cuba.gui.screen.*;
import com.company.selcommittee.entity.DirOfStudyWithPriority;

@UiController("selcommittee_DirOfStudyWithPriority.browse")
@UiDescriptor("dir-of-study-with-priority-browse.xml")
@LookupComponent("dirOfStudyWithPrioritiesTable")
@LoadDataBeforeShow
public class DirOfStudyWithPriorityBrowse extends StandardLookup<DirOfStudyWithPriority> {
}