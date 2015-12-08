// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.a;

import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.a:
//            e, f

public abstract class h extends e
    implements f
{

    protected final e b;

    public h(e e1)
    {
        b = (e)c.a(e1);
        e1.a(this);
    }

    public final void a(e e1)
    {
        if (e1 == b)
        {
            f();
        }
    }
}
