package com.hxlxz.zxl;

import java.util.Scanner;

public class Initail {

	int flag=0;
	static String[] books = {"高数","数据结构","语文","英语"};
	public static void main(String[] args){
		int findBook=0;
		System.out.println("输入命令：1-按照名称查找图书；2-按照序号查找图书.");
		
		/**************************测试部分**********************************
		******************************************************************/
		
		/**************************测试部分**********************************
		******************************************************************/	
		Initail findWay = new Initail();
		while(true){
			try{
				findBook = findWay.InputFindWay();
				break;
			}catch(InputErrorException iee){
				iee.printStackTrace();
				System.out.println("输入命令不正确！请重新输入：");
			}
		}
		
		if(findBook == 1){	//name
			System.out.println("请输入图书名称：");
			Initail fb = new Initail();
			while(true){
				try{
					fb.findName();
					break;
				}catch(BookNameNotExsitException bnnee){
					bnnee.printStackTrace();
					System.out.println("图书不存在！");
				}
			}
		}else{
			int bookNum=0;
			System.out.println("请输入图书序号：");
			Initail fb2 = new Initail();
			while(true){
				try{
					bookNum = fb2.findNum();
					break;
				}catch(BookNumNotExsitException bnnee){
					bnnee.printStackTrace();
					System.out.println("序号命令不正确！请重新输入图书序号：");
				}catch(BookNotExsitException bnee){
					bnee.printStackTrace();
					System.out.println("图书不存在！");
				}
			}
			System.out.println("book："+books[bookNum]);
		}	
	}
	private int InputFindWay() throws InputErrorException{
		int bookFind;
		Scanner sc = new Scanner(System.in);
		bookFind = sc.nextInt();
		if(bookFind!=1 && bookFind!=2){
			throw new InputErrorException();
		}
		return bookFind;
	}
	private int findNum() throws BookNumNotExsitException,BookNotExsitException{
		int bookNum=0;
		Scanner bn2 = new Scanner(System.in);
		bookNum = bn2.nextInt()-1;
		if(bookNum>9||bookNum<0){
			throw new BookNumNotExsitException();
		}
		if(bookNum>books.length){
			throw new BookNotExsitException();
		}
		return bookNum;
	}
	private void findName() throws BookNameNotExsitException{
		String  bookName=null;
		Scanner bn = new Scanner(System.in);
		bookName = bn.nextLine();
		for(int i=0;i<books.length;i++){
			if(bookName.equals(books[i])){
				System.out.println("book:"+books[i]);
				flag = 1;
				break;
			}
		}
		if(flag == 0){
			throw new BookNameNotExsitException();
		}else{
			
		}
	}

}
