package com.xworkz.jdbc.scan;

import com.xworkz.jdbc.dao.FestivalDao;

import com.xworkz.jdbc.dto.FestivalDto;

public class FeestivalScanner {

	public static void main(String[] args) {
		
		FestivalDto festivalDto= new FestivalDto(1,"deepawali",10,"tamilNadu");
		FestivalDto festivalDto1= new FestivalDto(2,"sankranti",7,"karnataka");
		FestivalDto festivalDto2= new FestivalDto(3,"lodi",9,"punjab");
		FestivalDto festivalDto3= new FestivalDto(4,"navrattri",10,"gujrat");
		FestivalDto festivalDto4= new FestivalDto(5,"navrattri",10,"gujrat");
		
		FestivalDao f= new FestivalDao();
	//	f.save(festivalDto4);
	//	f.save(festivalDto1);
	//	f.save(festivalDto2);
	//	f.save(festivalDto3);
		
		
	//	boolean remove=f.deleteById(2);
	//	System.out.println(remove);

		//boolean dis=f.displayById(1);
		
				boolean dis=f.displayAll();
			System.out.println(dis);
		
		
		
		
	}

}
