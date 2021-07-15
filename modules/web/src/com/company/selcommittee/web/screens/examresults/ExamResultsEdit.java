package com.company.selcommittee.web.screens.examresults;

import com.haulmont.cuba.gui.screen.*;
import com.company.selcommittee.entity.ExamResults;

@UiController("selcommittee_ExamResults.edit")
@UiDescriptor("exam-results-edit.xml")
@EditedEntityContainer("examResultsDc")
@LoadDataBeforeShow
public class ExamResultsEdit extends StandardEditor<ExamResults> {
}