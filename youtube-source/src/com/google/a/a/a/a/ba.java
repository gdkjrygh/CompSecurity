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
//            jk, ak, bd, ay, 
//            kz, sx, aw, ax, 
//            bc, vc, az, fk, 
//            bb

public final class ba extends b
{

    public static final ba a[] = new ba[0];
    public jk b[];
    public ay c;
    public String d;
    public String e;
    public kz f;
    public sx g;
    public sx h;
    public int i;
    public ak j[];
    public aw k;
    public ax l;
    public int m;
    public bc n;
    public bd o[];
    public vc p;
    public az q;
    public fk r;
    public bb s;
    public sx t;
    public sx u;

    public ba()
    {
        b = com.google.a.a.a.a.jk.a;
        c = null;
        d = "";
        e = "";
        f = null;
        g = null;
        h = null;
        i = 0;
        j = com.google.a.a.a.a.ak.a;
        k = null;
        l = null;
        m = 1;
        n = null;
        o = com.google.a.a.a.a.bd.a;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
    }

    public final int a()
    {
        boolean flag = false;
        int k1;
        if (b != null)
        {
            jk ajk[] = b;
            int l2 = ajk.length;
            int l1 = 0;
            int i1 = 0;
            do
            {
                k1 = i1;
                if (l1 >= l2)
                {
                    break;
                }
                k1 = CodedOutputByteBufferNano.b(2, ajk[l1]);
                l1++;
                i1 = k1 + i1;
            } while (true);
        } else
        {
            k1 = 0;
        }
        int j1 = k1;
        if (c != null)
        {
            j1 = k1 + CodedOutputByteBufferNano.b(3, c);
        }
        k1 = j1;
        if (!d.equals(""))
        {
            k1 = j1 + CodedOutputByteBufferNano.b(5, d);
        }
        j1 = k1;
        if (!e.equals(""))
        {
            j1 = k1 + CodedOutputByteBufferNano.b(6, e);
        }
        k1 = j1;
        if (f != null)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(7, f);
        }
        j1 = k1;
        if (g != null)
        {
            j1 = k1 + CodedOutputByteBufferNano.b(9, g);
        }
        k1 = j1;
        if (h != null)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(10, h);
        }
        j1 = k1;
        if (i != 0)
        {
            j1 = k1 + CodedOutputByteBufferNano.d(12, i);
        }
        k1 = j1;
        if (j != null)
        {
            ak aak[] = j;
            int i3 = aak.length;
            int i2 = 0;
            do
            {
                k1 = j1;
                if (i2 >= i3)
                {
                    break;
                }
                k1 = CodedOutputByteBufferNano.b(13, aak[i2]);
                i2++;
                j1 = k1 + j1;
            } while (true);
        }
        j1 = k1;
        if (k != null)
        {
            j1 = k1 + CodedOutputByteBufferNano.b(14, k);
        }
        k1 = j1;
        if (l != null)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(15, l);
        }
        int j2 = k1;
        if (m != 1)
        {
            j2 = k1 + CodedOutputByteBufferNano.d(17, m);
        }
        j1 = j2;
        if (n != null)
        {
            j1 = j2 + CodedOutputByteBufferNano.b(18, n);
        }
        k1 = j1;
        if (o != null)
        {
            bd abd[] = o;
            int j3 = abd.length;
            int k2 = ((flag) ? 1 : 0);
            do
            {
                k1 = j1;
                if (k2 >= j3)
                {
                    break;
                }
                j1 += CodedOutputByteBufferNano.b(19, abd[k2]);
                k2++;
            } while (true);
        }
        j1 = k1;
        if (p != null)
        {
            j1 = k1 + CodedOutputByteBufferNano.b(20, p);
        }
        k1 = j1;
        if (q != null)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(21, q);
        }
        j1 = k1;
        if (r != null)
        {
            j1 = k1 + CodedOutputByteBufferNano.b(22, r);
        }
        k1 = j1;
        if (s != null)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(23, s);
        }
        j1 = k1;
        if (t != null)
        {
            j1 = k1 + CodedOutputByteBufferNano.b(24, t);
        }
        k1 = j1;
        if (u != null)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(25, u);
        }
        j1 = k1 + com.google.protobuf.nano.f.a(dl);
        dm = j1;
        return j1;
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

            case 18: // '\022'
                int j2 = com.google.protobuf.nano.f.a(a1, 18);
                jk ajk[];
                int j1;
                if (b == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = b.length;
                }
                ajk = new jk[j2 + j1];
                if (b != null)
                {
                    System.arraycopy(b, 0, ajk, 0, j1);
                }
                for (b = ajk; j1 < b.length - 1; j1++)
                {
                    b[j1] = new jk();
                    a1.a(b[j1]);
                    a1.a();
                }

                b[j1] = new jk();
                a1.a(b[j1]);
                break;

            case 26: // '\032'
                c = new ay();
                a1.a(c);
                break;

            case 42: // '*'
                d = a1.f();
                break;

            case 50: // '2'
                e = a1.f();
                break;

            case 58: // ':'
                f = new kz();
                a1.a(f);
                break;

            case 74: // 'J'
                g = new sx();
                a1.a(g);
                break;

            case 82: // 'R'
                h = new sx();
                a1.a(h);
                break;

            case 96: // '`'
                i = a1.d();
                break;

            case 106: // 'j'
                int k2 = com.google.protobuf.nano.f.a(a1, 106);
                ak aak[];
                int k1;
                if (j == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = j.length;
                }
                aak = new ak[k2 + k1];
                if (j != null)
                {
                    System.arraycopy(j, 0, aak, 0, k1);
                }
                for (j = aak; k1 < j.length - 1; k1++)
                {
                    j[k1] = new ak();
                    a1.a(j[k1]);
                    a1.a();
                }

                j[k1] = new ak();
                a1.a(j[k1]);
                break;

            case 114: // 'r'
                k = new aw();
                a1.a(k);
                break;

            case 122: // 'z'
                l = new ax();
                a1.a(l);
                break;

            case 136: 
                int l1 = a1.d();
                if (l1 == 1 || l1 == 2)
                {
                    m = l1;
                } else
                {
                    m = 1;
                }
                break;

            case 146: 
                n = new bc();
                a1.a(n);
                break;

            case 154: 
                int l2 = com.google.protobuf.nano.f.a(a1, 154);
                bd abd[];
                int i2;
                if (o == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = o.length;
                }
                abd = new bd[l2 + i2];
                if (o != null)
                {
                    System.arraycopy(o, 0, abd, 0, i2);
                }
                for (o = abd; i2 < o.length - 1; i2++)
                {
                    o[i2] = new bd();
                    a1.a(o[i2]);
                    a1.a();
                }

                o[i2] = new bd();
                a1.a(o[i2]);
                break;

            case 162: 
                p = new vc();
                a1.a(p);
                break;

            case 170: 
                q = new az();
                a1.a(q);
                break;

            case 178: 
                r = new fk();
                a1.a(r);
                break;

            case 186: 
                s = new bb();
                a1.a(s);
                break;

            case 194: 
                t = new sx();
                a1.a(t);
                break;

            case 202: 
                u = new sx();
                a1.a(u);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != null)
        {
            jk ajk[] = b;
            int l1 = ajk.length;
            for (int i1 = 0; i1 < l1; i1++)
            {
                codedoutputbytebuffernano.a(2, ajk[i1]);
            }

        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(3, c);
        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(5, d);
        }
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(6, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(7, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(9, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(10, h);
        }
        if (i != 0)
        {
            codedoutputbytebuffernano.a(12, i);
        }
        if (j != null)
        {
            ak aak[] = j;
            int i2 = aak.length;
            for (int j1 = 0; j1 < i2; j1++)
            {
                codedoutputbytebuffernano.a(13, aak[j1]);
            }

        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(14, k);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(15, l);
        }
        if (m != 1)
        {
            codedoutputbytebuffernano.a(17, m);
        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(18, n);
        }
        if (o != null)
        {
            bd abd[] = o;
            int j2 = abd.length;
            for (int k1 = ((flag) ? 1 : 0); k1 < j2; k1++)
            {
                codedoutputbytebuffernano.a(19, abd[k1]);
            }

        }
        if (p != null)
        {
            codedoutputbytebuffernano.a(20, p);
        }
        if (q != null)
        {
            codedoutputbytebuffernano.a(21, q);
        }
        if (r != null)
        {
            codedoutputbytebuffernano.a(22, r);
        }
        if (s != null)
        {
            codedoutputbytebuffernano.a(23, s);
        }
        if (t != null)
        {
            codedoutputbytebuffernano.a(24, t);
        }
        if (u != null)
        {
            codedoutputbytebuffernano.a(25, u);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
