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
//            rx, rw

public final class rv extends b
{

    public static final rv a[] = new rv[0];
    public rx b[];
    public rw c[];

    public rv()
    {
        b = com.google.a.a.a.a.rx.a;
        c = com.google.a.a.a.a.rw.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        if (b != null)
        {
            rx arx[] = b;
            int j1 = arx.length;
            int l = 0;
            int j = 0;
            do
            {
                i = j;
                if (l >= j1)
                {
                    break;
                }
                i = CodedOutputByteBufferNano.b(1, arx[l]);
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
            rw arw[] = c;
            int k1 = arw.length;
            int k = ((flag) ? 1 : 0);
            do
            {
                i1 = i;
                if (k >= k1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, arw[k]);
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
                rx arx[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                arx = new rx[l + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, arx, 0, j);
                }
                for (b = arx; j < b.length - 1; j++)
                {
                    b[j] = new rx();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new rx();
                a1.a(b[j]);
                break;

            case 18: // '\022'
                int i1 = f.a(a1, 18);
                rw arw[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                arw = new rw[i1 + k];
                if (c != null)
                {
                    System.arraycopy(c, 0, arw, 0, k);
                }
                for (c = arw; k < c.length - 1; k++)
                {
                    c[k] = new rw();
                    a1.a(c[k]);
                    a1.a();
                }

                c[k] = new rw();
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
            rx arx[] = b;
            int k = arx.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(1, arx[i]);
            }

        }
        if (c != null)
        {
            rw arw[] = c;
            int l = arw.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(2, arw[j]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
