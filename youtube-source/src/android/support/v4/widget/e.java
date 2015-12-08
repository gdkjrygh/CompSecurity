// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.widget:
//            c

final class e extends DataSetObserver
{

    final c a;

    private e(c c1)
    {
        a = c1;
        super();
    }

    e(c c1, byte byte0)
    {
        this(c1);
    }

    public final void onChanged()
    {
        a.a = true;
        a.notifyDataSetChanged();
    }

    public final void onInvalidated()
    {
        a.a = false;
        a.notifyDataSetInvalidated();
    }
}
