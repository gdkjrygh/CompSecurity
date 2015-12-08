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
//            vz, fk, kz

public final class wa extends b
{

    public static final wa a[] = new wa[0];
    public fk b;
    public vz c[];
    public kz d;

    public wa()
    {
        b = null;
        c = com.google.a.a.a.a.vz.a;
        d = null;
    }

    public final int a()
    {
        int k = 0;
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
            vz avz[] = c;
            int l = avz.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, avz[k]);
                k++;
            } while (true);
        }
        i = j;
        if (d != null)
        {
            i = j + CodedOutputByteBufferNano.b(3, d);
        }
        i += f.a(dl);
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
                int k = f.a(a1, 18);
                vz avz[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                avz = new vz[k + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, avz, 0, j);
                }
                for (c = avz; j < c.length - 1; j++)
                {
                    c[j] = new vz();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new vz();
                a1.a(c[j]);
                break;

            case 26: // '\032'
                d = new kz();
                a1.a(d);
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
            vz avz[] = c;
            int j = avz.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(2, avz[i]);
            }

        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
