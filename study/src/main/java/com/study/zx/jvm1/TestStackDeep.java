package com.study.zx.jvm1;
/**
 * ��ʾջ���:ģ�ⷽ���������
 * java -Xss128k -cp shop.jar com.study.zx.jvm1.TestStackDeep a
 * -Xss ָ���̵߳����ջ�ռ�
 * @author Administrator
 *
 */
public class TestStackDeep {
	private static int count = 0;
	/**
	 * recursion���ݹ�
	 * �ݹ���� recursion()������һֱ��ջû�г�ջ����Ȼ����ջ���
	 */
	public static void recursion() {
		count++;
		recursion();
	}
	public static void main(String[] args) {
		try {
			recursion();
		} catch (Exception e) {
			System.out.println("deep of call = "+count);
			//StackOverflowError ջ�������
			e.printStackTrace();
		}
	}
}
