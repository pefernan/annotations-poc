package org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.model;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
enum PetType {
    CAT( "MEEOOOOOW!" ),
    DOC( "BARK!" ),
    COW( "MOO!" );

    private String noise;

    PetType( String noise ) {
        this.noise = noise;
    }

    public String makeNoise() {
        return noise;
    }
}
