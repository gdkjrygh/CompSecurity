// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.f;
import java.util.ArrayList;

public final class da extends b
{

    public static final da a[] = new da[0];
    public boolean b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public boolean h;

    public da()
    {
        b = false;
        c = "";
        d = "";
        e = "";
        f = "";
        g = 0;
        h = false;
    }

    public final int a()
    {
        int j = 0;
        if (b)
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i = j;
        if (!c.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (!d.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(3, d);
        }
        i = j;
        if (!e.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(4, e);
        }
        j = i;
        if (!f.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(5, f);
        }
        i = j;
        if (g != 0)
        {
            i = j + CodedOutputByteBufferNano.d(6, g);
        }
        j = i;
        if (h)
        {
            j = i + CodedOutputByteBufferNano.b(7, h);
        }
        i = j + com.google.protobuf.nano.f.a(dl);
        dm = i;
        return i;
    }

    public final c a(a a1)
    {
        do
        {
            int i = a1.a();
            switch (i)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                b = a1.e();
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 34: // '"'
                e = a1.f();
                break;

            case 42: // '*'
                f = a1.f();
                break;

            case 48: // '0'
                int j = a1.d();
                if (j == 0 || j == 1 || j == 2)
                {
                    g = j;
                } else
                {
                    g = 0;
                }
                break;

            case 56: // '8'
                h = a1.e();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (!f.equals(""))
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g != 0)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
