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
//            ak, sx, fk, kz, 
//            s, iw

public final class ka extends b
{

    public static final ka a[] = new ka[0];
    public String b;
    public sx c;
    public fk d;
    public fk e;
    public fk f;
    public sx g;
    public fk h;
    public fk i;
    public fk j;
    public fk k;
    public kz l;
    public ak m[];
    public ak n[];
    public s o;
    public String p;
    public byte q[];
    public fk r;
    public iw s;

    public ka()
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
        l = null;
        m = com.google.a.a.a.a.ak.a;
        n = com.google.a.a.a.a.ak.a;
        o = null;
        p = "";
        q = f.l;
        r = null;
        s = null;
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
            j1 = i1 + CodedOutputByteBufferNano.b(11, l);
        }
        i1 = j1;
        if (m != null)
        {
            ak aak[] = m;
            int i2 = aak.length;
            int k1 = 0;
            do
            {
                i1 = j1;
                if (k1 >= i2)
                {
                    break;
                }
                i1 = CodedOutputByteBufferNano.b(12, aak[k1]);
                k1++;
                j1 = i1 + j1;
            } while (true);
        }
        j1 = i1;
        if (n != null)
        {
            ak aak1[] = n;
            int j2 = aak1.length;
            int l1 = ((flag) ? 1 : 0);
            do
            {
                j1 = i1;
                if (l1 >= j2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(13, aak1[l1]);
                l1++;
            } while (true);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(14, o);
        }
        j1 = i1;
        if (!p.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(15, p);
        }
        i1 = j1;
        if (!Arrays.equals(q, f.l))
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
        i1 += com.google.protobuf.nano.f.a(dl);
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
                g = new sx();
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

            case 90: // 'Z'
                l = new kz();
                a1.a(l);
                break;

            case 98: // 'b'
                int l1 = com.google.protobuf.nano.f.a(a1, 98);
                ak aak[];
                int j1;
                if (m == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = m.length;
                }
                aak = new ak[l1 + j1];
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

            case 106: // 'j'
                int i2 = com.google.protobuf.nano.f.a(a1, 106);
                ak aak1[];
                int k1;
                if (n == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = n.length;
                }
                aak1 = new ak[i2 + k1];
                if (n != null)
                {
                    System.arraycopy(n, 0, aak1, 0, k1);
                }
                for (n = aak1; k1 < n.length - 1; k1++)
                {
                    n[k1] = new ak();
                    a1.a(n[k1]);
                    a1.a();
                }

                n[k1] = new ak();
                a1.a(n[k1]);
                break;

            case 114: // 'r'
                o = new s();
                a1.a(o);
                break;

            case 122: // 'z'
                p = a1.f();
                break;

            case 138: 
                q = a1.g();
                break;

            case 146: 
                r = new fk();
                a1.a(r);
                break;

            case 154: 
                s = new iw();
                a1.a(s);
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
            codedoutputbytebuffernano.a(11, l);
        }
        if (m != null)
        {
            ak aak[] = m;
            int k1 = aak.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(12, aak[i1]);
            }

        }
        if (n != null)
        {
            ak aak1[] = n;
            int l1 = aak1.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                codedoutputbytebuffernano.a(13, aak1[j1]);
            }

        }
        if (o != null)
        {
            codedoutputbytebuffernano.a(14, o);
        }
        if (!p.equals(""))
        {
            codedoutputbytebuffernano.a(15, p);
        }
        if (!Arrays.equals(q, f.l))
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
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
