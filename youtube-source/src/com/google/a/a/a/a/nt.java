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
//            sx, ni, fk

public final class nt extends b
{

    public static final nt a[] = new nt[0];
    public sx b;
    public ni c;
    public fk d;
    public fk e;
    public long f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k[];
    public boolean l;
    public boolean m;

    public nt()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = 0L;
        g = "";
        h = "";
        i = "";
        j = false;
        k = f.j;
        l = false;
        m = false;
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        int k1;
        if (b != null)
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(2, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(3, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(4, e);
        }
        j1 = i1;
        if (f != 0L)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(5, f);
        }
        i1 = j1;
        if (!g.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(6, g);
        }
        j1 = i1;
        if (!h.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, h);
        }
        k1 = j1;
        if (!i.equals(""))
        {
            k1 = j1 + CodedOutputByteBufferNano.b(8, i);
        }
        i1 = k1;
        if (j)
        {
            i1 = k1 + CodedOutputByteBufferNano.b(9, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                String as[] = k;
                int i2 = as.length;
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < i2; j1++)
                {
                    l1 += CodedOutputByteBufferNano.a(as[j1]);
                }

                j1 = i1 + l1 + k.length * 1;
            }
        }
        i1 = j1;
        if (l)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(11, l);
        }
        j1 = i1;
        if (m)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(12, m);
        }
        i1 = j1 + com.google.protobuf.nano.f.a(dl);
        dm = i1;
        return i1;
    }

    public final c a(a a1)
    {
        do
        {
            int i1 = a1.a();
            switch (i1)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = new sx();
                a1.a(b);
                break;

            case 18: // '\022'
                c = new ni();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new fk();
                a1.a(d);
                break;

            case 34: // '"'
                e = new fk();
                a1.a(e);
                break;

            case 40: // '('
                f = a1.b();
                break;

            case 50: // '2'
                g = a1.f();
                break;

            case 58: // ':'
                h = a1.f();
                break;

            case 66: // 'B'
                i = a1.f();
                break;

            case 72: // 'H'
                j = a1.e();
                break;

            case 82: // 'R'
                int k1 = com.google.protobuf.nano.f.a(a1, 82);
                int j1 = k.length;
                String as[] = new String[k1 + j1];
                System.arraycopy(k, 0, as, 0, j1);
                for (k = as; j1 < k.length - 1; j1++)
                {
                    k[j1] = a1.f();
                    a1.a();
                }

                k[j1] = a1.f();
                break;

            case 88: // 'X'
                l = a1.e();
                break;

            case 96: // '`'
                m = a1.e();
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
        if (f != 0L)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (!g.equals(""))
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (!i.equals(""))
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k != null)
        {
            String as[] = k;
            int j1 = as.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(10, as[i1]);
            }

        }
        if (l)
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m)
        {
            codedoutputbytebuffernano.a(12, m);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
