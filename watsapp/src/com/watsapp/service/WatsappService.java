package com.watsapp.service;

import com.watsapp.dao.WatsappDAO;
import com.watsapp.dao.WatsappDAOInterface;
import com.watsapp.entity.WatsappEmployee;

public class WatsappService implements WatsappServiceInterface
{
    private WatsappService() {}
	public static WatsappServiceInterface CreateServiceObject() {
		// TODO Auto-generated method stub
		return new WatsappService();
	}
	@Override
	public int createProfile(WatsappEmployee we) {
		// TODO Auto-generated method stub
		WatsappDAOInterface id=WatsappDAO.createObject();
		
		return id.createProfileDAO();
	}
	

}
