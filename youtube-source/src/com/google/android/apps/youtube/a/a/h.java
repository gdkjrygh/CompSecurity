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

public final class h extends c
{

    private boolean a;
    private String b;
    private List c;
    private boolean d;
    private int e;
    private int f;

    public h()
    {
        b = "";
        c = Collections.emptyList();
        e = 0;
        f = -1;
    }

    public final h a(int i)
    {
        if (c.isEmpty())
        {
            c = new ArrayList();
        }
        c.add(Integer.valueOf(i));
        return this;
    }

    public final h a(String s)
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

            case 10: // '\n'
                a(b1.e());
                break;

            case 16: // '\020'
                a(b1.c());
                break;

            case 24: // '\030'
                b(b1.c());
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
        for (Iterator iterator = c.iterator(); iterator.hasNext(); codedoutputstreammicro.a(2, ((Integer)iterator.next()).intValue())) { }
        if (d)
        {
            codedoutputstreammicro.a(3, e);
        }
    }

    public final h b(int i)
    {
        d = true;
        e = i;
        return this;
    }

    public final boolean b()
    {
        return a;
    }

    public final List c()
    {
        return c;
    }

    public final int d()
    {
        return e;
    }

    public final int e()
    {
        if (f < 0)
        {
            f();
        }
        return f;
    }

    public final int f()
    {
        int j = 0;
        Iterator iterator;
        int i;
        if (a)
        {
            i = CodedOutputStreamMicro.b(1, b) + 0;
        } else
        {
            i = 0;
        }
        for (iterator = c.iterator(); iterator.hasNext();)
        {
            j += CodedOutputStreamMicro.a(((Integer)iterator.next()).intValue());
        }

        j = i + j + c.size() * 1;
        i = j;
        if (d)
        {
            i = j + CodedOutputStreamMicro.b(3, e);
        }
        f = i;
        return i;
    }

    public final boolean g()
    {
        return d;
    }
}
