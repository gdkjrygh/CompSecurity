// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.google.a.a.a.a.ii;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.a.f;
import java.util.Iterator;
import java.util.List;

public final class p
{

    private final List a;

    public p(List list)
    {
        a = (List)c.a(list);
    }

    final ii a()
    {
        c.b();
        ii ii1 = new ii();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((f)iterator.next()).a(ii1)) { }
        return ii1;
    }
}
