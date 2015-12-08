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
//            ak, sw, sx, fk, 
//            kz, tq, dk, in

public final class dj extends b
{

    public static final dj a[] = new dj[0];
    public String b;
    public sx c;
    public fk d;
    public fk e;
    public fk f;
    public fk g;
    public fk h;
    public kz i;
    public String j;
    public fk k;
    public tq l;
    public ak m[];
    public sx n;
    public ak o[];
    public dk p;
    public byte q[];
    public sw r[];
    public boolean s;
    public in t;

    public dj()
    {
        b = "";
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = "";
        k = null;
        l = null;
        m = com.google.a.a.a.a.ak.a;
        n = null;
        o = com.google.a.a.a.a.ak.a;
        p = null;
        q = f.l;
        r = com.google.a.a.a.a.sw.a;
        s = false;
        t = null;
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        int k1;
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
        if (!j.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(9, j);
        }
        k1 = j1;
        if (k != null)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(10, k);
        }
        i1 = k1;
        if (l != null)
        {
            i1 = k1 + CodedOutputByteBufferNano.b(12, l);
        }
        j1 = i1;
        if (m != null)
        {
            ak aak[] = m;
            int i2 = aak.length;
            k1 = 0;
            do
            {
                j1 = i1;
                if (k1 >= i2)
                {
                    break;
                }
                j1 = CodedOutputByteBufferNano.b(13, aak[k1]);
                k1++;
                i1 = j1 + i1;
            } while (true);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(14, n);
        }
        j1 = i1;
        if (o != null)
        {
            ak aak1[] = o;
            int j2 = aak1.length;
            k1 = 0;
            do
            {
                j1 = i1;
                if (k1 >= j2)
                {
                    break;
                }
                j1 = CodedOutputByteBufferNano.b(15, aak1[k1]);
                k1++;
                i1 = j1 + i1;
            } while (true);
        }
        k1 = j1;
        if (p != null)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(17, p);
        }
        i1 = k1;
        if (!Arrays.equals(q, f.l))
        {
            i1 = k1 + CodedOutputByteBufferNano.b(18, q);
        }
        j1 = i1;
        if (r != null)
        {
            sw asw[] = r;
            int k2 = asw.length;
            int l1 = ((flag) ? 1 : 0);
            do
            {
                j1 = i1;
                if (l1 >= k2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(20, asw[l1]);
                l1++;
            } while (true);
        }
        i1 = j1;
        if (s)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(21, s);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(0x39d6d44, t);
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
                h = new fk();
                a1.a(h);
                break;

            case 66: // 'B'
                i = new kz();
                a1.a(i);
                break;

            case 74: // 'J'
                j = a1.f();
                break;

            case 82: // 'R'
                k = new fk();
                a1.a(k);
                break;

            case 98: // 'b'
                l = new tq();
                a1.a(l);
                break;

            case 106: // 'j'
                int i2 = com.google.protobuf.nano.f.a(a1, 106);
                ak aak[];
                int j1;
                if (m == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = m.length;
                }
                aak = new ak[i2 + j1];
                if (m != null)
                {
                    System.arraycopy(m, 0, aak, 0, j1);
                }
                for (m = aak; j1 < m.length - 1; j1++)
                {
                    m[j1] = new ak();
                    a1.a(m[j1]);
                    a1.a();
                }

                m[j1] = new ak();
                a1.a(m[j1]);
                break;

            case 114: // 'r'
                n = new sx();
                a1.a(n);
                break;

            case 122: // 'z'
                int j2 = com.google.protobuf.nano.f.a(a1, 122);
                ak aak1[];
                int k1;
                if (o == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = o.length;
                }
                aak1 = new ak[j2 + k1];
                if (o != null)
                {
                    System.arraycopy(o, 0, aak1, 0, k1);
                }
                for (o = aak1; k1 < o.length - 1; k1++)
                {
                    o[k1] = new ak();
                    a1.a(o[k1]);
                    a1.a();
                }

                o[k1] = new ak();
                a1.a(o[k1]);
                break;

            case 138: 
                p = new dk();
                a1.a(p);
                break;

            case 146: 
                q = a1.g();
                break;

            case 162: 
                int k2 = com.google.protobuf.nano.f.a(a1, 162);
                sw asw[];
                int l1;
                if (r == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = r.length;
                }
                asw = new sw[k2 + l1];
                if (r != null)
                {
                    System.arraycopy(r, 0, asw, 0, l1);
                }
                for (r = asw; l1 < r.length - 1; l1++)
                {
                    r[l1] = new sw();
                    a1.a(r[l1]);
                    a1.a();
                }

                r[l1] = new sw();
                a1.a(r[l1]);
                break;

            case 168: 
                s = a1.e();
                break;

            case 485190178: 
                t = new in();
                a1.a(t);
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
        if (!j.equals(""))
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(12, l);
        }
        if (m != null)
        {
            ak aak[] = m;
            int l1 = aak.length;
            for (int i1 = 0; i1 < l1; i1++)
            {
                codedoutputbytebuffernano.a(13, aak[i1]);
            }

        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(14, n);
        }
        if (o != null)
        {
            ak aak1[] = o;
            int i2 = aak1.length;
            for (int j1 = 0; j1 < i2; j1++)
            {
                codedoutputbytebuffernano.a(15, aak1[j1]);
            }

        }
        if (p != null)
        {
            codedoutputbytebuffernano.a(17, p);
        }
        if (!Arrays.equals(q, f.l))
        {
            codedoutputbytebuffernano.a(18, q);
        }
        if (r != null)
        {
            sw asw[] = r;
            int j2 = asw.length;
            for (int k1 = ((flag) ? 1 : 0); k1 < j2; k1++)
            {
                codedoutputbytebuffernano.a(20, asw[k1]);
            }

        }
        if (s)
        {
            codedoutputbytebuffernano.a(21, s);
        }
        if (t != null)
        {
            codedoutputbytebuffernano.a(0x39d6d44, t);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
