package org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.model;

import java.util.Date;

import org.jboss.errai.common.client.api.annotations.Portable;
import org.jboss.errai.databinding.client.api.Bindable;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.FormDefinition;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.Column;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.Layout;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.LayoutElementSettings;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.LayoutType;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.properties.FormField;

@Portable
@Bindable
@FormDefinition (
        layout = @Layout(
                layout = {@Column, @Column, @Column},
                startElement = "id"
        )
)
public class HumanBeing {

    @LayoutElementSettings ( horizontalSpan = 3 )
    private String id;

    @LayoutElementSettings( afterElement = "id" )
    private String name;

    @LayoutElementSettings( afterElement = "name" )
    private String lastName;

    @LayoutElementSettings( afterElement = "lastName" )
    private Date birthDay;

    @LayoutElementSettings( afterElement = "birthDay", horizontalSpan = 3 )
    @Layout( name = "personalData", type = LayoutType.TAB, labelKey = "layout.personalData" )
    @FormField( labelKey = "address.label" )
    private Address address;

    @LayoutElementSettings( afterElement = "address")
    private Pet pet;

    public HumanBeing() {
    }

    public String getId() {
        return id;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay( Date birthDay ) {
        this.birthDay = birthDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress( Address address ) {
        this.address = address;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet( Pet pet ) {
        this.pet = pet;
    }
}
