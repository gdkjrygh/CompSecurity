// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v7.internal.widget:
//            ListPopupWindow

final class ag extends DataSetObserver
{

    final ListPopupWindow a;

    private ag(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    ag(ListPopupWindow listpopupwindow, byte byte0)
    {
        this(listpopupwindow);
    }

    public final void onChanged()
    {
        if (a.f())
        {
            a.c();
        }
    }

    public final void onInvalidated()
    {
        a.d();
    }
}
