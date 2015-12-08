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
//            fj

public final class sb extends b
{

    public static final sb a[] = new sb[0];
    public long b;
    public fj c[];
    public fj d[];
    public String e;
    public String f;
    public fj g[];
    public String h;

    public sb()
    {
        b = 0L;
        c = com.google.a.a.a.a.fj.a;
        d = com.google.a.a.a.a.fj.a;
        e = "";
        f = "";
        g = com.google.a.a.a.a.fj.a;
        h = "";
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        int i1;
        if (b != 0L)
        {
            j = CodedOutputByteBufferNano.d(1, b) + 0;
        } else
        {
            j = 0;
        }
        i = j;
        if (c != null)
        {
            fj afj[] = c;
            int k1 = afj.length;
            int k = 0;
            do
            {
                i = j;
                if (k >= k1)
                {
                    break;
                }
                i = CodedOutputByteBufferNano.b(2, afj[k]);
                k++;
                j = i + j;
            } while (true);
        }
        j = i;
        if (d != null)
        {
            fj afj1[] = d;
            int l1 = afj1.length;
            int l = 0;
            do
            {
                j = i;
                if (l >= l1)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(3, afj1[l]);
                l++;
                i = j + i;
            } while (true);
        }
        i1 = j;
        if (!e.equals(""))
        {
            i1 = j + CodedOutputByteBufferNano.b(4, e);
        }
        i = i1;
        if (!f.equals(""))
        {
            i = i1 + CodedOutputByteBufferNano.b(5, f);
        }
        j = i;
        if (g != null)
        {
            fj afj2[] = g;
            int i2 = afj2.length;
            int j1 = ((flag) ? 1 : 0);
            do
            {
                j = i;
                if (j1 >= i2)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(6, afj2[j1]);
                j1++;
            } while (true);
        }
        i = j;
        if (!h.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(7, h);
        }
        i += com.google.protobuf.nano.f.a(dl);
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
                b = a1.c();
                break;

            case 18: // '\022'
                int i1 = com.google.protobuf.nano.f.a(a1, 18);
                fj afj[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                afj = new fj[i1 + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, afj, 0, j);
                }
                for (c = afj; j < c.length - 1; j++)
                {
                    c[j] = new fj();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new fj();
                a1.a(c[j]);
                break;

            case 26: // '\032'
                int j1 = com.google.protobuf.nano.f.a(a1, 26);
                fj afj1[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                afj1 = new fj[j1 + k];
                if (d != null)
                {
                    System.arraycopy(d, 0, afj1, 0, k);
                }
                for (d = afj1; k < d.length - 1; k++)
                {
                    d[k] = new fj();
                    a1.a(d[k]);
                    a1.a();
                }

                d[k] = new fj();
                a1.a(d[k]);
                break;

            case 34: // '"'
                e = a1.f();
                break;

            case 42: // '*'
                f = a1.f();
                break;

            case 50: // '2'
                int k1 = com.google.protobuf.nano.f.a(a1, 50);
                fj afj2[];
                int l;
                if (g == null)
                {
                    l = 0;
                } else
                {
                    l = g.length;
                }
                afj2 = new fj[k1 + l];
                if (g != null)
                {
                    System.arraycopy(g, 0, afj2, 0, l);
                }
                for (g = afj2; l < g.length - 1; l++)
                {
                    g[l] = new fj();
                    a1.a(g[l]);
                    a1.a();
                }

                g[l] = new fj();
                a1.a(g[l]);
                break;

            case 58: // ':'
                h = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != 0L)
        {
            codedoutputbytebuffernano.b(1, b);
        }
        if (c != null)
        {
            fj afj[] = c;
            int l = afj.length;
            for (int i = 0; i < l; i++)
            {
                codedoutputbytebuffernano.a(2, afj[i]);
            }

        }
        if (d != null)
        {
            fj afj1[] = d;
            int i1 = afj1.length;
            for (int j = 0; j < i1; j++)
            {
                codedoutputbytebuffernano.a(3, afj1[j]);
            }

        }
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (!f.equals(""))
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g != null)
        {
            fj afj2[] = g;
            int j1 = afj2.length;
            for (int k = ((flag) ? 1 : 0); k < j1; k++)
            {
                codedoutputbytebuffernano.a(6, afj2[k]);
            }

        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(7, h);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
