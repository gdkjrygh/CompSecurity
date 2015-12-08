// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.c;

import org.a.c.a.c;
import org.a.c.b.b.a.e;
import org.a.c.b.b.b.a;
import org.a.c.b.b.b.f;

// Referenced classes of package org.a.c.b.b.c:
//            l, k

public class j
    implements org.a.c.b.b.a.j
{

    private static final String h = System.getProperty("line.separator");
    public final int a;
    public final e b;
    public final a c;
    public final int d;
    private byte e[];
    private final l f;
    private int g;

    private j(int i, e e1, a a1, int k, byte abyte0[])
    {
        g = -1;
        a = i;
        b = e1;
        c = a1;
        d = k;
        e = abyte0;
        if (b())
        {
            f = null;
            return;
        } else
        {
            f = new l((new StringBuilder("Field Seperate value (")).append(e1.a()).append(")").toString(), abyte0);
            return;
        }
    }

    public j(e e1, a a1, int i, byte abyte0[])
    {
        this(e1.b, e1, a1, i, abyte0);
    }

    protected static final j a(e e1, int i)
    {
        return new j(e1, G_, 1, G_.a(new int[1], i));
    }

    protected final k a()
    {
        return f;
    }

    protected final void a(c c1)
    {
        c1.b(a);
        c1.b(c.b);
        c1.a(d);
        if (b())
        {
            if (f != null)
            {
                throw new org.a.c.c("Unexpected separate value item.");
            }
            if (e.length > 4)
            {
                throw new org.a.c.c((new StringBuilder("Local value has invalid length: ")).append(e.length).toString());
            }
            c1.a(e);
            int k = e.length;
            int i = 0;
            do
            {
                if (i >= 4 - k)
                {
                    return;
                }
                c1.write(0);
                i++;
            } while (true);
        }
        if (f == null)
        {
            throw new org.a.c.c("Missing separate value item.");
        } else
        {
            c1.a(f.d());
            return;
        }
    }

    protected final void a(byte abyte0[])
    {
        if (e.length != abyte0.length)
        {
            throw new org.a.c.c("Cannot change size of value.");
        }
        e = abyte0;
        if (f != null)
        {
            f.a(abyte0);
        }
    }

    protected final boolean b()
    {
        return e.length <= 4;
    }

    public final int c()
    {
        return g;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("");
        stringbuffer.append(b);
        stringbuffer.append(h);
        stringbuffer.append("");
        stringbuffer.append((new StringBuilder("count: ")).append(d).toString());
        stringbuffer.append(h);
        stringbuffer.append("");
        stringbuffer.append(c);
        stringbuffer.append(h);
        return stringbuffer.toString();
    }

}
