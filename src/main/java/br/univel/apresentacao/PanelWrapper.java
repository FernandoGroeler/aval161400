package br.univel.apresentacao;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.border.EmptyBorder;

import br.univel.comum.PanelPaiDeTodos;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

public class PanelWrapper extends PanelPaiDeTodos {

	private static final long serialVersionUID = -3748545691001218815L;
	private JButton btnX;
	private JLabel lblTitulo;

	/**
	 * Create the panel.
	 */
	public PanelWrapper() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblTitulo = new JLabel("Titulo");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.insets = new Insets(0, 0, 0, 5);
		gbc_lblTitulo.gridx = 0;
		gbc_lblTitulo.gridy = 0;
		panel.add(lblTitulo, gbc_lblTitulo);
		
		btnX = new JButton("X");
		GridBagConstraints gbc_btnX = new GridBagConstraints();
		gbc_btnX.anchor = GridBagConstraints.EAST;
		gbc_btnX.gridx = 1;
		gbc_btnX.gridy = 0;
		panel.add(btnX, gbc_btnX);

	}
	
	public void setConteudo(JPanel painel) {
		add(painel);
	}
	
	public void setAcaoFechar(ActionListener action) {
		btnX.addActionListener(action);
	}
	
	public void setTitulo(String titulo) {
		lblTitulo.setText(titulo);
	}	
}
