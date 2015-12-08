// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.internal;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.widget.Adapter;

// Referenced classes of package com.jiubang.pla.internal:
//            PLA_AdapterView

class l extends DataSetObserver
{

    final PLA_AdapterView a;
    private Parcelable b;

    l(PLA_AdapterView pla_adapterview)
    {
        a = pla_adapterview;
        super();
        b = null;
    }

    public void onChanged()
    {
        a.L = true;
        a.N = a.M;
        a.M = a.s().getCount();
        if (a.s().hasStableIds() && b != null && a.N == 0 && a.M > 0)
        {
            PLA_AdapterView.a(a, b);
            b = null;
        } else
        {
            a.y();
        }
        a.x();
        a.requestLayout();
    }

    public void onInvalidated()
    {
        a.L = true;
        if (a.s().hasStableIds())
        {
            b = PLA_AdapterView.a(a);
        }
        a.N = a.M;
        a.M = 0;
        a.G = false;
        a.x();
        a.requestLayout();
    }
}
