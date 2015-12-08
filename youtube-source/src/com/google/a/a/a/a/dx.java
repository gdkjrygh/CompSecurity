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
//            pu

public final class dx extends b
{

    public static final dx a[] = new dx[0];
    public pu b[];
    public pu c[];

    public dx()
    {
        b = com.google.a.a.a.a.pu.a;
        c = com.google.a.a.a.a.pu.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        if (b != null)
        {
            pu apu[] = b;
            int j1 = apu.length;
            int l = 0;
            int j = 0;
            do
            {
                i = j;
                if (l >= j1)
                {
                    break;
                }
                i = CodedOutputByteBufferNano.b(2, apu[l]);
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
            pu apu1[] = c;
            int k1 = apu1.length;
            int k = ((flag) ? 1 : 0);
            do
            {
                i1 = i;
                if (k >= k1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(3, apu1[k]);
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

            case 18: // '\022'
                int l = f.a(a1, 18);
                pu apu[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                apu = new pu[l + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, apu, 0, j);
                }
                for (b = apu; j < b.length - 1; j++)
                {
                    b[j] = new pu();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new pu();
                a1.a(b[j]);
                break;

            case 26: // '\032'
                int i1 = f.a(a1, 26);
                pu apu1[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                apu1 = new pu[i1 + k];
                if (c != null)
                {
                    System.arraycopy(c, 0, apu1, 0, k);
                }
                for (c = apu1; k < c.length - 1; k++)
                {
                    c[k] = new pu();
                    a1.a(c[k]);
                    a1.a();
                }

                c[k] = new pu();
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
            pu apu[] = b;
            int k = apu.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(2, apu[i]);
            }

        }
        if (c != null)
        {
            pu apu1[] = c;
            int l = apu1.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(3, apu1[j]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
