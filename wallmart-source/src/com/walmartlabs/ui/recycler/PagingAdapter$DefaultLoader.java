// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import java.util.List;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            PagingAdapter

public static abstract class allback
    implements allback
{

    private allback mCallback;

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

    public void setCallback(allback allback)
    {
        mCallback = allback;
    }

    public allback()
    {
    }
}
