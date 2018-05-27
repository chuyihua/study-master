package com.study.zx.jvm1;
/**
 *栈上分配
 * java -server -Xmx10m -Xms10m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:-UseTLAB -XX:+EliminateAllocations -cp shop.jar com.study.zx.jvm1.OnStackTest s
 * -server 启用server模式执行程序，因为只有在server模式下才可以启用逃逸分析
 * -Xmx10m 指定堆空间
 * -Xms10m 指定初始化栈空间
 * -XX:+DoEscapeAnalysis 启用逃逸分析
 * -XX:+PrintGC 打印GC日志
 * -XX:-UseTLAB 关闭TLAB
 * -XX:+EliminateAllocations 开启标量替换（默认打开），允许将对象打散分配在栈上，比如：user对象有id，name两个字段，name这两个字段将会被视为独立的局部变量进行分配
 * @author Administrator
 *
 */
public class OnStackTest {
//	public static User user;//局部变量，一个逃逸的User对象
	public static class User{
		public int id=0;
		public String name = "";
	}
	public static void alloc() {
//		user = new User();
		User user = new User(); //局部变量，一个非逃逸的对象
		user.id=5;
		user.name="shop";
	}
	public static void main(String[] args) {
		long b = System.currentTimeMillis();
		for(int i=0;i<100000000;i++) {
			//进行一亿次alloc()调用进行对象创建
			alloc();
		}
		long e = System.currentTimeMillis();
		System.out.println("耗时："+(e-b));
	}
}
