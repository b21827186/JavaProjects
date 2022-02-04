
public class measurements extends OperationDecorator{

	public measurements(Examination temp_examination) {
		super(temp_examination);
		// TODO Auto-generated constructor stub
	}

	public String printoperations() {
		return super.printoperations() + " measurements";
	}
	
	public int cost() {
		return super.cost() + 5;
	}
}
