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
//            ak, fk, sw, sx, 
//            kz, s, tq, uz, 
//            iw

public final class uy extends b
{

    public static final uy a[] = new uy[0];
    public String b;
    public sx c;
    public fk d;
    public fk e;
    public fk f;
    public fk g;
    public fk h;
    public fk i;
    public kz j;
    public ak k[];
    public ak l[];
    public fk m[];
    public s n;
    public String o;
    public fk p;
    public tq q;
    public fk r;
    public sx s;
    public uz t;
    public byte u[];
    public iw v;
    public sw w[];

    public uy()
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
        k = com.google.a.a.a.a.ak.a;
        l = com.google.a.a.a.a.ak.a;
        m = com.google.a.a.a.a.fk.a;
        n = null;
        o = "";
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = f.l;
        v = null;
        w = com.google.a.a.a.a.sw.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        int j2;
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
            ak aak[] = k;
            int k2 = aak.length;
            int k1 = 0;
            do
            {
                i1 = j1;
                if (k1 >= k2)
                {
                    break;
                }
                i1 = CodedOutputByteBufferNano.b(10, aak[k1]);
                k1++;
                j1 = i1 + j1;
            } while (true);
        }
        j1 = i1;
        if (l != null)
        {
            ak aak1[] = l;
            int l2 = aak1.length;
            int l1 = 0;
            do
            {
                j1 = i1;
                if (l1 >= l2)
                {
                    break;
                }
                j1 = CodedOutputByteBufferNano.b(11, aak1[l1]);
                l1++;
                i1 = j1 + i1;
            } while (true);
        }
        i1 = j1;
        if (m != null)
        {
            fk afk[] = m;
            int i3 = afk.length;
            int i2 = 0;
            do
            {
                i1 = j1;
                if (i2 >= i3)
                {
                    break;
                }
                i1 = CodedOutputByteBufferNano.b(12, afk[i2]);
                i2++;
                j1 = i1 + j1;
            } while (true);
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
        if (p != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(15, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(17, q);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(18, r);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(19, s);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(20, t);
        }
        j2 = j1;
        if (!Arrays.equals(u, f.l))
        {
            j2 = j1 + CodedOutputByteBufferNano.b(21, u);
        }
        i1 = j2;
        if (v != null)
        {
            i1 = j2 + CodedOutputByteBufferNano.b(22, v);
        }
        j2 = i1;
        if (w != null)
        {
            sw asw[] = w;
            int j3 = asw.length;
            j1 = ((flag) ? 1 : 0);
            do
            {
                j2 = i1;
                if (j1 >= j3)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(23, asw[j1]);
                j1++;
            } while (true);
        }
        i1 = j2 + com.google.protobuf.nano.f.a(dl);
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
                i = new fk();
                a1.a(i);
                break;

            case 74: // 'J'
                j = new kz();
                a1.a(j);
                break;

            case 82: // 'R'
                int j2 = com.google.protobuf.nano.f.a(a1, 82);
                ak aak[];
                int j1;
                if (k == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = k.length;
                }
                aak = new ak[j2 + j1];
                if (k != null)
                {
                    System.arraycopy(k, 0, aak, 0, j1);
                }
                for (k = aak; j1 < k.length - 1; j1++)
                {
                    k[j1] = new ak();
                    a1.a(k[j1]);
                    a1.a();
                }

                k[j1] = new ak();
                a1.a(k[j1]);
                break;

            case 90: // 'Z'
                int k2 = com.google.protobuf.nano.f.a(a1, 90);
                ak aak1[];
                int k1;
                if (l == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = l.length;
                }
                aak1 = new ak[k2 + k1];
                if (l != null)
                {
                    System.arraycopy(l, 0, aak1, 0, k1);
                }
                for (l = aak1; k1 < l.length - 1; k1++)
                {
                    l[k1] = new ak();
                    a1.a(l[k1]);
                    a1.a();
                }

                l[k1] = new ak();
                a1.a(l[k1]);
                break;

            case 98: // 'b'
                int l2 = com.google.protobuf.nano.f.a(a1, 98);
                fk afk[];
                int l1;
                if (m == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = m.length;
                }
                afk = new fk[l2 + l1];
                if (m != null)
                {
                    System.arraycopy(m, 0, afk, 0, l1);
                }
                for (m = afk; l1 < m.length - 1; l1++)
                {
                    m[l1] = new fk();
                    a1.a(m[l1]);
                    a1.a();
                }

                m[l1] = new fk();
                a1.a(m[l1]);
                break;

            case 106: // 'j'
                n = new s();
                a1.a(n);
                break;

            case 114: // 'r'
                o = a1.f();
                break;

            case 122: // 'z'
                p = new fk();
                a1.a(p);
                break;

            case 138: 
                q = new tq();
                a1.a(q);
                break;

            case 146: 
                r = new fk();
                a1.a(r);
                break;

            case 154: 
                s = new sx();
                a1.a(s);
                break;

            case 162: 
                t = new uz();
                a1.a(t);
                break;

            case 170: 
                u = a1.g();
                break;

            case 178: 
                v = new iw();
                a1.a(v);
                break;

            case 186: 
                int i3 = com.google.protobuf.nano.f.a(a1, 186);
                sw asw[];
                int i2;
                if (w == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = w.length;
                }
                asw = new sw[i3 + i2];
                if (w != null)
                {
                    System.arraycopy(w, 0, asw, 0, i2);
                }
                for (w = asw; i2 < w.length - 1; i2++)
                {
                    w[i2] = new sw();
                    a1.a(w[i2]);
                    a1.a();
                }

                w[i2] = new sw();
                a1.a(w[i2]);
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
            ak aak[] = k;
            int i2 = aak.length;
            for (int i1 = 0; i1 < i2; i1++)
            {
                codedoutputbytebuffernano.a(10, aak[i1]);
            }

        }
        if (l != null)
        {
            ak aak1[] = l;
            int j2 = aak1.length;
            for (int j1 = 0; j1 < j2; j1++)
            {
                codedoutputbytebuffernano.a(11, aak1[j1]);
            }

        }
        if (m != null)
        {
            fk afk[] = m;
            int k2 = afk.length;
            for (int k1 = 0; k1 < k2; k1++)
            {
                codedoutputbytebuffernano.a(12, afk[k1]);
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
        if (p != null)
        {
            codedoutputbytebuffernano.a(15, p);
        }
        if (q != null)
        {
            codedoutputbytebuffernano.a(17, q);
        }
        if (r != null)
        {
            codedoutputbytebuffernano.a(18, r);
        }
        if (s != null)
        {
            codedoutputbytebuffernano.a(19, s);
        }
        if (t != null)
        {
            codedoutputbytebuffernano.a(20, t);
        }
        if (!Arrays.equals(u, f.l))
        {
            codedoutputbytebuffernano.a(21, u);
        }
        if (v != null)
        {
            codedoutputbytebuffernano.a(22, v);
        }
        if (w != null)
        {
            sw asw[] = w;
            int l2 = asw.length;
            for (int l1 = ((flag) ? 1 : 0); l1 < l2; l1++)
            {
                codedoutputbytebuffernano.a(23, asw[l1]);
            }

        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
