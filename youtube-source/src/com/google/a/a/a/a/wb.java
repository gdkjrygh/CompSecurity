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

public final class wb extends b
{

    public static final wb a[] = new wb[0];
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public boolean g;
    public float h;
    public float i;
    public String j;

    public wb()
    {
        b = "";
        c = "";
        d = 0;
        e = "";
        f = "";
        g = false;
        h = 0.0F;
        i = 0.0F;
        j = "";
    }

    public final int a()
    {
        int l = 0;
        if (!b.equals(""))
        {
            l = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int k = l;
        if (!c.equals(""))
        {
            k = l + CodedOutputByteBufferNano.b(2, c);
        }
        l = k;
        if (d != 0)
        {
            l = k + CodedOutputByteBufferNano.d(3, d);
        }
        k = l;
        if (!e.equals(""))
        {
            k = l + CodedOutputByteBufferNano.b(4, e);
        }
        l = k;
        if (!f.equals(""))
        {
            l = k + CodedOutputByteBufferNano.b(5, f);
        }
        k = l;
        if (g)
        {
            k = l + CodedOutputByteBufferNano.b(6, g);
        }
        l = k;
        if (h != 0.0F)
        {
            l = k + CodedOutputByteBufferNano.b(7, h);
        }
        k = l;
        if (i != 0.0F)
        {
            k = l + CodedOutputByteBufferNano.b(8, i);
        }
        l = k;
        if (!j.equals(""))
        {
            l = k + CodedOutputByteBufferNano.b(9, j);
        }
        k = l + com.google.protobuf.nano.f.a(dl);
        dm = k;
        return k;
    }

    public final c a(a a1)
    {
        do
        {
            int k = a1.a();
            switch (k)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = a1.f();
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 24: // '\030'
                d = a1.d();
                break;

            case 34: // '"'
                e = a1.f();
                break;

            case 42: // '*'
                f = a1.f();
                break;

            case 48: // '0'
                g = a1.e();
                break;

            case 61: // '='
                h = Float.intBitsToFloat(a1.i());
                break;

            case 69: // 'E'
                i = Float.intBitsToFloat(a1.i());
                break;

            case 74: // 'J'
                j = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (!b.equals(""))
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != 0)
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
        if (g)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h != 0.0F)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != 0.0F)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (!j.equals(""))
        {
            codedoutputbytebuffernano.a(9, j);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
