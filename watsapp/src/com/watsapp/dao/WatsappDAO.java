package com.watsapp.dao;

public class WatsappDAO implements WatsappDAOInterface
{
	private WatsappDAO() {}

	public static WatsappDAOInterface createObject() {
		// TODO Auto-generated method stub
		return new WatsappDAO();
	}

	@Override
	public int createProfileDAO() {
		// TODO Auto-generated method stub
		return 1;
	}

}
