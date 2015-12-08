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
//            si, dc

public final class db extends b
{

    public static final db a[] = new db[0];
    public String b;
    public sx c;
    public fk d;
    public fk e;
    public fk f;
    public kz g;
    public String h;
    public si i;
    public fk j;
    public dc k;
    public ak l[];
    public ak m[];
    public byte n[];

    public db()
    {
        b = "";
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = "";
        i = null;
        j = null;
        k = null;
        l = com.google.a.a.a.a.ak.a;
        m = com.google.a.a.a.a.ak.a;
        n = f.l;
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
        if (!h.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, i);
        }
        k1 = i1;
        if (j != null)
        {
            k1 = i1 + CodedOutputByteBufferNano.b(9, j);
        }
        j1 = k1;
        if (k != null)
        {
            j1 = k1 + CodedOutputByteBufferNano.b(11, k);
        }
        i1 = j1;
        if (l != null)
        {
            ak aak[] = l;
            int j2 = aak.length;
            int l1 = 0;
            do
            {
                i1 = j1;
                if (l1 >= j2)
                {
                    break;
                }
                i1 = CodedOutputByteBufferNano.b(12, aak[l1]);
                l1++;
                j1 = i1 + j1;
            } while (true);
        }
        j1 = i1;
        if (m != null)
        {
            ak aak1[] = m;
            int k2 = aak1.length;
            int i2 = ((flag) ? 1 : 0);
            do
            {
                j1 = i1;
                if (i2 >= k2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(13, aak1[i2]);
                i2++;
            } while (true);
        }
        i1 = j1;
        if (!Arrays.equals(n, f.l))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(14, n);
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
                g = new kz();
                a1.a(g);
                break;

            case 58: // ':'
                h = a1.f();
                break;

            case 66: // 'B'
                i = new si();
                a1.a(i);
                break;

            case 74: // 'J'
                j = new fk();
                a1.a(j);
                break;

            case 90: // 'Z'
                k = new dc();
                a1.a(k);
                break;

            case 98: // 'b'
                int l1 = com.google.protobuf.nano.f.a(a1, 98);
                ak aak[];
                int j1;
                if (l == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = l.length;
                }
                aak = new ak[l1 + j1];
                if (l != null)
                {
                    System.arraycopy(l, 0, aak, 0, j1);
                }
                for (l = aak; j1 < l.length - 1; j1++)
                {
                    l[j1] = new ak();
                    a1.a(l[j1]);
                    a1.a();
                }

                l[j1] = new ak();
                a1.a(l[j1]);
                break;

            case 106: // 'j'
                int i2 = com.google.protobuf.nano.f.a(a1, 106);
                ak aak1[];
                int k1;
                if (m == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = m.length;
                }
                aak1 = new ak[i2 + k1];
                if (m != null)
                {
                    System.arraycopy(m, 0, aak1, 0, k1);
                }
                for (m = aak1; k1 < m.length - 1; k1++)
                {
                    m[k1] = new ak();
                    a1.a(m[k1]);
                    a1.a();
                }

                m[k1] = new ak();
                a1.a(m[k1]);
                break;

            case 114: // 'r'
                n = a1.g();
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
        if (!h.equals(""))
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
            codedoutputbytebuffernano.a(11, k);
        }
        if (l != null)
        {
            ak aak[] = l;
            int k1 = aak.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(12, aak[i1]);
            }

        }
        if (m != null)
        {
            ak aak1[] = m;
            int l1 = aak1.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                codedoutputbytebuffernano.a(13, aak1[j1]);
            }

        }
        if (!Arrays.equals(n, f.l))
        {
            codedoutputbytebuffernano.a(14, n);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
