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
//            hb, fk, sx

public final class ha extends b
{

    public static final ha a[] = new ha[0];
    public fk b;
    public fk c;
    public fk d;
    public hb e[];
    public sx f;
    public String g;

    public ha()
    {
        b = null;
        c = null;
        d = null;
        e = com.google.a.a.a.a.hb.a;
        f = null;
        g = "";
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
            j = i + CodedOutputByteBufferNano.b(2, c);
        }
        i = j;
        if (d != null)
        {
            i = j + CodedOutputByteBufferNano.b(3, d);
        }
        j = i;
        if (e != null)
        {
            hb ahb[] = e;
            int l = ahb.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(4, ahb[k]);
                k++;
            } while (true);
        }
        i = j;
        if (f != null)
        {
            i = j + CodedOutputByteBufferNano.b(5, f);
        }
        j = i;
        if (!g.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(6, g);
        }
        i = j + com.google.protobuf.nano.f.a(dl);
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
                d = new fk();
                a1.a(d);
                break;

            case 34: // '"'
                int k = com.google.protobuf.nano.f.a(a1, 34);
                hb ahb[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                ahb = new hb[k + j];
                if (e != null)
                {
                    System.arraycopy(e, 0, ahb, 0, j);
                }
                for (e = ahb; j < e.length - 1; j++)
                {
                    e[j] = new hb();
                    a1.a(e[j]);
                    a1.a();
                }

                e[j] = new hb();
                a1.a(e[j]);
                break;

            case 42: // '*'
                f = new sx();
                a1.a(f);
                break;

            case 50: // '2'
                g = a1.f();
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
            hb ahb[] = e;
            int j = ahb.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(4, ahb[i]);
            }

        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (!g.equals(""))
        {
            codedoutputbytebuffernano.a(6, g);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
