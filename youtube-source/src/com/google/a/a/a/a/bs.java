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
//            eg, fk, sx

public final class bs extends b
{

    public static final bs a[] = new bs[0];
    public fk b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public eg h[];
    public sx i;
    public String j;

    public bs()
    {
        b = null;
        c = "";
        d = "";
        e = "";
        f = "";
        g = "";
        h = com.google.a.a.a.a.eg.a;
        i = null;
        j = "";
    }

    public final int a()
    {
        int i1 = 0;
        int k;
        int l;
        if (b != null)
        {
            l = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            l = 0;
        }
        k = l;
        if (!c.equals(""))
        {
            k = l + CodedOutputByteBufferNano.b(2, c);
        }
        l = k;
        if (!d.equals(""))
        {
            l = k + CodedOutputByteBufferNano.b(3, d);
        }
        k = l;
        if (!e.equals(""))
        {
            k = l + CodedOutputByteBufferNano.b(4, e);
        }
        l = k;
        if (!f.equals(""))
        {
            l = k + CodedOutputByteBufferNano.b(5, f);
        }
        k = l;
        if (!g.equals(""))
        {
            k = l + CodedOutputByteBufferNano.b(6, g);
        }
        l = k;
        if (h != null)
        {
            eg aeg[] = h;
            int j1 = aeg.length;
            do
            {
                l = k;
                if (i1 >= j1)
                {
                    break;
                }
                k += CodedOutputByteBufferNano.b(7, aeg[i1]);
                i1++;
            } while (true);
        }
        k = l;
        if (i != null)
        {
            k = l + CodedOutputByteBufferNano.b(8, i);
        }
        l = k;
        if (!j.equals(""))
        {
            l = k + CodedOutputByteBufferNano.b(9, j);
        }
        k = l + com.google.protobuf.nano.f.a(dl);
        dm = k;
        return k;
    }

    public final c a(a a1)
    {
        do
        {
            int k = a1.a();
            switch (k)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, k))
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
                c = a1.f();
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 34: // '"'
                e = a1.f();
                break;

            case 42: // '*'
                f = a1.f();
                break;

            case 50: // '2'
                g = a1.f();
                break;

            case 58: // ':'
                int i1 = com.google.protobuf.nano.f.a(a1, 58);
                eg aeg[];
                int l;
                if (h == null)
                {
                    l = 0;
                } else
                {
                    l = h.length;
                }
                aeg = new eg[i1 + l];
                if (h != null)
                {
                    System.arraycopy(h, 0, aeg, 0, l);
                }
                for (h = aeg; l < h.length - 1; l++)
                {
                    h[l] = new eg();
                    a1.a(h[l]);
                    a1.a();
                }

                h[l] = new eg();
                a1.a(h[l]);
                break;

            case 66: // 'B'
                i = new sx();
                a1.a(i);
                break;

            case 74: // 'J'
                j = a1.f();
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
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (!f.equals(""))
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (!g.equals(""))
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h != null)
        {
            eg aeg[] = h;
            int l = aeg.length;
            for (int k = 0; k < l; k++)
            {
                codedoutputbytebuffernano.a(7, aeg[k]);
            }

        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (!j.equals(""))
        {
            codedoutputbytebuffernano.a(9, j);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
