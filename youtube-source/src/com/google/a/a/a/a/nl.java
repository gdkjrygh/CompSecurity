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

// Referenced classes of package com.google.a.a.a.a:
//            np, nn, nm, nq, 
//            no

public final class nl extends b
{

    public static final nl a[] = new nl[0];
    public np b;
    public nn c;
    public nm d;
    public nq e;
    public no f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public String o;
    public boolean p;

    public nl()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = "";
        p = false;
    }

    public final int a()
    {
        int j1 = 0;
        if (b != null)
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(2, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(3, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(4, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(5, f);
        }
        i1 = j1;
        if (g)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(6, g);
        }
        j1 = i1;
        if (h)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, h);
        }
        i1 = j1;
        if (i)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, i);
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
        if (l)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(11, l);
        }
        i1 = j1;
        if (m)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(12, m);
        }
        j1 = i1;
        if (n)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(13, n);
        }
        i1 = j1;
        if (!o.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(14, o);
        }
        j1 = i1;
        if (p)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(15, p);
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
                b = new np();
                a1.a(b);
                break;

            case 18: // '\022'
                c = new nn();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new nm();
                a1.a(d);
                break;

            case 34: // '"'
                e = new nq();
                a1.a(e);
                break;

            case 42: // '*'
                f = new no();
                a1.a(f);
                break;

            case 48: // '0'
                g = a1.e();
                break;

            case 56: // '8'
                h = a1.e();
                break;

            case 64: // '@'
                i = a1.e();
                break;

            case 72: // 'H'
                j = a1.e();
                break;

            case 80: // 'P'
                k = a1.e();
                break;

            case 88: // 'X'
                l = a1.e();
                break;

            case 96: // '`'
                m = a1.e();
                break;

            case 104: // 'h'
                n = a1.e();
                break;

            case 114: // 'r'
                o = a1.f();
                break;

            case 120: // 'x'
                p = a1.e();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i)
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
        if (l)
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m)
        {
            codedoutputbytebuffernano.a(12, m);
        }
        if (n)
        {
            codedoutputbytebuffernano.a(13, n);
        }
        if (!o.equals(""))
        {
            codedoutputbytebuffernano.a(14, o);
        }
        if (p)
        {
            codedoutputbytebuffernano.a(15, p);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
