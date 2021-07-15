package com.company.selcommittee.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import com.company.selcommittee.entity.Student;

@UiController("selcommittee_Student.browse")
@UiDescriptor("student-browse.xml")
@LookupComponent("studentsTable")
@LoadDataBeforeShow
public class StudentBrowse extends StandardLookup<Student> {
}