package com.company.selcommittee.web.screens.rating;

import com.company.selcommittee.entity.Rating;
import com.company.selcommittee.entity.Student;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import org.apache.commons.collections4.CollectionUtils;

import javax.inject.Inject;

@UiController("selcommittee_Rating.browse")
@UiDescriptor("rating-browse.xml")
@LookupComponent("ratingsTable")
@LoadDataBeforeShow
public class RatingBrowse extends StandardLookup<Rating> {
    @Inject
    private CollectionContainer<Student> studentsDc;

    @Inject
    private GroupTable<Rating> ratingsTable;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        ratingsTable.addSelectionListener(listener -> {
            if (CollectionUtils.isNotEmpty(listener.getSelected())) {
                Rating selected = listener.getSelected().iterator().next();
                studentsDc.setItems(selected.getStudents());
            }
        });
    }
}