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
//            ak, fk, kz, sx, 
//            si, s, ci

public final class ce extends b
{

    public static final ce a[] = new ce[0];
    public String b;
    public fk c;
    public kz d;
    public sx e;
    public fk f;
    public fk g;
    public fk h;
    public fk i;
    public ak j[];
    public si k;
    public ak l[];
    public fk m;
    public s n;
    public fk o;
    public String p;
    public ci q;
    public byte r[];

    public ce()
    {
        b = "";
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = com.google.a.a.a.a.ak.a;
        k = null;
        l = com.google.a.a.a.a.ak.a;
        m = null;
        n = null;
        o = null;
        p = "";
        q = null;
        r = f.l;
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
            ak aak[] = j;
            int i2 = aak.length;
            int k1 = 0;
            do
            {
                j1 = i1;
                if (k1 >= i2)
                {
                    break;
                }
                j1 = CodedOutputByteBufferNano.b(9, aak[k1]);
                k1++;
                i1 = j1 + i1;
            } while (true);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, k);
        }
        j1 = i1;
        if (l != null)
        {
            ak aak1[] = l;
            int j2 = aak1.length;
            int l1 = ((flag) ? 1 : 0);
            do
            {
                j1 = i1;
                if (l1 >= j2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(11, aak1[l1]);
                l1++;
            } while (true);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(12, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(13, n);
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
        if (q != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(17, q);
        }
        j1 = i1;
        if (!Arrays.equals(r, f.l))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(18, r);
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
                c = new fk();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new kz();
                a1.a(d);
                break;

            case 34: // '"'
                e = new sx();
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
                int l1 = com.google.protobuf.nano.f.a(a1, 74);
                ak aak[];
                int j1;
                if (j == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = j.length;
                }
                aak = new ak[l1 + j1];
                if (j != null)
                {
                    System.arraycopy(j, 0, aak, 0, j1);
                }
                for (j = aak; j1 < j.length - 1; j1++)
                {
                    j[j1] = new ak();
                    a1.a(j[j1]);
                    a1.a();
                }

                j[j1] = new ak();
                a1.a(j[j1]);
                break;

            case 82: // 'R'
                k = new si();
                a1.a(k);
                break;

            case 90: // 'Z'
                int i2 = com.google.protobuf.nano.f.a(a1, 90);
                ak aak1[];
                int k1;
                if (l == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = l.length;
                }
                aak1 = new ak[i2 + k1];
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
                m = new fk();
                a1.a(m);
                break;

            case 106: // 'j'
                n = new s();
                a1.a(n);
                break;

            case 114: // 'r'
                o = new fk();
                a1.a(o);
                break;

            case 122: // 'z'
                p = a1.f();
                break;

            case 138: 
                q = new ci();
                a1.a(q);
                break;

            case 146: 
                r = a1.g();
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
            ak aak[] = j;
            int k1 = aak.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(9, aak[i1]);
            }

        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (l != null)
        {
            ak aak1[] = l;
            int l1 = aak1.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                codedoutputbytebuffernano.a(11, aak1[j1]);
            }

        }
        if (m != null)
        {
            codedoutputbytebuffernano.a(12, m);
        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(13, n);
        }
        if (o != null)
        {
            codedoutputbytebuffernano.a(14, o);
        }
        if (!p.equals(""))
        {
            codedoutputbytebuffernano.a(15, p);
        }
        if (q != null)
        {
            codedoutputbytebuffernano.a(17, q);
        }
        if (!Arrays.equals(r, f.l))
        {
            codedoutputbytebuffernano.a(18, r);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
