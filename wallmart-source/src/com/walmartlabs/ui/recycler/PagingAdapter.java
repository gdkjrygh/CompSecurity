// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            BasicAdapter, BasicViewHolder

public abstract class PagingAdapter extends BasicAdapter
{
    public static abstract class DefaultLoader
        implements Loader
    {

        private Loader.ResultCallback mCallback;

        protected void notifyBatchLoaded(List list, boolean flag)
        {
            if (mCallback != null)
            {
                mCallback.onBatchLoaded(list, flag);
            }
        }

        protected void notifyLoadFailed(String s, boolean flag)
        {
            if (mCallback != null)
            {
                mCallback.onLoadFailed(s, flag);
            }
        }

        public void reset()
        {
        }

        public void setCallback(Loader.ResultCallback resultcallback)
        {
            mCallback = resultcallback;
        }

        public DefaultLoader()
        {
        }
    }

    public static interface Loader
    {

        public abstract void loadMore(int i);

        public abstract void reset();

        public abstract void setCallback(ResultCallback resultcallback);
    }

    public static interface Loader.ResultCallback
    {

        public abstract void onBatchLoaded(List list, boolean flag);

        public abstract void onLoadFailed(String s, boolean flag);
    }

    public static class LoadingIndicatorViewHolder extends BasicViewHolder
    {

        private TextView mLoadingTextView;

        public void setLoadingText(String s)
        {
            mLoadingTextView.setText(s);
            TextView textview = mLoadingTextView;
            int i;
            if (!TextUtils.isEmpty(s))
            {
                i = 0;
            } else
            {
                i = 8;
            }
            textview.setVisibility(i);
        }

        public LoadingIndicatorViewHolder(View view)
        {
            super(view);
            mLoadingTextView = (TextView)itemView.findViewById(com.walmart.lib.R.id.loading_text);
        }
    }


    private static final String TAG = com/walmartlabs/ui/recycler/PagingAdapter.getSimpleName();
    private static final int VIEW_TYPE_LOADING_INDICATOR;
    private final List mItems = new ArrayList();
    private Loader mLoader;
    private boolean mLoading;
    private boolean mLoadingComplete;

    public PagingAdapter()
    {
    }

    private int getLoadingIndicatorPosition()
    {
        if (mLoadingComplete)
        {
            return -1;
        } else
        {
            return mItems.size();
        }
    }

    private void loadMoreItems()
    {
        if (!mLoading && !mLoadingComplete && mLoader != null)
        {
            WLog.d(TAG, "loadMoreItems(): Requesting new batch (mLoading == true)");
            mLoading = true;
            mLoader.loadMore(mItems.size());
            return;
        }
        if (mLoading)
        {
            WLog.d(TAG, "loadMoreItems(): Ignoring load request, already in progress");
            return;
        }
        if (mLoadingComplete)
        {
            WLog.d(TAG, "loadMoreItems(): Ignoring load request, loading has already completed");
            return;
        } else
        {
            WLog.w(TAG, "loadMoreItems(): Ignoring load request, there is no loader available");
            return;
        }
    }

    public void deliverResult(List list, boolean flag)
    {
        String s1 = TAG;
        StringBuilder stringbuilder = (new StringBuilder()).append("deliverResult(): ");
        String s;
        if (list != null)
        {
            s = (new StringBuilder()).append("Batch size is ").append(list.size()).toString();
        } else
        {
            s = "Batch == null";
        }
        WLog.d(s1, stringbuilder.append(s).append(" (moreData == ").append(flag).append(")").toString());
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mLoadingComplete = flag;
        if (mLoadingComplete)
        {
            notifyItemRemoved(mItems.size());
        }
        if (list != null)
        {
            int i = mItems.size();
            mItems.addAll(list);
            if (i == 0)
            {
                notifyDataSetChanged();
            } else
            {
                notifyItemRangeInserted(i, list.size());
            }
        }
        WLog.d(TAG, "deliverResult(): Batch done (mLoading == false)");
        mLoading = false;
    }

    public void done()
    {
        deliverResult(null, false);
    }

    public final int getDataItemCount()
    {
        return mItems.size();
    }

    public final Object getItem(int i)
    {
        if (i < mItems.size())
        {
            return mItems.get(i);
        } else
        {
            return null;
        }
    }

    public final int getItemCount()
    {
        if (mLoadingComplete)
        {
            return mItems.size();
        } else
        {
            return mItems.size() + 1;
        }
    }

    public final int getItemViewType(int i)
    {
        if (i < mItems.size())
        {
            return super.getItemViewType(i);
        } else
        {
            return VIEW_TYPE_LOADING_INDICATOR;
        }
    }

    protected String getLoadingText()
    {
        return null;
    }

    public final boolean isFixedSection(int i)
    {
        return getItemViewType(i) == VIEW_TYPE_LOADING_INDICATOR;
    }

    public abstract void onBindItemViewHolder(BasicViewHolder basicviewholder, Object obj, int i);

    public final BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        if (i == VIEW_TYPE_LOADING_INDICATOR)
        {
            return new LoadingIndicatorViewHolder(LayoutInflater.from(viewgroup.getContext()).inflate(com.walmart.lib.R.layout.paging_adapter_loading_item, viewgroup, false));
        } else
        {
            return onCreateItemViewHolder(viewgroup, i);
        }
    }

    public abstract BasicViewHolder onCreateItemViewHolder(ViewGroup viewgroup, int i);

    public final void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        if (basicviewholder.getItemViewType() != VIEW_TYPE_LOADING_INDICATOR)
        {
            onBindItemViewHolder(basicviewholder, mItems.get(i), i);
            return;
        } else
        {
            ((LoadingIndicatorViewHolder)basicviewholder).setLoadingText(getLoadingText());
            return;
        }
    }

    public void onSettledAtVisibleRange(int i, int j)
    {
        super.onSettledAtVisibleRange(i, j);
        if (getLoadingIndicatorPosition() == j)
        {
            WLog.d(TAG, "Last visible position is the loading indicator, triggering load");
            loadMoreItems();
        }
    }

    public final void reload()
    {
        reset();
        loadMoreItems();
    }

    public final void reset()
    {
        reset(true);
    }

    public final void reset(boolean flag)
    {
        if (mLoader != null)
        {
            mLoader.reset();
        }
        mItems.clear();
        mLoadingComplete = false;
        mLoading = false;
        if (flag)
        {
            notifyDataSetChanged();
        }
    }

    public void setAndStartLoader(Loader loader)
    {
        setLoader(loader);
        startLoading();
    }

    public void setLoader(Loader loader)
    {
        reset(false);
        mLoader = loader;
        if (mLoader != null)
        {
            mLoader.setCallback(new Loader.ResultCallback() {

                final PagingAdapter this$0;

                public void onBatchLoaded(List list, boolean flag)
                {
                    deliverResult(list, flag);
                }

                public void onLoadFailed(String s, boolean flag)
                {
                    PagingAdapter pagingadapter = PagingAdapter.this;
                    if (!flag)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    pagingadapter.deliverResult(null, flag);
                    WLog.d(PagingAdapter.TAG, (new StringBuilder()).append("onLoadFailed(): ").append(s).toString());
                }

            
            {
                this$0 = PagingAdapter.this;
                super();
            }
            });
        }
        notifyDataSetChanged();
    }

    public void startLoading()
    {
        loadMoreItems();
    }

    static 
    {
        VIEW_TYPE_LOADING_INDICATOR = com.walmart.lib.R.layout.paging_adapter_loading_item;
    }

}
