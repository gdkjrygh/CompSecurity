// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.a;

import android.database.DataSetObserver;

// Referenced classes of package com.google.android.apps.youtube.core.a:
//            c

final class d extends DataSetObserver
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public final void onChanged()
    {
        a.d();
    }

    public final void onInvalidated()
    {
        a.e();
    }
}
