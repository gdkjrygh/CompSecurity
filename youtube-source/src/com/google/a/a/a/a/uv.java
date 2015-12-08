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
//            ak, fk, iz

public final class uv extends b
{

    public static final uv a[] = new uv[0];
    public fk b;
    public fk c;
    public fk d;
    public fk e;
    public fk f;
    public fk g;
    public fk h;
    public boolean i;
    public boolean j;
    public fk k;
    public int l;
    public String m;
    public iz n;
    public ak o[];

    public uv()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = false;
        j = false;
        k = null;
        l = 0;
        m = "";
        n = null;
        o = com.google.a.a.a.a.ak.a;
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
        if (i)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, i);
        }
        j1 = i1;
        if (j)
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
        k1 = j1;
        if (!m.equals(""))
        {
            k1 = j1 + CodedOutputByteBufferNano.b(12, m);
        }
        i1 = k1;
        if (n != null)
        {
            i1 = k1 + CodedOutputByteBufferNano.b(13, n);
        }
        k1 = i1;
        if (o != null)
        {
            ak aak[] = o;
            int l1 = aak.length;
            j1 = ((flag) ? 1 : 0);
            do
            {
                k1 = i1;
                if (j1 >= l1)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(14, aak[j1]);
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
                c = new fk();
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

            case 64: // '@'
                i = a1.e();
                break;

            case 72: // 'H'
                j = a1.e();
                break;

            case 82: // 'R'
                k = new fk();
                a1.a(k);
                break;

            case 88: // 'X'
                int j1 = a1.d();
                if (j1 == 0 || j1 == 1 || j1 == 2)
                {
                    l = j1;
                } else
                {
                    l = 0;
                }
                break;

            case 98: // 'b'
                m = a1.f();
                break;

            case 106: // 'j'
                n = new iz();
                a1.a(n);
                break;

            case 114: // 'r'
                int l1 = com.google.protobuf.nano.f.a(a1, 114);
                ak aak[];
                int k1;
                if (o == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = o.length;
                }
                aak = new ak[l1 + k1];
                if (o != null)
                {
                    System.arraycopy(o, 0, aak, 0, k1);
                }
                for (o = aak; k1 < o.length - 1; k1++)
                {
                    o[k1] = new ak();
                    a1.a(o[k1]);
                    a1.a();
                }

                o[k1] = new ak();
                a1.a(o[k1]);
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
        if (h != null)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j)
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
        if (!m.equals(""))
        {
            codedoutputbytebuffernano.a(12, m);
        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(13, n);
        }
        if (o != null)
        {
            ak aak[] = o;
            int j1 = aak.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(14, aak[i1]);
            }

        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
