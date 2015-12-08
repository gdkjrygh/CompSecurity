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
//            fk, lq

public final class ke extends b
{

    public static final ke a[] = new ke[0];
    public fk b;
    public fk c[];
    public String d;
    public lq e[];
    public byte f[];

    public ke()
    {
        b = null;
        c = com.google.a.a.a.a.fk.a;
        d = "";
        e = com.google.a.a.a.a.lq.a;
        f = f.l;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
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
            fk afk[] = c;
            int i1 = afk.length;
            int k = 0;
            do
            {
                j = i;
                if (k >= i1)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(2, afk[k]);
                k++;
                i = j + i;
            } while (true);
        }
        i = j;
        if (!d.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(3, d);
        }
        j = i;
        if (e != null)
        {
            lq alq[] = e;
            int j1 = alq.length;
            int l = ((flag) ? 1 : 0);
            do
            {
                j = i;
                if (l >= j1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(4, alq[l]);
                l++;
            } while (true);
        }
        i = j;
        if (!Arrays.equals(f, f.l))
        {
            i = j + CodedOutputByteBufferNano.b(6, f);
        }
        i += com.google.protobuf.nano.f.a(dl);
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
                if (com.google.protobuf.nano.f.a(dl, a1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = new fk();
                a1.a(b);
                break;

            case 18: // '\022'
                int l = com.google.protobuf.nano.f.a(a1, 18);
                fk afk[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                afk = new fk[l + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, afk, 0, j);
                }
                for (c = afk; j < c.length - 1; j++)
                {
                    c[j] = new fk();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new fk();
                a1.a(c[j]);
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 34: // '"'
                int i1 = com.google.protobuf.nano.f.a(a1, 34);
                lq alq[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                alq = new lq[i1 + k];
                if (e != null)
                {
                    System.arraycopy(e, 0, alq, 0, k);
                }
                for (e = alq; k < e.length - 1; k++)
                {
                    e[k] = new lq();
                    a1.a(e[k]);
                    a1.a();
                }

                e[k] = new lq();
                a1.a(e[k]);
                break;

            case 50: // '2'
                f = a1.g();
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
            fk afk[] = c;
            int k = afk.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(2, afk[i]);
            }

        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            lq alq[] = e;
            int l = alq.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(4, alq[j]);
            }

        }
        if (!Arrays.equals(f, f.l))
        {
            codedoutputbytebuffernano.a(6, f);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
