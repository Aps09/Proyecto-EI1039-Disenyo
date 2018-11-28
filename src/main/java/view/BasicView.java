package view;

import abstractFeatures.IBasicView;
import abstractFeatures.IModelViewFunctionality;
import abstractFeatures.IViewFunctionality;

public abstract class BasicView implements IBasicView, IViewFunctionality{
	
	protected IModelViewFunctionality model;

	@Override
	public void setModelView(IModelViewFunctionality model) {
		this.model = model;
	}

}
