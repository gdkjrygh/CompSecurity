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
//            km, fk, kt

public final class kl extends b
{

    public static final kl a[] = new kl[0];
    public fk b;
    public fk c;
    public km d[];
    public kt e;
    public fk f;
    public fk g[];

    public kl()
    {
        b = null;
        c = null;
        d = com.google.a.a.a.a.km.a;
        e = null;
        f = null;
        g = com.google.a.a.a.a.fk.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        int l;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j = 0;
        }
        i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (d != null)
        {
            km akm[] = d;
            int i1 = akm.length;
            int k = 0;
            do
            {
                j = i;
                if (k >= i1)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(3, akm[k]);
                k++;
                i = j + i;
            } while (true);
        }
        l = j;
        if (e != null)
        {
            l = j + CodedOutputByteBufferNano.b(4, e);
        }
        i = l;
        if (f != null)
        {
            i = l + CodedOutputByteBufferNano.b(5, f);
        }
        l = i;
        if (g != null)
        {
            fk afk[] = g;
            int j1 = afk.length;
            j = ((flag) ? 1 : 0);
            do
            {
                l = i;
                if (j >= j1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(6, afk[j]);
                j++;
            } while (true);
        }
        i = l + com.google.protobuf.nano.f.a(dl);
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

            case 10: // '\n'
                b = new fk();
                a1.a(b);
                break;

            case 18: // '\022'
                c = new fk();
                a1.a(c);
                break;

            case 26: // '\032'
                int l = com.google.protobuf.nano.f.a(a1, 26);
                km akm[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                akm = new km[l + j];
                if (d != null)
                {
                    System.arraycopy(d, 0, akm, 0, j);
                }
                for (d = akm; j < d.length - 1; j++)
                {
                    d[j] = new km();
                    a1.a(d[j]);
                    a1.a();
                }

                d[j] = new km();
                a1.a(d[j]);
                break;

            case 34: // '"'
                e = new kt();
                a1.a(e);
                break;

            case 42: // '*'
                f = new fk();
                a1.a(f);
                break;

            case 50: // '2'
                int i1 = com.google.protobuf.nano.f.a(a1, 50);
                fk afk[];
                int k;
                if (g == null)
                {
                    k = 0;
                } else
                {
                    k = g.length;
                }
                afk = new fk[i1 + k];
                if (g != null)
                {
                    System.arraycopy(g, 0, afk, 0, k);
                }
                for (g = afk; k < g.length - 1; k++)
                {
                    g[k] = new fk();
                    a1.a(g[k]);
                    a1.a();
                }

                g[k] = new fk();
                a1.a(g[k]);
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
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            km akm[] = d;
            int k = akm.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(3, akm[i]);
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
            fk afk[] = g;
            int l = afk.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(6, afk[j]);
            }

        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
