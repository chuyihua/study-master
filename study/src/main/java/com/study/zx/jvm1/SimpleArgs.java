package com.study.zx.jvm1;
/**
 * ִ��jar�������main����
 * java -Xmx32m -cp shop.jar com.study.zx.jvm1.SimpleArgs a
 * -Xmx32m ���������öѿռ�Ϊ32m
 * -cp ������������·������ָ�����������������ҵ����.class�ļ�
 * a args����������ո������
 */
public class SimpleArgs {
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			System.out.println("����"+(i+1)+":"+args[i]);
		}
		//��ӡϵͳ�������ö��ڴ棺-Xmx 
		System.out.println("-Xmx"+Runtime.getRuntime().maxMemory()/1000/1000+"M");
	}
}
