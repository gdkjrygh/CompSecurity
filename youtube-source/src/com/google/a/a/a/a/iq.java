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
//            is, fk, ir

public final class iq extends b
{

    public static final iq a[] = new iq[0];
    public is b[];
    public fk c;
    public ir d;
    public fk e;

    public iq()
    {
        b = com.google.a.a.a.a.is.a;
        c = null;
        d = null;
        e = null;
    }

    public final int a()
    {
        int j = 0;
        int i = 0;
        if (b != null)
        {
            is ais[] = b;
            int l = ais.length;
            int k = 0;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(1, ais[k]);
                k++;
                i = j + i;
            } while (true);
        }
        i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(3, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(5, e);
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
                int k = f.a(a1, 10);
                is ais[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ais = new is[k + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, ais, 0, j);
                }
                for (b = ais; j < b.length - 1; j++)
                {
                    b[j] = new is();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new is();
                a1.a(b[j]);
                break;

            case 18: // '\022'
                c = new fk();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new ir();
                a1.a(d);
                break;

            case 42: // '*'
                e = new fk();
                a1.a(e);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            is ais[] = b;
            int j = ais.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(1, ais[i]);
            }

        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(5, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
