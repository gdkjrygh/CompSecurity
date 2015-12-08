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

public final class jj extends b
{

    public static final jj a[] = new jj[0];
    public String b;
    public int c;
    public String d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public String l;
    public String m;
    public String n;

    public jj()
    {
        b = "";
        c = 1;
        d = "";
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = 0;
        j = false;
        k = false;
        l = "";
        m = "";
        n = "";
    }

    public final int a()
    {
        int j1 = 0;
        if (!b.equals(""))
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i1 = j1;
        if (c != 1)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(2, c);
        }
        j1 = i1;
        if (!d.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(3, d);
        }
        i1 = j1;
        if (e != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(4, e);
        }
        j1 = i1;
        if (f != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(5, f);
        }
        i1 = j1;
        if (g != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(6, g);
        }
        j1 = i1;
        if (h != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(7, h);
        }
        i1 = j1;
        if (i != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(8, i);
        }
        j1 = i1;
        if (j)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(9, j);
        }
        i1 = j1;
        if (k)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, k);
        }
        j1 = i1;
        if (!l.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(11, l);
        }
        i1 = j1;
        if (!m.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(12, m);
        }
        j1 = i1;
        if (!n.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(13, n);
        }
        i1 = j1 + com.google.protobuf.nano.f.a(dl);
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

            case 10: // '\n'
                b = a1.f();
                break;

            case 16: // '\020'
                int j1 = a1.d();
                if (j1 == 1 || j1 == 2)
                {
                    c = j1;
                } else
                {
                    c = 1;
                }
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 32: // ' '
                e = a1.d();
                break;

            case 40: // '('
                f = a1.d();
                break;

            case 48: // '0'
                g = a1.d();
                break;

            case 56: // '8'
                h = a1.d();
                break;

            case 64: // '@'
                i = a1.d();
                break;

            case 72: // 'H'
                j = a1.e();
                break;

            case 80: // 'P'
                k = a1.e();
                break;

            case 90: // 'Z'
                l = a1.f();
                break;

            case 98: // 'b'
                m = a1.f();
                break;

            case 106: // 'j'
                n = a1.f();
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
        if (c != 1)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != 0)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != 0)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g != 0)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h != 0)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != 0)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (!l.equals(""))
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (!m.equals(""))
        {
            codedoutputbytebuffernano.a(12, m);
        }
        if (!n.equals(""))
        {
            codedoutputbytebuffernano.a(13, n);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
