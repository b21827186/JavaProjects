import java.util.Calendar;

public class Fulltime_Employee {
	private String type;
	public Fulltime_Employee(String type){
		this.type=type;
	}

	public Double dayOfWork(){
		if (type.equals("C")){
			Double i = Double.valueOf(20*125);
			return i;
		}
		else {
			Double i = Double.valueOf(20*105);
			return i;
		}
		
	}
	
	public Double severancePay(int year_of_start){
		int current_year = 2020;
		return (current_year-year_of_start)*20*0.8;
	}
	
	public Double overWorkSalary(int workhours){  //for week
		int default_work = 40;
		if (type.equals("C")){
			if (workhours>48){
				return Double.valueOf(8*15);
			}
			else {
				return Double.valueOf((workhours-default_work)*15);
			}
		}
		else {
			if (workhours>50){
				return Double.valueOf(10*11);
			}
			else {
				return Double.valueOf((workhours-default_work)*11);
			}
		}
	}
}
