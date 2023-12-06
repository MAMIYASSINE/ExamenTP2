package Ex1;

public abstract class OperationStock implements MouvementStock {

	private static int count;
	private int idOp;
	Article art;
	OperationStock(Article art){
		this.art=art;
		count++;
		this.idOp=count;
	}
	@Override
	public String toString() {
		return "IdOP: "+idOp+" "+art;
	}
	
	
}
