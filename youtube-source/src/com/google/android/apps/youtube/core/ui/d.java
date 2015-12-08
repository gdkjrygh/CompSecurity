// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.database.DataSetObserver;
import android.os.Handler;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            BasePagedView, e

final class d extends DataSetObserver
{

    final BasePagedView a;

    private d(BasePagedView basepagedview)
    {
        a = basepagedview;
        super();
    }

    d(BasePagedView basepagedview, byte byte0)
    {
        this(basepagedview);
    }

    private void a()
    {
        BasePagedView.a(a).post(new e(this));
    }

    public final void onChanged()
    {
        super.onChanged();
        a();
    }

    public final void onInvalidated()
    {
        super.onInvalidated();
        a();
    }
}
