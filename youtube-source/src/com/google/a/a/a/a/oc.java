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

public final class oc extends b
{

    public static final oc a[] = new oc[0];
    public String b;
    public String c;
    public String d;
    public int e;
    public float f;
    public float g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l;
    public int m;

    public oc()
    {
        b = "";
        c = "";
        d = "";
        e = 0;
        f = 0.0F;
        g = 0.0F;
        h = "";
        i = "";
        j = "";
        k = "";
        l = 0;
        m = 0;
    }

    public final int a()
    {
        int j1 = 0;
        if (!b.equals(""))
        {
            j1 = CodedOutputByteBufferNano.b(2, b) + 0;
        }
        int i1 = j1;
        if (!c.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(3, c);
        }
        j1 = i1;
        if (!d.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(5, d);
        }
        i1 = j1;
        if (e != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(6, e);
        }
        j1 = i1;
        if (f != 0.0F)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, f);
        }
        i1 = j1;
        if (g != 0.0F)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, g);
        }
        j1 = i1;
        if (!h.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(9, h);
        }
        i1 = j1;
        if (!i.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, i);
        }
        j1 = i1;
        if (!j.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(11, j);
        }
        i1 = j1;
        if (!k.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(12, k);
        }
        j1 = i1;
        if (l != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(13, l);
        }
        i1 = j1;
        if (m != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.f(14, m);
        }
        i1 += com.google.protobuf.nano.f.a(dl);
        dm = i1;
        return i1;
    }

    public final c a(a a1)
    {
        do
        {
            int i1 = a1.a();
            switch (i1)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 18: // '\022'
                b = a1.f();
                break;

            case 26: // '\032'
                c = a1.f();
                break;

            case 42: // '*'
                d = a1.f();
                break;

            case 48: // '0'
                int j1 = a1.d();
                if (j1 == 0 || j1 == 1 || j1 == 2 || j1 == 3 || j1 == 4 || j1 == 5 || j1 == 6 || j1 == 7 || j1 == 8 || j1 == 9 || j1 == 10)
                {
                    e = j1;
                } else
                {
                    e = 0;
                }
                break;

            case 61: // '='
                f = Float.intBitsToFloat(a1.i());
                break;

            case 69: // 'E'
                g = Float.intBitsToFloat(a1.i());
                break;

            case 74: // 'J'
                h = a1.f();
                break;

            case 82: // 'R'
                i = a1.f();
                break;

            case 90: // 'Z'
                j = a1.f();
                break;

            case 98: // 'b'
                k = a1.f();
                break;

            case 104: // 'h'
                int k1 = a1.d();
                if (k1 == 0 || k1 == 1 || k1 == 2)
                {
                    l = k1;
                } else
                {
                    l = 0;
                }
                break;

            case 112: // 'p'
                m = a1.h();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (!b.equals(""))
        {
            codedoutputbytebuffernano.a(2, b);
        }
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(3, c);
        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(5, d);
        }
        if (e != 0)
        {
            codedoutputbytebuffernano.a(6, e);
        }
        if (f != 0.0F)
        {
            codedoutputbytebuffernano.a(7, f);
        }
        if (g != 0.0F)
        {
            codedoutputbytebuffernano.a(8, g);
        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(9, h);
        }
        if (!i.equals(""))
        {
            codedoutputbytebuffernano.a(10, i);
        }
        if (!j.equals(""))
        {
            codedoutputbytebuffernano.a(11, j);
        }
        if (!k.equals(""))
        {
            codedoutputbytebuffernano.a(12, k);
        }
        if (l != 0)
        {
            codedoutputbytebuffernano.a(13, l);
        }
        if (m != 0)
        {
            codedoutputbytebuffernano.c(14, m);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
