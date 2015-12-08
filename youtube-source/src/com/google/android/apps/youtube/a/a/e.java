// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.a.a;

import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.b;
import com.google.protobuf.micro.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.a.a:
//            h

public final class e extends c
{

    private boolean a;
    private h b;
    private boolean c;
    private h d;
    private boolean e;
    private h f;
    private boolean g;
    private h h;
    private List i;
    private int j;

    public e()
    {
        b = null;
        d = null;
        f = null;
        h = null;
        i = Collections.emptyList();
        j = -1;
    }

    public final e a(h h1)
    {
        if (h1 == null)
        {
            throw new NullPointerException();
        } else
        {
            a = true;
            b = h1;
            return this;
        }
    }

    public final c a(b b1)
    {
        do
        {
            int l = b1.a();
            switch (l)
            {
            default:
                if (b1.b(l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                h h1 = new h();
                b1.a(h1);
                a(h1);
                break;

            case 18: // '\022'
                h h2 = new h();
                b1.a(h2);
                b(h2);
                break;

            case 26: // '\032'
                h h3 = new h();
                b1.a(h3);
                c(h3);
                break;

            case 34: // '"'
                h h4 = new h();
                b1.a(h4);
                d(h4);
                break;

            case 42: // '*'
                h h5 = new h();
                b1.a(h5);
                e(h5);
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
        for (Iterator iterator = i.iterator(); iterator.hasNext(); codedoutputstreammicro.a(5, (h)iterator.next())) { }
    }

    public final boolean a()
    {
        return a;
    }

    public final e b(h h1)
    {
        if (h1 == null)
        {
            throw new NullPointerException();
        } else
        {
            c = true;
            d = h1;
            return this;
        }
    }

    public final h b()
    {
        return b;
    }

    public final e c(h h1)
    {
        if (h1 == null)
        {
            throw new NullPointerException();
        } else
        {
            e = true;
            f = h1;
            return this;
        }
    }

    public final boolean c()
    {
        return c;
    }

    public final e d(h h1)
    {
        if (h1 == null)
        {
            throw new NullPointerException();
        } else
        {
            g = true;
            h = h1;
            return this;
        }
    }

    public final h d()
    {
        return d;
    }

    public final int e()
    {
        if (j < 0)
        {
            f();
        }
        return j;
    }

    public final e e(h h1)
    {
        if (h1 == null)
        {
            throw new NullPointerException();
        }
        if (i.isEmpty())
        {
            i = new ArrayList();
        }
        i.add(h1);
        return this;
    }

    public final int f()
    {
        int i1 = 0;
        if (a)
        {
            i1 = CodedOutputStreamMicro.b(1, b) + 0;
        }
        int l = i1;
        if (c)
        {
            l = i1 + CodedOutputStreamMicro.b(2, d);
        }
        i1 = l;
        if (e)
        {
            i1 = l + CodedOutputStreamMicro.b(3, f);
        }
        l = i1;
        if (g)
        {
            l = i1 + CodedOutputStreamMicro.b(4, h);
        }
        for (Iterator iterator = i.iterator(); iterator.hasNext();)
        {
            l = CodedOutputStreamMicro.b(5, (h)iterator.next()) + l;
        }

        j = l;
        return l;
    }

    public final boolean g()
    {
        return e;
    }

    public final h h()
    {
        return f;
    }

    public final boolean i()
    {
        return g;
    }

    public final h j()
    {
        return h;
    }

    public final List k()
    {
        return i;
    }
}
