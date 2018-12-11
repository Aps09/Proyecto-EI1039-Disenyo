package main;

import abstractFeatures.IBasicModel;
import abstractFeatures.IBasicModelView;
import abstractFeatures.IBasicView;
import configuration.ConfigureDaoFile;
import configuration.IConfigureDao;
import model.BasicModel;
import model.Model;
import view.BasicView;
import view.View;
import viewModel.BasicViewModel;
import viewModel.ViewModel;

public class Main {
	
	@SuppressWarnings("unused")
	private static IBasicModel bm;
	private static IBasicModelView bvm;
	private static IBasicView bv;
	
	private static BasicViewModel vm;
	private static BasicModel m;
	private static BasicView v;
	
	private static IConfigureDao configDao;

	public static void main(String[] args) {
		setUpDefaultConfiguration();
		setUpConfigurationMVVM();
		setUpRelationshipsMVVM();
	}
	
	private static void setUpDefaultConfiguration() {
		configDao = new ConfigureDaoFile();
	}
	
	private static void setUpConfigurationMVVM() {
		v = new View();
		vm = new ViewModel();
		m = new Model(configDao);
		
		bv = v;
		bvm = vm;
		bm = m;
	}
	
	private static void setUpRelationshipsMVVM() {
		bvm.setModel(m);
		bvm.setView(v);
		
		bv.setModelView(vm);
	}

}
