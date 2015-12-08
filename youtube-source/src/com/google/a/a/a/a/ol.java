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
//            om, fk, iz, or

public final class ol extends b
{

    public static final ol a[] = new ol[0];
    public String b;
    public om c[];
    public int d;
    public String e;
    public int f;
    public fk g;
    public boolean h;
    public boolean i;
    public int j;
    public String k;
    public iz l;
    public or m;
    public fk n;
    public fk o;
    public fk p;

    public ol()
    {
        b = "";
        c = com.google.a.a.a.a.om.a;
        d = 0;
        e = "";
        f = 0;
        g = null;
        h = false;
        i = false;
        j = 0;
        k = "";
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
    }

    public final int a()
    {
        int k1 = 0;
        int i1;
        int j1;
        if (!b.equals(""))
        {
            i1 = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if (c != null)
        {
            om aom[] = c;
            int l1 = aom.length;
            do
            {
                j1 = i1;
                if (k1 >= l1)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(2, aom[k1]);
                k1++;
            } while (true);
        }
        i1 = j1;
        if (d != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(3, d);
        }
        j1 = i1;
        if (!e.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(5, e);
        }
        i1 = j1;
        if (f != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(6, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, g);
        }
        i1 = j1;
        if (h)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, h);
        }
        j1 = i1;
        if (i)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(11, i);
        }
        i1 = j1;
        if (j != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(12, j);
        }
        j1 = i1;
        if (!k.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(13, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(14, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(15, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(16, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(17, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(18, p);
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
                int l1 = com.google.protobuf.nano.f.a(a1, 18);
                om aom[];
                int j1;
                if (c == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = c.length;
                }
                aom = new om[l1 + j1];
                if (c != null)
                {
                    System.arraycopy(c, 0, aom, 0, j1);
                }
                for (c = aom; j1 < c.length - 1; j1++)
                {
                    c[j1] = new om();
                    a1.a(c[j1]);
                    a1.a();
                }

                c[j1] = new om();
                a1.a(c[j1]);
                break;

            case 24: // '\030'
                d = a1.d();
                break;

            case 42: // '*'
                e = a1.f();
                break;

            case 48: // '0'
                f = a1.d();
                break;

            case 58: // ':'
                g = new fk();
                a1.a(g);
                break;

            case 64: // '@'
                h = a1.e();
                break;

            case 88: // 'X'
                i = a1.e();
                break;

            case 96: // '`'
                int k1 = a1.d();
                if (k1 == 0 || k1 == 1 || k1 == 2)
                {
                    j = k1;
                } else
                {
                    j = 0;
                }
                break;

            case 106: // 'j'
                k = a1.f();
                break;

            case 114: // 'r'
                l = new iz();
                a1.a(l);
                break;

            case 122: // 'z'
                m = new or();
                a1.a(m);
                break;

            case 130: 
                n = new fk();
                a1.a(n);
                break;

            case 138: 
                o = new fk();
                a1.a(o);
                break;

            case 146: 
                p = new fk();
                a1.a(p);
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
            om aom[] = c;
            int j1 = aom.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(2, aom[i1]);
            }

        }
        if (d != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(5, e);
        }
        if (f != 0)
        {
            codedoutputbytebuffernano.a(6, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(7, g);
        }
        if (h)
        {
            codedoutputbytebuffernano.a(8, h);
        }
        if (i)
        {
            codedoutputbytebuffernano.a(11, i);
        }
        if (j != 0)
        {
            codedoutputbytebuffernano.a(12, j);
        }
        if (!k.equals(""))
        {
            codedoutputbytebuffernano.a(13, k);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(14, l);
        }
        if (m != null)
        {
            codedoutputbytebuffernano.a(15, m);
        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(16, n);
        }
        if (o != null)
        {
            codedoutputbytebuffernano.a(17, o);
        }
        if (p != null)
        {
            codedoutputbytebuffernano.a(18, p);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
