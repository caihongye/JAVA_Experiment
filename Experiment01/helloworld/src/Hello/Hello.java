package Hello;
/* 
  作者：chasiny
  日期：2017/11/02
 */
/*
 * 这是一个Java语言入门程序，定义类Hello。
 */
public class Hello {
	// 主方法，作为Java应用程序的默认入口。
	public static void main(String args[]) {
		System.out.println("实验一"); 					//输出实验一
		Worker worker=new Worker(3,100);				//定义一般工人
		Manager magnager=new Manager(5000);				//定义经理
		Salesman salesman=new Salesman(2000,3000,0.5);	//定义销售员

		System.out.println("一般工人工资为："+worker.ComputeSalary()); 					//输出一般工人工资
		System.out.println("经理工资为："+magnager.ComputeSalary()); 					//输出经理工资
		System.out.println("销售员工资为："+salesman.ComputeSalary()); 					//输出销售员工资
	}
}
