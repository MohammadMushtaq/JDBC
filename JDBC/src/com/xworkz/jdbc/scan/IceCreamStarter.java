package com.xworkz.jdbc.scan;

import com.xworkz.jdbc.dao.IceCreamDao;
import com.xworkz.jdbc.dto.IceCreamDto;

public class IceCreamStarter {

	public static void main(String[] args) {
		IceCreamDto iceCreamDto = new IceCreamDto(1,"venella","chocolate",40);
		IceCreamDto iceCreamDto1 = new IceCreamDto(2,"butterscoth","buttersocth",40);
		IceCreamDto iceCreamDto2 = new IceCreamDto(3,"Strawberry","candy",40);
		IceCreamDto iceCreamDto3 = new IceCreamDto(4,"Banana","amul",40);
		
		
		IceCreamDao iceCreamDao = new IceCreamDao();
		
	//	iceCreamDao.save(iceCreamDto);
	//	iceCreamDao.save(iceCreamDto2);
	//	iceCreamDao.save(iceCreamDto1);
	//	iceCreamDao.save(iceCreamDto3);
		
	//	boolean delete=iceCreamDao.deleteById(1);
	//	System.out.println(delete);
		

		//boolean dis=iceCreamDao.displayById(1);
		
				boolean dis=iceCreamDao.displayAll();
			System.out.println(dis);
		
		
	}

}
