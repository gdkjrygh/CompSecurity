// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public abstract class PagingShelfListAdapter extends BaseAdapter
{
    public class GetListDataCallback
    {

        final PagingShelfListAdapter this$0;

        public void onDataReceived(Object aobj[], boolean flag)
        {
        }

        public void onGetDataFailed()
        {
        }

        public GetListDataCallback()
        {
            this$0 = PagingShelfListAdapter.this;
            super();
        }
    }

    public static interface InitialPageLoadedListener
    {

        public abstract void onInitialPageLoaded();
    }

    private class PageLoader
    {

        private int mCurrentPageLoading;
        private int mFirstPageNumber;
        private int mLastPageLoaded;
        final PagingShelfListAdapter this$0;

        private void loadPage(int i)
        {
            GetListDataCallback getlistdatacallback = new GetListDataCallback() {

                final PageLoader this$1;

                public void onDataReceived(Object aobj[], boolean flag)
                {
                    WLog.d(PagingShelfListAdapter.TAG, (new StringBuilder()).append("onDataReceived() isLastPage=").append(flag).toString());
                    if (flag)
                    {
                        mAllPagesLoaded = true;
                    }
                    Collections.addAll(mDataList, aobj);
                    mLastPageLoaded = mCurrentPageLoading;
                    mCurrentPageLoading = PagingShelfListAdapter.CURRENT_PAGE_NONE;
                    notifyDataSetChanged();
                    if (mLastPageLoaded == mFirstPageNumber && mInitialPageLoadedListener != null)
                    {
                        mInitialPageLoadedListener.onInitialPageLoaded();
                    }
                }

                public void onGetDataFailed()
                {
                    mCurrentPageLoading = PagingShelfListAdapter.CURRENT_PAGE_NONE;
                }

            
            {
                this$1 = PageLoader.this;
                super();
            }
            };
            getListData(getlistdatacallback, i, mPageSize);
        }

        private void setLastPageLoaded(int i)
        {
            mLastPageLoaded = i;
        }

        public void loadNextPage()
        {
            int i = mLastPageLoaded + 1;
            if (mCurrentPageLoading != i)
            {
                WLog.d(PagingShelfListAdapter.TAG, (new StringBuilder()).append("loadNextPage(): ").append(i).toString());
                mCurrentPageLoading = i;
                loadPage(mCurrentPageLoading);
                return;
            } else
            {
                WLog.d(PagingShelfListAdapter.TAG, (new StringBuilder()).append("loadNextPage() already loading: ").append(i).append(" ignoring...").toString());
                return;
            }
        }

        public void setFirstPageNumber(int i)
        {
            mFirstPageNumber = i;
            setLastPageLoaded(i - 1);
        }




/*
        static int access$602(PageLoader pageloader, int i)
        {
            pageloader.mLastPageLoaded = i;
            return i;
        }

*/



/*
        static int access$702(PageLoader pageloader, int i)
        {
            pageloader.mCurrentPageLoading = i;
            return i;
        }

*/


        private PageLoader()
        {
            this$0 = PagingShelfListAdapter.this;
            super();
            mLastPageLoaded = -1;
            mCurrentPageLoading = PagingShelfListAdapter.CURRENT_PAGE_NONE;
        }

    }


    private static int CURRENT_PAGE_NONE = 0;
    private static final int ITEM_ID_DEFAULT = 0;
    private static final int ITEM_ID_LOADING_FOOTER = 1;
    private static final String TAG = com/walmartlabs/ui/PagingShelfListAdapter.getSimpleName();
    private boolean mAllPagesLoaded;
    private ArrayList mDataList;
    private LayoutInflater mInflater;
    private InitialPageLoadedListener mInitialPageLoadedListener;
    private int mListItemLayoutID;
    private View mLoadingFooterView;
    private int mLoadingLayoutID;
    private PageLoader mPageLoader;
    private int mPageSize;

    public PagingShelfListAdapter(Context context, int i, int j)
    {
        mPageSize = 20;
        mDataList = new ArrayList(100);
        mInflater = LayoutInflater.from(context);
        mListItemLayoutID = i;
        mPageLoader = new PageLoader();
        mLoadingLayoutID = j;
    }

    private int getLoadingViewIndex()
    {
        if (mAllPagesLoaded)
        {
            return -1;
        } else
        {
            return getDataCount();
        }
    }

    public int getCount()
    {
        int j = mDataList.size();
        int i = j;
        if (!mAllPagesLoaded)
        {
            i = j + 1;
        }
        return i;
    }

    public int getDataCount()
    {
        return mDataList.size();
    }

    public Object getItem(int i)
    {
        if (i < 0 || i >= mDataList.size())
        {
            return null;
        } else
        {
            return mDataList.get(i);
        }
    }

    public Object getItemData(int i)
    {
        if (i < 0 || i >= mDataList.size())
        {
            return null;
        } else
        {
            return mDataList.get(i);
        }
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public int getItemViewType(int i)
    {
        return i != getLoadingViewIndex() ? 0 : 1;
    }

    public abstract void getListData(GetListDataCallback getlistdatacallback, int i, int j);

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (i == getLoadingViewIndex())
        {
            if (mLoadingFooterView == null)
            {
                mLoadingFooterView = mInflater.inflate(mLoadingLayoutID, viewgroup, false);
            }
            view = mLoadingFooterView;
            onWillDisplayLoadingView(view);
            mPageLoader.loadNextPage();
            return view;
        }
        boolean flag = true;
        View view1 = view;
        if (view == null)
        {
            view1 = mInflater.inflate(mListItemLayoutID, viewgroup, false);
            flag = false;
        }
        populateView(view1, mDataList.get(i), i, flag);
        return view1;
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public void loadInitialPage(int i, int j)
    {
        mPageSize = i;
        mPageLoader.setFirstPageNumber(j);
        mPageLoader.loadNextPage();
    }

    public abstract void onWillDisplayLoadingView(View view);

    public abstract void populateView(View view, Object obj, int i, boolean flag);

    public void setInitialPage(Object aobj[], int i, boolean flag)
    {
        mPageLoader.setLastPageLoaded(i);
        mDataList.addAll(Arrays.asList(aobj));
        mAllPagesLoaded = flag;
    }

    public void setInitialPageLoadedListener(InitialPageLoadedListener initialpageloadedlistener)
    {
        mInitialPageLoadedListener = initialpageloadedlistener;
    }

    public void setPageSize(int i)
    {
        mPageSize = i;
    }

    static 
    {
        CURRENT_PAGE_NONE = -1;
    }





/*
    static boolean access$402(PagingShelfListAdapter pagingshelflistadapter, boolean flag)
    {
        pagingshelflistadapter.mAllPagesLoaded = flag;
        return flag;
    }

*/


}
