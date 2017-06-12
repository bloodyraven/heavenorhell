package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import beans.Joueur;
import beans.Personne;

public class InfoPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private Personne personne;
	private JButton heaven = new JButton("HEAVEN"), hell = new JButton("HELL");
	private Joueur joueur;
	
	private JPanel contentPanel;

	public InfoPanel(Joueur joueur, Personne personne) {
		this.setJoueur(joueur);
		this.setPersonne(personne);
		this.setLayout(new BorderLayout());
		
		contentPanel = new JPanel();
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.PAGE_AXIS));
		initInfoPersonne(personne);
		this.add(contentPanel, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(heaven);
		buttonPanel.add(hell);
		this.add(buttonPanel, BorderLayout.SOUTH);
		
		heaven.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				joueur.addPersonneToHeaven(personne);
				nextPersonne();
			}
		});
		
		hell.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				joueur.addPersonneToHell(personne);
				nextPersonne();
			}
		});
	}
	
	private void initInfoPersonne(Personne personne) {
		contentPanel.add(new JLabel("Nom : "+this.personne.getCivilite()+" "+this.personne.getNomFamille()+" "+this.personne.getNom()[0]));
		contentPanel.add(new JLabel("Adresse : "+personne.getNumRue()+" "+personne.getAdresse_ville()[0]));
		contentPanel.add(new JLabel("                   "+personne.getAdresse_ville()[1]));
		contentPanel.add(new JLabel("Age : "+personne.getAge()));
		contentPanel.add(new JLabel("Ce que j'ai fait : "));
		for (int i = 0; i < personne.getWhatItDid().size(); i++) {
			contentPanel.add(new JLabel(" - "+personne.getWhatItDid().get(i)));
		}
	}
	
	public void nextPersonne() {
		this.personne = new Personne();
		contentPanel.removeAll();
		initInfoPersonne(personne);
		this.repaint();
		this.revalidate();
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

	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
}
