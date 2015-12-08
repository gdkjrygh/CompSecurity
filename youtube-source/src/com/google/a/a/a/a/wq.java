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
//            ex, k, ta, wt

public final class wq extends b
{

    public static final wq a[] = new wq[0];
    public ex b[];
    public k c[];
    public ta d[];
    public wt e;

    public wq()
    {
        b = com.google.a.a.a.a.ex.a;
        c = com.google.a.a.a.a.k.a;
        d = com.google.a.a.a.a.ta.a;
        e = null;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        if (b != null)
        {
            ex aex[] = b;
            int l1 = aex.length;
            int i1 = 0;
            int j = 0;
            do
            {
                i = j;
                if (i1 >= l1)
                {
                    break;
                }
                i = CodedOutputByteBufferNano.b(1, aex[i1]);
                i1++;
                j = i + j;
            } while (true);
        } else
        {
            i = 0;
        }
        int l = i;
        if (c != null)
        {
            k ak[] = c;
            int i2 = ak.length;
            int j1 = 0;
            do
            {
                l = i;
                if (j1 >= i2)
                {
                    break;
                }
                l = CodedOutputByteBufferNano.b(2, ak[j1]);
                j1++;
                i = l + i;
            } while (true);
        }
        i = l;
        if (d != null)
        {
            ta ata[] = d;
            int j2 = ata.length;
            int k1 = ((flag) ? 1 : 0);
            do
            {
                i = l;
                if (k1 >= j2)
                {
                    break;
                }
                l += CodedOutputByteBufferNano.b(3, ata[k1]);
                k1++;
            } while (true);
        }
        l = i;
        if (e != null)
        {
            l = i + CodedOutputByteBufferNano.b(4, e);
        }
        i = l + f.a(dl);
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
                if (f.a(dl, a1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int j1 = f.a(a1, 10);
                ex aex[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aex = new ex[j1 + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, aex, 0, j);
                }
                for (b = aex; j < b.length - 1; j++)
                {
                    b[j] = new ex();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new ex();
                a1.a(b[j]);
                break;

            case 18: // '\022'
                int k1 = f.a(a1, 18);
                k ak[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                ak = new k[k1 + l];
                if (c != null)
                {
                    System.arraycopy(c, 0, ak, 0, l);
                }
                for (c = ak; l < c.length - 1; l++)
                {
                    c[l] = new k();
                    a1.a(c[l]);
                    a1.a();
                }

                c[l] = new k();
                a1.a(c[l]);
                break;

            case 26: // '\032'
                int l1 = f.a(a1, 26);
                ta ata[];
                int i1;
                if (d == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = d.length;
                }
                ata = new ta[l1 + i1];
                if (d != null)
                {
                    System.arraycopy(d, 0, ata, 0, i1);
                }
                for (d = ata; i1 < d.length - 1; i1++)
                {
                    d[i1] = new ta();
                    a1.a(d[i1]);
                    a1.a();
                }

                d[i1] = new ta();
                a1.a(d[i1]);
                break;

            case 34: // '"'
                e = new wt();
                a1.a(e);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != null)
        {
            ex aex[] = b;
            int i1 = aex.length;
            for (int i = 0; i < i1; i++)
            {
                codedoutputbytebuffernano.a(1, aex[i]);
            }

        }
        if (c != null)
        {
            k ak[] = c;
            int j1 = ak.length;
            for (int j = 0; j < j1; j++)
            {
                codedoutputbytebuffernano.a(2, ak[j]);
            }

        }
        if (d != null)
        {
            ta ata[] = d;
            int k1 = ata.length;
            for (int l = ((flag) ? 1 : 0); l < k1; l++)
            {
                codedoutputbytebuffernano.a(3, ata[l]);
            }

        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
