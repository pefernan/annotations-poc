package org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.Layout;
import org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout.LayoutSettings;

@java.lang.annotation.Retention( RetentionPolicy.RUNTIME )
@java.lang.annotation.Target( { ElementType.FIELD } )
public @interface FieldGroup {
    String name();

    FieldGroupType type() default FieldGroupType.DEFAULT;

    Layout layout() default @Layout;

    LayoutSettings settings() default @LayoutSettings;

    String labelKey() default "";

    String startElement() default "";
}
