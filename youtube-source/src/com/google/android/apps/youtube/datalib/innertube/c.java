// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.google.a.a.a.a.ii;
import com.google.a.a.a.a.ix;
import com.google.a.a.a.a.o;
import com.google.android.apps.youtube.core.client.h;
import com.google.android.apps.youtube.core.utils.a;
import com.google.android.apps.youtube.datalib.a.f;

public final class c
    implements f
{

    private final h a;

    public c(h h1)
    {
        a = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
    }

    public final void a(ii ii1)
    {
        if (ii1.i == null)
        {
            ii1.i = new o();
        }
        ix ix1 = new ix();
        a.a();
        ix1.b = com.google.android.apps.youtube.core.utils.a.c();
        ix1.c = a.a().b();
        ii1.i.b = (new ix[] {
            ix1
        });
    }
}
