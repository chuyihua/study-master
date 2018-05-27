package com.study.zx.jvm1;
/**
 * 执行jar包中类的main方法
 * java -Xmx32m -cp shop.jar com.study.zx.jvm1.SimpleArgs a
 * -Xmx32m 设置最大可用堆空间为32m
 * -cp 参数后面是类路径，是指定给解释器到哪里找到你的.class文件
 * a args参数（多个空格隔开）
 */
public class SimpleArgs {
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			System.out.println("参数"+(i+1)+":"+args[i]);
		}
		//打印系统的最大可用堆内存：-Xmx 
		System.out.println("-Xmx"+Runtime.getRuntime().maxMemory()/1000/1000+"M");
	}
}
