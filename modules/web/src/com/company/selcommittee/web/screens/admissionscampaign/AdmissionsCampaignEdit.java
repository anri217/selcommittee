package com.company.selcommittee.web.screens.admissionscampaign;

import com.haulmont.cuba.gui.screen.*;
import com.company.selcommittee.entity.AdmissionsCampaign;

@UiController("selcommittee_AdmissionsCampaign.edit")
@UiDescriptor("admissions-campaign-edit.xml")
@EditedEntityContainer("admissionsCampaignDc")
@LoadDataBeforeShow
public class AdmissionsCampaignEdit extends StandardEditor<AdmissionsCampaign> {
}