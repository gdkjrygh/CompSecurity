// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.database.Cursor;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.offline.store:
//            g, e

public final class h
{

    public final g a;
    public final e b;

    private h(g g1, e e1)
    {
        a = (g)c.a(g1);
        b = e1;
    }

    static h a(String s, String s1, Cursor cursor)
    {
        return new h(g.a(s, cursor), e.a(s1, cursor));
    }
}
