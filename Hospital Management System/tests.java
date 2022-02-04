
public class tests extends OperationDecorator {

	

	
	public tests(Examination temp_examination) {
		super(temp_examination);
	}

	public String printoperations() {
		return super.printoperations() + " tests";
	}
	
	public int cost() {
		return super.cost() + 7;
	}
}
