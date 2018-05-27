package com.study.zx.jvm1;
/**
 *ջ�Ϸ���
 * java -server -Xmx10m -Xms10m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:-UseTLAB -XX:+EliminateAllocations -cp shop.jar com.study.zx.jvm1.OnStackTest s
 * -server ����serverģʽִ�г�����Ϊֻ����serverģʽ�²ſ����������ݷ���
 * -Xmx10m ָ���ѿռ�
 * -Xms10m ָ����ʼ��ջ�ռ�
 * -XX:+DoEscapeAnalysis �������ݷ���
 * -XX:+PrintGC ��ӡGC��־
 * -XX:-UseTLAB �ر�TLAB
 * -XX:+EliminateAllocations ���������滻��Ĭ�ϴ򿪣������������ɢ������ջ�ϣ����磺user������id��name�����ֶΣ�name�������ֶν��ᱻ��Ϊ�����ľֲ��������з���
 * @author Administrator
 *
 */
public class OnStackTest {
//	public static User user;//�ֲ�������һ�����ݵ�User����
	public static class User{
		public int id=0;
		public String name = "";
	}
	public static void alloc() {
//		user = new User();
		User user = new User(); //�ֲ�������һ�������ݵĶ���
		user.id=5;
		user.name="shop";
	}
	public static void main(String[] args) {
		long b = System.currentTimeMillis();
		for(int i=0;i<100000000;i++) {
			//����һ�ڴ�alloc()���ý��ж��󴴽�
			alloc();
		}
		long e = System.currentTimeMillis();
		System.out.println("��ʱ��"+(e-b));
	}
}
