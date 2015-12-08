// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            DefaultCallback, PaginatedAdapter

class it> extends DefaultCallback
{

    final PaginatedAdapter this$0;

    public volatile void onModel(Object obj)
    {
        onModel((List)obj);
    }

    public void onModel(List list)
    {
        objects.addAll(list);
        PaginatedAdapter.access$002(PaginatedAdapter.this, PaginatedAdapter.access$000(PaginatedAdapter.this) + 1);
        loading = false;
        notifyDataSetChanged();
    }

    (Context context)
    {
        this$0 = PaginatedAdapter.this;
        super(context);
    }
}
