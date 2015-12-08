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
//            jk, cf

public final class cg extends b
{

    public static final cg a[] = new cg[0];
    public jk b[];
    public jk c[];
    public jk d[];
    public cf e[];
    public cf f[];
    public cf g[];

    public cg()
    {
        b = com.google.a.a.a.a.jk.a;
        c = com.google.a.a.a.a.jk.a;
        d = com.google.a.a.a.a.jk.a;
        e = com.google.a.a.a.a.cf.a;
        f = com.google.a.a.a.a.cf.a;
        g = com.google.a.a.a.a.cf.a;
    }

    public final int a()
    {
        boolean flag = false;
        int k;
        if (b != null)
        {
            jk ajk[] = b;
            int j2 = ajk.length;
            int l = 0;
            int i = 0;
            do
            {
                k = i;
                if (l >= j2)
                {
                    break;
                }
                k = CodedOutputByteBufferNano.b(1, ajk[l]);
                l++;
                i = k + i;
            } while (true);
        } else
        {
            k = 0;
        }
        int j = k;
        if (c != null)
        {
            jk ajk1[] = c;
            int k2 = ajk1.length;
            int i1 = 0;
            do
            {
                j = k;
                if (i1 >= k2)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(2, ajk1[i1]);
                i1++;
                k = j + k;
            } while (true);
        }
        k = j;
        if (d != null)
        {
            jk ajk2[] = d;
            int l2 = ajk2.length;
            int j1 = 0;
            do
            {
                k = j;
                if (j1 >= l2)
                {
                    break;
                }
                k = CodedOutputByteBufferNano.b(3, ajk2[j1]);
                j1++;
                j = k + j;
            } while (true);
        }
        j = k;
        if (e != null)
        {
            cf acf[] = e;
            int i3 = acf.length;
            int k1 = 0;
            do
            {
                j = k;
                if (k1 >= i3)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(4, acf[k1]);
                k1++;
                k = j + k;
            } while (true);
        }
        k = j;
        if (f != null)
        {
            cf acf1[] = f;
            int j3 = acf1.length;
            int l1 = 0;
            do
            {
                k = j;
                if (l1 >= j3)
                {
                    break;
                }
                k = CodedOutputByteBufferNano.b(5, acf1[l1]);
                l1++;
                j = k + j;
            } while (true);
        }
        int i2 = k;
        if (g != null)
        {
            cf acf2[] = g;
            int k3 = acf2.length;
            j = ((flag) ? 1 : 0);
            do
            {
                i2 = k;
                if (j >= k3)
                {
                    break;
                }
                k += CodedOutputByteBufferNano.b(6, acf2[j]);
                j++;
            } while (true);
        }
        j = i2 + com.google.protobuf.nano.f.a(dl);
        dm = j;
        return j;
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

            case 10: // '\n'
                int l1 = com.google.protobuf.nano.f.a(a1, 10);
                jk ajk[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ajk = new jk[l1 + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, ajk, 0, j);
                }
                for (b = ajk; j < b.length - 1; j++)
                {
                    b[j] = new jk();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new jk();
                a1.a(b[j]);
                break;

            case 18: // '\022'
                int i2 = com.google.protobuf.nano.f.a(a1, 18);
                jk ajk1[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ajk1 = new jk[i2 + k];
                if (c != null)
                {
                    System.arraycopy(c, 0, ajk1, 0, k);
                }
                for (c = ajk1; k < c.length - 1; k++)
                {
                    c[k] = new jk();
                    a1.a(c[k]);
                    a1.a();
                }

                c[k] = new jk();
                a1.a(c[k]);
                break;

            case 26: // '\032'
                int j2 = com.google.protobuf.nano.f.a(a1, 26);
                jk ajk2[];
                int l;
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                ajk2 = new jk[j2 + l];
                if (d != null)
                {
                    System.arraycopy(d, 0, ajk2, 0, l);
                }
                for (d = ajk2; l < d.length - 1; l++)
                {
                    d[l] = new jk();
                    a1.a(d[l]);
                    a1.a();
                }

                d[l] = new jk();
                a1.a(d[l]);
                break;

            case 34: // '"'
                int k2 = com.google.protobuf.nano.f.a(a1, 34);
                cf acf[];
                int i1;
                if (e == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = e.length;
                }
                acf = new cf[k2 + i1];
                if (e != null)
                {
                    System.arraycopy(e, 0, acf, 0, i1);
                }
                for (e = acf; i1 < e.length - 1; i1++)
                {
                    e[i1] = new cf();
                    a1.a(e[i1]);
                    a1.a();
                }

                e[i1] = new cf();
                a1.a(e[i1]);
                break;

            case 42: // '*'
                int l2 = com.google.protobuf.nano.f.a(a1, 42);
                cf acf1[];
                int j1;
                if (f == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = f.length;
                }
                acf1 = new cf[l2 + j1];
                if (f != null)
                {
                    System.arraycopy(f, 0, acf1, 0, j1);
                }
                for (f = acf1; j1 < f.length - 1; j1++)
                {
                    f[j1] = new cf();
                    a1.a(f[j1]);
                    a1.a();
                }

                f[j1] = new cf();
                a1.a(f[j1]);
                break;

            case 50: // '2'
                int i3 = com.google.protobuf.nano.f.a(a1, 50);
                cf acf2[];
                int k1;
                if (g == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = g.length;
                }
                acf2 = new cf[i3 + k1];
                if (g != null)
                {
                    System.arraycopy(g, 0, acf2, 0, k1);
                }
                for (g = acf2; k1 < g.length - 1; k1++)
                {
                    g[k1] = new cf();
                    a1.a(g[k1]);
                    a1.a();
                }

                g[k1] = new cf();
                a1.a(g[k1]);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != null)
        {
            jk ajk[] = b;
            int k1 = ajk.length;
            for (int i = 0; i < k1; i++)
            {
                codedoutputbytebuffernano.a(1, ajk[i]);
            }

        }
        if (c != null)
        {
            jk ajk1[] = c;
            int l1 = ajk1.length;
            for (int j = 0; j < l1; j++)
            {
                codedoutputbytebuffernano.a(2, ajk1[j]);
            }

        }
        if (d != null)
        {
            jk ajk2[] = d;
            int i2 = ajk2.length;
            for (int k = 0; k < i2; k++)
            {
                codedoutputbytebuffernano.a(3, ajk2[k]);
            }

        }
        if (e != null)
        {
            cf acf[] = e;
            int j2 = acf.length;
            for (int l = 0; l < j2; l++)
            {
                codedoutputbytebuffernano.a(4, acf[l]);
            }

        }
        if (f != null)
        {
            cf acf1[] = f;
            int k2 = acf1.length;
            for (int i1 = 0; i1 < k2; i1++)
            {
                codedoutputbytebuffernano.a(5, acf1[i1]);
            }

        }
        if (g != null)
        {
            cf acf2[] = g;
            int l2 = acf2.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l2; j1++)
            {
                codedoutputbytebuffernano.a(6, acf2[j1]);
            }

        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
