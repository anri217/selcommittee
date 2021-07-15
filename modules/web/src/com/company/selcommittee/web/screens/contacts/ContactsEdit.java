package com.company.selcommittee.web.screens.contacts;

import com.haulmont.cuba.gui.screen.*;
import com.company.selcommittee.entity.Contacts;

@UiController("selcommittee_Contacts.edit")
@UiDescriptor("contacts-edit.xml")
@EditedEntityContainer("contactsDc")
@LoadDataBeforeShow
public class ContactsEdit extends StandardEditor<Contacts> {
}