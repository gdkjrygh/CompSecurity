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
//            qp, tg, pg

public final class tf extends b
{

    public static final tf a[] = new tf[0];
    public pg b;
    public qp c[];
    public tg d[];

    public tf()
    {
        b = null;
        c = com.google.a.a.a.a.qp.a;
        d = com.google.a.a.a.a.tg.a;
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
            qp aqp[] = c;
            int i1 = aqp.length;
            int k = 0;
            do
            {
                i = j;
                if (k >= i1)
                {
                    break;
                }
                i = CodedOutputByteBufferNano.b(2, aqp[k]);
                k++;
                j = i + j;
            } while (true);
        }
        l = i;
        if (d != null)
        {
            tg atg[] = d;
            int j1 = atg.length;
            j = ((flag) ? 1 : 0);
            do
            {
                l = i;
                if (j >= j1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(3, atg[j]);
                j++;
            } while (true);
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
                b = new pg();
                a1.a(b);
                break;

            case 18: // '\022'
                int l = f.a(a1, 18);
                qp aqp[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aqp = new qp[l + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, aqp, 0, j);
                }
                for (c = aqp; j < c.length - 1; j++)
                {
                    c[j] = new qp();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new qp();
                a1.a(c[j]);
                break;

            case 26: // '\032'
                int i1 = f.a(a1, 26);
                tg atg[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                atg = new tg[i1 + k];
                if (d != null)
                {
                    System.arraycopy(d, 0, atg, 0, k);
                }
                for (d = atg; k < d.length - 1; k++)
                {
                    d[k] = new tg();
                    a1.a(d[k]);
                    a1.a();
                }

                d[k] = new tg();
                a1.a(d[k]);
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
            qp aqp[] = c;
            int k = aqp.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(2, aqp[i]);
            }

        }
        if (d != null)
        {
            tg atg[] = d;
            int l = atg.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(3, atg[j]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
