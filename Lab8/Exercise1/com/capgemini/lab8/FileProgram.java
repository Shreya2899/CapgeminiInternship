package com.capgemini.lab8;

import java.io.File;

public class FileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File sm_source=new File("C:\\Users\\user\\eclipse-workspace\\Lab8\\Exercise1\\source.txt"); // initializing  source file
		File sm_target=new File("C:\\Users\\user\\eclipse-workspace\\Lab8\\Exercise1\\target.txt"); // initializing  target file
		CopyDataThread cdt = new CopyDataThread(sm_source,sm_target);
		cdt.start();
	}

}