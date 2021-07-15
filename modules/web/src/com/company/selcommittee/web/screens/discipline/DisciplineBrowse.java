package com.company.selcommittee.web.screens.discipline;

import com.haulmont.cuba.gui.screen.*;
import com.company.selcommittee.entity.Discipline;

@UiController("selcommittee_Discipline.browse")
@UiDescriptor("discipline-browse.xml")
@LookupComponent("disciplinesTable")
@LoadDataBeforeShow
public class DisciplineBrowse extends StandardLookup<Discipline> {
}