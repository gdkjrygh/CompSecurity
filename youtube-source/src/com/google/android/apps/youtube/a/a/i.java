// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.a.a;

import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.b;
import com.google.protobuf.micro.c;

// Referenced classes of package com.google.android.apps.youtube.a.a:
//            d

public final class i extends c
{

    private boolean a;
    private d b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private String p;
    private int q;

    public i()
    {
        b = null;
        d = false;
        f = false;
        h = false;
        j = false;
        l = false;
        n = false;
        p = "";
        q = -1;
    }

    public final d a()
    {
        return b;
    }

    public final i a(d d1)
    {
        if (d1 == null)
        {
            throw new NullPointerException();
        } else
        {
            a = true;
            b = d1;
            return this;
        }
    }

    public final i a(String s)
    {
        o = true;
        p = s;
        return this;
    }

    public final i a(boolean flag)
    {
        c = true;
        d = flag;
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
                d d1 = new d();
                b1.a(d1);
                a(d1);
                break;

            case 16: // '\020'
                a(b1.d());
                break;

            case 24: // '\030'
                b(b1.d());
                break;

            case 32: // ' '
                c(b1.d());
                break;

            case 40: // '('
                d(b1.d());
                break;

            case 48: // '0'
                e(b1.d());
                break;

            case 56: // '8'
                f(b1.d());
                break;

            case 66: // 'B'
                a(b1.e());
                break;
            }
        } while (true);
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
        if (i)
        {
            codedoutputstreammicro.a(5, j);
        }
        if (k)
        {
            codedoutputstreammicro.a(6, l);
        }
        if (m)
        {
            codedoutputstreammicro.a(7, n);
        }
        if (o)
        {
            codedoutputstreammicro.a(8, p);
        }
    }

    public final i b(boolean flag)
    {
        e = true;
        f = flag;
        return this;
    }

    public final boolean b()
    {
        return d;
    }

    public final i c(boolean flag)
    {
        g = true;
        h = flag;
        return this;
    }

    public final boolean c()
    {
        return f;
    }

    public final i d(boolean flag)
    {
        i = true;
        j = flag;
        return this;
    }

    public final boolean d()
    {
        return h;
    }

    public final int e()
    {
        if (q < 0)
        {
            f();
        }
        return q;
    }

    public final i e(boolean flag)
    {
        k = true;
        l = flag;
        return this;
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
        j1 = i1;
        if (i)
        {
            j1 = i1 + CodedOutputStreamMicro.b(5, j);
        }
        i1 = j1;
        if (k)
        {
            i1 = j1 + CodedOutputStreamMicro.b(6, l);
        }
        j1 = i1;
        if (m)
        {
            j1 = i1 + CodedOutputStreamMicro.b(7, n);
        }
        i1 = j1;
        if (o)
        {
            i1 = j1 + CodedOutputStreamMicro.b(8, p);
        }
        q = i1;
        return i1;
    }

    public final i f(boolean flag)
    {
        m = true;
        n = flag;
        return this;
    }

    public final boolean g()
    {
        return j;
    }

    public final boolean h()
    {
        return l;
    }

    public final boolean i()
    {
        return n;
    }

    public final String j()
    {
        return p;
    }
}
