package com.company.selcommittee.web.screens.rating;

import com.haulmont.cuba.gui.screen.*;
import com.company.selcommittee.entity.Rating;

@UiController("selcommittee_Rating.edit")
@UiDescriptor("rating-edit.xml")
@EditedEntityContainer("ratingDc")
@LoadDataBeforeShow
public class RatingEdit extends StandardEditor<Rating> {
}