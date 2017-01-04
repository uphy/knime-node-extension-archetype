#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.knime.core.node.NodeDialog;
import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentNumber;
import org.knime.core.node.defaultnodesettings.SettingsModelIntegerBounded;

/**
 * {@link NodeDialog} for the "${nodeName}" Node.
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more
 * complex dialog please derive directly from
 * {@link org.knime.core.node.NodeDialogPane}.
 */
public class ${nodeName}Dialog extends DefaultNodeSettingsPane {

  /**
   * New pane for configuring Test node dialog. This is just a suggestion to
   * demonstrate possible default dialog components.
   */
  protected ${nodeName}Dialog() {
    super();

    addDialogComponent(new DialogComponentNumber(new SettingsModelIntegerBounded(${nodeName}Model.CFGKEY_COUNT, ${nodeName}Model.DEFAULT_COUNT, Integer.MIN_VALUE, Integer.MAX_VALUE), "Counter:", /* step */ 1,
        /* componentwidth */ 5));

  }
}
