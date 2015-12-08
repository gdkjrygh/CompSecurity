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
//            ie, hy

public final class hq extends b
{

    public static final hq a[] = new hq[0];
    public int b;
    public String c;
    public String d;
    public String e;
    public hy f;
    public ie g[];
    public String h;

    public hq()
    {
        b = 0;
        c = "";
        d = "";
        e = "";
        f = null;
        g = com.google.a.a.a.a.ie.a;
        h = "";
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        int k;
        if (b != 0)
        {
            j = CodedOutputByteBufferNano.d(1, b) + 0;
        } else
        {
            j = 0;
        }
        i = j;
        if (!c.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (!d.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(3, d);
        }
        k = j;
        if (!e.equals(""))
        {
            k = j + CodedOutputByteBufferNano.b(4, e);
        }
        i = k;
        if (f != null)
        {
            i = k + CodedOutputByteBufferNano.b(5, f);
        }
        j = i;
        if (g != null)
        {
            ie aie[] = g;
            int i1 = aie.length;
            int l = ((flag) ? 1 : 0);
            do
            {
                j = i;
                if (l >= i1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(6, aie[l]);
                l++;
            } while (true);
        }
        i = j;
        if (!h.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(7, h);
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

            case 8: // '\b'
                int j = a1.d();
                if (j == 0 || j == 1 || j == 2 || j == 3 || j == 4 || j == 5 || j == 6 || j == 7 || j == 8 || j == 9 || j == 10 || j == 11 || j == 12 || j == 13 || j == 14 || j == 15 || j == 16 || j == 17 || j == 18 || j == 19)
                {
                    b = j;
                } else
                {
                    b = 0;
                }
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
                f = new hy();
                a1.a(f);
                break;

            case 50: // '2'
                int l = com.google.protobuf.nano.f.a(a1, 50);
                ie aie[];
                int k;
                if (g == null)
                {
                    k = 0;
                } else
                {
                    k = g.length;
                }
                aie = new ie[l + k];
                if (g != null)
                {
                    System.arraycopy(g, 0, aie, 0, k);
                }
                for (g = aie; k < g.length - 1; k++)
                {
                    g[k] = new ie();
                    a1.a(g[k]);
                    a1.a();
                }

                g[k] = new ie();
                a1.a(g[k]);
                break;

            case 58: // ':'
                h = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != 0)
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
        if (f != null)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g != null)
        {
            ie aie[] = g;
            int j = aie.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(6, aie[i]);
            }

        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(7, h);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
