// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.io.Writer;

// Referenced classes of package com.whatsapp.protocol:
//            bt, by, bj, c_

public final class bk
    implements bt
{

    private final String a;
    private final bt b;
    private final bt c;
    private final Writer d;

    public bk(bt bt1, Writer writer, String s)
    {
        c = bt1;
        d = writer;
        b = new by(d);
        a = s;
    }

    public void a()
    {
        c.a();
        d.write(a);
        b.a();
    }

    public void a(bj bj)
    {
        c.a(bj);
    }

    public void a(c_ c_)
    {
        c.a(c_);
        try
        {
            d.write(a);
            b.a(c_);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_)
        {
            return;
        }
    }

    public void a(c_ c_, int i)
    {
        c.a(c_, i);
        try
        {
            d.write(a);
            b.a(c_);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_)
        {
            return;
        }
    }

    public void a(c_ c_, boolean flag)
    {
        c.a(c_, flag);
        try
        {
            d.write(a);
            b.a(c_);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_)
        {
            return;
        }
    }

    public void a(String s, String s1)
    {
        c.a(s, s1);
        d.write(a);
        b.a(s, s1);
    }
}
