package in.srain.cube.views.ptr;

import in.srain.cube.views.ptr.indicator.PtrIndicator;

/**
 *
 */
public interface PtrUIHandler {

    /**
     * When the content view has reached top and refresh has been completed, view will be reset.
     *
     * @param frame PtrFrameLayout
     */
    void onUIReset(PtrFrameLayout frame);

    /**
     * prepare for loading
     *
     * @param frame PtrFrameLayout
     */
    void onUIRefreshPrepare(PtrFrameLayout frame);

    /**
     * perform refreshing UI
     *
     * @param frame PtrFrameLayout
     */
    void onUIRefreshBegin(PtrFrameLayout frame);

    /**
     * perform UI after refresh
     *
     * @param frame PtrFrameLayout
     */
    void onUIRefreshComplete(PtrFrameLayout frame);

    /**
     * @param frame        PtrFrameLayout
     * @param isUnderTouch boolean
     * @param status       byte
     * @param ptrIndicator PtrIndicator
     */
    void onUIPositionChange(PtrFrameLayout frame, boolean isUnderTouch, byte status, PtrIndicator ptrIndicator);
}
