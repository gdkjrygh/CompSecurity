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
//            gf, fk

public final class ge extends b
{

    public static final ge a[] = new ge[0];
    public fk b;
    public gf c[];
    public String d;
    public byte e[];
    public fk f;
    public fk g;

    public ge()
    {
        b = null;
        c = com.google.a.a.a.a.gf.a;
        d = "";
        e = f.l;
        f = null;
        g = null;
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
            gf agf[] = c;
            int l = agf.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(4, agf[k]);
                k++;
            } while (true);
        }
        i = j;
        if (!d.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(5, d);
        }
        j = i;
        if (!Arrays.equals(e, f.l))
        {
            j = i + CodedOutputByteBufferNano.b(7, e);
        }
        i = j;
        if (f != null)
        {
            i = j + CodedOutputByteBufferNano.b(8, f);
        }
        j = i;
        if (g != null)
        {
            j = i + CodedOutputByteBufferNano.b(9, g);
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

            case 18: // '\022'
                b = new fk();
                a1.a(b);
                break;

            case 34: // '"'
                int k = com.google.protobuf.nano.f.a(a1, 34);
                gf agf[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                agf = new gf[k + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, agf, 0, j);
                }
                for (c = agf; j < c.length - 1; j++)
                {
                    c[j] = new gf();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new gf();
                a1.a(c[j]);
                break;

            case 42: // '*'
                d = a1.f();
                break;

            case 58: // ':'
                e = a1.g();
                break;

            case 66: // 'B'
                f = new fk();
                a1.a(f);
                break;

            case 74: // 'J'
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
            codedoutputbytebuffernano.a(2, b);
        }
        if (c != null)
        {
            gf agf[] = c;
            int j = agf.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(4, agf[i]);
            }

        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(5, d);
        }
        if (!Arrays.equals(e, f.l))
        {
            codedoutputbytebuffernano.a(7, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(8, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(9, g);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
