// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.a;

import android.database.DataSetObserver;

// Referenced classes of package com.google.android.apps.youtube.core.a:
//            j

final class k extends DataSetObserver
{

    final j a;

    private k(j j1)
    {
        a = j1;
        super();
    }

    k(j j1, byte byte0)
    {
        this(j1);
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
