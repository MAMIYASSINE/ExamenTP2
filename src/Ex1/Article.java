package Ex1;

public class Article {
	private int code;
	private String libelle;
	private int qteStock;
	private int stockMax;
	Article(int code,String libelle,int qteStock,int stockMax){
		this.code=code;
		this.libelle=libelle;
		this.qteStock=qteStock;
		this.stockMax=stockMax;
	}
	public int getQteStock() {
		return qteStock;
	}
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}
	public int getstockMax() {
		return this.stockMax;
	}
	public int getcode() {
		return code;
	}
	public String getLibelle() {
		return this.libelle;
	}
	@Override
	public String toString() {
		return "Code: "+code+" Libelle: "+libelle+" QteStock"+qteStock+" StockMax: "+stockMax;
	}
	public boolean equals(Article a) {
		if((this.code ==a.getcode())&&(this.libelle.equals(a.getLibelle()))) {
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
