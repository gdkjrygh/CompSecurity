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
//            ta, hj

public final class hk extends b
{

    public static final hk a[] = new hk[0];
    public ta b[];
    public hj c[];

    public hk()
    {
        b = com.google.a.a.a.a.ta.a;
        c = com.google.a.a.a.a.hj.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        if (b != null)
        {
            ta ata[] = b;
            int j1 = ata.length;
            int l = 0;
            int j = 0;
            do
            {
                i = j;
                if (l >= j1)
                {
                    break;
                }
                i = CodedOutputByteBufferNano.b(1, ata[l]);
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
            hj ahj[] = c;
            int k1 = ahj.length;
            int k = ((flag) ? 1 : 0);
            do
            {
                i1 = i;
                if (k >= k1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, ahj[k]);
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
                ta ata[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ata = new ta[l + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, ata, 0, j);
                }
                for (b = ata; j < b.length - 1; j++)
                {
                    b[j] = new ta();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new ta();
                a1.a(b[j]);
                break;

            case 18: // '\022'
                int i1 = f.a(a1, 18);
                hj ahj[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ahj = new hj[i1 + k];
                if (c != null)
                {
                    System.arraycopy(c, 0, ahj, 0, k);
                }
                for (c = ahj; k < c.length - 1; k++)
                {
                    c[k] = new hj();
                    a1.a(c[k]);
                    a1.a();
                }

                c[k] = new hj();
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
            ta ata[] = b;
            int k = ata.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(1, ata[i]);
            }

        }
        if (c != null)
        {
            hj ahj[] = c;
            int l = ahj.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(2, ahj[j]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
