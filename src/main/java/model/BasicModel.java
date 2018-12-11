package model;

import abstractFeatures.IBasicModel;
import abstractFeatures.IModelFunctionality;
import configuration.IConfigureDao;
import dao.DaoContacto;
import dao.DaoEmail;
import dao.DaoTelefono;
import messages.IObservable;
import messages.Message;
import messages.NotificationCenter;

public abstract class BasicModel implements IBasicModel, IModelFunctionality, IObservable{
	
	protected DaoContacto daoContacto;
	protected DaoEmail daoEmail;
	protected DaoTelefono daoTelefono;
	
	protected void configureDao(IConfigureDao config) {
		daoContacto = config.getDaoContacto();
		daoEmail = config.getDaoEmail();
		daoTelefono = config.getDaoTelefono();
	}
	
	protected void notify(Message message) {
		NotificationCenter nc = NotificationCenter.getInstance();
		nc.notify(this, message);
	}

}
