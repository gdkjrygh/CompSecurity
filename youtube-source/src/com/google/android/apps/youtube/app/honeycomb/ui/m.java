// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;

import android.os.SystemClock;
import com.google.android.apps.youtube.app.compat.q;
import com.google.android.apps.youtube.app.compat.s;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.ui:
//            j

final class m
    implements s
{

    final j a;

    m(j j1)
    {
        a = j1;
        super();
    }

    public final boolean a(q q1)
    {
        if (q1 == j.g(a))
        {
            j.a(a, true);
            j.g(a).c(p.fF);
            j.i(a).a("UploadStarted", null, (int)(SystemClock.elapsedRealtime() - j.h(a)));
            j.j(a);
            return true;
        } else
        {
            return false;
        }
    }
}
