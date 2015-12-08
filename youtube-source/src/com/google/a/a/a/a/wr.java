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
//            ex

public final class wr extends b
{

    public static final wr a[] = new wr[0];
    public ex b[];
    public String c[];
    public String d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public String k;
    public String l;

    public wr()
    {
        b = com.google.a.a.a.a.ex.a;
        c = f.j;
        d = "";
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = false;
        j = false;
        k = "";
        l = "";
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        if (b != null)
        {
            ex aex[] = b;
            int j2 = aex.length;
            int l1 = 0;
            int j1 = 0;
            do
            {
                i1 = j1;
                if (l1 >= j2)
                {
                    break;
                }
                i1 = CodedOutputByteBufferNano.b(1, aex[l1]);
                l1++;
                j1 = i1 + j1;
            } while (true);
        } else
        {
            i1 = 0;
        }
        int k1 = i1;
        if (c != null)
        {
            k1 = i1;
            if (c.length > 0)
            {
                String as[] = c;
                int k2 = as.length;
                int i2 = 0;
                for (k1 = ((flag) ? 1 : 0); k1 < k2; k1++)
                {
                    i2 += CodedOutputByteBufferNano.a(as[k1]);
                }

                k1 = i1 + i2 + c.length * 1;
            }
        }
        i1 = k1;
        if (!d.equals(""))
        {
            i1 = k1 + CodedOutputByteBufferNano.b(3, d);
        }
        k1 = i1;
        if (e != 0)
        {
            k1 = i1 + CodedOutputByteBufferNano.d(4, e);
        }
        i1 = k1;
        if (f != 0)
        {
            i1 = k1 + CodedOutputByteBufferNano.d(5, f);
        }
        k1 = i1;
        if (g != 0)
        {
            k1 = i1 + CodedOutputByteBufferNano.d(6, g);
        }
        i1 = k1;
        if (h != 0)
        {
            i1 = k1 + CodedOutputByteBufferNano.d(7, h);
        }
        k1 = i1;
        if (i)
        {
            k1 = i1 + CodedOutputByteBufferNano.b(8, i);
        }
        i1 = k1;
        if (j)
        {
            i1 = k1 + CodedOutputByteBufferNano.b(9, j);
        }
        k1 = i1;
        if (!k.equals(""))
        {
            k1 = i1 + CodedOutputByteBufferNano.b(10, k);
        }
        i1 = k1;
        if (!l.equals(""))
        {
            i1 = k1 + CodedOutputByteBufferNano.b(11, l);
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
                int l1 = com.google.protobuf.nano.f.a(a1, 10);
                ex aex[];
                int j1;
                if (b == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = b.length;
                }
                aex = new ex[l1 + j1];
                if (b != null)
                {
                    System.arraycopy(b, 0, aex, 0, j1);
                }
                for (b = aex; j1 < b.length - 1; j1++)
                {
                    b[j1] = new ex();
                    a1.a(b[j1]);
                    a1.a();
                }

                b[j1] = new ex();
                a1.a(b[j1]);
                break;

            case 18: // '\022'
                int i2 = com.google.protobuf.nano.f.a(a1, 18);
                int k1 = c.length;
                String as[] = new String[i2 + k1];
                System.arraycopy(c, 0, as, 0, k1);
                for (c = as; k1 < c.length - 1; k1++)
                {
                    c[k1] = a1.f();
                    a1.a();
                }

                c[k1] = a1.f();
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 32: // ' '
                e = a1.d();
                break;

            case 40: // '('
                f = a1.d();
                break;

            case 48: // '0'
                g = a1.d();
                break;

            case 56: // '8'
                h = a1.d();
                break;

            case 64: // '@'
                i = a1.e();
                break;

            case 72: // 'H'
                j = a1.e();
                break;

            case 82: // 'R'
                k = a1.f();
                break;

            case 90: // 'Z'
                l = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != null)
        {
            ex aex[] = b;
            int k1 = aex.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(1, aex[i1]);
            }

        }
        if (c != null)
        {
            String as[] = c;
            int l1 = as.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                codedoutputbytebuffernano.a(2, as[j1]);
            }

        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != 0)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != 0)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g != 0)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h != 0)
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
        if (!k.equals(""))
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (!l.equals(""))
        {
            codedoutputbytebuffernano.a(11, l);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
