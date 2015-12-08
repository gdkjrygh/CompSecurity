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
//            sx, fk, kz, pj, 
//            pl

public final class pk extends b
{

    public static final pk a[] = new pk[0];
    public String b;
    public sx c;
    public fk d;
    public fk e;
    public fk f;
    public fk g;
    public sx h;
    public fk i;
    public kz j;
    public pj k;
    public String l[];
    public String m[];
    public pl n;
    public String o;
    public byte p[];

    public pk()
    {
        b = "";
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = f.j;
        m = f.j;
        n = null;
        o = "";
        p = f.l;
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        if (!b.equals(""))
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
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(5, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(6, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(9, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                String as[] = l;
                int i2 = as.length;
                j1 = 0;
                int k1 = 0;
                for (; j1 < i2; j1++)
                {
                    k1 += CodedOutputByteBufferNano.a(as[j1]);
                }

                j1 = i1 + k1 + l.length * 1;
            }
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1;
            if (m.length > 0)
            {
                String as1[] = m;
                int j2 = as1.length;
                int l1 = 0;
                for (i1 = ((flag) ? 1 : 0); i1 < j2; i1++)
                {
                    l1 += CodedOutputByteBufferNano.a(as1[i1]);
                }

                i1 = j1 + l1 + m.length * 1;
            }
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(13, n);
        }
        i1 = j1;
        if (!o.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(14, o);
        }
        j1 = i1;
        if (!Arrays.equals(p, f.l))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(16, p);
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
                b = a1.f();
                break;

            case 18: // '\022'
                c = new sx();
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

            case 42: // '*'
                f = new fk();
                a1.a(f);
                break;

            case 50: // '2'
                g = new fk();
                a1.a(g);
                break;

            case 58: // ':'
                h = new sx();
                a1.a(h);
                break;

            case 66: // 'B'
                i = new fk();
                a1.a(i);
                break;

            case 74: // 'J'
                j = new kz();
                a1.a(j);
                break;

            case 82: // 'R'
                k = new pj();
                a1.a(k);
                break;

            case 90: // 'Z'
                int l1 = com.google.protobuf.nano.f.a(a1, 90);
                int j1 = l.length;
                String as[] = new String[l1 + j1];
                System.arraycopy(l, 0, as, 0, j1);
                for (l = as; j1 < l.length - 1; j1++)
                {
                    l[j1] = a1.f();
                    a1.a();
                }

                l[j1] = a1.f();
                break;

            case 98: // 'b'
                int i2 = com.google.protobuf.nano.f.a(a1, 98);
                int k1 = m.length;
                String as1[] = new String[i2 + k1];
                System.arraycopy(m, 0, as1, 0, k1);
                for (m = as1; k1 < m.length - 1; k1++)
                {
                    m[k1] = a1.f();
                    a1.a();
                }

                m[k1] = a1.f();
                break;

            case 106: // 'j'
                n = new pl();
                a1.a(n);
                break;

            case 114: // 'r'
                o = a1.f();
                break;

            case 130: 
                p = a1.g();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (!b.equals(""))
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
            codedoutputbytebuffernano.a(5, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (l != null)
        {
            String as[] = l;
            int k1 = as.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(11, as[i1]);
            }

        }
        if (m != null)
        {
            String as1[] = m;
            int l1 = as1.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                codedoutputbytebuffernano.a(12, as1[j1]);
            }

        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(13, n);
        }
        if (!o.equals(""))
        {
            codedoutputbytebuffernano.a(14, o);
        }
        if (!Arrays.equals(p, f.l))
        {
            codedoutputbytebuffernano.a(16, p);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
