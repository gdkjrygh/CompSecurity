// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            ab, an, ac

class al
    implements android.widget.AbsListView.OnScrollListener
{

    final ab a;

    private al(ab ab1)
    {
        a = ab1;
        super();
    }

    al(ab ab1, ac ac)
    {
        this(ab1);
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1 && !a.f() && ab.b(a).getContentView() != null)
        {
            ab.d(a).removeCallbacks(ab.c(a));
            ab.c(a).run();
        }
    }
}
