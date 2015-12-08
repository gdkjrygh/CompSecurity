// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.internal;

import android.view.View;
import android.widget.ListAdapter;

// Referenced classes of package com.jiubang.pla.internal:
//            j, PLA_AbsListView, a

class f extends j
    implements Runnable
{

    View a;
    int b;
    final PLA_AbsListView c;

    private f(PLA_AbsListView pla_abslistview)
    {
        c = pla_abslistview;
        super(pla_abslistview, null);
    }

    f(PLA_AbsListView pla_abslistview, a a1)
    {
        this(pla_abslistview);
    }

    public void run()
    {
        if (!c.L)
        {
            ListAdapter listadapter = c.c;
            int i = b;
            if (listadapter != null && c.M > 0 && i != -1 && i < listadapter.getCount() && b())
            {
                c.b(a, i, listadapter.getItemId(i));
                return;
            }
        }
    }
}
