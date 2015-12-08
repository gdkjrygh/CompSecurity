// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.a.a;

import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.a;
import com.google.protobuf.micro.b;
import com.google.protobuf.micro.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class d extends c
{

    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private boolean a;
    private String b;
    private List c;
    private boolean d;
    private String e;
    private boolean f;
    private int g;
    private boolean h;
    private String i;
    private boolean j;
    private a k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t;
    private int u;
    private boolean v;
    private String w;
    private boolean x;
    private boolean y;
    private boolean z;

    public d()
    {
        b = "";
        c = Collections.emptyList();
        e = "";
        g = 0;
        i = "";
        k = a.a;
        m = false;
        o = false;
        q = false;
        s = 0;
        u = 0;
        w = "";
        y = false;
        A = false;
        C = false;
        D = -1;
    }

    public final d a(int i1)
    {
        f = true;
        g = i1;
        return this;
    }

    public final d a(a a1)
    {
        j = true;
        k = a1;
        return this;
    }

    public final d a(String s1)
    {
        a = true;
        b = s1;
        return this;
    }

    public final d a(boolean flag)
    {
        l = true;
        m = flag;
        return this;
    }

    public final c a(b b1)
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

            case 18: // '\022'
                b(b1.e());
                break;

            case 26: // '\032'
                c(b1.e());
                break;

            case 32: // ' '
                a(b1.c());
                break;

            case 42: // '*'
                d(b1.e());
                break;

            case 50: // '2'
                a(b1.f());
                break;

            case 56: // '8'
                a(b1.d());
                break;

            case 64: // '@'
                b(b1.d());
                break;

            case 72: // 'H'
                c(b1.d());
                break;

            case 80: // 'P'
                b(b1.c());
                break;

            case 88: // 'X'
                c(b1.c());
                break;

            case 98: // 'b'
                e(b1.e());
                break;

            case 104: // 'h'
                d(b1.d());
                break;

            case 112: // 'p'
                e(b1.d());
                break;

            case 120: // 'x'
                f(b1.d());
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
        for (Iterator iterator = c.iterator(); iterator.hasNext(); codedoutputstreammicro.a(2, (String)iterator.next())) { }
        if (d)
        {
            codedoutputstreammicro.a(3, e);
        }
        if (f)
        {
            codedoutputstreammicro.a(4, g);
        }
        if (h)
        {
            codedoutputstreammicro.a(5, i);
        }
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
        if (v)
        {
            codedoutputstreammicro.a(12, w);
        }
        if (x)
        {
            codedoutputstreammicro.a(13, y);
        }
        if (z)
        {
            codedoutputstreammicro.a(14, A);
        }
        if (B)
        {
            codedoutputstreammicro.a(15, C);
        }
    }

    public final d b(int i1)
    {
        r = true;
        s = i1;
        return this;
    }

    public final d b(String s1)
    {
        if (s1 == null)
        {
            throw new NullPointerException();
        }
        if (c.isEmpty())
        {
            c = new ArrayList();
        }
        c.add(s1);
        return this;
    }

    public final d b(boolean flag)
    {
        n = true;
        o = flag;
        return this;
    }

    public final List b()
    {
        return c;
    }

    public final int c()
    {
        return c.size();
    }

    public final d c(int i1)
    {
        t = true;
        u = i1;
        return this;
    }

    public final d c(String s1)
    {
        d = true;
        e = s1;
        return this;
    }

    public final d c(boolean flag)
    {
        p = true;
        q = flag;
        return this;
    }

    public final d d(String s1)
    {
        h = true;
        i = s1;
        return this;
    }

    public final d d(boolean flag)
    {
        x = true;
        y = flag;
        return this;
    }

    public final String d()
    {
        return e;
    }

    public final int e()
    {
        if (D < 0)
        {
            f();
        }
        return D;
    }

    public final d e(String s1)
    {
        v = true;
        w = s1;
        return this;
    }

    public final d e(boolean flag)
    {
        z = true;
        A = flag;
        return this;
    }

    public final int f()
    {
        int j1 = 0;
        Iterator iterator;
        int i1;
        if (a)
        {
            i1 = CodedOutputStreamMicro.b(1, b) + 0;
        } else
        {
            i1 = 0;
        }
        for (iterator = c.iterator(); iterator.hasNext();)
        {
            j1 += CodedOutputStreamMicro.a((String)iterator.next());
        }

        j1 = i1 + j1 + c.size() * 1;
        i1 = j1;
        if (d)
        {
            i1 = j1 + CodedOutputStreamMicro.b(3, e);
        }
        j1 = i1;
        if (f)
        {
            j1 = i1 + CodedOutputStreamMicro.b(4, g);
        }
        i1 = j1;
        if (h)
        {
            i1 = j1 + CodedOutputStreamMicro.b(5, i);
        }
        j1 = i1;
        if (j)
        {
            j1 = i1 + CodedOutputStreamMicro.b(6, k);
        }
        i1 = j1;
        if (l)
        {
            i1 = j1 + CodedOutputStreamMicro.b(7, m);
        }
        j1 = i1;
        if (n)
        {
            j1 = i1 + CodedOutputStreamMicro.b(8, o);
        }
        i1 = j1;
        if (p)
        {
            i1 = j1 + CodedOutputStreamMicro.b(9, q);
        }
        j1 = i1;
        if (r)
        {
            j1 = i1 + CodedOutputStreamMicro.b(10, s);
        }
        i1 = j1;
        if (t)
        {
            i1 = j1 + CodedOutputStreamMicro.b(11, u);
        }
        j1 = i1;
        if (v)
        {
            j1 = i1 + CodedOutputStreamMicro.b(12, w);
        }
        i1 = j1;
        if (x)
        {
            i1 = j1 + CodedOutputStreamMicro.b(13, y);
        }
        j1 = i1;
        if (z)
        {
            j1 = i1 + CodedOutputStreamMicro.b(14, A);
        }
        i1 = j1;
        if (B)
        {
            i1 = j1 + CodedOutputStreamMicro.b(15, C);
        }
        D = i1;
        return i1;
    }

    public final d f(boolean flag)
    {
        B = true;
        C = flag;
        return this;
    }

    public final int g()
    {
        return g;
    }

    public final String h()
    {
        return i;
    }

    public final a i()
    {
        return k;
    }

    public final boolean j()
    {
        return m;
    }

    public final boolean k()
    {
        return o;
    }

    public final boolean l()
    {
        return q;
    }

    public final int m()
    {
        return s;
    }

    public final int n()
    {
        return u;
    }

    public final String o()
    {
        return w;
    }

    public final boolean p()
    {
        return y;
    }

    public final boolean q()
    {
        return A;
    }

    public final boolean r()
    {
        return C;
    }
}
