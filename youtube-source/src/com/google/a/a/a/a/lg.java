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
//            lh, lf, fk

public final class lg extends b
{

    public static final lg a[] = new lg[0];
    public lf b;
    public lh c[];
    public fk d;
    public byte e[];

    public lg()
    {
        b = null;
        c = com.google.a.a.a.a.lh.a;
        d = null;
        e = f.l;
    }

    public final int a()
    {
        int k = 0;
        int i;
        int j;
        if (b != null)
        {
            i = CodedOutputByteBufferNano.b(2, b) + 0;
        } else
        {
            i = 0;
        }
        j = i;
        if (c != null)
        {
            lh alh[] = c;
            int l = alh.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(3, alh[k]);
                k++;
            } while (true);
        }
        i = j;
        if (d != null)
        {
            i = j + CodedOutputByteBufferNano.b(4, d);
        }
        j = i;
        if (!Arrays.equals(e, f.l))
        {
            j = i + CodedOutputByteBufferNano.b(12, e);
        }
        i = j + f.a(dl);
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
                b = new lf();
                a1.a(b);
                break;

            case 26: // '\032'
                int k = f.a(a1, 26);
                lh alh[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                alh = new lh[k + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, alh, 0, j);
                }
                for (c = alh; j < c.length - 1; j++)
                {
                    c[j] = new lh();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new lh();
                a1.a(c[j]);
                break;

            case 34: // '"'
                d = new fk();
                a1.a(d);
                break;

            case 98: // 'b'
                e = a1.g();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(2, b);
        }
        if (c != null)
        {
            lh alh[] = c;
            int j = alh.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(3, alh[i]);
            }

        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(4, d);
        }
        if (!Arrays.equals(e, f.l))
        {
            codedoutputbytebuffernano.a(12, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
