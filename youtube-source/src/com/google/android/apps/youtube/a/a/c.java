// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.a.a;

import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.a;
import com.google.protobuf.micro.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.a.a:
//            b

public final class c extends com.google.protobuf.micro.c
{

    private boolean a;
    private String b;
    private boolean c;
    private int d;
    private boolean e;
    private int f;
    private boolean g;
    private String h;
    private List i;
    private boolean j;
    private a k;
    private boolean l;
    private long m;
    private boolean n;
    private String o;
    private boolean p;
    private long q;
    private boolean r;
    private int s;
    private boolean t;
    private long u;
    private int v;

    public c()
    {
        b = "";
        d = 0;
        f = 0;
        h = "";
        i = Collections.emptyList();
        k = a.a;
        m = 0L;
        o = "";
        q = 0L;
        s = 0;
        u = 0L;
        v = -1;
    }

    public static c a(byte abyte0[])
    {
        return (c)(new c()).b(abyte0);
    }

    public final c a(int i1)
    {
        c = true;
        d = i1;
        return this;
    }

    public final c a(long l1)
    {
        l = true;
        m = l1;
        return this;
    }

    public final c a(com.google.android.apps.youtube.a.a.b b1)
    {
        if (b1 == null)
        {
            throw new NullPointerException();
        }
        if (i.isEmpty())
        {
            i = new ArrayList();
        }
        i.add(b1);
        return this;
    }

    public final c a(String s1)
    {
        a = true;
        b = s1;
        return this;
    }

    public final com.google.protobuf.micro.c a(b b1)
    {
        do
        {
            int i1 = b1.a();
            switch (i1)
            {
            default:
                if (b1.b(i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a(b1.e());
                break;

            case 16: // '\020'
                a(b1.c());
                break;

            case 24: // '\030'
                b(b1.c());
                break;

            case 34: // '"'
                b(b1.e());
                break;

            case 42: // '*'
                com.google.android.apps.youtube.a.a.b b2 = new com.google.android.apps.youtube.a.a.b();
                b1.a(b2);
                a(b2);
                break;

            case 50: // '2'
                a a1 = b1.f();
                j = true;
                k = a1;
                break;

            case 56: // '8'
                a(b1.b());
                break;

            case 66: // 'B'
                c(b1.e());
                break;

            case 72: // 'H'
                b(b1.b());
                break;

            case 80: // 'P'
                c(b1.c());
                break;

            case 88: // 'X'
                c(b1.b());
                break;
            }
        } while (true);
    }

    public final String a()
    {
        return b;
    }

    public final void a(CodedOutputStreamMicro codedoutputstreammicro)
    {
        if (a)
        {
            codedoutputstreammicro.a(1, b);
        }
        if (c)
        {
            codedoutputstreammicro.a(2, d);
        }
        if (e)
        {
            codedoutputstreammicro.a(3, f);
        }
        if (g)
        {
            codedoutputstreammicro.a(4, h);
        }
        for (Iterator iterator = i.iterator(); iterator.hasNext(); codedoutputstreammicro.a(5, (com.google.android.apps.youtube.a.a.b)iterator.next())) { }
        if (j)
        {
            codedoutputstreammicro.a(6, k);
        }
        if (l)
        {
            codedoutputstreammicro.a(7, m);
        }
        if (n)
        {
            codedoutputstreammicro.a(8, o);
        }
        if (p)
        {
            codedoutputstreammicro.a(9, q);
        }
        if (r)
        {
            codedoutputstreammicro.a(10, s);
        }
        if (t)
        {
            codedoutputstreammicro.a(11, u);
        }
    }

    public final int b()
    {
        return d;
    }

    public final c b(int i1)
    {
        e = true;
        f = i1;
        return this;
    }

    public final c b(long l1)
    {
        p = true;
        q = l1;
        return this;
    }

    public final c b(String s1)
    {
        g = true;
        h = s1;
        return this;
    }

    public final int c()
    {
        return f;
    }

    public final c c(int i1)
    {
        r = true;
        s = i1;
        return this;
    }

    public final c c(long l1)
    {
        t = true;
        u = l1;
        return this;
    }

    public final c c(String s1)
    {
        n = true;
        o = s1;
        return this;
    }

    public final String d()
    {
        return h;
    }

    public final int e()
    {
        if (v < 0)
        {
            f();
        }
        return v;
    }

    public final int f()
    {
        int j1 = 0;
        if (a)
        {
            j1 = CodedOutputStreamMicro.b(1, b) + 0;
        }
        int i1 = j1;
        if (c)
        {
            i1 = j1 + CodedOutputStreamMicro.b(2, d);
        }
        j1 = i1;
        if (e)
        {
            j1 = i1 + CodedOutputStreamMicro.b(3, f);
        }
        i1 = j1;
        if (g)
        {
            i1 = j1 + CodedOutputStreamMicro.b(4, h);
        }
        Iterator iterator = i.iterator();
        for (j1 = i1; iterator.hasNext(); j1 = CodedOutputStreamMicro.b(5, (com.google.android.apps.youtube.a.a.b)iterator.next()) + j1) { }
        i1 = j1;
        if (j)
        {
            i1 = j1 + CodedOutputStreamMicro.b(6, k);
        }
        j1 = i1;
        if (l)
        {
            j1 = i1 + CodedOutputStreamMicro.b(7, m);
        }
        i1 = j1;
        if (n)
        {
            i1 = j1 + CodedOutputStreamMicro.b(8, o);
        }
        j1 = i1;
        if (p)
        {
            j1 = i1 + CodedOutputStreamMicro.b(9, q);
        }
        i1 = j1;
        if (r)
        {
            i1 = j1 + CodedOutputStreamMicro.b(10, s);
        }
        j1 = i1;
        if (t)
        {
            j1 = i1 + CodedOutputStreamMicro.b(11, u);
        }
        v = j1;
        return j1;
    }

    public final boolean g()
    {
        return g;
    }

    public final List h()
    {
        return i;
    }

    public final long i()
    {
        return m;
    }

    public final boolean j()
    {
        return l;
    }

    public final String k()
    {
        return o;
    }

    public final long l()
    {
        return q;
    }

    public final int m()
    {
        return s;
    }

    public final long n()
    {
        return u;
    }
}
