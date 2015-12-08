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
//            qj, qh

public final class dg extends b
{

    public static final dg a[] = new dg[0];
    public qj b[];
    public qh c[];

    public dg()
    {
        b = com.google.a.a.a.a.qj.a;
        c = com.google.a.a.a.a.qh.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        if (b != null)
        {
            qj aqj[] = b;
            int j1 = aqj.length;
            int l = 0;
            int j = 0;
            do
            {
                i = j;
                if (l >= j1)
                {
                    break;
                }
                i = CodedOutputByteBufferNano.b(1, aqj[l]);
                l++;
                j = i + j;
            } while (true);
        } else
        {
            i = 0;
        }
        int i1 = i;
        if (c != null)
        {
            qh aqh[] = c;
            int k1 = aqh.length;
            int k = ((flag) ? 1 : 0);
            do
            {
                i1 = i;
                if (k >= k1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, aqh[k]);
                k++;
            } while (true);
        }
        i = i1 + f.a(dl);
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
                int l = f.a(a1, 10);
                qj aqj[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aqj = new qj[l + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, aqj, 0, j);
                }
                for (b = aqj; j < b.length - 1; j++)
                {
                    b[j] = new qj();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new qj();
                a1.a(b[j]);
                break;

            case 18: // '\022'
                int i1 = f.a(a1, 18);
                qh aqh[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                aqh = new qh[i1 + k];
                if (c != null)
                {
                    System.arraycopy(c, 0, aqh, 0, k);
                }
                for (c = aqh; k < c.length - 1; k++)
                {
                    c[k] = new qh();
                    a1.a(c[k]);
                    a1.a();
                }

                c[k] = new qh();
                a1.a(c[k]);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != null)
        {
            qj aqj[] = b;
            int k = aqj.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(1, aqj[i]);
            }

        }
        if (c != null)
        {
            qh aqh[] = c;
            int l = aqh.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(2, aqh[j]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
