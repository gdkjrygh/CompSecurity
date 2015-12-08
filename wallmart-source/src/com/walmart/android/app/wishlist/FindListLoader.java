// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import com.walmart.android.service.wishlist.WishListManager;
import com.walmart.android.service.wishlist.WishListResults;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.walmart.android.app.wishlist:
//            SearchListParams

public class FindListLoader extends com.walmartlabs.ui.recycler.PagingAdapter.DefaultLoader
{
    public static interface Callback
    {

        public abstract void onError(int i, boolean flag);

        public abstract void onFirstResultBatch(int i);
    }


    private static final int PAGE_SIZE = 50;
    private Callback mCallback;
    private final Context mContext;
    private int mCurrentPage;
    private int mLoadedCount;
    private Request mRequestInFlight;
    private final SearchListParams mSearchParams;
    private int mTotalCount;

    public FindListLoader(Context context, SearchListParams searchlistparams)
    {
        mCurrentPage = 1;
        mContext = context;
        mSearchParams = searchlistparams;
    }

    private boolean isValidData(WishListResults wishlistresults)
    {
        boolean flag;
        boolean flag1;
        if (wishlistresults.searchResults != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (wishlistresults.paging != null || mCurrentPage != 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag && flag1;
    }

    public void loadMore(int i)
    {
        mRequestInFlight = WishListManager.get().findLists(mSearchParams.mFirstName, mSearchParams.mLastName, null, mSearchParams.mState, mCurrentPage, 50).addCallback(new CallbackSameThread(mContext) {

            final FindListLoader this$0;

            public void onResultSameThread(Request request, Result result)
            {
                mRequestInFlight = null;
                request = (WishListResults)result.getData();
                boolean flag;
                if (mCurrentPage == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (result.successful() && result.hasData() && isValidData(request))
                {
                    if (mCurrentPage == 1)
                    {
                        mTotalCount = ((WishListResults) (request)).paging.totalCount;
                        if (mCallback != null)
                        {
                            mCallback.onFirstResultBatch(mTotalCount);
                        }
                    }
                    int i = 
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = FindListLoader.this;
                super(context);
            }
        });
    }

    public void reset()
    {
        reset();
        mCurrentPage = 1;
        mTotalCount = 0;
        mLoadedCount = 0;
        if (mRequestInFlight != null)
        {
            mRequestInFlight.cancel();
            mRequestInFlight = null;
        }
    }

    public void setCallback(Callback callback)
    {
        mCallback = callback;
    }


/*
    static Request access$002(FindListLoader findlistloader, Request request)
    {
        findlistloader.mRequestInFlight = request;
        return request;
    }

*/



/*
    static int access$108(FindListLoader findlistloader)
    {
        int i = findlistloader.mCurrentPage;
        findlistloader.mCurrentPage = i + 1;
        return i;
    }

*/




/*
    static int access$302(FindListLoader findlistloader, int i)
    {
        findlistloader.mTotalCount = i;
        return i;
    }

*/




/*
    static int access$502(FindListLoader findlistloader, int i)
    {
        findlistloader.mLoadedCount = i;
        return i;
    }

*/


}
