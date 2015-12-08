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

public final class do extends b
{

    public static final do a[] = new do[0];
    public String b;
    public String c;
    public int d;
    public long e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public String l;
    public long m;
    public String n;
    public String o;
    public int p;
    public String q;

    public do()
    {
        b = "";
        c = "";
        d = 0;
        e = 0L;
        f = 0;
        g = 0;
        h = 0;
        i = false;
        j = false;
        k = false;
        l = "";
        m = 0L;
        n = "";
        o = "";
        p = 0;
        q = "";
    }

    public final int a()
    {
        int j1 = 0;
        if (!b.equals(""))
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i1 = j1;
        if (!c.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(3, c);
        }
        j1 = i1;
        if (d != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.f(4, d);
        }
        i1 = j1;
        if (e != 0L)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(5, e);
        }
        j1 = i1;
        if (f != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.f(6, f);
        }
        i1 = j1;
        if (g != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.f(7, g);
        }
        j1 = i1;
        if (h != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.f(8, h);
        }
        i1 = j1;
        if (i)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(9, i);
        }
        j1 = i1;
        if (j)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(10, j);
        }
        i1 = j1;
        if (k)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(11, k);
        }
        j1 = i1;
        if (!l.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(12, l);
        }
        i1 = j1;
        if (m != 0L)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(13, m);
        }
        j1 = i1;
        if (!n.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(15, n);
        }
        i1 = j1;
        if (!o.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(16, o);
        }
        j1 = i1;
        if (p != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(17, p);
        }
        i1 = j1;
        if (!q.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(18, q);
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

            case 10: // '\n'
                b = a1.f();
                break;

            case 26: // '\032'
                c = a1.f();
                break;

            case 32: // ' '
                d = a1.h();
                break;

            case 40: // '('
                e = a1.c();
                break;

            case 48: // '0'
                f = a1.h();
                break;

            case 56: // '8'
                g = a1.h();
                break;

            case 64: // '@'
                h = a1.h();
                break;

            case 72: // 'H'
                i = a1.e();
                break;

            case 80: // 'P'
                j = a1.e();
                break;

            case 88: // 'X'
                k = a1.e();
                break;

            case 98: // 'b'
                l = a1.f();
                break;

            case 104: // 'h'
                m = a1.b();
                break;

            case 122: // 'z'
                n = a1.f();
                break;

            case 130: 
                o = a1.f();
                break;

            case 136: 
                p = a1.d();
                break;

            case 146: 
                q = a1.f();
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
            codedoutputbytebuffernano.a(3, c);
        }
        if (d != 0)
        {
            codedoutputbytebuffernano.c(4, d);
        }
        if (e != 0L)
        {
            codedoutputbytebuffernano.b(5, e);
        }
        if (f != 0)
        {
            codedoutputbytebuffernano.c(6, f);
        }
        if (g != 0)
        {
            codedoutputbytebuffernano.c(7, g);
        }
        if (h != 0)
        {
            codedoutputbytebuffernano.c(8, h);
        }
        if (i)
        {
            codedoutputbytebuffernano.a(9, i);
        }
        if (j)
        {
            codedoutputbytebuffernano.a(10, j);
        }
        if (k)
        {
            codedoutputbytebuffernano.a(11, k);
        }
        if (!l.equals(""))
        {
            codedoutputbytebuffernano.a(12, l);
        }
        if (m != 0L)
        {
            codedoutputbytebuffernano.a(13, m);
        }
        if (!n.equals(""))
        {
            codedoutputbytebuffernano.a(15, n);
        }
        if (!o.equals(""))
        {
            codedoutputbytebuffernano.a(16, o);
        }
        if (p != 0)
        {
            codedoutputbytebuffernano.a(17, p);
        }
        if (!q.equals(""))
        {
            codedoutputbytebuffernano.a(18, q);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
