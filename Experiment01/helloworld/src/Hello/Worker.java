package Hello;

public class Worker extends Employee {

	public int workDay;			//��������
	public double daySalary;	//�չ���
	
	//��дComputeSalary����������*�չ���
	@Override
	public double ComputeSalary() {
		return workDay*daySalary;
	}

	//���캯��
	Worker(int _workDay,double _daySalary){
		daySalary=_daySalary;
		workDay=_workDay;
	}
}
//=