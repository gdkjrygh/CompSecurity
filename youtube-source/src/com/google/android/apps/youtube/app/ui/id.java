// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.youtube.p;

public final class id
    implements b
{

    private final Activity a;
    private final aw b;

    public id(Activity activity, aw aw1)
    {
        a = (Activity)c.a(activity);
        b = (aw)c.a(aw1);
    }

    public final void a(Object obj, Exception exception)
    {
        if (aw.a(exception, "GData", "InvalidEntryException", null, "Video already in playlist"))
        {
            ah.a(a, p.hk, 1);
            return;
        } else
        {
            L.a("Error adding to watch later", exception);
            b.c(exception);
            return;
        }
    }

    public final volatile void a(Object obj, Object obj1)
    {
        ah.a(a, p.hj, 1);
    }
}
