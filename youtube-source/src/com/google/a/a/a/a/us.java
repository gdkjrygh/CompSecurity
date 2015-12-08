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
//            ak, fk, sx, si, 
//            ul, ut, iz

public final class us extends b
{

    public static final us a[] = new us[0];
    public fk b;
    public sx c;
    public fk d;
    public fk e;
    public si f;
    public fk g;
    public fk h;
    public fk i;
    public fk j;
    public fk k;
    public int l;
    public fk m;
    public int n;
    public String o;
    public boolean p;
    public fk q;
    public boolean r;
    public ak s[];
    public ul t;
    public int u;
    public int v;
    public ut w;
    public iz x;
    public int y;
    public ak z[];

    public us()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = 0;
        m = null;
        n = 0;
        o = "";
        p = false;
        q = null;
        r = false;
        s = com.google.a.a.a.a.ak.a;
        t = null;
        u = 0;
        v = 0;
        w = null;
        x = null;
        y = 0;
        z = com.google.a.a.a.a.ak.a;
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
        if (l != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(11, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(12, m);
        }
        j1 = i1;
        if (n != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(13, n);
        }
        i1 = j1;
        if (!o.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(14, o);
        }
        j1 = i1;
        if (p)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(15, p);
        }
        k1 = j1;
        if (q != null)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(16, q);
        }
        i1 = k1;
        if (r)
        {
            i1 = k1 + CodedOutputByteBufferNano.b(17, r);
        }
        j1 = i1;
        if (s != null)
        {
            ak aak[] = s;
            int l1 = aak.length;
            k1 = 0;
            do
            {
                j1 = i1;
                if (k1 >= l1)
                {
                    break;
                }
                j1 = CodedOutputByteBufferNano.b(18, aak[k1]);
                k1++;
                i1 = j1 + i1;
            } while (true);
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(19, t);
        }
        j1 = i1;
        if (u != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(21, u);
        }
        i1 = j1;
        if (v != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(22, v);
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(23, w);
        }
        k1 = j1;
        if (x != null)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(24, x);
        }
        i1 = k1;
        if (y != 0)
        {
            i1 = k1 + CodedOutputByteBufferNano.d(25, y);
        }
        k1 = i1;
        if (z != null)
        {
            ak aak1[] = z;
            int i2 = aak1.length;
            j1 = ((flag) ? 1 : 0);
            do
            {
                k1 = i1;
                if (j1 >= i2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(26, aak1[j1]);
                j1++;
            } while (true);
        }
        i1 = k1 + com.google.protobuf.nano.f.a(dl);
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
                b = new fk();
                a1.a(b);
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
                f = new si();
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
                j = new fk();
                a1.a(j);
                break;

            case 82: // 'R'
                k = new fk();
                a1.a(k);
                break;

            case 88: // 'X'
                l = a1.d();
                break;

            case 98: // 'b'
                m = new fk();
                a1.a(m);
                break;

            case 104: // 'h'
                n = a1.d();
                break;

            case 114: // 'r'
                o = a1.f();
                break;

            case 120: // 'x'
                p = a1.e();
                break;

            case 130: 
                q = new fk();
                a1.a(q);
                break;

            case 136: 
                r = a1.e();
                break;

            case 146: 
                int k2 = com.google.protobuf.nano.f.a(a1, 146);
                ak aak[];
                int j1;
                if (s == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = s.length;
                }
                aak = new ak[k2 + j1];
                if (s != null)
                {
                    System.arraycopy(s, 0, aak, 0, j1);
                }
                for (s = aak; j1 < s.length - 1; j1++)
                {
                    s[j1] = new ak();
                    a1.a(s[j1]);
                    a1.a();
                }

                s[j1] = new ak();
                a1.a(s[j1]);
                break;

            case 154: 
                t = new ul();
                a1.a(t);
                break;

            case 168: 
                int k1 = a1.d();
                if (k1 == 0 || k1 == 1 || k1 == 2)
                {
                    u = k1;
                } else
                {
                    u = 0;
                }
                break;

            case 176: 
                int l1 = a1.d();
                if (l1 == 0 || l1 == 1 || l1 == 2)
                {
                    v = l1;
                } else
                {
                    v = 0;
                }
                break;

            case 186: 
                w = new ut();
                a1.a(w);
                break;

            case 194: 
                x = new iz();
                a1.a(x);
                break;

            case 200: 
                int i2 = a1.d();
                if (i2 == 0 || i2 == 1 || i2 == 2)
                {
                    y = i2;
                } else
                {
                    y = 0;
                }
                break;

            case 210: 
                int l2 = com.google.protobuf.nano.f.a(a1, 210);
                ak aak1[];
                int j2;
                if (z == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = z.length;
                }
                aak1 = new ak[l2 + j2];
                if (z != null)
                {
                    System.arraycopy(z, 0, aak1, 0, j2);
                }
                for (z = aak1; j2 < z.length - 1; j2++)
                {
                    z[j2] = new ak();
                    a1.a(z[j2]);
                    a1.a();
                }

                z[j2] = new ak();
                a1.a(z[j2]);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
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
        if (l != 0)
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m != null)
        {
            codedoutputbytebuffernano.a(12, m);
        }
        if (n != 0)
        {
            codedoutputbytebuffernano.a(13, n);
        }
        if (!o.equals(""))
        {
            codedoutputbytebuffernano.a(14, o);
        }
        if (p)
        {
            codedoutputbytebuffernano.a(15, p);
        }
        if (q != null)
        {
            codedoutputbytebuffernano.a(16, q);
        }
        if (r)
        {
            codedoutputbytebuffernano.a(17, r);
        }
        if (s != null)
        {
            ak aak[] = s;
            int k1 = aak.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(18, aak[i1]);
            }

        }
        if (t != null)
        {
            codedoutputbytebuffernano.a(19, t);
        }
        if (u != 0)
        {
            codedoutputbytebuffernano.a(21, u);
        }
        if (v != 0)
        {
            codedoutputbytebuffernano.a(22, v);
        }
        if (w != null)
        {
            codedoutputbytebuffernano.a(23, w);
        }
        if (x != null)
        {
            codedoutputbytebuffernano.a(24, x);
        }
        if (y != 0)
        {
            codedoutputbytebuffernano.a(25, y);
        }
        if (z != null)
        {
            ak aak1[] = z;
            int l1 = aak1.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                codedoutputbytebuffernano.a(26, aak1[j1]);
            }

        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
