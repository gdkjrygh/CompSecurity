// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.a.a;

import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.b;
import com.google.protobuf.micro.c;

public final class g extends c
{

    private boolean a;
    private String b;
    private boolean c;
    private long d;
    private boolean e;
    private long f;
    private int g;

    public g()
    {
        b = "";
        d = 0L;
        f = 0L;
        g = -1;
    }

    public final g a(long l)
    {
        c = true;
        d = l;
        return this;
    }

    public final g a(String s)
    {
        a = true;
        b = s;
        return this;
    }

    public final c a(b b1)
    {
        do
        {
            int i = b1.a();
            switch (i)
            {
            default:
                if (b1.b(i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 18: // '\022'
                a(b1.e());
                break;

            case 24: // '\030'
                a(b1.b());
                break;

            case 32: // ' '
                b(b1.b());
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
            codedoutputstreammicro.a(2, b);
        }
        if (c)
        {
            codedoutputstreammicro.a(3, d);
        }
        if (e)
        {
            codedoutputstreammicro.a(4, f);
        }
    }

    public final g b(long l)
    {
        e = true;
        f = l;
        return this;
    }

    public final boolean b()
    {
        return a;
    }

    public final long c()
    {
        return d;
    }

    public final boolean d()
    {
        return c;
    }

    public final int e()
    {
        if (g < 0)
        {
            f();
        }
        return g;
    }

    public final int f()
    {
        int j = 0;
        if (a)
        {
            j = CodedOutputStreamMicro.b(2, b) + 0;
        }
        int i = j;
        if (c)
        {
            i = j + CodedOutputStreamMicro.b(3, d);
        }
        j = i;
        if (e)
        {
            j = i + CodedOutputStreamMicro.b(4, f);
        }
        g = j;
        return j;
    }

    public final long g()
    {
        return f;
    }
}
