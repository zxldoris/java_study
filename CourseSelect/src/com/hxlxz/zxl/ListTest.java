package com.hxlxz.zxl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
	public List<Course> coursesToSelect;
	public ListTest(){
		this.coursesToSelect = new ArrayList<Course>();
	}
	/**
	 * 添加课程
	 */
	public void testAdd(){
		Course cr1 = new Course("1","数据结构");
		coursesToSelect.add(cr1);
		Course tmp0 = coursesToSelect.get(0);
		System.out.println("添加课程："+ tmp0.id +"." + tmp0.name);
		
		Course cr2 = new Course("2","C语言");
		coursesToSelect.add(0, cr2);
		Course tmp1 = coursesToSelect.get(0);
		System.out.println("添加课程：" + tmp1.id + "." + tmp1.name);
		
	//	Course cr3 = new Course("3","test");
	//	coursesToSelect.add(2,cr3);
		
		Course[] course = {new Course("3","离散数学"), new Course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		coursesToSelect.add(0, course[0]);
		Course tmp2 = coursesToSelect.get(2);
		Course tmp3 = coursesToSelect.get(3);
		System.out.println("添加了课程：" + tmp2.id + "." + tmp2.name + "\t" +
				tmp3.id + "." + tmp3.name);
		
		Course[] course2 = {new Course("4","高等数学"),new Course("5","大学英语")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course tmp4 = coursesToSelect.get(2);
		Course tmp5 = coursesToSelect.get(3);
		System.out.println("添加了课程：" + tmp4.id + "." + tmp4.name + "\t" +
				tmp5.id + "." + tmp5.name);
	}
	public void testGet(){
		int size = coursesToSelect.size();
		System.out.println("待选课程：");
		for(int i=0; i<size; i++){
			Course cr = coursesToSelect.get(i);
			System.out.println("课程：" + cr.id + "." + cr.name);
		}
	}
	public static void main(String[] args){
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
	}

}
