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
//            ei, kz

public final class eh extends b
{

    public static final eh a[] = new eh[0];
    public boolean b;
    public boolean c;
    public boolean d;
    public String e[];
    public String f;
    public String g;
    public String h;
    public ei i[];
    public boolean j;
    public String k;
    public boolean l;
    public kz m;
    public boolean n;
    public int o;

    public eh()
    {
        b = false;
        c = false;
        d = false;
        e = f.j;
        f = "";
        g = "";
        h = "";
        i = com.google.a.a.a.a.ei.a;
        j = false;
        k = "";
        l = false;
        m = null;
        n = false;
        o = 0;
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        if (b)
        {
            i1 = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if (c)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(2, c);
        }
        i1 = j1;
        if (d)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(3, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                String as[] = e;
                int i2 = as.length;
                j1 = 0;
                int k1 = 0;
                for (; j1 < i2; j1++)
                {
                    k1 += CodedOutputByteBufferNano.a(as[j1]);
                }

                j1 = i1 + k1 + e.length * 1;
            }
        }
        i1 = j1;
        if (!f.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(5, f);
        }
        j1 = i1;
        if (!g.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(6, g);
        }
        i1 = j1;
        if (!h.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(7, h);
        }
        j1 = i1;
        if (i != null)
        {
            ei aei[] = i;
            int j2 = aei.length;
            int l1 = ((flag) ? 1 : 0);
            do
            {
                j1 = i1;
                if (l1 >= j2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(8, aei[l1]);
                l1++;
            } while (true);
        }
        i1 = j1;
        if (j)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(9, j);
        }
        j1 = i1;
        if (!k.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(10, k);
        }
        i1 = j1;
        if (l)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(11, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(12, m);
        }
        i1 = j1;
        if (n)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(13, n);
        }
        j1 = i1;
        if (o != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(14, o);
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

            case 8: // '\b'
                b = a1.e();
                break;

            case 16: // '\020'
                c = a1.e();
                break;

            case 24: // '\030'
                d = a1.e();
                break;

            case 34: // '"'
                int i2 = com.google.protobuf.nano.f.a(a1, 34);
                int j1 = e.length;
                String as[] = new String[i2 + j1];
                System.arraycopy(e, 0, as, 0, j1);
                for (e = as; j1 < e.length - 1; j1++)
                {
                    e[j1] = a1.f();
                    a1.a();
                }

                e[j1] = a1.f();
                break;

            case 42: // '*'
                f = a1.f();
                break;

            case 50: // '2'
                g = a1.f();
                break;

            case 58: // ':'
                h = a1.f();
                break;

            case 66: // 'B'
                int j2 = com.google.protobuf.nano.f.a(a1, 66);
                ei aei[];
                int k1;
                if (i == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = i.length;
                }
                aei = new ei[j2 + k1];
                if (i != null)
                {
                    System.arraycopy(i, 0, aei, 0, k1);
                }
                for (i = aei; k1 < i.length - 1; k1++)
                {
                    i[k1] = new ei();
                    a1.a(i[k1]);
                    a1.a();
                }

                i[k1] = new ei();
                a1.a(i[k1]);
                break;

            case 72: // 'H'
                j = a1.e();
                break;

            case 82: // 'R'
                k = a1.f();
                break;

            case 88: // 'X'
                l = a1.e();
                break;

            case 98: // 'b'
                m = new kz();
                a1.a(m);
                break;

            case 104: // 'h'
                n = a1.e();
                break;

            case 112: // 'p'
                int l1 = a1.d();
                if (l1 == 0 || l1 == 1 || l1 == 2 || l1 == 3)
                {
                    o = l1;
                } else
                {
                    o = 0;
                }
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            String as[] = e;
            int k1 = as.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(4, as[i1]);
            }

        }
        if (!f.equals(""))
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (!g.equals(""))
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != null)
        {
            ei aei[] = i;
            int l1 = aei.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                codedoutputbytebuffernano.a(8, aei[j1]);
            }

        }
        if (j)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (!k.equals(""))
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (l)
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m != null)
        {
            codedoutputbytebuffernano.a(12, m);
        }
        if (n)
        {
            codedoutputbytebuffernano.a(13, n);
        }
        if (o != 0)
        {
            codedoutputbytebuffernano.a(14, o);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
