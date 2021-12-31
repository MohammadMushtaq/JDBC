package com.xworkz.jdbc.scan;

import com.xworkz.jdbc.dao.ClubDAO;
import com.xworkz.jdbc.dto.ClubDTO;

public class ClubScanner {

	public static void main(String[] args) {
		
		ClubDTO clubDTO1= new ClubDTO(1,"seaclub","chandapura",50);
		ClubDTO clubDTO2= new ClubDTO(2,"seaclub","chandapura",50);
		ClubDTO clubDTO3= new ClubDTO(3,"seaclub","chandapura",50);
		ClubDTO clubDTO4= new ClubDTO(4,"seaclub","chandapura",50);
		
		ClubDAO clubDAO= new ClubDAO();
	//	clubDAO.save(clubDTO1);
	//	clubDAO.save(clubDTO2);
	//	clubDAO.save(clubDTO3);
	//	clubDAO.save(clubDTO4);

	//	boolean delete=clubDAO.deleteById(2);
	//	System.out.println(delete);
		
		boolean dis=clubDAO.displayById(1);
	//	System.out.println(dis);
		
		boolean dis1=clubDAO.displayAll();
		System.out.println(dis1);
	}

}
