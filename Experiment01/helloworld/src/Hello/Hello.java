package Hello;
/* 
  ���ߣ�chasiny
  ���ڣ�2017/11/02
 */
/*
 * ����һ��Java�������ų��򣬶�����Hello��
 */
public class Hello {
	// ����������ΪJavaӦ�ó����Ĭ����ڡ�
	public static void main(String args[]) {
		System.out.println("ʵ��һ"); 					//���ʵ��һ
		Worker worker=new Worker(3,100);				//����һ�㹤��
		Manager magnager=new Manager(5000);				//���徭��
		Salesman salesman=new Salesman(2000,3000,0.5);	//��������Ա

		System.out.println("һ�㹤�˹���Ϊ��"+worker.ComputeSalary()); 					//���һ�㹤�˹���
		System.out.println("������Ϊ��"+magnager.ComputeSalary()); 					//���������
		System.out.println("����Ա����Ϊ��"+salesman.ComputeSalary()); 					//�������Ա����
	}
}
