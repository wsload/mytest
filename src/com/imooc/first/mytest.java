package com.imooc.first;

import java.text.SimpleDateFormat;
import java.util.Date;

public class mytest {
	
	public static int max(int a,int b){
		int[] t=new int[2];
		t[((a-b)>>31)+1]=a;
		t[((b-a)>>31)+1]=b;
		
		return t[1];
		
	}
	
	
		
	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(sdf.format(date)x);
		
	}
}
