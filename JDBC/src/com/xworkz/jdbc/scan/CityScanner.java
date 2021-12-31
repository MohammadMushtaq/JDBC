package com.xworkz.jdbc.scan;



import com.xworkz.jdbc.dao.CityDao;
import com.xworkz.jdbc.dto.CityDto;

public class CityScanner {

	public static void main(String[] args) {
		
		CityDto CityDto1 = new CityDto(1,"bangalore",150000d,"wounderla");
		CityDto CityDto2 = new CityDto(2,"mysore",100000d,"mysorepalace");
		CityDto CityDto3 = new CityDto(3,"hydrabad",140000d,"charminar");
		CityDto CityDto4 = new CityDto(4,"agra",800000,"tajmahal");
		CityDto CityDto5 = new CityDto(6,"delhi",152055,"gutubminar");
		
		CityDao cityDao = new CityDao();
		/*cityDao.save(CityDto1);
		cityDao.save(CityDto4);
		cityDao.save(CityDto2);
		cityDao.save(CityDto3);*/
	//	cityDao.save(CityDto5);
		
	/*	boolean d= cityDao.deleteById(2);
		System.out.println(d);*/
		
	boolean dis=cityDao.displayById(4);
	System.out.println(dis);
		
	//	boolean dis1=cityDao.displayAll();
	//	System.out.println(dis);
	
	
	}

}
