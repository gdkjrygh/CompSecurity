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
//            ak, sx, fk, kz, 
//            qy, ov, in

public final class ow extends b
{

    public static final ow a[] = new ow[0];
    public String b;
    public sx c;
    public fk d;
    public fk e;
    public fk f;
    public fk g;
    public kz h;
    public String i;
    public ak j[];
    public String k;
    public long l;
    public float m;
    public float n;
    public qy o;
    public ov p;
    public in q;

    public ow()
    {
        b = "";
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = "";
        j = com.google.a.a.a.a.ak.a;
        k = "";
        l = 0L;
        m = 0.0F;
        n = 0.0F;
        o = null;
        p = null;
        q = null;
    }

    public final int a()
    {
        int k1 = 0;
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
        if (!i.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, i);
        }
        j1 = i1;
        if (j != null)
        {
            ak aak[] = j;
            int l1 = aak.length;
            do
            {
                j1 = i1;
                if (k1 >= l1)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(9, aak[k1]);
                k1++;
            } while (true);
        }
        i1 = j1;
        if (!k.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, k);
        }
        j1 = i1;
        if (l != 0L)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(11, l);
        }
        i1 = j1;
        if (m != 0.0F)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(12, m);
        }
        j1 = i1;
        if (n != 0.0F)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(13, n);
        }
        i1 = j1;
        if (o != null)
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
            i1 = j1 + CodedOutputByteBufferNano.b(0x39d6d44, q);
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
                g = new fk();
                a1.a(g);
                break;

            case 58: // ':'
                h = new kz();
                a1.a(h);
                break;

            case 66: // 'B'
                i = a1.f();
                break;

            case 74: // 'J'
                int k1 = com.google.protobuf.nano.f.a(a1, 74);
                ak aak[];
                int j1;
                if (j == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = j.length;
                }
                aak = new ak[k1 + j1];
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
                k = a1.f();
                break;

            case 88: // 'X'
                l = a1.b();
                break;

            case 101: // 'e'
                m = Float.intBitsToFloat(a1.i());
                break;

            case 109: // 'm'
                n = Float.intBitsToFloat(a1.i());
                break;

            case 114: // 'r'
                o = new qy();
                a1.a(o);
                break;

            case 122: // 'z'
                p = new ov();
                a1.a(p);
                break;

            case 485190178: 
                q = new in();
                a1.a(q);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
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
        if (!i.equals(""))
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j != null)
        {
            ak aak[] = j;
            int j1 = aak.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(9, aak[i1]);
            }

        }
        if (!k.equals(""))
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (l != 0L)
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m != 0.0F)
        {
            codedoutputbytebuffernano.a(12, m);
        }
        if (n != 0.0F)
        {
            codedoutputbytebuffernano.a(13, n);
        }
        if (o != null)
        {
            codedoutputbytebuffernano.a(14, o);
        }
        if (p != null)
        {
            codedoutputbytebuffernano.a(15, p);
        }
        if (q != null)
        {
            codedoutputbytebuffernano.a(0x39d6d44, q);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
