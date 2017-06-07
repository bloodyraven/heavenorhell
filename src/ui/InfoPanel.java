package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import beans.Personne;

public class InfoPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private Personne personne;
	private JButton heaven = new JButton("HEAVEN"), hell = new JButton("HELL");

	public InfoPanel(Personne personne) {
		this.setLayout(new BorderLayout());
		
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.PAGE_AXIS));
		contentPanel.add(new JLabel("Nom : "+personne.getCivilite()+" "+personne.getNom()[0]));
		contentPanel.add(new JLabel("Adresse : "+personne.getNumRue()+" "+personne.getAdresse_ville()[0]));
		contentPanel.add(new JLabel(personne.getAdresse_ville()[1]));
		contentPanel.add(new JLabel("Ce que j'ai fait : "));
		for (int i = 0; i < personne.getWhatItDid().size(); i++) {
			contentPanel.add(new JLabel(" - "+personne.getWhatItDid().get(i)));
		}
		this.add(contentPanel, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(heaven);
		buttonPanel.add(hell);
		this.add(buttonPanel, BorderLayout.SOUTH);
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public JButton getHeaven() {
		return heaven;
	}

	public void setHeaven(JButton heaven) {
		this.heaven = heaven;
	}

	public JButton getHell() {
		return hell;
	}

	public void setHell(JButton hell) {
		this.hell = hell;
	}
}
