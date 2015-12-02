// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.io.Writer;

// Referenced classes of package com.whatsapp.protocol:
//            b9, by, bt, bj, 
//            c_

public final class bi
    implements b9
{

    private final Writer a;
    private final String b;
    private final b9 c;
    private final bt d;

    public bi(b9 b9_1, Writer writer, String s)
    {
        c = b9_1;
        a = writer;
        d = new by(a);
        b = s;
    }

    public void a()
    {
        c.a();
    }

    public void a(bj bj)
    {
        c.a(bj);
    }

    public void b()
    {
        c.b();
    }

    public c_ c()
    {
        c_ c_ = c.c();
        try
        {
            a.write(b);
            d.a(c_);
        }
        catch (Throwable throwable)
        {
            return c_;
        }
        return c_;
    }

    public String d()
    {
        return c.d();
    }
}
