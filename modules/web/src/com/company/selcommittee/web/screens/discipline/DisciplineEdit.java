package com.company.selcommittee.web.screens.discipline;

import com.haulmont.cuba.gui.screen.*;
import com.company.selcommittee.entity.Discipline;

@UiController("selcommittee_Discipline.edit")
@UiDescriptor("discipline-edit.xml")
@EditedEntityContainer("disciplineDc")
@LoadDataBeforeShow
public class DisciplineEdit extends StandardEditor<Discipline> {
}