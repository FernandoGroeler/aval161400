package br.univel.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import javax.swing.JTabbedPane;

public class FramePrincipal extends JFrame {

	private static final long serialVersionUID = 4276770728732999599L;
	private JPanel contentPane;
	private JTabbedPane tabbedPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal frame = new FramePrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FramePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnAluno = new JButton("Aluno");
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarAbaAluno();
			}
		});
		GridBagConstraints gbc_btnAluno = new GridBagConstraints();
		gbc_btnAluno.gridx = 0;
		gbc_btnAluno.gridy = 0;
		panel.add(btnAluno, gbc_btnAluno);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
	}
	
	private void adicionarAbaAluno() {
		JPanel panelAluno = new PanelAluno();
		
		PanelWrapper panelWrapper = new PanelWrapper();
		panelWrapper.setConteudo(panelAluno);
		panelWrapper.setTitulo("Cadastro de aluno");
		panelWrapper.setAcaoFechar(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.remove(panelWrapper);
			}
		});

		tabbedPane.addTab("Aluno", panelWrapper);
	}	

}
