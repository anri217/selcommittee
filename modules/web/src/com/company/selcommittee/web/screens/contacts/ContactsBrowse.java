package com.company.selcommittee.web.screens.contacts;

import com.haulmont.cuba.gui.screen.*;
import com.company.selcommittee.entity.Contacts;

@UiController("selcommittee_Contacts.browse")
@UiDescriptor("contacts-browse.xml")
@LookupComponent("contactsesTable")
@LoadDataBeforeShow
public class ContactsBrowse extends StandardLookup<Contacts> {
}