// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            DefaultCallback, LoadAllAdapter

class init> extends DefaultCallback
{

    final LoadAllAdapter this$0;

    public volatile void onModel(Object obj)
    {
        onModel((List)obj);
    }

    public void onModel(List list)
    {
        objects.addAll(list);
        loading = false;
        notifyDataSetChanged();
    }

    (Context context)
    {
        this$0 = LoadAllAdapter.this;
        super(context);
    }
}
