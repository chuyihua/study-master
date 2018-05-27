package com.study.zx.jvm1;
/**
 * 演示栈溢出:模拟方法调用深度
 * java -Xss128k -cp shop.jar com.study.zx.jvm1.TestStackDeep a
 * -Xss 指定线程的最大栈空间
 * @author Administrator
 *
 */
public class TestStackDeep {
	private static int count = 0;
	/**
	 * recursion：递归
	 * 递归调用 recursion()函数，一直入栈没有出栈，必然导致栈溢出
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
			//StackOverflowError 栈溢出错误
			e.printStackTrace();
		}
	}
}
