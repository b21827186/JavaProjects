import java.util.Calendar;

public class Security {

	public Double hourOfWork(int workhour){    //per week
		int max_workhour = 54;
		int min_workhour = 30;
		Double transMoney = Double.valueOf(5*6); //transportation money per week
		Double foodMoney = Double.valueOf(10*6); //food money per week
		if (workhour >= max_workhour){
			Double total = Double.valueOf(54*10) + transMoney + foodMoney;
			return total;
		}
		
		else if ((workhour>=min_workhour)&&(workhour<max_workhour)) {
			Double total = Double.valueOf(workhour*10) + transMoney + foodMoney;
			return total;
		}
		else {
			return Double.valueOf(0);
		}
		
	}
	
	public Double severancePay(int year_of_start){
		int current_year = 2020;
		return (current_year-year_of_start)*20*0.8;
	}
	
	public Double total(int work_for_week1,int work_for_week2,int work_for_week3,int work_for_week4,int year_of_start){
		Double week1 = hourOfWork(work_for_week1);
		Double week2 = hourOfWork(work_for_week2);
		Double week3 = hourOfWork(work_for_week3);
		Double week4 = hourOfWork(work_for_week4);
		Double severance = severancePay(year_of_start);
		return  week1 + week2 + week3 + week4 + severance ;
				}
}


