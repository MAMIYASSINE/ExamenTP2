package Ex1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Article ar1=new Article(1, "TV", 30, 100);
		Article ar2=new Article(2, "LaveVaisselle", 5, 20);
		Stock st=new Stock(10);
		try {
			st.ajouterOp(new Achat(ar1,700,20));
		} catch (QteArticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st.ajouterOp(new Achat(ar2,1600,15));
		} catch (QteArticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st.ajouterOp(new Vente(ar1,800,20));
		} catch (QteArticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st.ajouterOp(new Vente(ar2,1800,10));
		} catch (QteArticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st.ajouterOp(new Vente(ar2,1900,5));
		} catch (QteArticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		st.affichOpAchat();
		System.out.println(st.meilleurPrixVente(ar2));



	}

}
