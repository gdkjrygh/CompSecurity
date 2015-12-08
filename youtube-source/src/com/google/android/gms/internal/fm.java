// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.d;

public final class fm
    implements c
{

    private final d a;

    public fm(d d1)
    {
        a = d1;
    }

    public final void a(a a1)
    {
        a.a(a1);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof fm)
        {
            return a.equals(((fm)obj).a);
        } else
        {
            return a.equals(obj);
        }
    }
}
