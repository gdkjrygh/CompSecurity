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
//            bv, fk

public final class bw extends b
{

    public static final bw a[] = new bw[0];
    public fk b;
    public fk c;
    public bv d[];

    public bw()
    {
        b = null;
        c = null;
        d = com.google.a.a.a.a.bv.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        int k;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j = 0;
        }
        i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        k = i;
        if (d != null)
        {
            bv abv[] = d;
            int l = abv.length;
            j = ((flag) ? 1 : 0);
            do
            {
                k = i;
                if (j >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(3, abv[j]);
                j++;
            } while (true);
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
                b = new fk();
                a1.a(b);
                break;

            case 18: // '\022'
                c = new fk();
                a1.a(c);
                break;

            case 26: // '\032'
                int k = f.a(a1, 26);
                bv abv[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                abv = new bv[k + j];
                if (d != null)
                {
                    System.arraycopy(d, 0, abv, 0, j);
                }
                for (d = abv; j < d.length - 1; j++)
                {
                    d[j] = new bv();
                    a1.a(d[j]);
                    a1.a();
                }

                d[j] = new bv();
                a1.a(d[j]);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            bv abv[] = d;
            int j = abv.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(3, abv[i]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
