// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.database.DataSetObserver;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            et

final class eu extends DataSetObserver
{

    final et a;

    private eu(et et1)
    {
        a = et1;
        super();
    }

    eu(et et1, byte byte0)
    {
        this(et1);
    }

    public final void onChanged()
    {
        a.notifyDataSetChanged();
    }

    public final void onInvalidated()
    {
        a.notifyDataSetInvalidated();
    }
}
