package com.company.selcommittee.web.screens.examresults;

import com.haulmont.cuba.gui.screen.*;
import com.company.selcommittee.entity.ExamResults;

@UiController("selcommittee_ExamResults.browse")
@UiDescriptor("exam-results-browse.xml")
@LookupComponent("examResultsesTable")
@LoadDataBeforeShow
public class ExamResultsBrowse extends StandardLookup<ExamResults> {
}