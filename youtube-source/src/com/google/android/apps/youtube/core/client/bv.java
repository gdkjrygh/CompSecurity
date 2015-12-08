// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.q;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            bu

public final class bv
{

    private final l a;
    private final q b;
    private final b c;
    private final boolean d;

    private bv()
    {
        a = null;
        b = null;
        c = null;
        d = true;
    }

    public bv(l l1, q q1, b b1)
    {
        a = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        b = (q)com.google.android.apps.youtube.common.fromguava.c.a(q1);
        c = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        d = false;
    }

    public static bv a()
    {
        return new bv();
    }

    public final bu a(String s)
    {
        if (d)
        {
            return null;
        } else
        {
            return new bu(a, b, c, s);
        }
    }
}
