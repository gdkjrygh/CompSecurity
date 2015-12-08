// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.common.http;

import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

// Referenced classes of package com.google.android.common.http:
//            b

public final class a extends HttpEntityWrapper
{

    private final String a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public a(HttpEntity httpentity, String s, int i, long l, long l1, 
            long l2, long l3)
    {
        super(httpentity);
        a = s;
        b = i;
        c = l;
        d = l1;
        e = l2;
        f = l3;
    }

    static long a(a a1)
    {
        return a1.f;
    }

    static int b(a a1)
    {
        return a1.b;
    }

    static String c(a a1)
    {
        return a1.a;
    }

    static long d(a a1)
    {
        return a1.e;
    }

    static long e(a a1)
    {
        return a1.c;
    }

    static long f(a a1)
    {
        return a1.d;
    }

    public final InputStream getContent()
    {
        return new b(this, super.getContent());
    }
}
