package Ex1;

public class Stock {

	OperationStock tabOp[];
	private int nbOp;
	Stock(int max){
		tabOp=new OperationStock[max];
	}
	void ajouterOp(OperationStock op) {
		if(nbOp<tabOp.length) {
			tabOp[nbOp]=op;
			nbOp++;
		}
		else
		{
			System.out.println(" Le tab est plein");
		}
	}
	void affichOpAchat() {
		for(int i=0;i<nbOp;i++) {
			System.out.println(tabOp[i]);
		}
	}
	public double meilleurPrixVente(Article a) {
		int i=0;
		double prixmax=0;
		boolean estrouve=false;
		while((i<nbOp)&&(estrouve==false)) {
			if((tabOp[i].art.equals(a)==true)&&(tabOp[i] instanceof Vente)) {
				estrouve=true;
			}
			else
			{
				i++;
			}
		}
		if(i<nbOp) {
			prixmax=((Vente)tabOp[i]).getPrixVente();
			for(int j=i;j<nbOp;j++) {
				if((tabOp[j].art.equals(a))&&(tabOp[j] instanceof Vente )&&(((Vente)tabOp[j]).getPrixVente()>prixmax)){
					
					prixmax=((Vente)tabOp[j]).getPrixVente();
				}
			}
			
		}
		return prixmax;
	}
	
	
}
