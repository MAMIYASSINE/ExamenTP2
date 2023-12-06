package Ex1;

public class Vente extends OperationStock {

	private double prixVente;
	private int qteVendu;
	
	Vente(Article art,double prixVente,int qteVendu) throws QteArticleException {
		super(art);
		this.prixVente=prixVente;
		this.qteVendu=qteVendu;
		this.mouvementerStock(art, qteVendu);
		// TODO Auto-generated constructor stub
	}
	public double getPrixVente() {
		return this.prixVente;
	}
	@Override
	public String toString() {
		return " PrixVente: "+prixVente+" QteVendu:"+qteVendu+super.toString();
	}
	

	@Override
	public boolean estMouvementabe() {
		// TODO Auto-generated method stub
		if(super.art.getQteStock()>this.qteVendu) {
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public void mouvementerStock(Article a, int qte) throws QteArticleException {
		// TODO Auto-generated method stub
		qte=this.qteVendu;
		if(this.estMouvementabe()==true) {
			a.setQteStock(a.getQteStock()-qte);
		}
		else
		{
			throw new QteArticleException(2);
		}
	}
	
	
}
