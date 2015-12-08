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
//            ak, fk, sx, kz, 
//            on

public final class oo extends b
{

    public static final oo a[] = new oo[0];
    public fk b;
    public fk c;
    public sx d;
    public fk e;
    public fk f;
    public boolean g;
    public kz h;
    public fk i;
    public fk j;
    public String k;
    public fk l;
    public ak m[];
    public on n;

    public oo()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = false;
        h = null;
        i = null;
        j = null;
        k = "";
        l = null;
        m = com.google.a.a.a.a.ak.a;
        n = null;
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
        if (g)
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
        k1 = j1;
        if (!k.equals(""))
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
            int l1 = ((flag) ? 1 : 0);
            do
            {
                j1 = i1;
                if (l1 >= i2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(13, aak[l1]);
                l1++;
            } while (true);
        }
        i1 = j1;
        if (n != null)
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
                b = new fk();
                a1.a(b);
                break;

            case 18: // '\022'
                c = new fk();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new sx();
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

            case 48: // '0'
                g = a1.e();
                break;

            case 58: // ':'
                h = new kz();
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
                k = a1.f();
                break;

            case 98: // 'b'
                l = new fk();
                a1.a(l);
                break;

            case 106: // 'j'
                int k1 = com.google.protobuf.nano.f.a(a1, 106);
                ak aak[];
                int j1;
                if (m == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = m.length;
                }
                aak = new ak[k1 + j1];
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
                n = new on();
                a1.a(n);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
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
        if (g)
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
        if (!k.equals(""))
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
            int j1 = aak.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(13, aak[i1]);
            }

        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(14, n);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
