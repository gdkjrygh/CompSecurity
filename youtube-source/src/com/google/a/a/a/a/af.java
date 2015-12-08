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
//            ag, fk

public final class af extends b
{

    public static final af a[] = new af[0];
    public ag b[];
    public fk c;
    public int d;
    public ag e[];

    public af()
    {
        b = com.google.a.a.a.a.ag.a;
        c = null;
        d = 0;
        e = com.google.a.a.a.a.ag.a;
    }

    public final int a()
    {
        boolean flag = false;
        int k;
        if (b != null)
        {
            ag aag[] = b;
            int k1 = aag.length;
            int i1 = 0;
            int i = 0;
            do
            {
                k = i;
                if (i1 >= k1)
                {
                    break;
                }
                k = CodedOutputByteBufferNano.b(1, aag[i1]);
                i1++;
                i = k + i;
            } while (true);
        } else
        {
            k = 0;
        }
        int j1 = k;
        if (c != null)
        {
            j1 = k + CodedOutputByteBufferNano.b(2, c);
        }
        int j = j1;
        if (d != 0)
        {
            j = j1 + CodedOutputByteBufferNano.d(3, d);
        }
        j1 = j;
        if (e != null)
        {
            ag aag1[] = e;
            int l1 = aag1.length;
            int l = ((flag) ? 1 : 0);
            do
            {
                j1 = j;
                if (l >= l1)
                {
                    break;
                }
                j += CodedOutputByteBufferNano.b(4, aag1[l]);
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
                ag aag[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aag = new ag[l + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, aag, 0, j);
                }
                for (b = aag; j < b.length - 1; j++)
                {
                    b[j] = new ag();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new ag();
                a1.a(b[j]);
                break;

            case 18: // '\022'
                c = new fk();
                a1.a(c);
                break;

            case 24: // '\030'
                d = a1.d();
                break;

            case 34: // '"'
                int i1 = f.a(a1, 34);
                ag aag1[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                aag1 = new ag[i1 + k];
                if (e != null)
                {
                    System.arraycopy(e, 0, aag1, 0, k);
                }
                for (e = aag1; k < e.length - 1; k++)
                {
                    e[k] = new ag();
                    a1.a(e[k]);
                    a1.a();
                }

                e[k] = new ag();
                a1.a(e[k]);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != null)
        {
            ag aag[] = b;
            int k = aag.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(1, aag[i]);
            }

        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            ag aag1[] = e;
            int l = aag1.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(4, aag1[j]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
