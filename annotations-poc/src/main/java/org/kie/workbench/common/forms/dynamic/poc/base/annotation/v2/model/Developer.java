package org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.model;

import java.util.ArrayList;
import java.util.List;

import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.FieldGroup;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.FieldGroupType;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.FormDefinition;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.Field;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.i18n.I18nSettings;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.Column;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.Layout;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.LayoutSettings;

@FormDefinition(
        i18n = @I18nSettings(
                bundle = "org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.model.AppConstants",
                keyPreffix = "Developer"
        ),
        layout = @Layout( @Column ),
        startElement = "name"
)
public class Developer extends HumanBeing {

    @LayoutSettings( afterElement = "personalData" )
    @FieldGroup(
            name = "techincalTab",
            type = FieldGroupType.TAB,
            labelKey = "techincalTab.label" )
    @Field( labelKey = "languages.label" )
    private String languages;

    @LayoutSettings( afterElement = "languages" )
    @Field( labelKey = "techscore.label" )
    private Integer techScore;

    @LayoutSettings( afterElement = "techScore" )
    @Field( labelKey = "developerFriends.label" )
    private List<Pet> friends = new ArrayList<Pet>();

    public List<Pet> getFriends() {
        return friends;
    }

    public void setFriends( List<Pet> friends ) {
        this.friends = friends;
    }
}
