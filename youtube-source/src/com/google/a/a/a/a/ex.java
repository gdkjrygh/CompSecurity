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
//            ac, ll

public final class ex extends b
{

    public static final ex a[] = new ex[0];
    public ac b[];
    public String c;
    public ll d[];

    public ex()
    {
        b = com.google.a.a.a.a.ac.a;
        c = "";
        d = com.google.a.a.a.a.ll.a;
    }

    public final int a()
    {
        boolean flag = false;
        int k;
        if (b != null)
        {
            ac aac[] = b;
            int k1 = aac.length;
            int i1 = 0;
            int i = 0;
            do
            {
                k = i;
                if (i1 >= k1)
                {
                    break;
                }
                k = CodedOutputByteBufferNano.b(1, aac[i1]);
                i1++;
                i = k + i;
            } while (true);
        } else
        {
            k = 0;
        }
        int j = k;
        if (!c.equals(""))
        {
            j = k + CodedOutputByteBufferNano.b(2, c);
        }
        int j1 = j;
        if (d != null)
        {
            ll all[] = d;
            int l1 = all.length;
            int l = ((flag) ? 1 : 0);
            do
            {
                j1 = j;
                if (l >= l1)
                {
                    break;
                }
                j += CodedOutputByteBufferNano.b(3, all[l]);
                l++;
            } while (true);
        }
        j = j1 + f.a(dl);
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
                if (f.a(dl, a1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int l = f.a(a1, 10);
                ac aac[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aac = new ac[l + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, aac, 0, j);
                }
                for (b = aac; j < b.length - 1; j++)
                {
                    b[j] = new ac();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new ac();
                a1.a(b[j]);
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 26: // '\032'
                int i1 = f.a(a1, 26);
                ll all[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                all = new ll[i1 + k];
                if (d != null)
                {
                    System.arraycopy(d, 0, all, 0, k);
                }
                for (d = all; k < d.length - 1; k++)
                {
                    d[k] = new ll();
                    a1.a(d[k]);
                    a1.a();
                }

                d[k] = new ll();
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
            ac aac[] = b;
            int k = aac.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(1, aac[i]);
            }

        }
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            ll all[] = d;
            int l = all.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(3, all[j]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
