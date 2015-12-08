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
//            fk, xh, xf, kz, 
//            xe

public final class xg extends b
{

    public static final xg a[] = new xg[0];
    public fk b;
    public xh c;
    public xf d;
    public fk e[];
    public fk f[];
    public kz g;
    public fk h;
    public xe i;
    public byte j[];

    public xg()
    {
        b = null;
        c = null;
        d = null;
        e = com.google.a.a.a.a.fk.a;
        f = com.google.a.a.a.a.fk.a;
        g = null;
        h = null;
        i = null;
        j = f.l;
    }

    public final int a()
    {
        boolean flag = false;
        int k;
        int l;
        if (b != null)
        {
            l = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            l = 0;
        }
        k = l;
        if (c != null)
        {
            k = l + CodedOutputByteBufferNano.b(2, c);
        }
        l = k;
        if (d != null)
        {
            l = k + CodedOutputByteBufferNano.b(3, d);
        }
        k = l;
        if (e != null)
        {
            fk afk[] = e;
            int k1 = afk.length;
            int i1 = 0;
            do
            {
                k = l;
                if (i1 >= k1)
                {
                    break;
                }
                k = CodedOutputByteBufferNano.b(4, afk[i1]);
                i1++;
                l = k + l;
            } while (true);
        }
        l = k;
        if (f != null)
        {
            fk afk1[] = f;
            int l1 = afk1.length;
            int j1 = ((flag) ? 1 : 0);
            do
            {
                l = k;
                if (j1 >= l1)
                {
                    break;
                }
                k += CodedOutputByteBufferNano.b(5, afk1[j1]);
                j1++;
            } while (true);
        }
        k = l;
        if (g != null)
        {
            k = l + CodedOutputByteBufferNano.b(6, g);
        }
        l = k;
        if (h != null)
        {
            l = k + CodedOutputByteBufferNano.b(7, h);
        }
        k = l;
        if (i != null)
        {
            k = l + CodedOutputByteBufferNano.b(8, i);
        }
        l = k;
        if (!Arrays.equals(j, f.l))
        {
            l = k + CodedOutputByteBufferNano.b(10, j);
        }
        k = l + com.google.protobuf.nano.f.a(dl);
        dm = k;
        return k;
    }

    public final c a(a a1)
    {
        do
        {
            int k = a1.a();
            switch (k)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, k))
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
                c = new xh();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new xf();
                a1.a(d);
                break;

            case 34: // '"'
                int j1 = com.google.protobuf.nano.f.a(a1, 34);
                fk afk[];
                int l;
                if (e == null)
                {
                    l = 0;
                } else
                {
                    l = e.length;
                }
                afk = new fk[j1 + l];
                if (e != null)
                {
                    System.arraycopy(e, 0, afk, 0, l);
                }
                for (e = afk; l < e.length - 1; l++)
                {
                    e[l] = new fk();
                    a1.a(e[l]);
                    a1.a();
                }

                e[l] = new fk();
                a1.a(e[l]);
                break;

            case 42: // '*'
                int k1 = com.google.protobuf.nano.f.a(a1, 42);
                fk afk1[];
                int i1;
                if (f == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = f.length;
                }
                afk1 = new fk[k1 + i1];
                if (f != null)
                {
                    System.arraycopy(f, 0, afk1, 0, i1);
                }
                for (f = afk1; i1 < f.length - 1; i1++)
                {
                    f[i1] = new fk();
                    a1.a(f[i1]);
                    a1.a();
                }

                f[i1] = new fk();
                a1.a(f[i1]);
                break;

            case 50: // '2'
                g = new kz();
                a1.a(g);
                break;

            case 58: // ':'
                h = new fk();
                a1.a(h);
                break;

            case 66: // 'B'
                i = new xe();
                a1.a(i);
                break;

            case 82: // 'R'
                j = a1.g();
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
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            fk afk[] = e;
            int i1 = afk.length;
            for (int k = 0; k < i1; k++)
            {
                codedoutputbytebuffernano.a(4, afk[k]);
            }

        }
        if (f != null)
        {
            fk afk1[] = f;
            int j1 = afk1.length;
            for (int l = ((flag) ? 1 : 0); l < j1; l++)
            {
                codedoutputbytebuffernano.a(5, afk1[l]);
            }

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
        if (!Arrays.equals(j, f.l))
        {
            codedoutputbytebuffernano.a(10, j);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
