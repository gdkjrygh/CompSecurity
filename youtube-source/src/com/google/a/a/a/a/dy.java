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
//            qy, sx, kz, fk, 
//            dz

public final class dy extends b
{

    public static final dy a[] = new dy[0];
    public sx b;
    public kz c;
    public fk d;
    public kz e;
    public fk f;
    public fk g;
    public String h;
    public dz i;
    public fk j;
    public String k;
    public int l;
    public qy m[];

    public dy()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = "";
        i = null;
        j = null;
        k = "";
        l = 0;
        m = com.google.a.a.a.a.qy.a;
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
        if (!h.equals(""))
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
        if (l != 0)
        {
            i1 = k1 + CodedOutputByteBufferNano.d(11, l);
        }
        k1 = i1;
        if (m != null)
        {
            qy aqy[] = m;
            int l1 = aqy.length;
            j1 = ((flag) ? 1 : 0);
            do
            {
                k1 = i1;
                if (j1 >= l1)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(12, aqy[j1]);
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
                b = new sx();
                a1.a(b);
                break;

            case 18: // '\022'
                c = new kz();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new fk();
                a1.a(d);
                break;

            case 34: // '"'
                e = new kz();
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
                h = a1.f();
                break;

            case 66: // 'B'
                i = new dz();
                a1.a(i);
                break;

            case 74: // 'J'
                j = new fk();
                a1.a(j);
                break;

            case 82: // 'R'
                k = a1.f();
                break;

            case 88: // 'X'
                l = a1.d();
                break;

            case 98: // 'b'
                int k1 = com.google.protobuf.nano.f.a(a1, 98);
                qy aqy[];
                int j1;
                if (m == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = m.length;
                }
                aqy = new qy[k1 + j1];
                if (m != null)
                {
                    System.arraycopy(m, 0, aqy, 0, j1);
                }
                for (m = aqy; j1 < m.length - 1; j1++)
                {
                    m[j1] = new qy();
                    a1.a(m[j1]);
                    a1.a();
                }

                m[j1] = new qy();
                a1.a(m[j1]);
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
        if (!k.equals(""))
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (l != 0)
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m != null)
        {
            qy aqy[] = m;
            int j1 = aqy.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(12, aqy[i1]);
            }

        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
