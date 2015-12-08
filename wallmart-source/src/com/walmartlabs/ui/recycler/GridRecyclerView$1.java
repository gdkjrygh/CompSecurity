// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            GridRecyclerView

class ration extends android.support.v7.widget.coration
{

    final GridRecyclerView this$0;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget._cls1 _pcls1)
    {
        applySpacing(rect, recyclerview.getChildPosition(view));
    }

    ration()
    {
        this$0 = GridRecyclerView.this;
        super();
    }
}
