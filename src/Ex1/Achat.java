package Ex1;

public class Achat extends OperationStock{
	
	
	private double prixAchat;
	private int qtiteAchete;
	@Override
	public boolean estMouvementabe() {
		// TODO Auto-generated method stub
		if((qtiteAchete+super.art.getQteStock())<(super.art.getstockMax())) {
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
		qte=this.qtiteAchete;
		if(this.estMouvementabe()==true) {
			a.setQteStock(a.getQteStock()+qte);
		}
		else
		{
			throw new QteArticleException(1);
		}
		
	}
	
	Achat(Article art,double prixAchat,int QtiteAchete) throws QteArticleException{
		super(art);
		this.prixAchat=prixAchat;
		this.qtiteAchete=QtiteAchete;
		this.mouvementerStock(art, QtiteAchete) ;
	}
	@Override
	public String toString() {
		return "PrixAchat: "+prixAchat+" QtiteAchete"+qtiteAchete+super.toString();
	}
	

	
	
	
	

}
	
	
	


