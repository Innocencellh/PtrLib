package in.srain.cube.views.ptr.loadmore;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import in.srain.cube.views.ptr.R;

public class LoadMoreDefaultFooterView extends RelativeLayout implements LoadMoreUIHandler {

    private ProgressBar progressBar;
    private TextView mTextView;

    public LoadMoreDefaultFooterView(Context context) {
        this(context, null);
    }

    public LoadMoreDefaultFooterView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoadMoreDefaultFooterView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setupViews();
    }

    private void setupViews() {
        LayoutInflater.from(getContext()).inflate(R.layout.cube_ptr_load_more_default_footer, this);
        progressBar = (ProgressBar) findViewById(R.id.cube_ptr_load_more_default_footer_progressbar);
        mTextView = (TextView) findViewById(R.id.cube_ptr_load_more_default_footer_text_view);
    }

    @Override
    public void onLoading(LoadMoreContainer container) {
        setVisibility(VISIBLE);
        progressBar.setVisibility(VISIBLE);
        mTextView.setText(R.string.cube_ptr_load_more_loading);
    }

    @Override
    public void onLoadFinish(LoadMoreContainer container, boolean empty, boolean hasMore) {
        if (!hasMore) {
            progressBar.setVisibility(View.GONE);
            setVisibility(VISIBLE);
            if (empty) {
                mTextView.setText(R.string.cube_ptr_load_more_loaded_empty);
            } else {
                mTextView.setText(R.string.cube_ptr_load_more_loaded_no_more);
            }
        } else {
            setVisibility(INVISIBLE);
        }
    }

    @Override
    public void onWaitToLoadMore(LoadMoreContainer container) {
        setVisibility(VISIBLE);
        progressBar.setVisibility(View.INVISIBLE);
        mTextView.setText(R.string.cube_ptr_load_more_click_to_load_more);
    }

    @Override
    public void onLoadError(LoadMoreContainer container, int errorCode, String errorMessage) {
        progressBar.setVisibility(View.GONE);
        mTextView.setText(R.string.cube_ptr_load_more_error);
    }
}
