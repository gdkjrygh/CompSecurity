// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ib, hj

final class ho extends ib
    implements b
{

    final hj a;
    private final String c;

    public ho(hj hj1, String s)
    {
        a = hj1;
        super(hj1, (byte)0);
        c = s;
    }

    public final void a()
    {
        hj.f(a).b("Favorite");
        hj.e(a).j(c, com.google.android.apps.youtube.common.a.a.a(a.a, this));
    }

    public final void a(Object obj, Exception exception)
    {
        if (aw.a(exception, "GData", "InvalidEntryException", null, "Video already in favorite list."))
        {
            com.google.android.apps.youtube.app.ui.hj.a(a, p.j);
            return;
        } else
        {
            L.a("Error adding to favorites", exception);
            com.google.android.apps.youtube.app.ui.hj.a(a).c(exception);
            return;
        }
    }

    public final volatile void a(Object obj, Object obj1)
    {
        com.google.android.apps.youtube.app.ui.hj.a(a, p.i);
    }
}
