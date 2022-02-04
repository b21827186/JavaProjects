import java.util.Calendar;

public class Parttime_Employee {
	
	
	public Double severancePay(int year_of_start){
		int current_year = 2020;
		return (current_year-year_of_start)*20*0.8;
	}
	
	
	public Double hourOfWork(int workhour){
		int min_workhour = 10;
		int max_workhour = 20;
		if ((workhour>=min_workhour)&&(max_workhour>workhour)){
			return Double.valueOf(workhour*18);
		}
		else if (workhour>=max_workhour){
			return Double.valueOf(max_workhour*18);
		}
		else {
			return Double.valueOf(0);
		}
	}
	public Double total(int work_for_week1,int work_for_week2,int work_for_week3,int work_for_week4,int year_of_start){
		Double week1 = hourOfWork(work_for_week1);
		Double week2 = hourOfWork(work_for_week2);
		Double week3 = hourOfWork(work_for_week3);
		Double week4 = hourOfWork(work_for_week4);
		Double severance = severancePay(year_of_start);
		return week1 + week2 + week3 + week4 + severance ;
	}
}
