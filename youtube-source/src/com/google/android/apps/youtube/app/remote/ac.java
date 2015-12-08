// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            t

abstract class ac
    implements b
{

    private final Object a;
    private final b b;
    final t c;

    ac(t t, Object obj, b b1)
    {
        c = t;
        super();
        a = obj;
        b = b1;
    }

    public final volatile void a(Object obj, Exception exception)
    {
        if (b != null)
        {
            b.a(a, exception);
        }
    }
}
