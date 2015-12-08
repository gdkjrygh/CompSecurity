// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list;

import android.widget.AbsListView;

// Referenced classes of package com.contextlogic.wish.ui.components.list:
//            ListeningListView

class this._cls0
    implements android.widget.Listener
{

    final ListeningListView this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (ListeningListView.access$000(ListeningListView.this) != null)
        {
            ListeningListView.access$000(ListeningListView.this).onScroll(abslistview, i, j, k);
        }
        ListeningListView.access$100(ListeningListView.this);
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (ListeningListView.access$000(ListeningListView.this) != null)
        {
            ListeningListView.access$000(ListeningListView.this).onScrollStateChanged(abslistview, i);
        }
    }

    ()
    {
        this$0 = ListeningListView.this;
        super();
    }
}
