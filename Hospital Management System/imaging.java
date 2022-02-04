
public class imaging extends OperationDecorator {

	
	
	
	public imaging(Examination temp_examination) {
		super(temp_examination);
		// TODO Auto-generated constructor stub
	}


	public String printoperations() {
		return super.printoperations() + " imaging";
	}
	
	
	public int cost() {
		return super.cost()+10;
	}
}
