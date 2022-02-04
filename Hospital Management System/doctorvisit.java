
public class doctorvisit extends OperationDecorator {

	
	public doctorvisit(Examination temp_examination) {
		super(temp_examination);
		
	}


	public String printoperations() {
		return super.printoperations() + " doctorvisit";
	}
	
	
	public int cost() {
		return super.cost() + 15;
	}
}
