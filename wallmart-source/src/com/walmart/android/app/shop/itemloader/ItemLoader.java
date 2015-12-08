// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import java.util.List;

public abstract class ItemLoader
{
    public static interface Callback
    {

        public static final int UNKNOWN_TOTAL_COUNT = -1;

        public abstract void onFirstPageLoaded(List list, int i);

        public abstract void onPageLoaded(List list);

        public abstract void onPageLoadingFailed(PageLoadError pageloaderror, int i);
    }

    protected abstract class LoaderRequest extends AsyncCallbackOnThread
    {

        private boolean mIsCancelled;
        final ItemLoader this$0;

        protected void cancel()
        {
            mIsCancelled = true;
        }

        public abstract void onFailed(Integer integer, Object obj);

        public final void onFailureSameThread(Integer integer, Object obj)
        {
            if (!mIsCancelled)
            {
                onFailed(integer, obj);
                mRequestInFlight = null;
            }
        }

        public volatile void onFailureSameThread(Object obj, Object obj1)
        {
            onFailureSameThread((Integer)obj, obj1);
        }

        public abstract void onResponse(Object obj);

        public final void onSuccessSameThread(Object obj)
        {
            if (!mIsCancelled)
            {
                onResponse(obj);
                mOffset = mOffset + mPageSize;
                mRequestInFlight = null;
            }
        }

        protected LoaderRequest(Handler handler)
        {
            this$0 = ItemLoader.this;
            super(handler);
        }
    }

    public static final class PageLoadError extends Enum
    {

        private static final PageLoadError $VALUES[];
        public static final PageLoadError NO_NETWORK;
        public static final PageLoadError NO_RESULTS;
        public static final PageLoadError OTHER;

        public static PageLoadError valueOf(String s)
        {
            return (PageLoadError)Enum.valueOf(com/walmart/android/app/shop/itemloader/ItemLoader$PageLoadError, s);
        }

        public static PageLoadError[] values()
        {
            return (PageLoadError[])$VALUES.clone();
        }

        static 
        {
            NO_NETWORK = new PageLoadError("NO_NETWORK", 0);
            NO_RESULTS = new PageLoadError("NO_RESULTS", 1);
            OTHER = new PageLoadError("OTHER", 2);
            $VALUES = (new PageLoadError[] {
                NO_NETWORK, NO_RESULTS, OTHER
            });
        }

        private PageLoadError(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int NO_EXTRA = -1;
    private boolean mAllItemsLoaded;
    private Callback mCallback;
    private Handler mHandler;
    private int mLoadedCount;
    private int mOffset;
    private int mPageSize;
    private LoaderRequest mRequestInFlight;
    private int mTotalCount;

    public ItemLoader(int i)
    {
        mHandler = new Handler();
        mPageSize = i;
    }

    private void countAndTrack(List list)
    {
        int j = mLoadedCount;
        int i;
        if (list != null)
        {
            i = list.size();
        } else
        {
            i = 0;
        }
        mLoadedCount = i + j;
        if (mLoadedCount >= mTotalCount)
        {
            setAllItemsLoaded();
        }
    }

    protected Handler getHandler()
    {
        return mHandler;
    }

    public boolean hasLoadedAllItems()
    {
        return mAllItemsLoaded;
    }

    public boolean hasRequestInFlight()
    {
        return mRequestInFlight != null;
    }

    protected boolean isFirstPage()
    {
        return mOffset == 0;
    }

    protected abstract LoaderRequest load(int i, int j);

    public void loadNextPage()
    {
        if (!hasRequestInFlight())
        {
            mRequestInFlight = load(mOffset, mPageSize);
        }
    }

    protected void notifyError(PageLoadError pageloaderror)
    {
        notifyError(pageloaderror, -1);
    }

    protected void notifyError(PageLoadError pageloaderror, int i)
    {
        if (mCallback != null)
        {
            mCallback.onPageLoadingFailed(pageloaderror, i);
        }
    }

    protected void notifyFirstPageLoaded(List list, int i)
    {
        mTotalCount = i;
        countAndTrack(list);
        if (mCallback != null)
        {
            mCallback.onFirstPageLoaded(list, i);
        }
    }

    protected void notifyPageLoaded(List list)
    {
        countAndTrack(list);
        if (mCallback != null)
        {
            mCallback.onPageLoaded(list);
        }
    }

    public void reset()
    {
        mOffset = 0;
        mAllItemsLoaded = false;
        mTotalCount = 0;
        mLoadedCount = 0;
        if (mRequestInFlight != null)
        {
            mRequestInFlight.cancel();
            mRequestInFlight = null;
        }
    }

    public void setAllItemsLoaded()
    {
        mAllItemsLoaded = true;
    }

    public void setCallback(Callback callback)
    {
        mCallback = callback;
    }

    public void shutdown()
    {
        mCallback = null;
        reset();
    }


/*
    static LoaderRequest access$002(ItemLoader itemloader, LoaderRequest loaderrequest)
    {
        itemloader.mRequestInFlight = loaderrequest;
        return loaderrequest;
    }

*/



/*
    static int access$102(ItemLoader itemloader, int i)
    {
        itemloader.mOffset = i;
        return i;
    }

*/

}
