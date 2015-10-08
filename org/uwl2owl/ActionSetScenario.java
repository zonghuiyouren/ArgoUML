package org.uwl2owl;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by qianminming on 6/10/2015.
 */
public class ActionSetScenario extends AbstractAction {


    public ActionSetScenario () {
        super("Set Scenario");
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new ScenarioGUI().setVisible(true);
                }
            });
        } catch (Exception ex) {

        }
    }

}
