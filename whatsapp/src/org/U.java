// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org;

import java.net.DatagramSocket;
import java.nio.charset.Charset;

// Referenced classes of package org:
//            N, g, at

public abstract class U
{

    public static int b;
    private static final at c = new N();
    private Charset a;
    protected int d;
    protected boolean e;
    protected at f;
    protected DatagramSocket g;

    public U()
    {
        int i = b;
        super();
        a = Charset.defaultCharset();
        g = null;
        d = 0;
        e = false;
        f = c;
        if (i != 0)
        {
            g.b++;
        }
    }

    public void a()
    {
        g = f.a();
        g.setSoTimeout(d);
        e = true;
    }

    public void a(int i)
    {
        d = i;
    }

    public void b()
    {
        if (g != null)
        {
            g.close();
        }
        g = null;
        e = false;
    }

    public boolean c()
    {
        return e;
    }

}
