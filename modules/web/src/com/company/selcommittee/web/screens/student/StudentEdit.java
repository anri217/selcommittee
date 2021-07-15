package com.company.selcommittee.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import com.company.selcommittee.entity.Student;

@UiController("selcommittee_Student.edit")
@UiDescriptor("student-edit.xml")
@EditedEntityContainer("studentDc")
@LoadDataBeforeShow
public class StudentEdit extends StandardEditor<Student> {
}