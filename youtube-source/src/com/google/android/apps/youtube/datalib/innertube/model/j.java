// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.fh;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

public final class j
{

    protected final fh a;
    private CharSequence b;

    public j(fh fh1)
    {
        a = (fh)c.a(fh1);
    }

    public final CharSequence a()
    {
        if (b == null)
        {
            if (a.b != null)
            {
                b = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.b);
            } else
            {
                b = "";
            }
        }
        return b;
    }
}
