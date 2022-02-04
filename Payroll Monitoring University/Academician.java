import java.util.Calendar;

public class Academician {
	private Double baseSalary = 2600.00;  //constant for academicians
	private String type;
	
	public Academician(String type){
		this.type=type;
	}
	
	public Double get_baseSalary(){
		return baseSalary;
	}

	public Double ssBenetifs(){  // type is for to know if is it faculty member of assistant
		if (type.equals("F")){
			return (baseSalary*135)/100;
		}
		else {
			return (baseSalary*105)/100;
		}
	}
	
	public Double severancePay(int year_of_start){
		int current_year = 2020;
		return (current_year-year_of_start)*20*0.8;
	}
	
	
}

	