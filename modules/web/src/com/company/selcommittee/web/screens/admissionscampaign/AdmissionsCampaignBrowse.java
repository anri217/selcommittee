package com.company.selcommittee.web.screens.admissionscampaign;

import com.haulmont.cuba.gui.screen.*;
import com.company.selcommittee.entity.AdmissionsCampaign;

@UiController("selcommittee_AdmissionsCampaign.browse")
@UiDescriptor("admissions-campaign-browse.xml")
@LookupComponent("admissionsCampaignsTable")
@LoadDataBeforeShow
public class AdmissionsCampaignBrowse extends StandardLookup<AdmissionsCampaign> {
}