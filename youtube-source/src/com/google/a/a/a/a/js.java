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
import java.util.Arrays;

// Referenced classes of package com.google.a.a.a.a:
//            jt, fk, sx, kz

public final class js extends b
{

    public static final js a[] = new js[0];
    public String b;
    public fk c;
    public sx d;
    public long e;
    public kz f;
    public fk g;
    public fk h;
    public jt i[];
    public fk j;
    public fk k;
    public kz l;
    public byte m[];

    public js()
    {
        b = "";
        c = null;
        d = null;
        e = 0L;
        f = null;
        g = null;
        h = null;
        i = com.google.a.a.a.a.jt.a;
        j = null;
        k = null;
        l = null;
        m = f.l;
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        int k1;
        if (!b.equals(""))
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
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
        if (e != 0L)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(4, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(5, f);
        }
        k1 = j1;
        if (g != null)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(6, g);
        }
        i1 = k1;
        if (h != null)
        {
            i1 = k1 + CodedOutputByteBufferNano.b(7, h);
        }
        j1 = i1;
        if (i != null)
        {
            jt ajt[] = i;
            int i2 = ajt.length;
            int l1 = ((flag) ? 1 : 0);
            do
            {
                j1 = i1;
                if (l1 >= i2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(9, ajt[l1]);
                l1++;
            } while (true);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(11, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(13, l);
        }
        j1 = i1;
        if (!Arrays.equals(m, f.l))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(14, m);
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

            case 18: // '\022'
                c = new fk();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new sx();
                a1.a(d);
                break;

            case 32: // ' '
                e = a1.c();
                break;

            case 42: // '*'
                f = new kz();
                a1.a(f);
                break;

            case 50: // '2'
                g = new fk();
                a1.a(g);
                break;

            case 58: // ':'
                h = new fk();
                a1.a(h);
                break;

            case 74: // 'J'
                int k1 = com.google.protobuf.nano.f.a(a1, 74);
                jt ajt[];
                int j1;
                if (i == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = i.length;
                }
                ajt = new jt[k1 + j1];
                if (i != null)
                {
                    System.arraycopy(i, 0, ajt, 0, j1);
                }
                for (i = ajt; j1 < i.length - 1; j1++)
                {
                    i[j1] = new jt();
                    a1.a(i[j1]);
                    a1.a();
                }

                i[j1] = new jt();
                a1.a(i[j1]);
                break;

            case 82: // 'R'
                j = new fk();
                a1.a(j);
                break;

            case 90: // 'Z'
                k = new fk();
                a1.a(k);
                break;

            case 106: // 'j'
                l = new kz();
                a1.a(l);
                break;

            case 114: // 'r'
                m = a1.g();
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
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != 0L)
        {
            codedoutputbytebuffernano.b(4, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != null)
        {
            jt ajt[] = i;
            int j1 = ajt.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(9, ajt[i1]);
            }

        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(10, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(11, k);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(13, l);
        }
        if (!Arrays.equals(m, f.l))
        {
            codedoutputbytebuffernano.a(14, m);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
