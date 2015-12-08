// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.core.converter.e;
import com.google.android.apps.youtube.core.converter.f;
import com.google.android.apps.youtube.core.converter.n;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            ap, cb

public final class ca extends ap
{

    private final e c;

    private ca(n n, e e)
    {
        super(n);
        c = e;
    }

    public static ca b(n n)
    {
        f f1 = new f();
        cb.b(f1);
        return new ca(n, f1.a());
    }

    public static ca c(n n)
    {
        f f1 = new f();
        cb.c(f1);
        return new ca(n, f1.a());
    }

    protected final e a()
    {
        return c;
    }
}
