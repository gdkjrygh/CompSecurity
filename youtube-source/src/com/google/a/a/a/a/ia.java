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
//            hx, id, hw

public final class ia extends b
{

    public static final ia a[] = new ia[0];
    public id b;
    public hw c;
    public hx d[];
    public int e;

    public ia()
    {
        b = null;
        c = null;
        d = com.google.a.a.a.a.hx.a;
        e = 0;
    }

    public final int a()
    {
        int k = 0;
        int i;
        int j;
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
        j = i;
        if (d != null)
        {
            hx ahx[] = d;
            int l = ahx.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(3, ahx[k]);
                k++;
            } while (true);
        }
        i = j;
        if (e != 0)
        {
            i = j + CodedOutputByteBufferNano.d(4, e);
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
                b = new id();
                a1.a(b);
                break;

            case 18: // '\022'
                c = new hw();
                a1.a(c);
                break;

            case 26: // '\032'
                int k = f.a(a1, 26);
                hx ahx[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                ahx = new hx[k + j];
                if (d != null)
                {
                    System.arraycopy(d, 0, ahx, 0, j);
                }
                for (d = ahx; j < d.length - 1; j++)
                {
                    d[j] = new hx();
                    a1.a(d[j]);
                    a1.a();
                }

                d[j] = new hx();
                a1.a(d[j]);
                break;

            case 32: // ' '
                e = a1.d();
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
            hx ahx[] = d;
            int j = ahx.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(3, ahx[i]);
            }

        }
        if (e != 0)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
