// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.os.Handler;
import com.walmart.android.data.InStoreSearchResult;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.storesearch.InStoreSearchService;
import com.walmart.android.wmservice.Services;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop:
//            InStoreSearchAdapter

public class mSearchType extends com.walmartlabs.ui.recycler.
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

            final InStoreSearchAdapter.InStoreLoader this$1;

            public void onFailureSameThread(Integer integer, InStoreSearchResult instoresearchresult)
            {
                notifyLoadFailed((new StringBuilder()).append("Error: ").append(integer).toString(), true);
                if (InStoreSearchAdapter.access$100(this$0) != null)
                {
                    InStoreSearchAdapter.access$100(this$0).onLoadingFailed(integer);
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
                    InStoreSearchAdapter.InStoreLoader instoreloader;
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
                    instoreloader = InStoreSearchAdapter.InStoreLoader.this;
                    list = Arrays.asList(instoresearchresult.results);
                    if (instoresearchresult.results.length == 0 || flag)
                    {
                        flag1 = false;
                    }
                    instoreloader.notifyBatchLoaded(list, flag1);
                    if (InStoreSearchAdapter.access$100(this$0) != null)
                    {
                        InStoreSearchAdapter.access$100(this$0).onFirstBatchLoaded();
                        return;
                    }
                }
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((InStoreSearchResult)obj);
            }

            
            {
                this$1 = InStoreSearchAdapter.InStoreLoader.this;
                super(handler);
            }
        };
        Services.get().getInStoreSearchService().searchInStore(mQuery, mStoreId, mMode, mSearchType, mOffset, 20, asynccallbackonthread);
    }

    public void reset()
    {
        super.();
        mOffset = 0;
    }




/*
    static int access$202(_cls1 _pcls1, int i)
    {
        _pcls1.mOffset = i;
        return i;
    }

*/


    public _cls1.this._cls1(String s, String s1, String s2, String s3)
    {
        this$0 = InStoreSearchAdapter.this;
        super();
        mQuery = s;
        mStoreId = s1;
        mMode = s2;
        mSearchType = s3;
    }
}
