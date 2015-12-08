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

public final class fi extends b
{

    public static final fi a[] = new fi[0];
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k[];
    public int l;
    public boolean m;

    public fi()
    {
        b = 0;
        c = 0;
        d = 0;
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = f.j;
        l = 1;
        m = false;
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        int k1;
        if (b != 0)
        {
            j1 = CodedOutputByteBufferNano.d(1, b) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if (c != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(2, c);
        }
        j1 = i1;
        if (d != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(3, d);
        }
        i1 = j1;
        if (e)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(4, e);
        }
        j1 = i1;
        if (f)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(5, f);
        }
        i1 = j1;
        if (g)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(6, g);
        }
        j1 = i1;
        if (h)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, h);
        }
        k1 = j1;
        if (i)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(8, i);
        }
        i1 = k1;
        if (j)
        {
            i1 = k1 + CodedOutputByteBufferNano.b(9, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                String as[] = k;
                int i2 = as.length;
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < i2; j1++)
                {
                    l1 += CodedOutputByteBufferNano.a(as[j1]);
                }

                j1 = i1 + l1 + k.length * 1;
            }
        }
        i1 = j1;
        if (l != 1)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(11, l);
        }
        j1 = i1;
        if (m)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(12, m);
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
                int j1 = a1.d();
                if (j1 == 0 || j1 == 1 || j1 == 2 || j1 == 3 || j1 == 4 || j1 == 5)
                {
                    b = j1;
                } else
                {
                    b = 0;
                }
                break;

            case 16: // '\020'
                int k1 = a1.d();
                if (k1 == 0 || k1 == 1 || k1 == 2 || k1 == 3 || k1 == 4 || k1 == 5)
                {
                    c = k1;
                } else
                {
                    c = 0;
                }
                break;

            case 24: // '\030'
                int l1 = a1.d();
                if (l1 == 0 || l1 == 1 || l1 == 2 || l1 == 3)
                {
                    d = l1;
                } else
                {
                    d = 0;
                }
                break;

            case 32: // ' '
                e = a1.e();
                break;

            case 40: // '('
                f = a1.e();
                break;

            case 48: // '0'
                g = a1.e();
                break;

            case 56: // '8'
                h = a1.e();
                break;

            case 64: // '@'
                i = a1.e();
                break;

            case 72: // 'H'
                j = a1.e();
                break;

            case 82: // 'R'
                int k2 = com.google.protobuf.nano.f.a(a1, 82);
                int i2 = k.length;
                String as[] = new String[k2 + i2];
                System.arraycopy(k, 0, as, 0, i2);
                for (k = as; i2 < k.length - 1; i2++)
                {
                    k[i2] = a1.f();
                    a1.a();
                }

                k[i2] = a1.f();
                break;

            case 88: // 'X'
                int j2 = a1.d();
                if (j2 == 1 || j2 == 2 || j2 == 3)
                {
                    l = j2;
                } else
                {
                    l = 1;
                }
                break;

            case 96: // '`'
                m = a1.e();
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
        if (c != 0)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h)
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
            String as[] = k;
            int j1 = as.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(10, as[i1]);
            }

        }
        if (l != 1)
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m)
        {
            codedoutputbytebuffernano.a(12, m);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
