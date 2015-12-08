// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.converter.e;
import com.google.android.apps.youtube.core.converter.f;
import com.google.android.apps.youtube.core.converter.n;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            gz, em, dj

public final class el extends gz
{

    private final e c;

    public el(n n, b b, dj dj)
    {
        super(n);
        com.google.android.apps.youtube.common.fromguava.c.a(b);
        n = new f();
        em.a("", b, n, null, dj);
        c = n.a();
    }

    protected final e a()
    {
        return c;
    }
}
