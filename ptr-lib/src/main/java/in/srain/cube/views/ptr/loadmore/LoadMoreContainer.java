package in.srain.cube.views.ptr.loadmore;

import android.view.View;
import android.widget.AbsListView;

public interface LoadMoreContainer {

    public void setShowLoadingForFirstPage(boolean showLoading);

    public void setAutoLoadMore(boolean autoLoadMore);

    public void setOnScrollListener(AbsListView.OnScrollListener l);

    public void setLoadMoreView(View view);

    public void setLoadMoreUIHandler(LoadMoreUIHandler handler);

    public void setLoadMoreHandler(LoadMoreHandler handler);

    /**
     * When data has loaded
     *
     * @param emptyResult boolean
     * @param hasMore     boolean
     */
    public void loadMoreFinish(boolean emptyResult, boolean hasMore);

    /**
     * When something unexpected happened while loading the data
     *
     * @param errorCode    int
     * @param errorMessage String
     */
    public void loadMoreError(int errorCode, String errorMessage);
}
