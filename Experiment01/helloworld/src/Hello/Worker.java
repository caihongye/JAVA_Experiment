package Hello;

public class Worker extends Employee {

	public int workDay;			//工作天数
	public double daySalary;	//日工资
	
	//重写ComputeSalary，工作天数*日工资
	@Override
	public double ComputeSalary() {
		return workDay*daySalary;
	}

	//构造函数
	Worker(int _workDay,double _daySalary){
		daySalary=_daySalary;
		workDay=_workDay;
	}
}
//=