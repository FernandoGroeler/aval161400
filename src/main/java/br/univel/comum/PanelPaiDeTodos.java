package br.univel.comum;

import javax.swing.JPanel;
import java.awt.GridBagLayout;

public class PanelPaiDeTodos extends JPanel {

	private static final long serialVersionUID = 5417929362447697171L;

	/**
	 * Create the panel.
	 */
	public PanelPaiDeTodos() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0};
		gridBagLayout.rowHeights = new int[]{0};
		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
		setLayout(gridBagLayout);

	}

}
