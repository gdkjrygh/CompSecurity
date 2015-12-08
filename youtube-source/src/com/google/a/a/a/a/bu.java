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
//            gq

public final class bu extends b
{

    public static final bu a[] = new bu[0];
    public gq b[];
    public gq c[];

    public bu()
    {
        b = com.google.a.a.a.a.gq.a;
        c = com.google.a.a.a.a.gq.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        if (b != null)
        {
            gq agq[] = b;
            int j1 = agq.length;
            int l = 0;
            int j = 0;
            do
            {
                i = j;
                if (l >= j1)
                {
                    break;
                }
                i = CodedOutputByteBufferNano.b(1, agq[l]);
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
            gq agq1[] = c;
            int k1 = agq1.length;
            int k = ((flag) ? 1 : 0);
            do
            {
                i1 = i;
                if (k >= k1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, agq1[k]);
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
                gq agq[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                agq = new gq[l + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, agq, 0, j);
                }
                for (b = agq; j < b.length - 1; j++)
                {
                    b[j] = new gq();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new gq();
                a1.a(b[j]);
                break;

            case 18: // '\022'
                int i1 = f.a(a1, 18);
                gq agq1[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                agq1 = new gq[i1 + k];
                if (c != null)
                {
                    System.arraycopy(c, 0, agq1, 0, k);
                }
                for (c = agq1; k < c.length - 1; k++)
                {
                    c[k] = new gq();
                    a1.a(c[k]);
                    a1.a();
                }

                c[k] = new gq();
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
            gq agq[] = b;
            int k = agq.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(1, agq[i]);
            }

        }
        if (c != null)
        {
            gq agq1[] = c;
            int l = agq1.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(2, agq1[j]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
