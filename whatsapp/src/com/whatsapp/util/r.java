// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.graphics.drawable.Drawable;
import java.io.File;

// Referenced classes of package com.whatsapp.util:
//            b2

public class r
{

    private Drawable a;
    private int b;
    private long c;
    private Drawable d;
    private final File e;
    private int f;

    public r(File file)
    {
        c = 0x100000L;
        b = 4;
        e = file;
    }

    static Drawable a(r r1)
    {
        return r1.a;
    }

    static int b(r r1)
    {
        return r1.f;
    }

    static long c(r r1)
    {
        return r1.c;
    }

    static int d(r r1)
    {
        return r1.b;
    }

    static Drawable e(r r1)
    {
        return r1.d;
    }

    static File f(r r1)
    {
        return r1.e;
    }

    public b2 a()
    {
        return new b2(this, null);
    }

    public r a(int i)
    {
        f = i;
        return this;
    }

    public r a(long l)
    {
        c = l;
        return this;
    }

    public r a(Drawable drawable)
    {
        a = drawable;
        return this;
    }

    public r b(Drawable drawable)
    {
        d = drawable;
        return this;
    }
}
