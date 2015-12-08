// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.listview;

import android.widget.ListAdapter;
import com.jiubang.pla.internal.PLA_AbsListView;
import com.jiubang.pla.internal.e;

// Referenced classes of package com.jiubang.pla.listview:
//            MultiColumnListView, d

class a
    implements e
{

    final d a;
    final MultiColumnListView b;
    private int c;

    a(MultiColumnListView multicolumnlistview, d d1)
    {
        b = multicolumnlistview;
        a = d1;
        super();
        c = 0;
    }

    public void a(PLA_AbsListView pla_abslistview, int i)
    {
        int j = b.z().getCount();
        if (i == 0 && c == j - 1 && MultiColumnListView.a(b))
        {
            a.g();
            MultiColumnListView.a(b, false);
        }
    }

    public void a(PLA_AbsListView pla_abslistview, int i, int j, int k)
    {
        c = (i + j) - 1;
    }
}
