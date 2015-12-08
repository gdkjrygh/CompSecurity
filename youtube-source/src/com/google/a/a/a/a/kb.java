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
//            kd, kc

public final class kb extends b
{

    public static final kb a[] = new kb[0];
    public kd b[];
    public kc c[];

    public kb()
    {
        b = com.google.a.a.a.a.kd.a;
        c = com.google.a.a.a.a.kc.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        if (b != null)
        {
            kd akd[] = b;
            int j1 = akd.length;
            int l = 0;
            int j = 0;
            do
            {
                i = j;
                if (l >= j1)
                {
                    break;
                }
                i = CodedOutputByteBufferNano.b(1, akd[l]);
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
            kc akc[] = c;
            int k1 = akc.length;
            int k = ((flag) ? 1 : 0);
            do
            {
                i1 = i;
                if (k >= k1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, akc[k]);
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
                kd akd[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akd = new kd[l + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, akd, 0, j);
                }
                for (b = akd; j < b.length - 1; j++)
                {
                    b[j] = new kd();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new kd();
                a1.a(b[j]);
                break;

            case 18: // '\022'
                int i1 = f.a(a1, 18);
                kc akc[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                akc = new kc[i1 + k];
                if (c != null)
                {
                    System.arraycopy(c, 0, akc, 0, k);
                }
                for (c = akc; k < c.length - 1; k++)
                {
                    c[k] = new kc();
                    a1.a(c[k]);
                    a1.a();
                }

                c[k] = new kc();
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
            kd akd[] = b;
            int k = akd.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(1, akd[i]);
            }

        }
        if (c != null)
        {
            kc akc[] = c;
            int l = akc.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(2, akc[j]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
