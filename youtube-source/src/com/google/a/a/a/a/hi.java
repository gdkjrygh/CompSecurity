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
//            jj, ta, ex, k, 
//            l, hl, mp

public final class hi extends b
{

    public static final hi a[] = new hi[0];
    public l b;
    public String c;
    public jj d[];
    public ta e[];
    public hl f;
    public ex g[];
    public k h[];
    public mp i;

    public hi()
    {
        b = null;
        c = "";
        d = com.google.a.a.a.a.jj.a;
        e = com.google.a.a.a.a.ta.a;
        f = null;
        g = com.google.a.a.a.a.ex.a;
        h = com.google.a.a.a.a.k.a;
        i = null;
    }

    public final int a()
    {
        boolean flag = false;
        int j;
        int i1;
        int k1;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j = 0;
        }
        i1 = j;
        if (!c.equals(""))
        {
            i1 = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i1;
        if (d != null)
        {
            jj ajj[] = d;
            int j2 = ajj.length;
            int j1 = 0;
            do
            {
                j = i1;
                if (j1 >= j2)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(3, ajj[j1]);
                j1++;
                i1 = j + i1;
            } while (true);
        }
        k1 = j;
        if (e != null)
        {
            ta ata[] = e;
            int k2 = ata.length;
            i1 = 0;
            do
            {
                k1 = j;
                if (i1 >= k2)
                {
                    break;
                }
                k1 = CodedOutputByteBufferNano.b(4, ata[i1]);
                i1++;
                j = k1 + j;
            } while (true);
        }
        i1 = k1;
        if (f != null)
        {
            i1 = k1 + CodedOutputByteBufferNano.b(5, f);
        }
        j = i1;
        if (g != null)
        {
            ex aex[] = g;
            int l2 = aex.length;
            int l1 = 0;
            do
            {
                j = i1;
                if (l1 >= l2)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(6, aex[l1]);
                l1++;
                i1 = j + i1;
            } while (true);
        }
        i1 = j;
        if (h != null)
        {
            k ak[] = h;
            int i3 = ak.length;
            int i2 = ((flag) ? 1 : 0);
            do
            {
                i1 = j;
                if (i2 >= i3)
                {
                    break;
                }
                j += CodedOutputByteBufferNano.b(7, ak[i2]);
                i2++;
            } while (true);
        }
        j = i1;
        if (i != null)
        {
            j = i1 + CodedOutputByteBufferNano.b(8, i);
        }
        j += com.google.protobuf.nano.f.a(dl);
        dm = j;
        return j;
    }

    public final c a(a a1)
    {
        do
        {
            int j = a1.a();
            switch (j)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = new l();
                a1.a(b);
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 26: // '\032'
                int i2 = com.google.protobuf.nano.f.a(a1, 26);
                jj ajj[];
                int i1;
                if (d == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = d.length;
                }
                ajj = new jj[i2 + i1];
                if (d != null)
                {
                    System.arraycopy(d, 0, ajj, 0, i1);
                }
                for (d = ajj; i1 < d.length - 1; i1++)
                {
                    d[i1] = new jj();
                    a1.a(d[i1]);
                    a1.a();
                }

                d[i1] = new jj();
                a1.a(d[i1]);
                break;

            case 34: // '"'
                int j2 = com.google.protobuf.nano.f.a(a1, 34);
                ta ata[];
                int j1;
                if (e == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = e.length;
                }
                ata = new ta[j2 + j1];
                if (e != null)
                {
                    System.arraycopy(e, 0, ata, 0, j1);
                }
                for (e = ata; j1 < e.length - 1; j1++)
                {
                    e[j1] = new ta();
                    a1.a(e[j1]);
                    a1.a();
                }

                e[j1] = new ta();
                a1.a(e[j1]);
                break;

            case 42: // '*'
                f = new hl();
                a1.a(f);
                break;

            case 50: // '2'
                int k2 = com.google.protobuf.nano.f.a(a1, 50);
                ex aex[];
                int k1;
                if (g == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = g.length;
                }
                aex = new ex[k2 + k1];
                if (g != null)
                {
                    System.arraycopy(g, 0, aex, 0, k1);
                }
                for (g = aex; k1 < g.length - 1; k1++)
                {
                    g[k1] = new ex();
                    a1.a(g[k1]);
                    a1.a();
                }

                g[k1] = new ex();
                a1.a(g[k1]);
                break;

            case 58: // ':'
                int l2 = com.google.protobuf.nano.f.a(a1, 58);
                k ak[];
                int l1;
                if (h == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = h.length;
                }
                ak = new k[l2 + l1];
                if (h != null)
                {
                    System.arraycopy(h, 0, ak, 0, l1);
                }
                for (h = ak; l1 < h.length - 1; l1++)
                {
                    h[l1] = new k();
                    a1.a(h[l1]);
                    a1.a();
                }

                h[l1] = new k();
                a1.a(h[l1]);
                break;

            case 66: // 'B'
                i = new mp();
                a1.a(i);
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
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            jj ajj[] = d;
            int l1 = ajj.length;
            for (int j = 0; j < l1; j++)
            {
                codedoutputbytebuffernano.a(3, ajj[j]);
            }

        }
        if (e != null)
        {
            ta ata[] = e;
            int i2 = ata.length;
            for (int i1 = 0; i1 < i2; i1++)
            {
                codedoutputbytebuffernano.a(4, ata[i1]);
            }

        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g != null)
        {
            ex aex[] = g;
            int j2 = aex.length;
            for (int j1 = 0; j1 < j2; j1++)
            {
                codedoutputbytebuffernano.a(6, aex[j1]);
            }

        }
        if (h != null)
        {
            k ak[] = h;
            int k2 = ak.length;
            for (int k1 = ((flag) ? 1 : 0); k1 < k2; k1++)
            {
                codedoutputbytebuffernano.a(7, ak[k1]);
            }

        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
