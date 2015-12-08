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
//            b, fk, rf, la, 
//            mt, bo, tw, kz

public final class bp extends b
{

    public static final bp a[] = new bp[0];
    public fk b;
    public com.google.a.a.a.a.b c[];
    public com.google.a.a.a.a.b d[];
    public fk e;
    public fk f;
    public fk g;
    public rf h;
    public la i;
    public mt j;
    public bo k;
    public tw l;
    public kz m;
    public String n;

    public bp()
    {
        b = null;
        c = com.google.a.a.a.a.b.a;
        d = com.google.a.a.a.a.b.a;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = "";
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        if (b != null)
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if (c != null)
        {
            com.google.a.a.a.a.b ab[] = c;
            int i2 = ab.length;
            int k1 = 0;
            do
            {
                i1 = j1;
                if (k1 >= i2)
                {
                    break;
                }
                i1 = CodedOutputByteBufferNano.b(2, ab[k1]);
                k1++;
                j1 = i1 + j1;
            } while (true);
        }
        j1 = i1;
        if (d != null)
        {
            com.google.a.a.a.a.b ab1[] = d;
            int j2 = ab1.length;
            int l1 = ((flag) ? 1 : 0);
            do
            {
                j1 = i1;
                if (l1 >= j2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(3, ab1[l1]);
                l1++;
            } while (true);
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
        if (g != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(6, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(9, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(11, l);
        }
        i1 = j1;
        if (m != null)
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
                b = new fk();
                a1.a(b);
                break;

            case 18: // '\022'
                int l1 = com.google.protobuf.nano.f.a(a1, 18);
                com.google.a.a.a.a.b ab[];
                int j1;
                if (c == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = c.length;
                }
                ab = new com.google.a.a.a.a.b[l1 + j1];
                if (c != null)
                {
                    System.arraycopy(c, 0, ab, 0, j1);
                }
                for (c = ab; j1 < c.length - 1; j1++)
                {
                    c[j1] = new com.google.a.a.a.a.b();
                    a1.a(c[j1]);
                    a1.a();
                }

                c[j1] = new com.google.a.a.a.a.b();
                a1.a(c[j1]);
                break;

            case 26: // '\032'
                int i2 = com.google.protobuf.nano.f.a(a1, 26);
                com.google.a.a.a.a.b ab1[];
                int k1;
                if (d == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = d.length;
                }
                ab1 = new com.google.a.a.a.a.b[i2 + k1];
                if (d != null)
                {
                    System.arraycopy(d, 0, ab1, 0, k1);
                }
                for (d = ab1; k1 < d.length - 1; k1++)
                {
                    d[k1] = new com.google.a.a.a.a.b();
                    a1.a(d[k1]);
                    a1.a();
                }

                d[k1] = new com.google.a.a.a.a.b();
                a1.a(d[k1]);
                break;

            case 34: // '"'
                e = new fk();
                a1.a(e);
                break;

            case 42: // '*'
                f = new fk();
                a1.a(f);
                break;

            case 50: // '2'
                g = new fk();
                a1.a(g);
                break;

            case 58: // ':'
                h = new rf();
                a1.a(h);
                break;

            case 66: // 'B'
                i = new la();
                a1.a(i);
                break;

            case 74: // 'J'
                j = new mt();
                a1.a(j);
                break;

            case 82: // 'R'
                k = new bo();
                a1.a(k);
                break;

            case 90: // 'Z'
                l = new tw();
                a1.a(l);
                break;

            case 98: // 'b'
                m = new kz();
                a1.a(m);
                break;

            case 106: // 'j'
                n = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != null)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != null)
        {
            com.google.a.a.a.a.b ab[] = c;
            int k1 = ab.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(2, ab[i1]);
            }

        }
        if (d != null)
        {
            com.google.a.a.a.a.b ab1[] = d;
            int l1 = ab1.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                codedoutputbytebuffernano.a(3, ab1[j1]);
            }

        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(4, e);
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
            codedoutputbytebuffernano.a(8, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m != null)
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
