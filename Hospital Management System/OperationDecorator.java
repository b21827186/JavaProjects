
public class OperationDecorator implements Examination {

	protected Examination temp_examination;
	
	public OperationDecorator(Examination temp_examination) {
	super();
	this.temp_examination = temp_examination;
	
	}
	
	public String printoperations() {
		return temp_examination.printoperations();
	}

	
	public int cost() {
		
		return temp_examination.cost();
	}


}
