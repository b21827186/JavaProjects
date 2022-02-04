
public class Research_Assistant extends Academician {

	public Research_Assistant(){
		super("R");
	}

public Double total(int year_of_start){
	Double severance = severancePay(year_of_start);
	Double ssbenefits = ssBenetifs();
	return get_baseSalary() + severance + ssbenefits;
}			



}