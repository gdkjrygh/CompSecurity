// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.c;

public final class fi
    implements b
{

    private final c a;

    public fi(c c1)
    {
        a = c1;
    }

    public final void a()
    {
        a.b();
    }

    public final void a(Bundle bundle)
    {
        a.u_();
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof fi)
        {
            return a.equals(((fi)obj).a);
        } else
        {
            return a.equals(obj);
        }
    }
}
