package com.sist.controller;
//com.sist.model.MainController를 넘겨줘야..할당받음
import java.io.*;
public class FileConfig {
	public static void main(String[] args) {
		FileConfig fc=new FileConfig();
		fc.componentScan("com.sist.model");
	}
	
	public void componentScan(String pack)
	{
		try{
			String path="C:\\webDev\\webStudy\\MVCAnnotaionProject\\src\\";
			path=path+pack.replace(".", "\\");
			File dir=new File(path);
			File[] files=dir.listFiles();
			for(File f:files)
			{
				System.out.println(f.getName());
				String str=pack+"."+f.getName().substring(f.getName().lastIndexOf("."));
				
				System.out.println(pack);
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
