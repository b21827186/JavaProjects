
public class Faculty_Member extends Academician {

	public Faculty_Member(){
		super("F");
	}
	
	
	public Double addCourseFee(int work_for_week){       //it calculates for weeks
		int default_work = 40;
		if (work_for_week-default_work>8){
			Double i = Double.valueOf(20*8);
			return i;
		}
		else {
			Double i = Double.valueOf((work_for_week-default_work)*20);
			return i;
		}
	}
	public Double total(int work_for_week1,int work_for_week2,int work_for_week3,int work_for_week4,int year_of_start){
		Double week1 = addCourseFee(work_for_week1);
		Double week2 = addCourseFee(work_for_week2);
		Double week3 = addCourseFee(work_for_week3);
		Double week4 = addCourseFee(work_for_week4);
		Double severance = severancePay(year_of_start);
		Double ssbenefits = ssBenetifs();
		return get_baseSalary() + week1 + week2 + week3 + week4 + severance + ssbenefits;
				}
	
}
