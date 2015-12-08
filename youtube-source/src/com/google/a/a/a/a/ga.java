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
//            gb, kz, sx, hc, 
//            fk

public final class ga extends b
{

    public static final ga a[] = new ga[0];
    public kz b;
    public String c;
    public sx d;
    public gb e[];
    public byte f[];
    public hc g;
    public fk h;

    public ga()
    {
        b = null;
        c = "";
        d = null;
        e = com.google.a.a.a.a.gb.a;
        f = f.l;
        g = null;
        h = null;
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
        if (!c.equals(""))
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
            gb agb[] = e;
            int l = agb.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(4, agb[k]);
                k++;
            } while (true);
        }
        i = j;
        if (!Arrays.equals(f, f.l))
        {
            i = j + CodedOutputByteBufferNano.b(6, f);
        }
        j = i;
        if (g != null)
        {
            j = i + CodedOutputByteBufferNano.b(7, g);
        }
        i = j;
        if (h != null)
        {
            i = j + CodedOutputByteBufferNano.b(8, h);
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
                b = new kz();
                a1.a(b);
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 26: // '\032'
                d = new sx();
                a1.a(d);
                break;

            case 34: // '"'
                int k = com.google.protobuf.nano.f.a(a1, 34);
                gb agb[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                agb = new gb[k + j];
                if (e != null)
                {
                    System.arraycopy(e, 0, agb, 0, j);
                }
                for (e = agb; j < e.length - 1; j++)
                {
                    e[j] = new gb();
                    a1.a(e[j]);
                    a1.a();
                }

                e[j] = new gb();
                a1.a(e[j]);
                break;

            case 50: // '2'
                f = a1.g();
                break;

            case 58: // ':'
                g = new hc();
                a1.a(g);
                break;

            case 66: // 'B'
                h = new fk();
                a1.a(h);
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
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            gb agb[] = e;
            int j = agb.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(4, agb[i]);
            }

        }
        if (!Arrays.equals(f, f.l))
        {
            codedoutputbytebuffernano.a(6, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(7, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(8, h);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
