// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import com.walmartlabs.utils.WLog;
import java.util.List;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            PagingAdapter

class this._cls0
    implements ader.ResultCallback
{

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
        WLog.d(PagingAdapter.access$000(), (new StringBuilder()).append("onLoadFailed(): ").append(s).toString());
    }

    ader.ResultCallback()
    {
        this$0 = PagingAdapter.this;
        super();
    }
}
