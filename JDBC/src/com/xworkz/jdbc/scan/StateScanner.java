package com.xworkz.jdbc.scan;

import com.xworkz.jdbc.dao.StateDao;
import com.xworkz.jdbc.dto.StateDto;


public class StateScanner {

	public static void main(String[] args) {
		
	StateDto stateDto = new StateDto(1,"karnataka",91,"bangalore");
	StateDto stateDto1 = new StateDto(2,"kerala",81,"Kochi");
	StateDto stateDto2 = new StateDto(3,"tamilnadu",91,"chennai");
	StateDto stateDto3 = new StateDto(4,"maharasta",91,"mumbai");
	
	StateDao stateDao = new StateDao();
//	stateDao.save(stateDto);
//	stateDao.save(stateDto1);
//	stateDao.save(stateDto2);
//	stateDao.save(stateDto3);
	
//	boolean del=stateDao.deleteById(1);
//	System.out.println(del);
	
	boolean dis=stateDao.displayById(2);
	System.out.println(dis);
//	boolean dis=stateDao.displayAll();
//System.out.println(dis);


	}

}
