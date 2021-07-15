package com.company.selcommittee.web.screens.directionofstudy;

import com.haulmont.cuba.gui.screen.*;
import com.company.selcommittee.entity.DirectionOfStudy;

@UiController("selcommittee_DirectionOfStudy.edit")
@UiDescriptor("direction-of-study-edit.xml")
@EditedEntityContainer("directionOfStudyDc")
@LoadDataBeforeShow
public class DirectionOfStudyEdit extends StandardEditor<DirectionOfStudy> {
}