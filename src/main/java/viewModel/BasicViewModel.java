package viewModel;

import abstractFeatures.IBasicModelView;
import abstractFeatures.IModelFunctionality;
import abstractFeatures.IModelViewFunctionality;
import abstractFeatures.IViewFunctionality;

public abstract class BasicViewModel implements IBasicModelView, IModelViewFunctionality{
	
	protected IModelFunctionality model;
	protected IViewFunctionality view;

	@Override
	public void setModel(IModelFunctionality model) {
		this.model = model;
		
	}

	@Override
	public void setView(IViewFunctionality view) {
		this.view = view;
		
	}

}
