// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import com.walmartlabs.utils.WLog;
import java.util.Collections;

// Referenced classes of package com.walmartlabs.ui:
//            PagingShelfListAdapter

private class <init>
{

    private int mCurrentPageLoading;
    private int mFirstPageNumber;
    private int mLastPageLoaded;
    final PagingShelfListAdapter this$0;

    private void loadPage(int i)
    {
        Callback callback = new PagingShelfListAdapter.GetListDataCallback() {

            final PagingShelfListAdapter.PageLoader this$1;

            public void onDataReceived(Object aobj[], boolean flag)
            {
                WLog.d(PagingShelfListAdapter.access$300(), (new StringBuilder()).append("onDataReceived() isLastPage=").append(flag).toString());
                if (flag)
                {
                    PagingShelfListAdapter.access$402(this$0, true);
                }
                Collections.addAll(PagingShelfListAdapter.access$500(this$0), aobj);
                mLastPageLoaded = mCurrentPageLoading;
                mCurrentPageLoading = PagingShelfListAdapter.access$200();
                notifyDataSetChanged();
                if (mLastPageLoaded == mFirstPageNumber && PagingShelfListAdapter.access$900(this$0) != null)
                {
                    PagingShelfListAdapter.access$900(this$0).onInitialPageLoaded();
                }
            }

            public void onGetDataFailed()
            {
                mCurrentPageLoading = PagingShelfListAdapter.access$200();
            }

            
            {
                this$1 = PagingShelfListAdapter.PageLoader.this;
                super(this$0);
            }
        };
        getListData(callback, i, PagingShelfListAdapter.access$1000(PagingShelfListAdapter.this));
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
            WLog.d(PagingShelfListAdapter.access$300(), (new StringBuilder()).append("loadNextPage(): ").append(i).toString());
            mCurrentPageLoading = i;
            loadPage(mCurrentPageLoading);
            return;
        } else
        {
            WLog.d(PagingShelfListAdapter.access$300(), (new StringBuilder()).append("loadNextPage() already loading: ").append(i).append(" ignoring...").toString());
            return;
        }
    }

    public void setFirstPageNumber(int i)
    {
        mFirstPageNumber = i;
        setLastPageLoaded(i - 1);
    }




/*
    static int access$602(_cls1 _pcls1, int i)
    {
        _pcls1.mLastPageLoaded = i;
        return i;
    }

*/



/*
    static int access$702(mLastPageLoaded mlastpageloaded, int i)
    {
        mlastpageloaded.mCurrentPageLoading = i;
        return i;
    }

*/


    private this._cls0()
    {
        this$0 = PagingShelfListAdapter.this;
        super();
        mLastPageLoaded = -1;
        mCurrentPageLoading = PagingShelfListAdapter.access$200();
    }

    mCurrentPageLoading(mCurrentPageLoading mcurrentpageloading)
    {
        this();
    }
}
