package com.company.selcommittee.web.screens.directionofstudy;

import com.haulmont.cuba.gui.screen.*;
import com.company.selcommittee.entity.DirectionOfStudy;

@UiController("selcommittee_DirectionOfStudy.browse")
@UiDescriptor("direction-of-study-browse.xml")
@LookupComponent("directionOfStudiesTable")
@LoadDataBeforeShow
public class DirectionOfStudyBrowse extends StandardLookup<DirectionOfStudy> {
}