
public class Worker extends Fulltime_Employee{

	public Worker() {
		super("W");
		
	}

	public Double total(int work_for_week1,int work_for_week2,int work_for_week3,int work_for_week4,int year_of_start){
		Double week1 = overWorkSalary(work_for_week1);
		Double week2 = overWorkSalary(work_for_week2);
		Double week3 = overWorkSalary(work_for_week3);
		Double week4 = overWorkSalary(work_for_week4);
		Double severance = severancePay(year_of_start);
		Double dayofwork = dayOfWork();
		return dayofwork + week1 + week2 + week3 + week4 + severance ;
	}
	
	
}
