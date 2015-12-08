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
import java.util.Arrays;

// Referenced classes of package com.google.a.a.a.a:
//            iv, iu, ip

public final class it extends b
{

    public static final it a[] = new it[0];
    public iv b[];
    public iu c[];
    public byte d[];
    public ip e;

    public it()
    {
        b = com.google.a.a.a.a.iv.a;
        c = com.google.a.a.a.a.iu.a;
        d = f.l;
        e = null;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        if (b != null)
        {
            iv aiv[] = b;
            int j1 = aiv.length;
            int l = 0;
            int j = 0;
            do
            {
                i = j;
                if (l >= j1)
                {
                    break;
                }
                i = CodedOutputByteBufferNano.b(1, aiv[l]);
                l++;
                j = i + j;
            } while (true);
        } else
        {
            i = 0;
        }
        int k = i;
        if (c != null)
        {
            iu aiu[] = c;
            int k1 = aiu.length;
            int i1 = ((flag) ? 1 : 0);
            do
            {
                k = i;
                if (i1 >= k1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, aiu[i1]);
                i1++;
            } while (true);
        }
        i = k;
        if (!Arrays.equals(d, f.l))
        {
            i = k + CodedOutputByteBufferNano.b(4, d);
        }
        k = i;
        if (e != null)
        {
            k = i + CodedOutputByteBufferNano.b(5, e);
        }
        i = k + f.a(dl);
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
                iv aiv[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aiv = new iv[l + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, aiv, 0, j);
                }
                for (b = aiv; j < b.length - 1; j++)
                {
                    b[j] = new iv();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new iv();
                a1.a(b[j]);
                break;

            case 18: // '\022'
                int i1 = f.a(a1, 18);
                iu aiu[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                aiu = new iu[i1 + k];
                if (c != null)
                {
                    System.arraycopy(c, 0, aiu, 0, k);
                }
                for (c = aiu; k < c.length - 1; k++)
                {
                    c[k] = new iu();
                    a1.a(c[k]);
                    a1.a();
                }

                c[k] = new iu();
                a1.a(c[k]);
                break;

            case 34: // '"'
                d = a1.g();
                break;

            case 42: // '*'
                e = new ip();
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
            iv aiv[] = b;
            int k = aiv.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(1, aiv[i]);
            }

        }
        if (c != null)
        {
            iu aiu[] = c;
            int l = aiu.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(2, aiu[j]);
            }

        }
        if (!Arrays.equals(d, f.l))
        {
            codedoutputbytebuffernano.a(4, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(5, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
