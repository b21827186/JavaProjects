import java.util.Calendar;

public class Officer {
	
	private Double baseSalary = 2600.00;  //constant for officers
	
	public Double ssBenetifs(){
		return (baseSalary*65)/100;
	}
	
	public Double severancePay(int year_of_start){
		int current_year = 2020;
		return (current_year-year_of_start)*20*0.8;
	}
	public double overWorkSalary(int work_for_week){       //it calculates for weeks
		int default_work = 40;
		if (work_for_week-default_work>10){
			Double i = Double.valueOf(20*10);
			return i;
		}
		else {
			Double i = Double.valueOf((work_for_week-default_work)*20);
			return i;
		}
	}
	public Double total(int work_for_week1,int work_for_week2,int work_for_week3,int work_for_week4,int year_of_start){
		Double week1 = overWorkSalary(work_for_week1);
		Double week2 = overWorkSalary(work_for_week2);
		Double week3 = overWorkSalary(work_for_week3);
		Double week4 = overWorkSalary(work_for_week4);
		Double severance = severancePay(year_of_start);
		Double ssbenefits = ssBenetifs();
		return baseSalary + week1 + week2 + week3 + week4 + severance + ssbenefits;
				}
}
