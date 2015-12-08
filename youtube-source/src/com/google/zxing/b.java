// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import com.google.zxing.common.a;

// Referenced classes of package com.google.zxing:
//            a

public final class b
{

    private final com.google.zxing.a a;
    private com.google.zxing.common.b b;

    public b(com.google.zxing.a a1)
    {
        if (a1 == null)
        {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        } else
        {
            a = a1;
            return;
        }
    }

    public final int a()
    {
        return a.c();
    }

    public final a a(int i, a a1)
    {
        return a.a(i, a1);
    }

    public final int b()
    {
        return a.d();
    }

    public final com.google.zxing.common.b c()
    {
        if (b == null)
        {
            b = a.b();
        }
        return b;
    }

    public final boolean d()
    {
        a.a();
        return false;
    }

    public final b e()
    {
        a.a();
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }
}
