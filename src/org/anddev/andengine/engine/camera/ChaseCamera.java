package org.anddev.andengine.engine.camera;

import org.anddev.andengine.entity.IDynamicEntity;

/**
 * @author Nicolas Gramlich
 * @since 15:57:13 - 27.03.2010
 */
public class ChaseCamera extends Camera {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private IDynamicEntity mChaseEntity;

	// ===========================================================
	// Constructors
	// ===========================================================

	public ChaseCamera(final float pX, final float pY, final float pWidth, final float pHeight, final IDynamicEntity pChaseEntity) {
		super(pX, pY, pWidth, pHeight);
		this.mChaseEntity = pChaseEntity;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public void setChaseEntity(final IDynamicEntity pDynamicEntity) {
		this.mChaseEntity = pDynamicEntity;
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public void onUpdate(final float pSecondsElapsed) {
		super.onUpdate(pSecondsElapsed);

		if(this.mChaseEntity != null) {
			this.setCenter(this.mChaseEntity.getCenterX(), this.mChaseEntity.getCenterY());
		}
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
