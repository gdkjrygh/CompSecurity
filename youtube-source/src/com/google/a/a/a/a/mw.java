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
//            ai, lv, mv, mi

public final class mw extends b
{

    public static final mw a[] = new mw[0];
    public int b;
    public String c;
    public String d[];
    public boolean e;
    public boolean f;
    public ai g;
    public lv h;
    public mv i;
    public boolean j;
    public mi k;

    public mw()
    {
        b = 0;
        c = "";
        d = f.j;
        e = false;
        f = false;
        g = null;
        h = null;
        i = null;
        j = false;
        k = null;
    }

    public final int a()
    {
        boolean flag = false;
        int l;
        int i1;
        if (b != 0)
        {
            i1 = CodedOutputByteBufferNano.d(1, b) + 0;
        } else
        {
            i1 = 0;
        }
        l = i1;
        if (!c.equals(""))
        {
            l = i1 + CodedOutputByteBufferNano.b(2, c);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l;
            if (d.length > 0)
            {
                String as[] = d;
                int k1 = as.length;
                int j1 = 0;
                for (i1 = ((flag) ? 1 : 0); i1 < k1; i1++)
                {
                    j1 += CodedOutputByteBufferNano.a(as[i1]);
                }

                i1 = l + j1 + d.length * 1;
            }
        }
        l = i1;
        if (e)
        {
            l = i1 + CodedOutputByteBufferNano.b(4, e);
        }
        i1 = l;
        if (f)
        {
            i1 = l + CodedOutputByteBufferNano.b(5, f);
        }
        l = i1;
        if (g != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(6, g);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(7, h);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(8, i);
        }
        i1 = l;
        if (j)
        {
            i1 = l + CodedOutputByteBufferNano.b(9, j);
        }
        l = i1;
        if (k != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(10, k);
        }
        l += com.google.protobuf.nano.f.a(dl);
        dm = l;
        return l;
    }

    public final c a(a a1)
    {
        do
        {
            int l = a1.a();
            switch (l)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                int i1 = a1.d();
                if (i1 == 0 || i1 == 1 || i1 == 2 || i1 == 3 || i1 == 4 || i1 == 5)
                {
                    b = i1;
                } else
                {
                    b = 0;
                }
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 26: // '\032'
                int k1 = com.google.protobuf.nano.f.a(a1, 26);
                int j1 = d.length;
                String as[] = new String[k1 + j1];
                System.arraycopy(d, 0, as, 0, j1);
                for (d = as; j1 < d.length - 1; j1++)
                {
                    d[j1] = a1.f();
                    a1.a();
                }

                d[j1] = a1.f();
                break;

            case 32: // ' '
                e = a1.e();
                break;

            case 40: // '('
                f = a1.e();
                break;

            case 50: // '2'
                g = new ai();
                a1.a(g);
                break;

            case 58: // ':'
                h = new lv();
                a1.a(h);
                break;

            case 66: // 'B'
                i = new mv();
                a1.a(i);
                break;

            case 72: // 'H'
                j = a1.e();
                break;

            case 82: // 'R'
                k = new mi();
                a1.a(k);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != 0)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            String as[] = d;
            int i1 = as.length;
            for (int l = 0; l < i1; l++)
            {
                codedoutputbytebuffernano.a(3, as[l]);
            }

        }
        if (e)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f)
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
        if (j)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
