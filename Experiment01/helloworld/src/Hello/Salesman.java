package Hello;

public class Salesman extends Employee {

	public double baseSalary;	//基本工资
	public double saleVolume;	//销售额
	public double saleRate;		//提成比
	
	//重写ComputeSalary，基本工资+销售额*提成比
	@Override
	public double ComputeSalary() {
		return baseSalary+saleVolume*saleRate;
	}

	//构造函数
	Salesman(double _baseSalary,double _saleVolume,double _saleRate){
		baseSalary=_baseSalary;
		saleVolume=_saleVolume;
		saleRate=_saleRate;
	}
}
