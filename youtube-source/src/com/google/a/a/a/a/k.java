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
//            rz, gz, hd, wu, 
//            xb, mp

public final class k extends b
{

    public static final k a[] = new k[0];
    public int b;
    public rz c;
    public String d;
    public gz e;
    public hd f;
    public String g[];
    public String h;
    public int i;
    public int j;
    public wu k;
    public xb l;
    public mp m;
    public String n;
    public String o;

    public k()
    {
        b = 0;
        c = null;
        d = "";
        e = null;
        f = null;
        g = f.j;
        h = "";
        i = 0;
        j = 0;
        k = null;
        l = null;
        m = null;
        n = "";
        o = "";
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        int k1;
        if (b != 0)
        {
            j1 = CodedOutputByteBufferNano.d(1, b) + 0;
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
        if (!d.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(3, d);
        }
        k1 = j1;
        if (e != null)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(4, e);
        }
        i1 = k1;
        if (f != null)
        {
            i1 = k1 + CodedOutputByteBufferNano.b(5, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1;
            if (g.length > 0)
            {
                String as[] = g;
                int i2 = as.length;
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < i2; j1++)
                {
                    l1 += CodedOutputByteBufferNano.a(as[j1]);
                }

                j1 = i1 + l1 + g.length * 1;
            }
        }
        i1 = j1;
        if (!h.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(7, h);
        }
        j1 = i1;
        if (i != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(8, i);
        }
        i1 = j1;
        if (j != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(9, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(10, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(11, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(12, m);
        }
        i1 = j1;
        if (!n.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(13, n);
        }
        j1 = i1;
        if (!o.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(14, o);
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

            case 8: // '\b'
                int j1 = a1.d();
                if (j1 == 0 || j1 == 1 || j1 == 2 || j1 == 3)
                {
                    b = j1;
                } else
                {
                    b = 0;
                }
                break;

            case 18: // '\022'
                c = new rz();
                a1.a(c);
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 34: // '"'
                e = new gz();
                a1.a(e);
                break;

            case 42: // '*'
                f = new hd();
                a1.a(f);
                break;

            case 50: // '2'
                int l1 = com.google.protobuf.nano.f.a(a1, 50);
                int k1 = g.length;
                String as[] = new String[l1 + k1];
                System.arraycopy(g, 0, as, 0, k1);
                for (g = as; k1 < g.length - 1; k1++)
                {
                    g[k1] = a1.f();
                    a1.a();
                }

                g[k1] = a1.f();
                break;

            case 58: // ':'
                h = a1.f();
                break;

            case 64: // '@'
                i = a1.d();
                break;

            case 72: // 'H'
                j = a1.d();
                break;

            case 82: // 'R'
                k = new wu();
                a1.a(k);
                break;

            case 90: // 'Z'
                l = new xb();
                a1.a(l);
                break;

            case 98: // 'b'
                m = new mp();
                a1.a(m);
                break;

            case 106: // 'j'
                n = a1.f();
                break;

            case 114: // 'r'
                o = a1.f();
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
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g != null)
        {
            String as[] = g;
            int j1 = as.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(6, as[i1]);
            }

        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != 0)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j != 0)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m != null)
        {
            codedoutputbytebuffernano.a(12, m);
        }
        if (!n.equals(""))
        {
            codedoutputbytebuffernano.a(13, n);
        }
        if (!o.equals(""))
        {
            codedoutputbytebuffernano.a(14, o);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
