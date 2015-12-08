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
//            bm, fk, sx

public final class bl extends b
{

    public static final bl a[] = new bl[0];
    public fk b;
    public fk c;
    public sx d;
    public fk e;
    public bm f[];
    public fk g;

    public bl()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = com.google.a.a.a.a.bm.a;
        g = null;
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
            j = i + CodedOutputByteBufferNano.b(3, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(4, e);
        }
        j = i;
        if (f != null)
        {
            bm abm[] = f;
            int l = abm.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(5, abm[k]);
                k++;
            } while (true);
        }
        i = j;
        if (g != null)
        {
            i = j + CodedOutputByteBufferNano.b(6, g);
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
                c = new fk();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new sx();
                a1.a(d);
                break;

            case 34: // '"'
                e = new fk();
                a1.a(e);
                break;

            case 42: // '*'
                int k = com.google.protobuf.nano.f.a(a1, 42);
                bm abm[];
                int j;
                if (f == null)
                {
                    j = 0;
                } else
                {
                    j = f.length;
                }
                abm = new bm[k + j];
                if (f != null)
                {
                    System.arraycopy(f, 0, abm, 0, j);
                }
                for (f = abm; j < f.length - 1; j++)
                {
                    f[j] = new bm();
                    a1.a(f[j]);
                    a1.a();
                }

                f[j] = new bm();
                a1.a(f[j]);
                break;

            case 50: // '2'
                g = new fk();
                a1.a(g);
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
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != null)
        {
            bm abm[] = f;
            int j = abm.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(5, abm[i]);
            }

        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
