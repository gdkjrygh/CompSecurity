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
//            ou, ot

public final class os extends b
{

    public static final os a[] = new os[0];
    public ou b[];
    public String c;
    public boolean d;
    public ot e[];
    public boolean f;

    public os()
    {
        b = com.google.a.a.a.a.ou.a;
        c = "";
        d = false;
        e = com.google.a.a.a.a.ot.a;
        f = false;
    }

    public final int a()
    {
        boolean flag = false;
        int k;
        if (b != null)
        {
            ou aou[] = b;
            int k1 = aou.length;
            int l = 0;
            int i = 0;
            do
            {
                k = i;
                if (l >= k1)
                {
                    break;
                }
                k = CodedOutputByteBufferNano.b(1, aou[l]);
                l++;
                i = k + i;
            } while (true);
        } else
        {
            k = 0;
        }
        int i1 = k;
        if (!c.equals(""))
        {
            i1 = k + CodedOutputByteBufferNano.b(2, c);
        }
        int j = i1;
        if (d)
        {
            j = i1 + CodedOutputByteBufferNano.b(3, d);
        }
        k = j;
        if (e != null)
        {
            ot aot[] = e;
            int l1 = aot.length;
            int j1 = ((flag) ? 1 : 0);
            do
            {
                k = j;
                if (j1 >= l1)
                {
                    break;
                }
                j += CodedOutputByteBufferNano.b(4, aot[j1]);
                j1++;
            } while (true);
        }
        j = k;
        if (f)
        {
            j = k + CodedOutputByteBufferNano.b(5, f);
        }
        j += com.google.protobuf.nano.f.a(dl);
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
                if (com.google.protobuf.nano.f.a(dl, a1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int l = com.google.protobuf.nano.f.a(a1, 10);
                ou aou[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aou = new ou[l + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, aou, 0, j);
                }
                for (b = aou; j < b.length - 1; j++)
                {
                    b[j] = new ou();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new ou();
                a1.a(b[j]);
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 24: // '\030'
                d = a1.e();
                break;

            case 34: // '"'
                int i1 = com.google.protobuf.nano.f.a(a1, 34);
                ot aot[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                aot = new ot[i1 + k];
                if (e != null)
                {
                    System.arraycopy(e, 0, aot, 0, k);
                }
                for (e = aot; k < e.length - 1; k++)
                {
                    e[k] = new ot();
                    a1.a(e[k]);
                    a1.a();
                }

                e[k] = new ot();
                a1.a(e[k]);
                break;

            case 40: // '('
                f = a1.e();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != null)
        {
            ou aou[] = b;
            int k = aou.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(1, aou[i]);
            }

        }
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            ot aot[] = e;
            int l = aot.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(4, aot[j]);
            }

        }
        if (f)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
