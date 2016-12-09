package org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.model;

import org.jboss.errai.common.client.api.annotations.Portable;
import org.jboss.errai.databinding.client.api.Bindable;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.FormDefinition;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.ColSpan;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.Column;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.Layout;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.FormField;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.SkipFormField;

@Portable
@Bindable
@FormDefinition(
        layout = @Layout( { @Column( ColSpan.SPAN_4 ), @Column } ),
        startElement = "name"
)
public class Pet {

    @FormField( labelKey = "Pet.label" )
    private String name;

    @FormField( labelKey = "Pet.type" )
    private PetType type;

    @SkipFormField
    private int age;

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public PetType getType() {
        return type;
    }

    public void setType( PetType type ) {
        this.type = type;
    }
}
