// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;

import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.itemloader:
//            ItemLoader

public class PagingLoader extends com.walmartlabs.ui.recycler.PagingAdapter.DefaultLoader
{
    public static interface LoaderListener
    {

        public abstract void onBatchLoaded();

        public abstract void onFirstBatchLoaded(int i);

        public abstract void onLoadFailed(ItemLoader.PageLoadError pageloaderror, int i);
    }


    private ItemLoader mItemLoader;
    private LoaderListener mListener;

    public PagingLoader(ItemLoader itemloader)
    {
        mItemLoader = itemloader;
        mItemLoader.setCallback(new ItemLoader.Callback() {

            final PagingLoader this$0;

            public void onFirstPageLoaded(List list, int i)
            {
                PagingLoader pagingloader = PagingLoader.this;
                boolean flag;
                if (!mItemLoader.hasLoadedAllItems())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                pagingloader.notifyBatchLoaded(list, flag);
                if (mListener != null)
                {
                    mListener.onFirstBatchLoaded(i);
                }
            }

            public void onPageLoaded(List list)
            {
                PagingLoader pagingloader = PagingLoader.this;
                boolean flag;
                if (!mItemLoader.hasLoadedAllItems())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                pagingloader.notifyBatchLoaded(list, flag);
                if (mListener != null)
                {
                    mListener.onBatchLoaded();
                }
            }

            public void onPageLoadingFailed(ItemLoader.PageLoadError pageloaderror, int i)
            {
                notifyLoadFailed(pageloaderror.toString(), true);
                if (mListener != null)
                {
                    mListener.onLoadFailed(pageloaderror, i);
                }
            }

            
            {
                this$0 = PagingLoader.this;
                super();
            }
        });
    }

    public void destroy()
    {
        mItemLoader.shutdown();
        setCallback(null);
        mListener = null;
    }

    public boolean isDone()
    {
        return mItemLoader.hasLoadedAllItems();
    }

    public void loadMore(int i)
    {
        mItemLoader.loadNextPage();
    }

    public void reset()
    {
        super.reset();
        mItemLoader.reset();
    }

    public void setDone()
    {
        mItemLoader.setAllItemsLoaded();
        notifyBatchLoaded(null, false);
    }

    public void setListener(LoaderListener loaderlistener)
    {
        mListener = loaderlistener;
    }





}
