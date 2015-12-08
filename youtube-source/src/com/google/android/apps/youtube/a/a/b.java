// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.a.a;

import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.c;

public final class b extends c
{

    private boolean a;
    private String b;
    private boolean c;
    private String d;
    private int e;

    public b()
    {
        b = "";
        d = "";
        e = -1;
    }

    public final b a(String s)
    {
        a = true;
        b = s;
        return this;
    }

    public final c a(com.google.protobuf.micro.b b1)
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

            case 10: // '\n'
                a(b1.e());
                break;

            case 18: // '\022'
                b(b1.e());
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
    }

    public final b b(String s)
    {
        c = true;
        d = s;
        return this;
    }

    public final boolean b()
    {
        return a;
    }

    public final String c()
    {
        return d;
    }

    public final boolean d()
    {
        return c;
    }

    public final int e()
    {
        if (e < 0)
        {
            f();
        }
        return e;
    }

    public final int f()
    {
        int i = 0;
        if (a)
        {
            i = CodedOutputStreamMicro.b(1, b) + 0;
        }
        int j = i;
        if (c)
        {
            j = i + CodedOutputStreamMicro.b(2, d);
        }
        e = j;
        return j;
    }
}
