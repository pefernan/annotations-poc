/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the License);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an AS IS BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.forms.dynamic.poc.base.annotation.v2.form.layout;

public enum ColSpan {
    DEFAULT( 0 ),
    SPAN_1( 1 ),
    SPAN_2( 2 ),
    SPAN_3( 3 ),
    SPAN_4( 4 ),
    SPAN_5( 5 ),
    SPAN_6( 6 ),
    SPAN_7( 7 ),
    SPAN_8( 8 ),
    SPAN_9( 9 ),
    SPAN_10( 10 ),
    SPAN_11( 11 ),
    SPAN_12( 12 );

    private int span;

    ColSpan( int span ) {
        this.span = span;
    }

    public int getSpan() {
        return span;
    }

    @Override
    public String toString() {
        return String.valueOf( span );
    }
}
