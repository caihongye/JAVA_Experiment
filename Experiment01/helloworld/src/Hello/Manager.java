package Hello;

public class Manager extends Employee {

	public double baseSalary;	//��������
	
	//��дComputeSalary������Ϊ��������
	@Override
	public double ComputeSalary() {
		return baseSalary;
	}

	//���캯��
	Manager(double _baseSalary){
		baseSalary=_baseSalary;
	}

}
