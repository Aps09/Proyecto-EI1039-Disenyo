package main;

import abstractFeatures.IBasicModel;
import abstractFeatures.IBasicModelView;
import abstractFeatures.IBasicView;
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

	public static void main(String[] args) {
		setUpDefaultConfiguration();
		setUpConfigurationMVVM();
	}
	
	private static void setUpDefaultConfiguration() {
		v = new View();
		vm = new ViewModel();
		m = new Model();
		
		bv = v;
		bvm = vm;
		bm = m;
		
	}
	
	private static void setUpConfigurationMVVM() {
		bvm.setModel(m);
		bvm.setView(v);
		
		bv.setModelView(vm);
	}

}
