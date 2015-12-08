// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            DefaultCallback, SearchAdapter

class this._cls1 extends DefaultCallback
{

    final Updated this$1;

    public volatile void onModel(Object obj)
    {
        onModel((List)obj);
    }

    public void onModel(List list)
    {
        if (!cess._mth000(this._cls1.this))
        {
            searchResults = list;
            loading = false;
            notifyDataSetChanged();
            searchResultsUpdated();
        }
    }

    (Context context)
    {
        this$1 = this._cls1.this;
        super(context);
    }
}
