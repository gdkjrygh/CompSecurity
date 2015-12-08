// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.jl;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

public class r
{

    private final CharSequence a;

    public r(jl jl1)
    {
        c.a(jl1);
        if (jl1.b != null)
        {
            a = b.a(jl1.b);
            return;
        } else
        {
            a = "";
            return;
        }
    }

    public final CharSequence a()
    {
        return a;
    }
}
