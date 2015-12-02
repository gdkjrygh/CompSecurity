// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            l, o

final class c extends DataSetObserver
{

    final l a;

    private c(l l1)
    {
        a = l1;
        super();
    }

    c(l l1, o o)
    {
        this(l1);
    }

    public void onChanged()
    {
        l.a(a, a.a(l.a(a)));
        a.notifyDataSetChanged();
    }

    public void onInvalidated()
    {
        l.a(a, a.a(l.a(a)));
        a.notifyDataSetInvalidated();
    }
}
