package esk.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the PIIRIPUNKTI_ALLUVUS database table.
 * 
 */
@Entity
@Table(name="PIIRIPUNKTI_ALLUVUS")
public class PiiripunktiAlluvus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PIIRIPUNKTI_ALLUVUS_ID", unique=true, nullable=false)
	private int piiripunktiAlluvusId;

	@Column(length=18)
	private String alates;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date avatud;

	@Column(length=18)
	private String kommentaar;

	@Column(length=18)
	private String kuni;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

	//bi-directional many-to-one association to Piiripunkt
    @ManyToOne
	@JoinColumn(name="PIIRIPUNKT_ID", nullable=false)
	private Piiripunkt piiripunkt;

	//bi-directional many-to-one association to Vaeosa
    @ManyToOne
	@JoinColumn(name="VAEOSA_ID", nullable=false)
	private Vaeosa vaeosa;

    public PiiripunktiAlluvus() {
    }

	public int getPiiripunktiAlluvusId() {
		return this.piiripunktiAlluvusId;
	}

	public void setPiiripunktiAlluvusId(int piiripunktiAlluvusId) {
		this.piiripunktiAlluvusId = piiripunktiAlluvusId;
	}

	public String getAlates() {
		return this.alates;
	}

	public void setAlates(String alates) {
		this.alates = alates;
	}

	public String getAvaja() {
		return this.avaja;
	}

	public void setAvaja(String avaja) {
		this.avaja = avaja;
	}

	public Date getAvatud() {
		return this.avatud;
	}

	public void setAvatud(Date avatud) {
		this.avatud = avatud;
	}

	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}

	public String getKuni() {
		return this.kuni;
	}

	public void setKuni(String kuni) {
		this.kuni = kuni;
	}

	public Date getMuudetud() {
		return this.muudetud;
	}

	public void setMuudetud(Date muudetud) {
		this.muudetud = muudetud;
	}

	public String getMuutja() {
		return this.muutja;
	}

	public void setMuutja(String muutja) {
		this.muutja = muutja;
	}

	public Date getSuletud() {
		return this.suletud;
	}

	public void setSuletud(Date suletud) {
		this.suletud = suletud;
	}

	public String getSulgeja() {
		return this.sulgeja;
	}

	public void setSulgeja(String sulgeja) {
		this.sulgeja = sulgeja;
	}

	public Piiripunkt getPiiripunkt() {
		return this.piiripunkt;
	}

	public void setPiiripunkt(Piiripunkt piiripunkt) {
		this.piiripunkt = piiripunkt;
	}
	
	public Vaeosa getVaeosa() {
		return this.vaeosa;
	}

	public void setVaeosa(Vaeosa vaeosa) {
		this.vaeosa = vaeosa;
	}
	
}