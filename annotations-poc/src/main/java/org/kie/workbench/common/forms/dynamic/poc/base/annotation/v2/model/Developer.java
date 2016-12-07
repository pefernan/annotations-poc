package org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.model;

import java.util.ArrayList;
import java.util.List;

import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.FormDefinition;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.i18n.I18nSettings;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.Column;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.Layout;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.LayoutElementSettings;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.LayoutType;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.properties.FormField;

@FormDefinition(
        i18n = @I18nSettings(
                bundle = "org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.model.AppConstants",
                keyPreffix = "Developer"
        ),
        layout = @Layout(
                layout = @Column,
                startElement = "name"
        )
)
public class Developer extends HumanBeing {

    @LayoutElementSettings( afterElement = "personalData" )
    @Layout( type = LayoutType.TAB, labelKey = "techincalTab.label")
    @FormField( labelKey = "languages.label")
    private String languages;

    @LayoutElementSettings( afterElement = "languages" )
    @FormField( labelKey = "techscore.label" )
    private Integer techScore;

    @LayoutElementSettings( afterElement = "techScore" )
    @FormField( labelKey = "developerFriends.label" )
    private List<Pet> friends = new ArrayList<Pet>();

    public List<Pet> getFriends() {
        return friends;
    }

    public void setFriends( List<Pet> friends ) {
        this.friends = friends;
    }
}
