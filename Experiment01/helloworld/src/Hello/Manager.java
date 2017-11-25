package Hello;

public class Manager extends Employee {

	public double baseSalary;	//基本工资
	
	//重写ComputeSalary，工资为基本工资
	@Override
	public double ComputeSalary() {
		return baseSalary;
	}

	//构造函数
	Manager(double _baseSalary){
		baseSalary=_baseSalary;
	}

}
