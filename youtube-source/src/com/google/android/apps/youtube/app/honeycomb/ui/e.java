// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;

import com.google.android.apps.youtube.app.compat.r;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.ui:
//            d, f

final class e
    implements r
{

    final d a;

    private e(d d1)
    {
        a = d1;
        super();
    }

    e(d d1, byte byte0)
    {
        this(d1);
    }

    public final boolean a()
    {
        for (Iterator iterator = a.e.iterator(); iterator.hasNext(); ((f)iterator.next()).A()) { }
        return true;
    }

    public final boolean b()
    {
        for (Iterator iterator = a.e.iterator(); iterator.hasNext(); ((f)iterator.next()).z()) { }
        return true;
    }
}
