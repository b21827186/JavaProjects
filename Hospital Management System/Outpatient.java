
public class Outpatient implements Examination {

	

	@Override
	public String printoperations() {
		return "Outpatient" + "\t";
	}

	@Override
	public int cost() {
		return 15;
	}


}
