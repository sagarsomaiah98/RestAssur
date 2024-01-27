package com.rest.serialization;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rest.pojo.Records;
import com.rest.pojo.Students;
import com.rest.util.MappperUtil;
import com.rest.util.Xls_Reader;





public class StudentRecordsSerialize {
	Xls_Reader xls;
	int totalRows;
	static List<String> regNo= new ArrayList<String>();
	static List<String> name=new ArrayList<String>();
	static List<String> gender= new ArrayList<String>();
	static List<Students> stud= new ArrayList<Students>();
	Students student= new Students();
	Records record= new Records();

	@Test
  public void jsonCreate() {	
		xls=new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\java\\com\\rest\\testData\\DATA.xlsx");
	 totalRows=xls.getRowCount("STUDENT");
	for(int i=2;i<=totalRows;i++) {
		regNo.add(xls.getCellData("STUDENT", "REG_NO", i));
		name.add(xls.getCellData("STUDENT", "NAME", i));
		gender.add(xls.getCellData("STUDENT", "GENDER", i));
		student.setName(name.get(i-2));	
		student.setRegno(regNo.get(i-2));
		student.setGender(gender.get(i-2));		 
		stud.add(student);
		
		 record.setStudents(stud);
		
		

}
	try {
		System.out.println(MappperUtil.mapper(record));
		 FileWriter output = new FileWriter(System.getProperty("user.dir")+"\\src\\test\\java\\com\\rest\\testData\\Student.json");
		 output.write(MappperUtil.mapper(record));
		 output.close();
	} catch (Exception e) {
		
		e.printStackTrace();
	}

}
}
