package Ex1;

public class QteArticleException extends Exception {
	QteArticleException(int i){
		if(i==1) {
			System.out.println(" L’espace de stockage est insuffisant");
			
		}
		else if(i==2)
		{
			System.out.println(" la quantité en stock de l’article est insuffisante. !!");
		}
	}

}
