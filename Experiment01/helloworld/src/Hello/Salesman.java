package Hello;

public class Salesman extends Employee {

	public double baseSalary;	//��������
	public double saleVolume;	//���۶�
	public double saleRate;		//��ɱ�
	
	//��дComputeSalary����������+���۶�*��ɱ�
	@Override
	public double ComputeSalary() {
		return baseSalary+saleVolume*saleRate;
	}

	//���캯��
	Salesman(double _baseSalary,double _saleVolume,double _saleRate){
		baseSalary=_baseSalary;
		saleVolume=_saleVolume;
		saleRate=_saleRate;
	}
}
