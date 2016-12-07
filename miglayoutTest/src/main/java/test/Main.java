/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class Main {

    public static void main( String[] args ) {
        MigLayout layout = new MigLayout( "wrap 3" );

        MigLayout layout2 = new MigLayout( "", // Layout Constraints
                "[][]20[]", // Column constraints
                "[]20[]" );

        MigLayout defaultLayout = new MigLayout();

        JFrame frame = new JFrame( "Title" );

        JPanel panel = new JPanel( layout2 );

        panel.add( new JLabel( "Test" ) );
        panel.add( new JTextField( 20 ) );
        panel.add( new JLabel( "Last Name" ) );
        panel.add( new JTextField( 20 ) );
        panel.add( new JLabel( "Address" ) );
        panel.add( new JTextField( 50 ) );

        frame.add( panel );

        frame.pack();
        frame.setVisible( true );
    }
}
