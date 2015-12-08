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
//            ex, rz, gz, l

public final class hj extends b
{

    public static final hj a[] = new hj[0];
    public int b;
    public rz c;
    public String d;
    public gz e;
    public ex f[];
    public String g[];
    public String h;
    public l i;
    public String j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public String q;
    public String r;

    public hj()
    {
        b = 0;
        c = null;
        d = "";
        e = null;
        f = com.google.a.a.a.a.ex.a;
        g = f.j;
        h = "";
        i = null;
        j = "";
        k = 0;
        l = 0;
        m = 0;
        n = 0;
        o = false;
        p = false;
        q = "";
        r = "";
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
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
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(4, e);
        }
        j1 = i1;
        if (f != null)
        {
            ex aex[] = f;
            int i2 = aex.length;
            int k1 = 0;
            do
            {
                j1 = i1;
                if (k1 >= i2)
                {
                    break;
                }
                j1 = CodedOutputByteBufferNano.b(5, aex[k1]);
                k1++;
                i1 = j1 + i1;
            } while (true);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1;
            if (g.length > 0)
            {
                String as[] = g;
                int j2 = as.length;
                int l1 = 0;
                for (i1 = ((flag) ? 1 : 0); i1 < j2; i1++)
                {
                    l1 += CodedOutputByteBufferNano.a(as[i1]);
                }

                i1 = j1 + l1 + g.length * 1;
            }
        }
        j1 = i1;
        if (!h.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, i);
        }
        j1 = i1;
        if (!j.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(9, j);
        }
        i1 = j1;
        if (k != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(10, k);
        }
        j1 = i1;
        if (l != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(11, l);
        }
        i1 = j1;
        if (m != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(12, m);
        }
        j1 = i1;
        if (n != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(13, n);
        }
        i1 = j1;
        if (o)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(14, o);
        }
        j1 = i1;
        if (p)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(15, p);
        }
        i1 = j1;
        if (!q.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(16, q);
        }
        j1 = i1;
        if (!r.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(17, r);
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
                int i2 = com.google.protobuf.nano.f.a(a1, 42);
                ex aex[];
                int k1;
                if (f == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = f.length;
                }
                aex = new ex[i2 + k1];
                if (f != null)
                {
                    System.arraycopy(f, 0, aex, 0, k1);
                }
                for (f = aex; k1 < f.length - 1; k1++)
                {
                    f[k1] = new ex();
                    a1.a(f[k1]);
                    a1.a();
                }

                f[k1] = new ex();
                a1.a(f[k1]);
                break;

            case 50: // '2'
                int j2 = com.google.protobuf.nano.f.a(a1, 50);
                int l1 = g.length;
                String as[] = new String[j2 + l1];
                System.arraycopy(g, 0, as, 0, l1);
                for (g = as; l1 < g.length - 1; l1++)
                {
                    g[l1] = a1.f();
                    a1.a();
                }

                g[l1] = a1.f();
                break;

            case 58: // ':'
                h = a1.f();
                break;

            case 66: // 'B'
                i = new l();
                a1.a(i);
                break;

            case 74: // 'J'
                j = a1.f();
                break;

            case 80: // 'P'
                k = a1.d();
                break;

            case 88: // 'X'
                l = a1.d();
                break;

            case 96: // '`'
                m = a1.d();
                break;

            case 104: // 'h'
                n = a1.d();
                break;

            case 112: // 'p'
                o = a1.e();
                break;

            case 120: // 'x'
                p = a1.e();
                break;

            case 130: 
                q = a1.f();
                break;

            case 138: 
                r = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
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
            ex aex[] = f;
            int k1 = aex.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(5, aex[i1]);
            }

        }
        if (g != null)
        {
            String as[] = g;
            int l1 = as.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                codedoutputbytebuffernano.a(6, as[j1]);
            }

        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (!j.equals(""))
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k != 0)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (l != 0)
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m != 0)
        {
            codedoutputbytebuffernano.a(12, m);
        }
        if (n != 0)
        {
            codedoutputbytebuffernano.a(13, n);
        }
        if (o)
        {
            codedoutputbytebuffernano.a(14, o);
        }
        if (p)
        {
            codedoutputbytebuffernano.a(15, p);
        }
        if (!q.equals(""))
        {
            codedoutputbytebuffernano.a(16, q);
        }
        if (!r.equals(""))
        {
            codedoutputbytebuffernano.a(17, r);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
