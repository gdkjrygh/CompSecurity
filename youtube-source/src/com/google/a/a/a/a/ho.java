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
//            hq, ie, hp, hr, 
//            hz, hs, ib, if

public final class ho extends b
{

    public static final ho a[] = new ho[0];
    public int b;
    public hp c;
    public int d;
    public long e;
    public long f;
    public hq g[];
    public ie h[];
    public hr i;
    public hz j;
    public hs k;
    public int l;
    public ib m;
    public if n;

    public ho()
    {
        b = 0;
        c = null;
        d = 0;
        e = 0L;
        f = 0L;
        g = com.google.a.a.a.a.hq.a;
        h = com.google.a.a.a.a.ie.a;
        i = null;
        j = null;
        k = null;
        l = 0;
        m = null;
        n = null;
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        if (b != 0)
        {
            j1 = CodedOutputByteBufferNano.d(1, b) + 0;
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
        if (d != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(3, d);
        }
        i1 = j1;
        if (e != 0L)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(4, e);
        }
        j1 = i1;
        if (f != 0L)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(5, f);
        }
        i1 = j1;
        if (g != null)
        {
            hq ahq[] = g;
            int i2 = ahq.length;
            int k1 = 0;
            do
            {
                i1 = j1;
                if (k1 >= i2)
                {
                    break;
                }
                i1 = CodedOutputByteBufferNano.b(6, ahq[k1]);
                k1++;
                j1 = i1 + j1;
            } while (true);
        }
        j1 = i1;
        if (h != null)
        {
            ie aie[] = h;
            int j2 = aie.length;
            int l1 = ((flag) ? 1 : 0);
            do
            {
                j1 = i1;
                if (l1 >= j2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(7, aie[l1]);
                l1++;
            } while (true);
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
        if (l != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(11, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(12, m);
        }
        j1 = i1;
        if (n != null)
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

            case 8: // '\b'
                int j1 = a1.d();
                if (j1 == 0 || j1 == 1 || j1 == 2 || j1 == 3)
                {
                    b = j1;
                } else
                {
                    b = 0;
                }
                break;

            case 18: // '\022'
                c = new hp();
                a1.a(c);
                break;

            case 24: // '\030'
                d = a1.d();
                break;

            case 32: // ' '
                e = a1.c();
                break;

            case 40: // '('
                f = a1.c();
                break;

            case 50: // '2'
                int j2 = com.google.protobuf.nano.f.a(a1, 50);
                hq ahq[];
                int k1;
                if (g == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = g.length;
                }
                ahq = new hq[j2 + k1];
                if (g != null)
                {
                    System.arraycopy(g, 0, ahq, 0, k1);
                }
                for (g = ahq; k1 < g.length - 1; k1++)
                {
                    g[k1] = new hq();
                    a1.a(g[k1]);
                    a1.a();
                }

                g[k1] = new hq();
                a1.a(g[k1]);
                break;

            case 58: // ':'
                int k2 = com.google.protobuf.nano.f.a(a1, 58);
                ie aie[];
                int l1;
                if (h == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = h.length;
                }
                aie = new ie[k2 + l1];
                if (h != null)
                {
                    System.arraycopy(h, 0, aie, 0, l1);
                }
                for (h = aie; l1 < h.length - 1; l1++)
                {
                    h[l1] = new ie();
                    a1.a(h[l1]);
                    a1.a();
                }

                h[l1] = new ie();
                a1.a(h[l1]);
                break;

            case 66: // 'B'
                i = new hr();
                a1.a(i);
                break;

            case 74: // 'J'
                j = new hz();
                a1.a(j);
                break;

            case 82: // 'R'
                k = new hs();
                a1.a(k);
                break;

            case 88: // 'X'
                int i2 = a1.d();
                if (i2 == 0 || i2 == 1)
                {
                    l = i2;
                } else
                {
                    l = 0;
                }
                break;

            case 98: // 'b'
                m = new ib();
                a1.a(m);
                break;

            case 106: // 'j'
                n = new if();
                a1.a(n);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != 0)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != 0L)
        {
            codedoutputbytebuffernano.b(4, e);
        }
        if (f != 0L)
        {
            codedoutputbytebuffernano.b(5, f);
        }
        if (g != null)
        {
            hq ahq[] = g;
            int k1 = ahq.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(6, ahq[i1]);
            }

        }
        if (h != null)
        {
            ie aie[] = h;
            int l1 = aie.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                codedoutputbytebuffernano.a(7, aie[j1]);
            }

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
        if (l != 0)
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m != null)
        {
            codedoutputbytebuffernano.a(12, m);
        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(13, n);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
