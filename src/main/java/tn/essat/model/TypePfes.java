package tn.essat.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class TypePfes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	
	@OneToMany
	@JoinColumn(name = "listeP_id")
	private List<Pfe> listP;

	public TypePfes() {
		super();
	}

	public TypePfes(Integer id, String nom, List<Pfe> listP) {
		super();
		this.id = id;
		this.nom = nom;
		this.listP = listP;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Pfe> getListP() {
		return listP;
	}

	public void setListP(List<Pfe> listP) {
		this.listP = listP;
	}
	
	

}
