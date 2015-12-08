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
//            fk, ak, sx

public final class xd extends b
{

    public static final xd a[] = new xd[0];
    public fk b;
    public fk c[];
    public ak d[];
    public sx e;
    public fk f;
    public sx g[];
    public String h;
    public byte i[];

    public xd()
    {
        b = null;
        c = com.google.a.a.a.a.fk.a;
        d = com.google.a.a.a.a.ak.a;
        e = null;
        f = null;
        g = com.google.a.a.a.a.sx.a;
        h = "";
        i = f.l;
    }

    public final int a()
    {
        boolean flag = false;
        int j;
        int k;
        int j1;
        if (b != null)
        {
            k = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            k = 0;
        }
        j = k;
        if (c != null)
        {
            fk afk[] = c;
            int l1 = afk.length;
            int l = 0;
            do
            {
                j = k;
                if (l >= l1)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(2, afk[l]);
                l++;
                k = j + k;
            } while (true);
        }
        k = j;
        if (d != null)
        {
            ak aak[] = d;
            int i2 = aak.length;
            int i1 = 0;
            do
            {
                k = j;
                if (i1 >= i2)
                {
                    break;
                }
                k = CodedOutputByteBufferNano.b(3, aak[i1]);
                i1++;
                j = k + j;
            } while (true);
        }
        j1 = k;
        if (e != null)
        {
            j1 = k + CodedOutputByteBufferNano.b(4, e);
        }
        j = j1;
        if (f != null)
        {
            j = j1 + CodedOutputByteBufferNano.b(5, f);
        }
        k = j;
        if (g != null)
        {
            sx asx[] = g;
            int j2 = asx.length;
            int k1 = ((flag) ? 1 : 0);
            do
            {
                k = j;
                if (k1 >= j2)
                {
                    break;
                }
                j += CodedOutputByteBufferNano.b(6, asx[k1]);
                k1++;
            } while (true);
        }
        j = k;
        if (!h.equals(""))
        {
            j = k + CodedOutputByteBufferNano.b(7, h);
        }
        k = j;
        if (!Arrays.equals(i, f.l))
        {
            k = j + CodedOutputByteBufferNano.b(9, i);
        }
        j = k + com.google.protobuf.nano.f.a(dl);
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
                b = new fk();
                a1.a(b);
                break;

            case 18: // '\022'
                int j1 = com.google.protobuf.nano.f.a(a1, 18);
                fk afk[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                afk = new fk[j1 + k];
                if (c != null)
                {
                    System.arraycopy(c, 0, afk, 0, k);
                }
                for (c = afk; k < c.length - 1; k++)
                {
                    c[k] = new fk();
                    a1.a(c[k]);
                    a1.a();
                }

                c[k] = new fk();
                a1.a(c[k]);
                break;

            case 26: // '\032'
                int k1 = com.google.protobuf.nano.f.a(a1, 26);
                ak aak[];
                int l;
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                aak = new ak[k1 + l];
                if (d != null)
                {
                    System.arraycopy(d, 0, aak, 0, l);
                }
                for (d = aak; l < d.length - 1; l++)
                {
                    d[l] = new ak();
                    a1.a(d[l]);
                    a1.a();
                }

                d[l] = new ak();
                a1.a(d[l]);
                break;

            case 34: // '"'
                e = new sx();
                a1.a(e);
                break;

            case 42: // '*'
                f = new fk();
                a1.a(f);
                break;

            case 50: // '2'
                int l1 = com.google.protobuf.nano.f.a(a1, 50);
                sx asx[];
                int i1;
                if (g == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = g.length;
                }
                asx = new sx[l1 + i1];
                if (g != null)
                {
                    System.arraycopy(g, 0, asx, 0, i1);
                }
                for (g = asx; i1 < g.length - 1; i1++)
                {
                    g[i1] = new sx();
                    a1.a(g[i1]);
                    a1.a();
                }

                g[i1] = new sx();
                a1.a(g[i1]);
                break;

            case 58: // ':'
                h = a1.f();
                break;

            case 74: // 'J'
                i = a1.g();
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
            fk afk[] = c;
            int i1 = afk.length;
            for (int j = 0; j < i1; j++)
            {
                codedoutputbytebuffernano.a(2, afk[j]);
            }

        }
        if (d != null)
        {
            ak aak[] = d;
            int j1 = aak.length;
            for (int k = 0; k < j1; k++)
            {
                codedoutputbytebuffernano.a(3, aak[k]);
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
            sx asx[] = g;
            int k1 = asx.length;
            for (int l = ((flag) ? 1 : 0); l < k1; l++)
            {
                codedoutputbytebuffernano.a(6, asx[l]);
            }

        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (!Arrays.equals(i, f.l))
        {
            codedoutputbytebuffernano.a(9, i);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
