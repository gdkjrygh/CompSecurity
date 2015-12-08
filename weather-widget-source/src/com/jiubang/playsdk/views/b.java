// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.database.DataSetObserver;

// Referenced classes of package com.jiubang.playsdk.views:
//            HorizontalListView

class b extends DataSetObserver
{

    final HorizontalListView a;

    b(HorizontalListView horizontallistview)
    {
        a = horizontallistview;
        super();
    }

    public void onChanged()
    {
        HorizontalListView.a(a, true);
        HorizontalListView.b(a, false);
        HorizontalListView.b(a);
        a.invalidate();
        a.requestLayout();
    }

    public void onInvalidated()
    {
        HorizontalListView.b(a, false);
        HorizontalListView.b(a);
        HorizontalListView.c(a);
        a.invalidate();
        a.requestLayout();
    }
}
