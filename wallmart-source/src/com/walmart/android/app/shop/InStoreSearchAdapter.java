// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.picasso.Picasso;
import com.walmart.android.data.InStoreSearchResult;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.storesearch.InStoreSearchService;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.PagingAdapter;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfItemView

public class InStoreSearchAdapter extends PagingAdapter
{
    public class InStoreLoader extends com.walmartlabs.ui.recycler.PagingAdapter.DefaultLoader
    {

        private static final int PAGE_SIZE = 20;
        private final String mMode;
        private int mOffset;
        private final String mQuery;
        private final String mSearchType;
        private final String mStoreId;
        final InStoreSearchAdapter this$0;

        public void loadMore(int i)
        {
            AsyncCallbackOnThread asynccallbackonthread = new AsyncCallbackOnThread(new Handler()) {

                final InStoreLoader this$1;

                public void onFailureSameThread(Integer integer, InStoreSearchResult instoresearchresult)
                {
                    notifyLoadFailed((new StringBuilder()).append("Error: ").append(integer).toString(), true);
                    if (mInStoreListener != null)
                    {
                        mInStoreListener.onLoadingFailed(integer);
                    }
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (InStoreSearchResult)obj1);
                }

                public void onSuccessSameThread(InStoreSearchResult instoresearchresult)
                {
                    boolean flag1 = true;
                    if (instoresearchresult.results == null)
                    {
                        onFailureSameThread(Integer.valueOf(0x15f91), instoresearchresult);
                    } else
                    {
                        InStoreLoader instoreloader;
                        List list;
                        boolean flag;
                        if (instoresearchresult.results.length != 20)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        mOffset = mOffset + 20;
                        instoreloader = InStoreLoader.this;
                        list = Arrays.asList(instoresearchresult.results);
                        if (instoresearchresult.results.length == 0 || flag)
                        {
                            flag1 = false;
                        }
                        instoreloader.notifyBatchLoaded(list, flag1);
                        if (mInStoreListener != null)
                        {
                            mInStoreListener.onFirstBatchLoaded();
                            return;
                        }
                    }
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((InStoreSearchResult)obj);
                }

            
            {
                this$1 = InStoreLoader.this;
                super(handler);
            }
            };
            Services.get().getInStoreSearchService().searchInStore(mQuery, mStoreId, mMode, mSearchType, mOffset, 20, asynccallbackonthread);
        }

        public void reset()
        {
            super.reset();
            mOffset = 0;
        }




/*
        static int access$202(InStoreLoader instoreloader, int i)
        {
            instoreloader.mOffset = i;
            return i;
        }

*/


        public InStoreLoader(String s, String s1, String s2, String s3)
        {
            this$0 = InStoreSearchAdapter.this;
            super();
            mQuery = s;
            mStoreId = s1;
            mMode = s2;
            mSearchType = s3;
        }
    }

    public static interface LoaderListener
    {

        public abstract void onFirstBatchLoaded();

        public abstract void onLoadingFailed(Integer integer);
    }

    public static class SearchResultViewHolder extends BasicViewHolder
    {

        public SearchResultViewHolder(View view)
        {
            super(view);
        }
    }


    private final Context mContext;
    private LoaderListener mInStoreListener;
    private final InStoreLoader mLoader;

    public InStoreSearchAdapter(Context context, String s, String s1, String s2, String s3)
    {
        mContext = context;
        mLoader = new InStoreLoader(s, s1, s2, s3);
    }

    public void cleanup()
    {
        reset(false);
        setInStoreListener(null);
        Picasso.with(getContext()).cancelTag(ShelfItemView.TAG);
    }

    protected Context getContext()
    {
        return mContext;
    }

    public void initLoader()
    {
        setAndStartLoader(mLoader);
    }

    public void onBindItemViewHolder(SearchResultViewHolder searchresultviewholder, com.walmart.android.data.InStoreSearchResult.Result result, int i)
    {
        ((ShelfItemView)searchresultviewholder.itemView).setInStoreItem(result);
    }

    public volatile void onBindItemViewHolder(BasicViewHolder basicviewholder, Object obj, int i)
    {
        onBindItemViewHolder((SearchResultViewHolder)basicviewholder, (com.walmart.android.data.InStoreSearchResult.Result)obj, i);
    }

    public SearchResultViewHolder onCreateItemViewHolder(ViewGroup viewgroup, int i)
    {
        return new SearchResultViewHolder(ViewUtil.inflate(mContext, 0x7f04018f, viewgroup));
    }

    public volatile BasicViewHolder onCreateItemViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateItemViewHolder(viewgroup, i);
    }

    public void setInStoreListener(LoaderListener loaderlistener)
    {
        mInStoreListener = loaderlistener;
    }

}
