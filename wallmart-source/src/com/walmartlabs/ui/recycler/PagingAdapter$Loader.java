// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import java.util.List;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            PagingAdapter

public static interface ResultCallback
{
    public static interface ResultCallback
    {

        public abstract void onBatchLoaded(List list, boolean flag);

        public abstract void onLoadFailed(String s, boolean flag);
    }


    public abstract void loadMore(int i);

    public abstract void reset();

    public abstract void setCallback(ResultCallback resultcallback);
}
