package Hello;

import java.util.Scanner;


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
        while (true) {
            System.out.println("now I create a number between 0 and 100,you can guess it");
            int randomNum = (int) (Math.random() * 100) + 1;
            int inNum;
            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.println("input your num:");
                inNum = input.nextInt();
                if (inNum == randomNum) {
                    System.out.println("you are right!");
                    break;
                } else if (inNum >= randomNum) {
                    System.out.println("your num is bigger than my num!");
                } else {
                    System.out.println("your num is smaller than my num!");
                }
            }
            System.out.println("randomNum is " + randomNum);
            System.out.println("input 0 to exit ,1 to continue.");
            inNum = input.nextInt();
            if(inNum==0){
                break;
            }else {
                continue;
            }
        }
    }
}
