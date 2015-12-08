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
//            ac, ky

public final class ll extends b
{

    public static final ll a[] = new ll[0];
    public ky b;
    public ac c[];
    public String d;
    public ll e[];

    public ll()
    {
        b = null;
        c = com.google.a.a.a.a.ac.a;
        d = "";
        e = a;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        int i1;
        if (b != null)
        {
            i = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            i = 0;
        }
        j = i;
        if (c != null)
        {
            ac aac[] = c;
            int j1 = aac.length;
            int l = 0;
            do
            {
                j = i;
                if (l >= j1)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(2, aac[l]);
                l++;
                i = j + i;
            } while (true);
        }
        i = j;
        if (!d.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(3, d);
        }
        i1 = i;
        if (e != null)
        {
            ll all[] = e;
            int k1 = all.length;
            int k = ((flag) ? 1 : 0);
            do
            {
                i1 = i;
                if (k >= k1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(4, all[k]);
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
                b = new ky();
                a1.a(b);
                break;

            case 18: // '\022'
                int l = f.a(a1, 18);
                ac aac[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aac = new ac[l + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, aac, 0, j);
                }
                for (c = aac; j < c.length - 1; j++)
                {
                    c[j] = new ac();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new ac();
                a1.a(c[j]);
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 34: // '"'
                int i1 = f.a(a1, 34);
                ll all[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                all = new ll[i1 + k];
                if (e != null)
                {
                    System.arraycopy(e, 0, all, 0, k);
                }
                for (e = all; k < e.length - 1; k++)
                {
                    e[k] = new ll();
                    a1.a(e[k]);
                    a1.a();
                }

                e[k] = new ll();
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
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != null)
        {
            ac aac[] = c;
            int k = aac.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(2, aac[i]);
            }

        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            ll all[] = e;
            int l = all.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(4, all[j]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
