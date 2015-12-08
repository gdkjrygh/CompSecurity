// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.widget.Adapter;

// Referenced classes of package android.support.v7.internal.widget:
//            v

final class w extends DataSetObserver
{

    final v a;
    private Parcelable b;

    w(v v1)
    {
        a = v1;
        super();
        b = null;
    }

    public final void onChanged()
    {
        a.u = true;
        a.A = a.z;
        a.z = a.c().getCount();
        if (a.c().hasStableIds() && b != null && a.A == 0 && a.z > 0)
        {
            v.a(a, b);
            b = null;
        } else
        {
            a.h();
        }
        a.e();
        a.requestLayout();
    }

    public final void onInvalidated()
    {
        a.u = true;
        if (a.c().hasStableIds())
        {
            b = v.a(a);
        }
        a.A = a.z;
        a.z = 0;
        a.x = -1;
        a.y = 0x8000000000000000L;
        a.v = -1;
        a.w = 0x8000000000000000L;
        a.p = false;
        a.e();
        a.requestLayout();
    }
}
